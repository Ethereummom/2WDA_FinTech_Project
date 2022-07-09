import java.awt.Graphics;
import java.util.*;

import javax.swing.ImageIcon;

class Nexus extends ProtossBuilding  implements Runnable{
	static int cost=400;
	static int gascost=0;
	static int buildtime=500;
	Nexus(StarUI ui){
		super(ui);
		name = "Nexus";
		flag=true;
		work=true;
		progress=0;
		energy=1500;
		con = new Vector();
		con.addElement("노는중");
		con.addElement("생산중");
		condi=(String)con.elementAt(0);
		
		go=new Thread(this);
		go.start();
	}
	public void run(){
		while(true){
			switch(job){
			case 0:
				flag=true;
				go.suspend();
				break;
			case 1:
				flag=true;
				makeUnit();
				break;
			}
		}
	}
   
	
	public void makeUnit(){
		if(ui.clan.getMineral()>=Probe.cost){
			if(ui.clan.getMaxunit()>ui.clan.getUnit()){ //최대유닛보다 현재 유닛이 적을 경우
				condi=(String)con.elementAt(1);
				ui.clan.setMineral(-Probe.cost);
				ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));
				ui.setTB(ui.clan.mainBVT);
				progressing(Probe.buildtime);
				ui.clan.workerVT.addElement(new Probe(ui));
				ui.clan.setUnit(ui.clan.workerVT.size(),ui.clan.attacker1VT.size(),ui.clan.attacker2VT.size());
				ui.U_unit.setText(String.valueOf(ui.clan.getUnit()));
				condi=(String)con.elementAt(0);
				
				if(ui.U_name.getText()==ui.clan.getWorkerName())
					ui.setTB(ui.clan.workerVT);
				if(ui.U_name.getText()==ui.clan.getMainBName())
					ui.setTB(ui.clan.mainBVT);
			}
			else{
				
				ui.setMessage("Need to Pylon");
			}
		}
		else
			ui.setMessage("Not enough minerals");
		progress=0;
		job=0;
	}
}

import java.awt.Graphics;
import java.util.*;

import javax.swing.ImageIcon;

class Hatchery extends ZergBuilding  implements Runnable{
	static int cost=350;
	static int gascost=0;
	static int buildtime=500;
	Hatchery(StarUI ui){
		super(ui);
		name = "Hatchery";
		flag=true;
		work=true;
		progress=0;
		energy=1500;
		con = new Vector();
		con.addElement("�����");
		con.addElement("������");
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
		if(ui.clan.getMineral()>=Drone.cost){
			if(ui.clan.getMaxunit()>ui.clan.getUnit()){ //�ִ����ֺ��� ���� ������ ���� ���
				condi=(String)con.elementAt(1);
				ui.clan.setMineral(-Drone.cost);
				ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));
				ui.setTB(ui.clan.mainBVT);
				progressing(Drone.buildtime);
				ui.clan.workerVT.addElement(new Drone(ui));
				ui.clan.setUnit(ui.clan.workerVT.size(),ui.clan.attacker1VT.size(),ui.clan.attacker2VT.size());
				ui.U_unit.setText(String.valueOf(ui.clan.getUnit()));
				condi=(String)con.elementAt(0);
				
				if(ui.U_name.getText()==ui.clan.getWorkerName())
					ui.setTB(ui.clan.workerVT);
				if(ui.U_name.getText()==ui.clan.getMainBName())
					ui.setTB(ui.clan.mainBVT);
			}
			else
				ui.setMessage("Need to CreepColony");
		}
		else
			ui.setMessage("Not enough minerals");
		progress=0;
		job=0;
	}
}

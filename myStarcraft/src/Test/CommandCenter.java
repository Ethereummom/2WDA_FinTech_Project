package Test;

import java.awt.Graphics;
import java.util.*;

import javax.swing.ImageIcon;

class CommandCenter extends TerranBuilding  implements Runnable{
	static int cost=90;
	static int gascost=0;
	static int buildtime=100;
	CommandCenter(StarUI ui){
		super(ui);
		name = "CommandCenter";
		flag=true;
		work=true;
		progress=0;
		energy=1500;
		con = new ArrayList();
		con.add("노는중");
		con.add("생산중");
		condi=(String)con.get(0);
		
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
		if(ui.clan.getMineral()>=SCV.cost){
			if(ui.clan.getMaxunit()>ui.clan.getUnit()){ //�ִ����ֺ��� ���� ������ ���� ���
				condi=(String)con.get(1);
				ui.clan.setMineral(-SCV.cost);
				ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));
				ui.setTB(ui.clan.mainBVT);
				progressing(SCV.buildtime);
				ui.clan.workerVT.add(new SCV(ui));
				ui.clan.setUnit(ui.clan.workerVT.size());
				ui.U_unit.setText(String.valueOf(ui.clan.getUnit()));
				condi=(String)con.get(0);
				
				if(ui.U_name.getText()==ui.clan.getWorkerName())
					ui.setTB(ui.clan.workerVT);
				if(ui.U_name.getText()==ui.clan.getMainBName())
					ui.setTB(ui.clan.mainBVT);
			}
			else
				ui.setMessage("Need to SupplyDepot");
		}
		else
			ui.setMessage("Not enough minerals");
		progress=0;
		job=0;
	}
}

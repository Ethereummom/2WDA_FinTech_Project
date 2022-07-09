import java.util.*;

class SpawningPool extends ZergBuilding implements Runnable{
	static int cost=200;
	static int gascost=0;
	static int buildtime=300;
	
	SpawningPool(StarUI ui){
		super(ui);
		name = "SpawningPool";
		progress=0;
		energy = 1000;
		flag=true;
		work=true;
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
		if(ui.clan.getMineral()>=Zergling.cost){
			if(ui.clan.getMaxunit()>ui.clan.getUnit()){ //최대유닛보다 현재 유닛이 적을 경우
				condi=(String)con.elementAt(1);
				ui.clan.setMineral(-Zergling.cost);
				ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));
				ui.setTB(ui.clan.building1VT);
				progressing(Zergling.buildtime);
				ui.clan.attacker1VT.addElement(new Zergling(ui));
				ui.clan.setUnit(ui.clan.workerVT.size(),ui.clan.attacker1VT.size(),ui.clan.attacker2VT.size());
				ui.U_unit.setText(String.valueOf(ui.clan.getUnit()));
				condi=(String)con.elementAt(0);
				if(ui.U_name.getText()==ui.clan.getBuilding1Name())
					ui.setTB(ui.clan.building1VT);
				if(ui.U_name.getText()==ui.clan.getAttacker1Name())
					ui.setTB(ui.clan.attacker1VT);
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

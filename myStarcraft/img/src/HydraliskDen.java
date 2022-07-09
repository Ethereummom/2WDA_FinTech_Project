import java.util.Vector;

class HydraliskDen extends ZergBuilding implements Runnable {
	static int cost=200;
	static int gascost=100;
	static int buildtime=400;
	HydraliskDen(StarUI ui){
		super(ui);
		name = "HydraliskDen";
		progress=0;
		energy = 1250;
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
		if(ui.clan.getMineral()>=Hydralisk.cost && ui.clan.getMineral()>=Hydralisk.gascost){
			if(ui.clan.getMaxunit()>ui.clan.getUnit()){ //최대유닛보다 현재 유닛이 적을 경우
				condi=(String)con.elementAt(1);
				ui.clan.setMineral(-Hydralisk.cost);
				ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));
				ui.clan.setGas(-Hydralisk.gascost);
				ui.U_gas.setText(String.valueOf(ui.clan.getGas()));
				ui.setTB(ui.clan.building2VT);
				progressing(Hydralisk.buildtime);
				ui.clan.attacker2VT.addElement(new Hydralisk(ui));
				ui.clan.setUnit(ui.clan.workerVT.size(),ui.clan.attacker1VT.size(),ui.clan.attacker2VT.size());
				ui.U_unit.setText(String.valueOf(ui.clan.getUnit()));
				condi=(String)con.elementAt(0);
				if(ui.U_name.getText()==ui.clan.getBuilding2Name())
					ui.setTB(ui.clan.building2VT);
				if(ui.U_name.getText()==ui.clan.getAttacker2Name())
					ui.setTB(ui.clan.attacker2VT);
			}
			else
				ui.setMessage("Need to CreepColony");
		}
		else if(ui.clan.getMineral()<Hydralisk.cost)
			ui.setMessage("Not enough minerals");
		else
			ui.setMessage("Not enough Vespene gases");
		progress=0;
		job=0;
	}
	

}




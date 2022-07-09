import java.util.Vector;

class CreepColony extends ZergBuilding implements Runnable {
	static int cost=100;
	static int gascost=0;
	static int buildtime=250;
	CreepColony(StarUI ui){
		super(ui);
		name = "CreepColony";
		progress=0;
		energy = 500;
		flag=true;
		work=true;
		con = new Vector();
		con.addElement("노는중");
		con.addElement("업그레이드중");
		condi=(String)con.elementAt(0);
		ui.clan.setMaxunit(8); //최대 유닛제한 8증가시킴
		ui.U_maxunit.setText(String.valueOf(ui.clan.getMaxunit()));
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
	
	public void makeUnit(){ //유닛만들기 대신 업그레이드 가능
		condi=(String)con.elementAt(1);
			ui.setTB(ui.clan.building3VT);
			progressing(50);
			ui.clan.setUpgrade(1); //업그레이드 파워 1증가 시킴
			condi=(String)con.elementAt(0);
			if(ui.U_name.getText()==ui.clan.getBuilding3Name())
				ui.setTB(ui.clan.building3VT);
			ui.setMessage("Upgrade is complete");
		progress=0;
		job=0;
	}
}

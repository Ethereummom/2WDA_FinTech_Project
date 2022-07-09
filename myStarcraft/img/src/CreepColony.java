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
		con.addElement("�����");
		con.addElement("���׷��̵���");
		condi=(String)con.elementAt(0);
		ui.clan.setMaxunit(8); //�ִ� �������� 8������Ŵ
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
	
	public void makeUnit(){ //���ָ���� ��� ���׷��̵� ����
		condi=(String)con.elementAt(1);
			ui.setTB(ui.clan.building3VT);
			progressing(50);
			ui.clan.setUpgrade(1); //���׷��̵� �Ŀ� 1���� ��Ŵ
			condi=(String)con.elementAt(0);
			if(ui.U_name.getText()==ui.clan.getBuilding3Name())
				ui.setTB(ui.clan.building3VT);
			ui.setMessage("Upgrade is complete");
		progress=0;
		job=0;
	}
}

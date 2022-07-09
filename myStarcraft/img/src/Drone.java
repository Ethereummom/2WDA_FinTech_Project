import java.awt.event.ActionEvent;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


class Drone extends ZergUnit implements Runnable{
	static int cost=50; //���
	static int gascost=0; //�������
	static int buildtime = 70; //����µ� �ɸ��� �ð�
	static int attackspeed = 400; //���ݽ��ǵ�
	Drone(StarUI ui){
		super(ui);
		name = "Drone";
		energy=50;
		power=1;
		work=true;
		flag=true;
		progress=0;
		con = new Vector();
		con.addElement("�����");
		con.addElement("�̳׶�");
		con.addElement("����");
		con.addElement("Hatchery");
		con.addElement("SpawningPool");
		con.addElement("HydraliskDen");
		con.addElement("CreepColony");
		con.addElement("����");
		condi=(String) con.elementAt(0);
		go=new Thread(this);
		go.start();
	}
		
	public void run(){
		while(true){

			switch(job){
			case 0:
				flag=true;
				condi=(String)con.elementAt(0);
				go.suspend();
				break;
			case 1:
				flag=true;
				addMineral();
				break;
			case 2: 
				flag=true;
				addGas();
				break;
			case 3:
				flag=true;
				makeMainB();
				break;
			case 4:
				flag=true;
				makeSpawningPool();
				break;
			case 5:
				flag=true;
				makeHydraliskDen();
				break;
			case 6:
				flag=true;
				makeCreepColony();
				break;
			case 7:
				flag=true;
				condi=(String)getCondition(7);
				int rand;
				ui.setTB(ui.clan.workerVT);
				while(true){ 
					if(ui.enemy.clan.attacker2VT.size()!=0){
						rand=random.nextInt(ui.enemy.clan.attacker2VT.size());
						((StarObject)(ui.enemy.clan.attacker2VT.elementAt(rand))).flag=false;
						((StarObject)(ui.enemy.clan.attacker2VT.elementAt(rand))).target=this;
						((StarObject)(ui.enemy.clan.attacker2VT.elementAt(rand))).vt=ui.clan.workerVT;
						((StarObject)(ui.enemy.clan.attacker2VT.elementAt(rand))).job=3;
						((StarObject)(ui.enemy.clan.attacker2VT.elementAt(rand))).go.resume();
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.attacker2VT,(StarObject)ui.enemy.clan.attacker2VT.elementAt(rand));
						ui.enemy.clan.setUnit(ui.enemy.clan.attacker1VT.size(),ui.enemy.clan.attacker2VT.size(),ui.enemy.clan.workerVT.size());
						ui.enemy.U_unit.setText(String.valueOf(ui.enemy.clan.getUnit()));
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getAttacker2Name()){ //���� ���̴� ȭ���� ���� 2�϶�
							ui.enemy.setTB(ui.enemy.clan.attacker2VT); // ����
						}
						if(flag==false)
							break;
					}
					else if(ui.enemy.clan.attacker1VT.size()!=0){
						rand=random.nextInt(ui.enemy.clan.attacker1VT.size());
						((StarObject)(ui.enemy.clan.attacker1VT.elementAt(rand))).flag=false;
						((StarObject)(ui.enemy.clan.attacker1VT.elementAt(rand))).target=this;
						((StarObject)(ui.enemy.clan.attacker1VT.elementAt(rand))).vt=ui.clan.workerVT;
						((StarObject)(ui.enemy.clan.attacker1VT.elementAt(rand))).job=3;
						((StarObject)(ui.enemy.clan.attacker1VT.elementAt(rand))).go.resume();
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.attacker1VT,(StarObject)ui.enemy.clan.attacker1VT.elementAt(rand));
						ui.enemy.clan.setUnit(ui.enemy.clan.attacker1VT.size(),ui.enemy.clan.attacker2VT.size(),ui.enemy.clan.workerVT.size());
						ui.enemy.U_unit.setText(String.valueOf(ui.enemy.clan.getUnit()));
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getAttacker1Name()){ 
							ui.enemy.setTB(ui.enemy.clan.attacker1VT); // ����
						}
						if(flag==false)
							break;
					}
					else if(ui.enemy.clan.workerVT.size()!=0){
						System.out.println("zz");
						rand=random.nextInt(ui.enemy.clan.workerVT.size());						
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.workerVT,(StarObject)ui.enemy.clan.workerVT.elementAt(rand));
						ui.enemy.clan.setUnit(ui.enemy.clan.attacker1VT.size(),ui.enemy.clan.attacker2VT.size(),ui.enemy.clan.workerVT.size());
						ui.enemy.U_unit.setText(String.valueOf(ui.enemy.clan.getUnit()));
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getWorkerName()){ //���̴� ȭ���� �ϲ��϶�
							ui.enemy.setTB(ui.enemy.clan.workerVT); // ����
						}
						if(flag==false)
							break;
					}
					else if(ui.enemy.clan.building2VT.size()!=0){
						rand=random.nextInt(ui.enemy.clan.building2VT.size());
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.building2VT,(StarObject)ui.enemy.clan.building2VT.elementAt(rand));
						ui.enemy.clan.setBuilding(ui.enemy.clan.mainBVT.size(),ui.enemy.clan.building1VT.size(),ui.enemy.clan.building2VT.size(),ui.enemy.clan.building3VT.size());
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getBuilding2Name()){ 
							ui.enemy.setTB(ui.enemy.clan.building2VT); // ����
						}
						if(flag==false)
							break;
					}
					else if(ui.enemy.clan.building1VT.size()!=0){
						rand=random.nextInt(ui.enemy.clan.building1VT.size());
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.building1VT,(StarObject)ui.enemy.clan.building1VT.elementAt(rand));
						ui.enemy.clan.setBuilding(ui.enemy.clan.mainBVT.size(),ui.enemy.clan.building1VT.size(),ui.enemy.clan.building2VT.size(),ui.enemy.clan.building3VT.size());
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getBuilding1Name()){ 
							ui.enemy.setTB(ui.enemy.clan.building1VT); // ����
						}
						if(flag==false)
							break;
					}
					else if(ui.enemy.clan.mainBVT.size()!=0){
						rand=random.nextInt(ui.enemy.clan.mainBVT.size());
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.mainBVT,(StarObject)ui.enemy.clan.mainBVT.elementAt(rand));
						ui.enemy.clan.setBuilding(ui.enemy.clan.mainBVT.size(),ui.enemy.clan.building1VT.size(),ui.enemy.clan.building2VT.size(),ui.enemy.clan.building3VT.size());
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getMainBName()){
							ui.enemy.setTB(ui.enemy.clan.mainBVT); // ����
						}
						if(flag==false)
							break;
					}
					else if(ui.enemy.clan.building3VT.size()!=0){
						rand=random.nextInt(ui.enemy.clan.building3VT.size());
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.building3VT,(StarObject)ui.enemy.clan.building3VT.elementAt(rand));
						ui.enemy.U_maxunit.setText(String.valueOf(ui.enemy.clan.building3VT.size()*8+10));
						ui.enemy.clan.setBuilding(ui.enemy.clan.mainBVT.size(),ui.enemy.clan.building1VT.size(),ui.enemy.clan.building2VT.size(),ui.enemy.clan.building3VT.size());
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getBuilding3Name()){
							ui.enemy.setTB(ui.enemy.clan.building3VT); // ����
						}
						if(flag==false)
							break;
					}
					/////////�ǹ��� ������������//////////
					if(ui.enemy.clan.getBuilding()==0||flag==false){ //�ǹ��� �� ��������
						job=0; //���� ����
						condi=(String)getCondition(0);
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getWorkerName())
							ui.setTB(ui.enemy.clan.workerVT);
						ui.endMessage("�¸��Ͽ����ϴ�.");
						ui.enemy.endMessage("�й��Ͽ����ϴ�.");
						System.exit(0); //���� ����
						break;
					}
				}
				if(flag==false)
					break;
				
				break;
			}
		}		
	}
	
	public boolean getFlag(){
		return flag;
	}
	
	
	void addMineral(){
		condi=(String)getCondition(1);
		ui.setTB(ui.clan.workerVT); //�������� �ٲ�			
		while(true){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {}
			ui.clan.setMineral(8);;
			ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));
			
			if(flag==false){
				break;
			}
		}		
	}
	void addGas(){
		condi=(String)getCondition(2);
		ui.setTB(ui.clan.workerVT);
		while(true){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {}
			ui.clan.setGas(8);
			ui.U_gas.setText(String.valueOf(ui.clan.getGas()));
			
			if(flag==false){
				break;
			}
		}		
	}
	void makeMainB(){
		if(ui.clan.getMineral()>=Hatchery.cost){
			condi=(String)getCondition(3);
			ui.clan.setMineral(-Hatchery.cost);
			ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));
			ui.setTB(ui.clan.workerVT);
			progressing(Hatchery.buildtime);
			ui.clan.mainBVT.addElement(new Hatchery(ui));
			ui.clan.setBuilding(ui.clan.mainBVT.size(),ui.clan.building1VT.size(),ui.clan.building2VT.size(),ui.clan.building3VT.size());
			condi=(String)getCondition(0);
			if(ui.U_name.getText()==ui.clan.getWorkerName())
				ui.setTB(ui.clan.workerVT);
			if(ui.U_name.getText()==ui.clan.getMainBName())
				ui.setTB(ui.clan.mainBVT);
		}
		else{
			ui.setMessage("Not enough minerals");
		}
		progress=0;
		job=0;
	}
	void makeSpawningPool(){
		
		if(ui.clan.getMineral()>=SpawningPool.cost){
			condi=(String)getCondition(4);
			ui.clan.setMineral(-SpawningPool.cost);
			ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));
			ui.setTB(ui.clan.workerVT);
			progressing(SpawningPool.buildtime);
			ui.clan.building1VT.addElement(new SpawningPool(ui));
			ui.clan.setBuilding(ui.clan.mainBVT.size(),ui.clan.building1VT.size(),ui.clan.building2VT.size(),ui.clan.building3VT.size());
			condi=(String)getCondition(0);
			if(ui.U_name.getText()==ui.clan.getWorkerName())
				ui.setTB(ui.clan.workerVT);
			if(ui.U_name.getText()==ui.clan.getBuilding1Name())
				ui.setTB(ui.clan.building1VT);
		}
		else{
			ui.setMessage("Not enough minerals");
		}

		progress=0;
		job=0;
	}
	void makeHydraliskDen(){
		if(ui.clan.getMineral()>=HydraliskDen.cost && ui.clan.getGas()>=HydraliskDen.gascost){
			condi=(String)getCondition(5);
			ui.clan.setMineral(-HydraliskDen.cost);
			ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));
			ui.clan.setGas(-HydraliskDen.gascost);
			ui.U_gas.setText(String.valueOf(ui.clan.getGas()));
			ui.setTB(ui.clan.workerVT);
			progressing(HydraliskDen.buildtime);
			ui.clan.building2VT.addElement(new HydraliskDen(ui));
			ui.clan.setBuilding(ui.clan.mainBVT.size(),ui.clan.building1VT.size(),ui.clan.building2VT.size(),ui.clan.building3VT.size());
			condi=(String)getCondition(0);
			if(ui.U_name.getText()==ui.clan.getWorkerName())
				ui.setTB(ui.clan.workerVT);
			if(ui.U_name.getText()==ui.clan.getBuilding2Name())
				ui.setTB(ui.clan.building2VT);
		}
		else if(ui.clan.getMineral()<HydraliskDen.cost)
			ui.setMessage("Not enough minerals");
		else
			ui.setMessage("Not enough Vespene gases");
		

		progress=0;
		job=0;
	}
	void makeCreepColony(){
		if(ui.clan.getMineral()>=CreepColony.cost){
			condi=(String)getCondition(6);
			ui.clan.setMineral(-CreepColony.cost);
			ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));
			ui.setTB(ui.clan.workerVT);
			progressing(CreepColony.buildtime);
			ui.clan.building3VT.addElement(new CreepColony(ui));
			ui.clan.setBuilding(ui.clan.mainBVT.size(),ui.clan.building1VT.size(),ui.clan.building2VT.size(),ui.clan.building3VT.size());
			condi=(String)getCondition(0);
			if(ui.U_name.getText()==ui.clan.getWorkerName())
				ui.setTB(ui.clan.workerVT);
			if(ui.U_name.getText()==ui.clan.getBuilding3Name())
				ui.setTB(ui.clan.building3VT);
		}
		else
			ui.setMessage("Not enough minerals");
		progress=0;
		job=0;
	}
}

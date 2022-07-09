import java.awt.event.ActionEvent;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


class SCV extends TerranUnit implements Runnable{
	static int cost=50; //비용
	static int gascost=0; //가스비용
	static int buildtime = 70;
	static int attackspeed = 600;
	SCV(StarUI ui){
		super(ui);
		name = "SCV";
		energy=60;
		power=2;
		work=true;
		flag=true;
		progress=0;
		con = new Vector();
		con.addElement("노는중");
		con.addElement("미네랄");
		con.addElement("가스");
		con.addElement("커맨드");
		con.addElement("베럭스");
		con.addElement("팩토리");
		con.addElement("서플라이");
		con.addElement("공격");
		condi=(String) con.elementAt(0);
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
				makeBarracks();
				break;
			case 5:
				flag=true;
				makeFactory();
				break;
			case 6:
				flag=true;
				makeSupplyDepot();
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
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getAttacker2Name()){ //보이는 화면이 일꾼일때
							ui.enemy.setTB(ui.enemy.clan.attacker2VT); // 제거
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
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getAttacker1Name()){ //보이는 화면이 일꾼일때
							ui.enemy.setTB(ui.enemy.clan.attacker1VT); // 제거
						}
						if(flag==false)
							break;
					}
					else if(ui.enemy.clan.workerVT.size()!=0){
						rand=random.nextInt(ui.enemy.clan.workerVT.size());						
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.workerVT,(StarObject)ui.enemy.clan.workerVT.elementAt(rand));
						ui.enemy.clan.setUnit(ui.enemy.clan.attacker1VT.size(),ui.enemy.clan.attacker2VT.size(),ui.enemy.clan.workerVT.size());
						ui.enemy.U_unit.setText(String.valueOf(ui.enemy.clan.getUnit()));
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getWorkerName()){ //보이는 화면이 일꾼일때
							ui.enemy.setTB(ui.enemy.clan.workerVT); // 제거
						}
						if(flag==false)
							break;
					}
					else if(ui.enemy.clan.building2VT.size()!=0){
						rand=random.nextInt(ui.enemy.clan.building2VT.size());
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.building2VT,(StarObject)ui.enemy.clan.building2VT.elementAt(rand));
						ui.enemy.clan.setBuilding(ui.enemy.clan.mainBVT.size(),ui.enemy.clan.building1VT.size(),ui.enemy.clan.building2VT.size(),ui.enemy.clan.building3VT.size());
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getBuilding2Name()){ //보이는 화면이 일꾼일때
							ui.enemy.setTB(ui.enemy.clan.building2VT); // 제거
						}
						if(flag==false)
							break;
					}
					else if(ui.enemy.clan.building1VT.size()!=0){
						rand=random.nextInt(ui.enemy.clan.building1VT.size());
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.building1VT,(StarObject)ui.enemy.clan.building1VT.elementAt(rand));
						ui.enemy.clan.setBuilding(ui.enemy.clan.mainBVT.size(),ui.enemy.clan.building1VT.size(),ui.enemy.clan.building2VT.size(),ui.enemy.clan.building3VT.size());
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getBuilding1Name()){ //보이는 화면이 일꾼일때
							ui.enemy.setTB(ui.enemy.clan.building1VT); // 제거
						}
						if(flag==false)
							break;
					}
					else if(ui.enemy.clan.mainBVT.size()!=0){
						rand=random.nextInt(ui.enemy.clan.mainBVT.size());
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.mainBVT,(StarObject)ui.enemy.clan.mainBVT.elementAt(rand));
						ui.enemy.clan.setBuilding(ui.enemy.clan.mainBVT.size(),ui.enemy.clan.building1VT.size(),ui.enemy.clan.building2VT.size(),ui.enemy.clan.building3VT.size());
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getMainBName()){ //보이는 화면이 일꾼일때
							ui.enemy.setTB(ui.enemy.clan.mainBVT); // 제거
						}
						if(flag==false)
							break;
					}
					else if(ui.enemy.clan.building3VT.size()!=0){
						rand=random.nextInt(ui.enemy.clan.building3VT.size());
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.building3VT,(StarObject)ui.enemy.clan.building3VT.elementAt(rand));
						ui.enemy.U_maxunit.setText(String.valueOf(ui.enemy.clan.building3VT.size()*8+10));
						ui.enemy.clan.setBuilding(ui.enemy.clan.mainBVT.size(),ui.enemy.clan.building1VT.size(),ui.enemy.clan.building2VT.size(),ui.enemy.clan.building3VT.size());
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getBuilding3Name()){ //보이는 화면이 일꾼일때
							ui.enemy.setTB(ui.enemy.clan.building3VT); // 제거
						}
						if(flag==false)
							break;
					}
					
					if(ui.enemy.clan.getBuilding()==0||flag==false){ //건물이 다 업어지면
						job=0; //공격 중지
						condi=(String)getCondition(0);
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getWorkerName())
							ui.setTB(ui.enemy.clan.workerVT);
						ui.endMessage("승리하였습니다.");
						ui.enemy.endMessage("패배하였습니다.");
						System.exit(0); //게임 종료
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
		ui.setTB(ui.clan.workerVT); //상태정보 바꿈
		
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
		if(ui.clan.getMineral()>=CommandCenter.cost){
			condi=(String)getCondition(3);
			ui.clan.setMineral(-CommandCenter.cost);
			ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));
			ui.setTB(ui.clan.workerVT);
			progressing(CommandCenter.buildtime);
			ui.clan.mainBVT.addElement(new CommandCenter(ui));
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
	void makeBarracks(){
		
		if(ui.clan.getMineral()>=Barracks.cost){
			condi=(String)getCondition(4);
			ui.clan.setMineral(-Barracks.cost);
			ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));
			ui.setTB(ui.clan.workerVT);
			progressing(Barracks.buildtime);
			ui.clan.building1VT.addElement(new Barracks(ui));
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
	void makeFactory(){
		if(ui.clan.getMineral()>=Factory.cost && ui.clan.getGas()>=Factory.gascost){
			condi=(String)getCondition(5);
			ui.clan.setMineral(-Factory.cost);
			ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));
			ui.clan.setGas(-Factory.gascost);
			ui.U_gas.setText(String.valueOf(ui.clan.getGas()));
			ui.setTB(ui.clan.workerVT);
			progressing(Factory.buildtime);
			ui.clan.building2VT.addElement(new Factory(ui));
			ui.clan.setBuilding(ui.clan.mainBVT.size(),ui.clan.building1VT.size(),ui.clan.building2VT.size(),ui.clan.building3VT.size());
			condi=(String)getCondition(0);
			if(ui.U_name.getText()==ui.clan.getWorkerName())
				ui.setTB(ui.clan.workerVT);
			if(ui.U_name.getText()==ui.clan.getBuilding2Name())
				ui.setTB(ui.clan.building2VT);
		}
		else if(ui.clan.getMineral()<Factory.cost)
			ui.setMessage("Not enough minerals");
		else
			ui.setMessage("Not enough Vespene gases");
		

		progress=0;
		job=0;
	}
	void makeSupplyDepot(){
		if(ui.clan.getMineral()>=SupplyDepot.cost){
			condi=(String)getCondition(6);
			ui.clan.setMineral(-SupplyDepot.cost);
			ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));
			ui.setTB(ui.clan.workerVT);
			progressing(SupplyDepot.buildtime);
			ui.clan.building3VT.addElement(new SupplyDepot(ui));
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

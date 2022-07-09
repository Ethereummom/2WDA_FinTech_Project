import java.util.Vector;


class DarkArchon extends ProtossUnit implements Runnable {
	static int cost=150;
	static int gascost=100;
	static int buildtime=150;
	static int attackspeed=800;
	DarkArchon(StarUI ui) {
		super(ui);
		name = "DarkArchon";
		energy = 150;
		power=10;
		work=true;
		flag=true;
		con = new Vector();
		con.addElement("노는중");
		con.addElement("공격중");
		
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
				condi=(String)getCondition(1);				
				int rand;
				ui.setTB(ui.clan.attacker2VT);
				while(true){ 
					if(ui.enemy.clan.attacker2VT.size()!=0){
						rand=random.nextInt(ui.enemy.clan.attacker2VT.size());
						/////////적 방어 시킴///////
						((StarObject)(ui.enemy.clan.attacker2VT.elementAt(rand))).flag=false;
						((StarObject)(ui.enemy.clan.attacker2VT.elementAt(rand))).target=this;
						((StarObject)(ui.enemy.clan.attacker2VT.elementAt(rand))).vt=ui.clan.attacker2VT;
						((StarObject)(ui.enemy.clan.attacker2VT.elementAt(rand))).job=3;
						((StarObject)(ui.enemy.clan.attacker2VT.elementAt(rand))).go.resume();
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.attacker2VT,(StarObject)ui.enemy.clan.attacker2VT.elementAt(rand));
						ui.enemy.clan.setUnit(ui.enemy.clan.attacker1VT.size(),ui.enemy.clan.attacker2VT.size(),ui.enemy.clan.workerVT.size());
						ui.enemy.U_unit.setText(String.valueOf(ui.enemy.clan.getUnit()));
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getAttacker2Name()){ //적의 보이는 화면이 유닛2 일때
							ui.enemy.setTB(ui.enemy.clan.attacker2VT); // 제거
						}
						if(flag==false)
							break;
					}
					else if(ui.enemy.clan.attacker1VT.size()!=0){
						rand=random.nextInt(ui.enemy.clan.attacker1VT.size());
						((StarObject)(ui.enemy.clan.attacker1VT.elementAt(rand))).flag=false;
						((StarObject)(ui.enemy.clan.attacker1VT.elementAt(rand))).target=this;
						((StarObject)(ui.enemy.clan.attacker1VT.elementAt(rand))).vt=ui.clan.attacker2VT;
						((StarObject)(ui.enemy.clan.attacker1VT.elementAt(rand))).job=3;
						((StarObject)(ui.enemy.clan.attacker1VT.elementAt(rand))).go.resume();
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.attacker1VT,(StarObject)ui.enemy.clan.attacker1VT.elementAt(rand));
						ui.enemy.clan.setUnit(ui.enemy.clan.attacker1VT.size(),ui.enemy.clan.attacker2VT.size(),ui.enemy.clan.workerVT.size());
						ui.enemy.U_unit.setText(String.valueOf(ui.enemy.clan.getUnit()));
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getAttacker1Name()){
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
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getWorkerName()){ 
							ui.enemy.setTB(ui.enemy.clan.workerVT); // 제거
						}
						if(flag==false)
							break;
					}
					else if(ui.enemy.clan.building2VT.size()!=0){
						rand=random.nextInt(ui.enemy.clan.building2VT.size());
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.building2VT,(StarObject)ui.enemy.clan.building2VT.elementAt(rand));
						ui.enemy.clan.setBuilding(ui.enemy.clan.mainBVT.size(),ui.enemy.clan.building1VT.size(),ui.enemy.clan.building2VT.size(),ui.enemy.clan.building3VT.size());
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getBuilding2Name()){
							ui.enemy.setTB(ui.enemy.clan.building2VT); // 제거
						}
						if(flag==false)
							break;
					}
					else if(ui.enemy.clan.building1VT.size()!=0){
						rand=random.nextInt(ui.enemy.clan.building1VT.size());
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.building1VT,(StarObject)ui.enemy.clan.building1VT.elementAt(rand));
						ui.enemy.clan.setBuilding(ui.enemy.clan.mainBVT.size(),ui.enemy.clan.building1VT.size(),ui.enemy.clan.building2VT.size(),ui.enemy.clan.building3VT.size());
						//ui.enemy.U_building.setText(String.valueOf(ui.enemy.clan.getBuilding()));
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getBuilding1Name()){ 
							ui.enemy.setTB(ui.enemy.clan.building1VT); // 제거
						}
						if(flag==false)
							break;
					}
					else if(ui.enemy.clan.mainBVT.size()!=0){
						rand=random.nextInt(ui.enemy.clan.mainBVT.size());
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.mainBVT,(StarObject)ui.enemy.clan.mainBVT.elementAt(rand));
						ui.enemy.clan.setBuilding(ui.enemy.clan.mainBVT.size(),ui.enemy.clan.building1VT.size(),ui.enemy.clan.building2VT.size(),ui.enemy.clan.building3VT.size());
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getMainBName()){ 
							ui.enemy.setTB(ui.enemy.clan.mainBVT); // 제거
						}
						if(flag==false)
							break;
					}
					else if(ui.enemy.clan.building3VT.size()!=0){
						rand=random.nextInt(ui.enemy.clan.building3VT.size());
						attack(power+ui.clan.getUpgrade(),attackspeed,ui.enemy.clan.building3VT,(StarObject)ui.enemy.clan.building3VT.elementAt(rand));
						System.out.println(ui.enemy.clan.building3VT.size());
						ui.enemy.U_maxunit.setText(String.valueOf(ui.enemy.clan.building3VT.size()*8+10));
						ui.enemy.clan.setBuilding(ui.enemy.clan.mainBVT.size(),ui.enemy.clan.building1VT.size(),ui.enemy.clan.building2VT.size(),ui.enemy.clan.building3VT.size());
						if(ui.enemy.U_name.getText()==ui.enemy.clan.getBuilding3Name()){ 
							ui.enemy.setTB(ui.enemy.clan.building3VT); // 제거
						}
						if(flag==false)
							break;
					}
					
					if(ui.enemy.clan.getBuilding()==0||flag==false){ //건물이 다 없어지면
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
			case 3:
				flag=true;
				condi="방어중";
				ui.setTB(ui.clan.attacker2VT);
				attack(power+ui.clan.getUpgrade(),attackspeed, vt, target);
				ui.enemy.clan.setUnit(ui.enemy.clan.attacker1VT.size(),ui.enemy.clan.attacker2VT.size(),ui.enemy.clan.workerVT.size());
				ui.enemy.U_unit.setText(String.valueOf(ui.enemy.clan.getUnit()));
				if(ui.enemy.U_name.getText()==target.name){ 
					ui.enemy.setTB(vt); // 제거
				}
				condi=(String)getCondition(0);
				if(ui.U_name.getText()==ui.clan.getAttacker2Name()){ 
					ui.setTB(ui.clan.attacker2VT); // 갱신
				}
				job=0;
				if(flag==false)
					break;
				break;
			}
		}
	}	
}

import java.util.Vector;

import javax.swing.ImageIcon;


abstract class Tribe {
	StarUI ui;

	ImageIcon mainBIC, building1IC, building2IC, building3IC, workerIC, attacker1IC, attacker2IC; // 라벨 이미지
	ImageIcon buildingface, workerface, attacker1face, attacker2face; // 각 페이스 이미지
	protected int mineral; //미네랄
	protected int gas; //가스
	protected int unit; //총 유닛 갯수
	protected int maxunit=10; //최대 만들수 있는 유닛 갯수
	protected int building; //총 건물 갯수
	protected int upgradepower; //업그레이드 파워		
	protected String tribe; //종족이름	
	protected String mainbuildingName; //본건물 이름
	protected String building1Name; //공격생산건물 1
	protected String building2Name; //공격생산건물 2
	protected String building3Name; //건물3
	protected String workerName; //일꾼이름
	protected String attacker1Name; //공격유닛1
	protected String attacker2Name; //공격유닛2	
	//유닛 및 건물 설명 부분//
	protected String mainBdesc;
	protected String building1desc;
	protected String building2desc;
	protected String building3desc;
	protected String workerdesc;
	protected String attacker1desc;
	protected String attacker2desc;	
	protected int workerPower;//일꾼 공격력
	protected int attacker1Power;//유닛 1 공격력
	protected int attacker2Power;//유닛 2 공격력
	protected int workerEnergy;//일꾼 에너지 정보
	protected int attacker1Energy;//유닛1 에너지 정보
	protected int attacker2Energy;//유닛2 에너지 정보
	protected int mainBEnergy;//메인건물 에너지 정보
	protected int building1Energy;//건물1에너지 정보
	protected int building2Energy;//건물2에너지 정보
	protected int building3Energy;//건물3에너지 정보
	
	Vector mainBVT; //메인건물 객체 담는곳
	Vector workerVT; // 일꾼객체
	Vector building1VT; // 공격생산1건물
	Vector attacker1VT; // 공격유닛1
	Vector building2VT; // 공격생산2건물
	Vector attacker2VT; // 공격유닛2
	Vector building3VT; // 건물(최대 만들수있는 유닛 증가 and 업그레이드가능)
	/////////각 건물 및 유닛 아이템(콤보박스)정보 담는 벡터//////
	Vector mainBItem;
	Vector building1Item;
	Vector building2Item;
	Vector building3Item;
	Vector workerItem;
	Vector attacker1Item;
	Vector attacker2Item;
	Tribe(StarUI ui){
		this.ui = ui;
		mineral=100;
		gas=100;
		
	}
	public int getMainBEnergy(){
		return mainBEnergy;
	}
	public int getBuilding1Energy(){
		return building1Energy;
	}
	public int getBuilding2Energy(){
		return building2Energy;
	}
	public int getBuilding3Energy(){
		return building3Energy;
	}
	public int getWorkerEnergy(){
		return workerEnergy;
	}
	public int getAttacker1Energy(){
		return attacker1Energy;
	}
	public int getAttacekr2Energy(){
		return attacker2Energy;
	}
	public void setUpgrade(int i){
		upgradepower += i;
	}
	public int getUpgrade(){
		return upgradepower;
	}
	public ImageIcon getWorkerIC(){
		return workerIC;
	}
	
	synchronized void setMineral(int i){
		mineral+=i;
	}
	public int getMineral(){
		return mineral;
	}	
	synchronized void setGas(int i){
		gas+=i;
	}
	public int getGas(){
		return gas;
	}	
	synchronized void setUnit(int a, int b, int c){
		unit=a+b+c;
	}
	public int getUnit(){
		return unit;
	}
	synchronized void setMaxunit(int i){
		maxunit +=i;
	}
	public int getMaxunit(){
		return maxunit;
	}
	synchronized void setBuilding(int a,int b,int c,int d){
		building = a+b+c+d;
	}
	public int getBuilding(){
		return building;
	}	
	public String getTribeName(){
		return tribe;
	}
	public String getMainBName(){
		return mainbuildingName;
	}
	public String getBuilding1Name(){
		return building1Name;
	}
	public String getBuilding2Name(){
		return building2Name;
	}
	public String getBuilding3Name(){
		return building3Name;
	}
	public String getWorkerName(){
		return workerName;
	}
	public String getAttacker1Name(){
		return attacker1Name;
	}
	public String getAttacker2Name(){
		return attacker2Name;
	}
	public int getWorkerpower(){
		return workerPower;
	}
	public int getAttacker1power(){
		return attacker1Power;
	}
	public int getAttacker2power(){
		return attacker2Power;
	}	
}

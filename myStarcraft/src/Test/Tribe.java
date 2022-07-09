package Test;

import java.util.ArrayList;

import javax.swing.ImageIcon;

abstract class Tribe {
	StarUI ui;

	ImageIcon mainBIC, workerIC; // 라벨 이미지
	ImageIcon buildingface, workerface, attacker1face, attacker2face; // 각 페이스 이미지
	protected int mineral; // 미네랄

	protected int gas; // 가스
	
	protected int unit; // 총 유닛 갯수
	protected int maxunit = 10; // 최대 만들수 있는 유닛 갯수
	protected int building; // 총 건물 갯수
	protected int upgradepower; // 업그레이드 파워
	protected String tribe; // 종족이름
	protected String mainbuildingName; // 본건물 이름
	protected String workerName; // 일꾼이름
	// 유닛 및 건물 설명 부분//
	protected String mainBdesc;
	protected String workerdesc;
	protected int workerPower;// 일꾼 공격력
	protected int workerEnergy;// 일꾼 에너지 정보
	protected int mainBEnergy;// 메인건물 에너지 정보

	ArrayList mainBVT; // 메인건물 객체 담는곳
	ArrayList workerVT; // 일꾼객체
	///////// 각 건물 및 유닛 아이템(콤보박스)정보 담는 벡터//////
	ArrayList mainBItem;
	ArrayList workerItem;

	Tribe(StarUI ui) {
		this.ui = ui;
		mineral = 100;
		gas = 100;

	}

	public int getMainBEnergy() {
		return mainBEnergy;
	}

	public int getWorkerEnergy() {
		return workerEnergy;
	}

	public void setUpgrade(int i) {
		upgradepower += i;
	}

	public int getUpgrade() {
		return upgradepower;
	}

	public ImageIcon getWorkerIC() {
		return workerIC;
	}

	synchronized void setMineral(int i) {
		mineral += i;
	}

	public int getMineral() {
		return mineral;
	}
	
	

	synchronized void setGas(int i) {
		gas += i;
	}

	public int getGas() {
		return gas;
	}

	synchronized void setUnit(int a) {
		unit = a;
	}

	public int getUnit() {
		return unit;
	}

	synchronized void setMaxunit(int i) {
		maxunit += i;
	}

	public int getMaxunit() {
		return maxunit;
	}

	synchronized void setBuilding(int a) {
		building = a;
	}

	public int getBuilding() {
		return building;
	}

	public String getTribeName() {
		return tribe;
	}

	public String getMainBName() {
		return mainbuildingName;
	}


	public String getWorkerName() {
		return workerName;
	}


	public int getWorkerpower() {
		return workerPower;
	}

}

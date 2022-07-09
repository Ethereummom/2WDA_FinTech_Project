package Test;

import java.util.ArrayList;

import javax.swing.ImageIcon;

abstract class Tribe {
	StarUI ui;

	ImageIcon mainBIC, workerIC; // �� �̹���
	ImageIcon buildingface, workerface, attacker1face, attacker2face; // �� ���̽� �̹���
	protected int mineral; // �̳׶�

	protected int gas; // ����
	
	protected int unit; // �� ���� ����
	protected int maxunit = 10; // �ִ� ����� �ִ� ���� ����
	protected int building; // �� �ǹ� ����
	protected int upgradepower; // ���׷��̵� �Ŀ�
	protected String tribe; // �����̸�
	protected String mainbuildingName; // ���ǹ� �̸�
	protected String workerName; // �ϲ��̸�
	// ���� �� �ǹ� ���� �κ�//
	protected String mainBdesc;
	protected String workerdesc;
	protected int workerPower;// �ϲ� ���ݷ�
	protected int workerEnergy;// �ϲ� ������ ����
	protected int mainBEnergy;// ���ΰǹ� ������ ����

	ArrayList mainBVT; // ���ΰǹ� ��ü ��°�
	ArrayList workerVT; // �ϲ۰�ü
	///////// �� �ǹ� �� ���� ������(�޺��ڽ�)���� ��� ����//////
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

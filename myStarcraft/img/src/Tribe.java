import java.util.Vector;

import javax.swing.ImageIcon;


abstract class Tribe {
	StarUI ui;

	ImageIcon mainBIC, building1IC, building2IC, building3IC, workerIC, attacker1IC, attacker2IC; // �� �̹���
	ImageIcon buildingface, workerface, attacker1face, attacker2face; // �� ���̽� �̹���
	protected int mineral; //�̳׶�
	protected int gas; //����
	protected int unit; //�� ���� ����
	protected int maxunit=10; //�ִ� ����� �ִ� ���� ����
	protected int building; //�� �ǹ� ����
	protected int upgradepower; //���׷��̵� �Ŀ�		
	protected String tribe; //�����̸�	
	protected String mainbuildingName; //���ǹ� �̸�
	protected String building1Name; //���ݻ���ǹ� 1
	protected String building2Name; //���ݻ���ǹ� 2
	protected String building3Name; //�ǹ�3
	protected String workerName; //�ϲ��̸�
	protected String attacker1Name; //��������1
	protected String attacker2Name; //��������2	
	//���� �� �ǹ� ���� �κ�//
	protected String mainBdesc;
	protected String building1desc;
	protected String building2desc;
	protected String building3desc;
	protected String workerdesc;
	protected String attacker1desc;
	protected String attacker2desc;	
	protected int workerPower;//�ϲ� ���ݷ�
	protected int attacker1Power;//���� 1 ���ݷ�
	protected int attacker2Power;//���� 2 ���ݷ�
	protected int workerEnergy;//�ϲ� ������ ����
	protected int attacker1Energy;//����1 ������ ����
	protected int attacker2Energy;//����2 ������ ����
	protected int mainBEnergy;//���ΰǹ� ������ ����
	protected int building1Energy;//�ǹ�1������ ����
	protected int building2Energy;//�ǹ�2������ ����
	protected int building3Energy;//�ǹ�3������ ����
	
	Vector mainBVT; //���ΰǹ� ��ü ��°�
	Vector workerVT; // �ϲ۰�ü
	Vector building1VT; // ���ݻ���1�ǹ�
	Vector attacker1VT; // ��������1
	Vector building2VT; // ���ݻ���2�ǹ�
	Vector attacker2VT; // ��������2
	Vector building3VT; // �ǹ�(�ִ� ������ִ� ���� ���� and ���׷��̵尡��)
	/////////�� �ǹ� �� ���� ������(�޺��ڽ�)���� ��� ����//////
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

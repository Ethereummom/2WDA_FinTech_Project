import java.util.Random;
import java.util.Vector;

import javax.swing.ImageIcon;


abstract class StarObject {
	StarUI ui;

	Random random = new Random();
	protected String condi;	 //���������� ��� ����
	protected int energy; // ��ü ������
	protected String name; // ��ü �̸�
	protected String tribe; // ��ü ���� ����
	
	Vector con;//��������
	boolean work;//�۾������� �ƴ��� �ľ�
	boolean flag;//�ٸ� �۾��� ���� ����
	int job;//���� �� �۾�
	int progress; //���� ��Ȳ
	
	
	Thread go;//������ ����
	StarObject target; //���� Ÿ��
	Vector vt; // �ڽ��� ��ü ��ȯ
	StarObject(StarUI ui){
		this.ui = ui;
	}
	public Object getCondition(int i){ //���°�������
		return con.elementAt(i);
	}
	public String getTribe() {
		return tribe;
	}
	public String getCondition(){
		return condi;
	}
	public String getName(){
		return name;
	}
	public void setThread(Thread go){
		this.go = go;
	}
	public Thread getThread(){
		return go;
	}
	public int getEnergy() {
		return energy;
	}
	public void setFlag(boolean flag){
		this.flag = flag;
	}
	public boolean getFlag() {
		return flag;
	}
	public void setJob(int job) {
		this.job = job;
	}
	public int getJob() {
		return job;
	}
	
}

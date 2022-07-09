package Test;

import java.util.ArrayList;

import javax.swing.ImageIcon;
class Terran extends Tribe {
	
	Terran(StarUI ui){
		
		super(ui);
		
		this.ui = ui;
		tribe = "Terran"; //���� �̸�
		//////////���� �� �ǹ� �̸�//////////
		mainbuildingName="CommandCenter";
		workerName="SCV";
		/////////������ �Ŀ�����//////
		workerPower=2;
		///////���� �� �ǹ� ������ ����/////
		workerEnergy=60;
		mainBEnergy=1500;
		//////////���� �� �ǹ� ������ ����/////
		mainBdesc = "Terran Command Center";
		workerdesc = "Terran SCV";
		///////////�ǹ��� ���� �̹���//////////////
		mainBIC = new ImageIcon("img/terranmainB.jpg");
		workerIC = new ImageIcon("img/terranworker.jpg");
		//////////�ǹ� �� ���� ���̽� �̹���/////////////
		buildingface = new ImageIcon("img/terranbuildingface.jpg");
		workerface =new ImageIcon("img/terranworkerface.jpg");
		attacker1face = new ImageIcon("img/terranattacker1face.jpg");
		attacker2face = new ImageIcon("img/terranattacker2face.jpg");
		
		
		///////////�ǹ� �� ���� ������(�ൿ)���� �ʱ�ȭ///////////	
		mainBVT = new ArrayList();
		workerVT = new ArrayList();
		
		mainBVT = new ArrayList();
		workerVT = new ArrayList();
		
		mainBItem = new ArrayList();
		mainBItem.add("SCV");
		
		
		
		
		workerItem = new ArrayList();
		workerItem.add("���");
		workerItem.add("�̳׶�");
		workerItem.add("����");
		workerItem.add("CommandCenter");
		
		
		mainBVT.add(new CommandCenter(ui)); //���� Ŀ�ǵ� �ǹ� �⺻ �ϳ�
		
		for(int i=0;i<4;i++){//���� SCV�⺻ 4��
			workerVT.add(new SCV(ui));
		}		
		setUpgrade(0);//���� ���׷��̵� �Ŀ� 0
		setUnit(workerVT.size());
		setBuilding(mainBVT.size());
		
	}
}

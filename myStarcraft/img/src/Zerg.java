import java.util.*;

import javax.swing.ImageIcon;
class Zerg extends Tribe {
	Zerg(StarUI ui){
		
		super(ui);
		
		this.ui = ui;
		tribe = "Zerg"; //���� �̸�
		//////////���� �� �ǹ� �̸�//////////
		mainbuildingName="Hatchery";
		building1Name="SpawningPool";
		building2Name="HydraliskDen";
		building3Name="CreepColony";
		workerName="Drone";
		attacker1Name="Zergling";
		attacker2Name="Hydralisk";
		/////////������ �Ŀ�����//////
		workerPower=1;
		attacker1Power=3;
		attacker2Power=7;		
		///////���� �� �ǹ� ������ ����/////
		workerEnergy=50;
		attacker1Energy=50;
		attacker2Energy=100;
		mainBEnergy=1500;
		building1Energy=1000;
		building2Energy=1250;
		building3Energy=500;
		//////////���� �� �ǹ� ������ ����/////
		mainBdesc = "Zerg Hatchery";
		building1desc = "Zerg SpawningPool";
		building2desc = "Zerg HydraliskDen";
		building3desc = "Zerg CreepColony";
		workerdesc = "Zerg Drone";
		attacker1desc = "Zerg Zergling";
		attacker2desc = "Zerg Hydralisk";
		///////////�ǹ��� ���� �̹���//////////////
		mainBIC = new ImageIcon("img/zergmainB.jpg");
		building1IC = new ImageIcon("img/zergbuilding1.jpg");
		building2IC = new ImageIcon("img/zergbuilding2.jpg");
		building3IC = new ImageIcon("img/zergbuilding3.jpg");
		workerIC = new ImageIcon("img/zergworker.jpg");
		attacker1IC = new ImageIcon("img/zergattacker1.jpg");
		attacker2IC = new ImageIcon("img/zergattacker2.jpg");
		//////////�ǹ� �� ���� ���̽� �̹���/////////////
		buildingface = new ImageIcon("img/zergbuildingface.jpg");
		workerface =new ImageIcon("img/zergworkerface.jpg");
		attacker1face = new ImageIcon("img/zergattacker1face.jpg");
		attacker2face = new ImageIcon("img/zergattacker2face.jpg");
		
		
		///////////�ǹ� �� ���� ������(�ൿ)���� �ʱ�ȭ///////////
		mainBVT = new Vector();
		building1VT = new Vector();
		building2VT = new Vector();
		building3VT = new Vector();
		workerVT = new Vector();
		attacker1VT = new Vector();
		attacker2VT = new Vector();
		
		mainBItem = new Vector();
		mainBItem.addElement("Drone");
		
		building1Item = new Vector();
		building1Item.addElement("Zergling");
		
		building2Item = new Vector();
		building2Item.addElement("Hydralisk");
		
		building3Item = new Vector();
		building3Item.addElement("Upgrade");
		
		workerItem = new Vector();
		workerItem.addElement("���");
		workerItem.addElement("�̳׶�");
		workerItem.addElement("����");
		workerItem.addElement("Hatchery");
		workerItem.addElement("SpawningPool");
		workerItem.addElement("HydraliskDen");
		workerItem.addElement("CreepColony");
		workerItem.addElement("�����ϱ�");
		
		attacker1Item = new Vector();
		attacker1Item.addElement("���");
		attacker1Item.addElement("�����ϱ�");
		
		attacker2Item = new Vector();
		attacker2Item.addElement("���");
		attacker2Item.addElement("�����ϱ�");
		
		
		
		mainBVT.addElement(new Hatchery(ui)); 
		
		for(int i=0;i<4;i++){
			workerVT.addElement(new Drone(ui));
		}		
		setUpgrade(0);//���� ���׷��̵� �Ŀ� 0
		setUnit(workerVT.size(),attacker1VT.size(),attacker2VT.size());
		setBuilding(mainBVT.size(),building1VT.size(),building2VT.size(),building3VT.size());
		
	}
}

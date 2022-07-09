import java.util.*;

import javax.swing.ImageIcon;
class Protoss extends Tribe {	
	Protoss(StarUI ui){		
		super(ui);
		
		this.ui = ui;
		tribe = "Protoss"; //종족 이름
		//////////유닛 및 건물 이름//////////
		mainbuildingName="Nexus";
		building1Name="Gateway";
		building2Name="Templar";
		building3Name="Pylon";
		workerName="Probe";
		attacker1Name="Zealot";
		attacker2Name="DarkArchon";
		/////////유닛의 파워정보//////
		workerPower=1;
		attacker1Power=7;
		attacker2Power=10;
		///////유닛 및 건물 에너지 정보/////
		workerEnergy=50;
		attacker1Energy=80;
		attacker2Energy=150;
		mainBEnergy=1500;
		building1Energy=1000;
		building2Energy=1250;
		building3Energy=500;
		//////////유닛 및 건물 간략한 설명/////
		mainBdesc = "Protoss Nexus";
		building1desc = "Protoss GateWay";
		building2desc = "Protoss Templar Archives";
		building3desc = "Protoss Pylon";
		workerdesc = "Protoss Probe";
		attacker1desc = "Protoss Zealot";
		attacker2desc = "Protoss Dark Archon";
		///////////건물및 유닛 이미지//////////////
		mainBIC = new ImageIcon("img/promainB.jpg");
		building1IC = new ImageIcon("img/probuilding1.jpg");
		building2IC = new ImageIcon("img/probuilding2.jpg");
		building3IC = new ImageIcon("img/probuilding3.jpg");
		workerIC = new ImageIcon("img/proworker.jpg");
		attacker1IC = new ImageIcon("img/proattacker1.jpg");
		attacker2IC = new ImageIcon("img/proattacker2.jpg");
		//////////건물 및 유닛 페이스 이미지/////////////
		buildingface = new ImageIcon("img/probuildingface.jpg");
		workerface =new ImageIcon("img/proworkerface.jpg");
		attacker1face = new ImageIcon("img/proattacker1face.jpg");
		attacker2face = new ImageIcon("img/proattacker2face.jpg");
		
		
		///////////건물 및 유닛 아이템(행동)정보 초기화///////////
		mainBVT = new Vector();
		building1VT = new Vector();
		building2VT = new Vector();
		building3VT = new Vector();
		workerVT = new Vector();
		attacker1VT = new Vector();
		attacker2VT = new Vector();
		
		mainBItem = new Vector();
		mainBItem.addElement("Probe");
		
		building1Item = new Vector();
		building1Item.addElement("Zealot");
		
		building2Item = new Vector();
		building2Item.addElement("DarkArchon");
		
		building3Item = new Vector();
		building3Item.addElement("Upgrade");
		
		workerItem = new Vector();
		workerItem.addElement("놀기");
		workerItem.addElement("미네랄");
		workerItem.addElement("가스");
		workerItem.addElement("Nexus");
		workerItem.addElement("Gateway");
		workerItem.addElement("Templar");
		workerItem.addElement("Pylon");
		workerItem.addElement("공격하기");
		
		attacker1Item = new Vector();
		attacker1Item.addElement("놀기");
		attacker1Item.addElement("공격하기");
		
		attacker2Item = new Vector();
		attacker2Item.addElement("놀기");
		attacker2Item.addElement("공격하기");
		
		
		
		mainBVT.addElement(new Nexus(ui));		
		for(int i=0;i<4;i++){
			workerVT.addElement(new Probe(ui));
		}		
		setUpgrade(0);//최초 업그레이드 파워 0
		setUnit(workerVT.size(),attacker1VT.size(),attacker2VT.size());
		setBuilding(mainBVT.size(),building1VT.size(),building2VT.size(),building3VT.size());
		
	}
}

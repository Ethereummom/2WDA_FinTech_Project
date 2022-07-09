import java.util.*;

import javax.swing.ImageIcon;
class Terran extends Tribe {
	
	Terran(StarUI ui){
		
		super(ui);
		
		this.ui = ui;
		tribe = "Terran"; //종족 이름
		//////////유닛 및 건물 이름//////////
		mainbuildingName="CommandCenter";
		building1Name="Barracks";
		building2Name="Factory";
		building3Name="SupplyDepot";
		workerName="SCV";
		attacker1Name="Marine";
		attacker2Name="Tank";
		/////////유닛의 파워정보//////
		workerPower=2;
		attacker1Power=6;
		attacker2Power=10;
		///////유닛 및 건물 에너지 정보/////
		workerEnergy=60;
		attacker1Energy=40;
		attacker2Energy=150;
		mainBEnergy=1500;
		building1Energy=1000;
		building2Energy=1250;
		building3Energy=500;
		//////////유닛 및 건물 간략한 설명/////
		mainBdesc = "Terran Command Center";
		building1desc = "Terran Barracks";
		building2desc = "Terran Factory";
		building3desc = "Terran Supply Depot";
		workerdesc = "Terran SCV";
		attacker1desc = "Terran Marine";
		attacker2desc = "Terran Siege Tank";
		///////////건물및 유닛 이미지//////////////
		mainBIC = new ImageIcon("img/terranmainB.jpg");
		building1IC = new ImageIcon("img/terranbuilding1.jpg");
		building2IC = new ImageIcon("img/terranbuilding2.jpg");
		building3IC = new ImageIcon("img/terranbuilding3.jpg");
		workerIC = new ImageIcon("img/terranworker.jpg");
		attacker1IC = new ImageIcon("img/terranattacker1.jpg");
		attacker2IC = new ImageIcon("img/terranattacker2.jpg");
		//////////건물 및 유닛 페이스 이미지/////////////
		buildingface = new ImageIcon("img/terranbuildingface.jpg");
		workerface =new ImageIcon("img/terranworkerface.jpg");
		attacker1face = new ImageIcon("img/terranattacker1face.jpg");
		attacker2face = new ImageIcon("img/terranattacker2face.jpg");
		
		
		///////////건물 및 유닛 아이템(행동)정보 초기화///////////	
		mainBVT = new Vector();
		building1VT = new Vector();
		building2VT = new Vector();
		building3VT = new Vector();
		workerVT = new Vector();
		attacker1VT = new Vector();
		attacker2VT = new Vector();
		
		mainBVT = new Vector();
		building1VT = new Vector();
		building2VT = new Vector();
		building3VT = new Vector();
		workerVT = new Vector();
		attacker1VT = new Vector();
		attacker2VT = new Vector();
		
		mainBItem = new Vector();
		mainBItem.addElement("SCV");
		
		building1Item = new Vector();
		building1Item.addElement("Marine");
		
		building2Item = new Vector();
		building2Item.addElement("Tank");
		
		building3Item = new Vector();
		building3Item.addElement("Upgrade");
		
		workerItem = new Vector();
		workerItem.addElement("놀기");
		workerItem.addElement("미네랄");
		workerItem.addElement("가스");
		workerItem.addElement("CommandCenter");
		workerItem.addElement("Barracks");
		workerItem.addElement("Factory");
		workerItem.addElement("SupplyDepot");
		workerItem.addElement("공격하기");
		
		attacker1Item = new Vector();
		attacker1Item.addElement("놀기");
		attacker1Item.addElement("공격하기");
		
		attacker2Item = new Vector();
		attacker2Item.addElement("놀기");
		attacker2Item.addElement("공격하기");
		
		mainBVT.addElement(new CommandCenter(ui)); //최초 커맨드 건물 기본 하나
		
		for(int i=0;i<4;i++){//최초 SCV기본 4명
			workerVT.addElement(new SCV(ui));
		}		
		setUpgrade(0);//최초 업그레이드 파워 0
		setUnit(workerVT.size(),attacker1VT.size(),attacker2VT.size());
		setBuilding(mainBVT.size(),building1VT.size(),building2VT.size(),building3VT.size());
		
	}
}

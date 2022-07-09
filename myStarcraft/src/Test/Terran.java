package Test;

import java.util.ArrayList;

import javax.swing.ImageIcon;
class Terran extends Tribe {
	
	Terran(StarUI ui){
		
		super(ui);
		
		this.ui = ui;
		tribe = "Terran"; //종족 이름
		//////////유닛 및 건물 이름//////////
		mainbuildingName="CommandCenter";
		workerName="SCV";
		/////////유닛의 파워정보//////
		workerPower=2;
		///////유닛 및 건물 에너지 정보/////
		workerEnergy=60;
		mainBEnergy=1500;
		//////////유닛 및 건물 간략한 설명/////
		mainBdesc = "Terran Command Center";
		workerdesc = "Terran SCV";
		///////////건물및 유닛 이미지//////////////
		mainBIC = new ImageIcon("img/terranmainB.jpg");
		workerIC = new ImageIcon("img/terranworker.jpg");
		//////////건물 및 유닛 페이스 이미지/////////////
		buildingface = new ImageIcon("img/terranbuildingface.jpg");
		workerface =new ImageIcon("img/terranworkerface.jpg");
		attacker1face = new ImageIcon("img/terranattacker1face.jpg");
		attacker2face = new ImageIcon("img/terranattacker2face.jpg");
		
		
		///////////건물 및 유닛 아이템(행동)정보 초기화///////////	
		mainBVT = new ArrayList();
		workerVT = new ArrayList();
		
		mainBVT = new ArrayList();
		workerVT = new ArrayList();
		
		mainBItem = new ArrayList();
		mainBItem.add("SCV");
		
		
		
		
		workerItem = new ArrayList();
		workerItem.add("놀기");
		workerItem.add("미네랄");
		workerItem.add("가스");
		workerItem.add("CommandCenter");
		
		
		mainBVT.add(new CommandCenter(ui)); //최초 커맨드 건물 기본 하나
		
		for(int i=0;i<4;i++){//최초 SCV기본 4명
			workerVT.add(new SCV(ui));
		}		
		setUpgrade(0);//최초 업그레이드 파워 0
		setUnit(workerVT.size());
		setBuilding(mainBVT.size());
		
	}
}

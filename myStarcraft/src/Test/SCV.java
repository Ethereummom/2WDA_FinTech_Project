package Test;

import java.util.ArrayList;

class SCV extends TerranUnit implements Runnable {
	static int cost = 10; // ���
	static int gascost = 0; // �������
	static int buildtime = 70;
	static int attackspeed = 600;

	SCV(StarUI ui) {
		super(ui);
		name = "SCV";
		energy = 60;
		power = 2;
		work = true;
		flag = true;
		progress = 0;
		con = new ArrayList();
		con.add("노는중");
		con.add("미네랄");
		con.add("가스");
		con.add("커멘드");
		condi = (String) con.get(0);
		go = new Thread(this);
		go.start();
	}

	public void run() {
		while (true) {

			switch (job) {
			case 0:
				flag = true;
				go.suspend();
				break;
			case 1:
				flag = true;
				addMineral();
				break;
			case 2:
				flag = true;
				addGas();
				break;
			case 3:
				flag = true;
				makeMainB();
				break;
			}
		}
	}

	public boolean getFlag() {
		return flag;
	}

	void addMineral() {
		condi = (String) getCondition(1);
		ui.setTB(ui.clan.workerVT); // �������� �ٲ�

		while (true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				mi=0;
			}
			ui.clan.setMineral(8);
			mi += 8;
			ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));

			if (flag == false) {
				break;
			}
		}
	}

	void addGas() {
		condi = (String) getCondition(2);
		ui.setTB(ui.clan.workerVT);
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				ga=0;
			}
			ui.clan.setGas(8);
			ga+=8;
			ui.U_gas.setText(String.valueOf(ui.clan.getGas()));

			if (flag == false) {
				break;
			}
		}
	}

	void makeMainB() {
		if (ui.clan.getMineral() >= CommandCenter.cost) {
			condi = (String) getCondition(3);
			ui.clan.setMineral(-CommandCenter.cost);
			ui.U_mineral.setText(String.valueOf(ui.clan.getMineral()));
			ui.setTB(ui.clan.workerVT);
			progressing(CommandCenter.buildtime);
			ui.clan.mainBVT.add(new CommandCenter(ui));
//			ui.clan.setBuilding(ui.clan.mainBVT.size());
			condi = (String) getCondition(0);
			if (ui.U_name.getText() == ui.clan.getWorkerName())
				ui.setTB(ui.clan.workerVT);
			if (ui.U_name.getText() == ui.clan.getMainBName())
				ui.setTB(ui.clan.mainBVT);
		} else {
			ui.setMessage("Not enough minerals");
		}
		progress = 0;
		job = 0;
	}

}

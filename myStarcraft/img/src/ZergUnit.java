import java.util.Vector;


abstract class ZergUnit extends StarObject implements IStarUnit {
	protected int power;
	ZergUnit(StarUI ui) {
		super(ui);
		// TODO Auto-generated constructor stub
	}
	
	
	public void attack(int power,int attackspeed,Vector vt,StarObject target) { //������ ������ �Ŀ�, ���ݴ��� �׸�, ���� ���� Ÿ��
		while(true){
			target.energy=target.getEnergy()- power; //Ÿ���� ���������� ���� �Ŀ���ŭ ��´�
			try {
				Thread.sleep(attackspeed); //���� �ش���
			} catch (InterruptedException e) {}
			try{
				if(target.energy<=0){ //Ÿ���� �ǰ� 0���ϰ� �ɶ����� ����
					target.go.suspend(); //�ϴ��� ������Ű��
					vt.removeElement(target); //Ÿ���� �ǰ� 0�̵Ǹ� ����
					break;
					
				}
			}catch(Exception e){break;}
			
			if(flag==false) //�ٸ� �۾� ��û��� �ð�� ����
				break;
		}
	}
	
	
	public void progressing(int time){
		while(progress<100){
			try {
                Thread.sleep(time);
            } catch (InterruptedException ignore) {}
            progress+=1;
		}
	}
	public int getPower(){
		return power;
	}
}

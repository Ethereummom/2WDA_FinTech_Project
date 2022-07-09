import java.util.Vector;


abstract class ZergUnit extends StarObject implements IStarUnit {
	protected int power;
	ZergUnit(StarUI ui) {
		super(ui);
		// TODO Auto-generated constructor stub
	}
	
	
	public void attack(int power,int attackspeed,Vector vt,StarObject target) { //공격한 유닛의 파워, 공격당할 그릇, 공격 당할 타겟
		while(true){
			target.energy=target.getEnergy()- power; //타겟의 에너지에서 나의 파워만큼 깍는다
			try {
				Thread.sleep(attackspeed); //텀을 준다음
			} catch (InterruptedException e) {}
			try{
				if(target.energy<=0){ //타겟의 피가 0이하가 될때까지 공격
					target.go.suspend(); //하던일 정지시키고
					vt.removeElement(target); //타겟의 피가 0이되면 제거
					break;
					
				}
			}catch(Exception e){break;}
			
			if(flag==false) //다른 작업 요청들어 올경우 중지
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

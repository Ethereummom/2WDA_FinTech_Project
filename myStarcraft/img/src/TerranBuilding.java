import java.util.Vector;


abstract class TerranBuilding extends StarObject implements IStarBuilding  {
	TerranBuilding(StarUI ui) {
		super(ui);
		// TODO Auto-generated constructor stub
	}
	public void makeUnit() {
		// TODO Auto-generated method stub
		
	}
	public void flightBuilding(){
		
	}
	public void progressing(int time){
		while(progress<100){
			try {
                Thread.sleep(time);
            } catch (InterruptedException ignore) {}
            progress+=1;
		}
	}
}

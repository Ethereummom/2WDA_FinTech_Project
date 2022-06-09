
class Car{
	
	int speed;
	int gear;
	public String color;
	
	
	public void speedUp(int increment) {
		speed += increment;
	}
	public void speedDown (int decrement) {
		speed -= decrement;
	}
	public void printStatus() {
		System.out.println("현재 속도는 " + speed + " 기어는 " + gear + " 색깔은 " + color);
	}
}	


class SportsCar extends Car{
	
	
	boolean turbo;
	
	public void setTurbo(boolean newValue) {
		turbo = newValue;
	
	}
}




public class Test {

	public static void main(String[] args) {
		
		SportsCar c = new SportsCar();
		c.color = "Red";
		c.speedUp(100);
		c.speedDown(30);
		c.setTurbo(true);
		c.printStatus();
		
		// TODO Auto-generated method stub

	}

}

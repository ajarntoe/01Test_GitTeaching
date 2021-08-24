public class Vehicle {
	int speed;
	int acc;

	public Vehicle(int speed, int acc) {
		System.out.println("Vehicle constructor starts" );
		this.speed = speed;
		this.acc = acc;
		System.out.println("Vehicle constructor ends" );
	}
	
	public Vehicle() {
		this(1,1);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = Math.max(0,speed);
	}

	public int getAcc() {
		return acc;
	}

	public void setAcc(int acc) {
		this.acc = Math.max(0, acc);
	}
	
	

}
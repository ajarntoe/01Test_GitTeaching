public class Vehicle {
	int speed;
	int acc;

	public Vehicle(int speed, int acc) {
		super();
		this.speed = speed;
		this.acc = acc;
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
		this.acc = acc;
	}
	
	

}
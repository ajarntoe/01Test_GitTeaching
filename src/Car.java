
public class Car extends Vehicle {

	int brake;

	public Car(int speed, int acc, int br) {
		// super(speed, acc);
		System.out.println("Car constructor starts");
		brake = br;
		System.out.println("Car constructor ends");

	}

	public int getBrakeScale() {
		return brake;
	}

	public void setBrakeScale(int brakeScale) {
		if (brakeScale > 5) {
			brakeScale = 5;
		} else if (brakeScale < 0) {
			brakeScale = 0;
		}
		this.brake = brakeScale;
	}

	public static void main(String[] args) {
		Car x = new Car(1, 1, 1);

	}

}

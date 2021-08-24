
public class Car extends Vehicle {


	int brakeScale;

	
	public Car(int speed, int acc, int br) {
		super(speed, acc);
		brakeScale = br;
	}


	public int getBrakeScale() {
		return brakeScale;
	}


//	public void setBrakeScale(int brakeScale) {
//		if(brakeScale >5) {
//			brakeScale =5;
//		}else if(brakeScale <0) {
//			brakeScale =0;
//		}
//		this.brakeScale = brakeScale;
//	}
	
	
	
}

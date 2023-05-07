package week1.day1;

public class Car {

	public void wearSeatbelt() {
		System.out.println("Wearing seatbelt");
	}
	
	public void startEngine() {
		System.out.println("Turning on engine");
	}
	public void turnOnAc() {
		System.out.println("Turning on ac");
	}
	public void shiftGear() {
		System.out.println("Gear shifting");
	}
	public void raiseAccelerator() {
		System.out.println("Raising accelerator");
	}
	public void applyBreak() {
		System.out.println("Break applying");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car features=new Car();
		features.wearSeatbelt();
		features.startEngine();
		features.turnOnAc();
		features.shiftGear();
		features.raiseAccelerator();
		features.applyBreak();
	}

}

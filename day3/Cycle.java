package week1.day3;

public class Cycle {

	public void kickStand() {
		System.out.println("Standkicking");
	}

	public void startPedaling() {
		System.out.println("Pedaling");
	}

	public void applyBreak() {
		System.out.println("Applying break");
	}

	public void ringBell() {
		System.out.println("Bell ringing");
	}

	public void checkAir() {
		System.out.println("Checking air pressure");
	}

	public void checkPunctured() {
		System.out.println("Checking for puncture");
	}

	public void turnRight() {
		System.out.println("Turning right");
	}

	public void turnLeft() {
		System.out.println("Turning left");
	}

	byte wheels = 2;
	short manufacturedOn = 2016;
	int price = 25500;
	long modelNo = 1784348214518832623L;
	float weight = 14.7F;
	double height = 4.36728;
	boolean isPunctured = false;
	char logo = 'H';
	String BrandName = "Herculus";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cycle features = new Cycle();
		features.kickStand();
		features.startPedaling();
		features.applyBreak();
		features.ringBell();
		features.checkAir();
		features.checkPunctured();
		features.turnRight();
		features.turnLeft();

		System.out.println();
		System.out.println();

		System.out.println(features.wheels);
		System.out.println(features.manufacturedOn);
		System.out.println(features.price);
		System.out.println(features.modelNo);
		System.out.println(features.weight);
		System.out.println(features.height);
		System.out.println(features.isPunctured);
		System.out.println(features.logo);
		System.out.println(features.BrandName);
	}

}

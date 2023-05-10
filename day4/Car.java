package week1.day4;

public class Car {

	public void puncturing() {
		System.out.println("Tyre punctured");
	}

	private void switchOnAC() {
		System.out.println("Switching on AC");
	}

	protected void applyHandbrake() {
		System.out.println("Applying Handbrake");
	}

	void wearSeatbelt() {
		System.out.println("Wearing seatbelt");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car features = new Car();
		features.puncturing();
		features.switchOnAC();
		features.applyHandbrake();
		features.wearSeatbelt();

	}

}

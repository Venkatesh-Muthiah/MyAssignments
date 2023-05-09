package week1.day3;

public class Mobile {

	public void switchOn() {
		System.out.println("Switching on");
	}

	public void turnOnGprs() {
		System.out.println("Turn on GPRS");
	}

	public void turnOnBluetooth() {
		System.out.println("Turning on bluetooth");
	}

	public void turnOnNearbysharing() {
		System.out.println("Turning on nearby sharing");
	}

	public void makeCall() {
		System.out.println("Calling...");
	}

	public void sendMessage() {
		System.out.println("Messaging...");
	}

	public void makePayment() {
		System.out.println("Paying...");
	}

	public void scanQR() {
		System.out.println("QR Scanning");
	}

	public void turnOnWifi() {
		System.out.println("Turning on WiFi");
	}

	public void takeScreenshot() {
		System.out.println("Taking screenshot");
	}

	public void playMovie() {
		System.out.println("Playing movie");
	}

	public void playRadio() {
		System.out.println("Listening to Radio");
	}

	byte simcardSlot = 2;
	short manufacturedOn = 2020;
	int price = 155000;
	long imeiNo = 1784348214518832623L;
	float size = 6.4F;
	double weight = 0.2567D;
	boolean isAndroid = true;
	char logo = 'N';
	String BrandName = "Nothing";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile features = new Mobile();

		features.switchOn();
		features.turnOnWifi();
		features.turnOnGprs();
		features.turnOnBluetooth();
		features.turnOnNearbysharing();
		features.makeCall();
		features.sendMessage();
		features.makePayment();
		features.scanQR();
		features.takeScreenshot();

		System.out.println();
		System.out.println();

		System.out.println(features.simcardSlot);
		System.out.println(features.manufacturedOn);
		System.out.println(features.price);
		System.out.println(features.imeiNo);
		System.out.println(features.weight);
		System.out.println(features.size);
		System.out.println(features.isAndroid);
		System.out.println(features.logo);
		System.out.println(features.BrandName);

	}

}

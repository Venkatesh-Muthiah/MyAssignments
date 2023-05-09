package week1.day3;

public class Laptop {

	public void turnOn() {
		System.out.println("Switching on");
	}

	public void shutdown() {
		System.out.println("Shutdowning");
	}

	public void sleep() {
		System.out.println("Turning to sleepmode");
	}

	public void playGames() {
		System.out.println("Playing games");
	}

	public void watchMovies() {
		System.out.println("Playing movies");
	}

	public void attendingMeeting() {
		System.out.println("Meeting");
	}

	public void playMusic() {
		System.out.println("Playing music");
	}

	public void runCoding() {
		System.out.println("Coding...");
	}

	public void turnOnWifi() {
		System.out.println("Turning on WiFi");
	}

	public void takeScreenshot() {
		System.out.println("Taking screenshot");
	}

	public void turnOnBluetooth() {
		System.out.println("Turning on bluetooth");
	}

	public void turnOnLocation() {
		System.out.println("Turning Location");
	}

	byte ram = 8;
	short manufacturedOn = 2021;
	int price = 159000;
	long modelNo = 1784328462934L;
	float size = 15.6F;
	double weight = 0.2567D;
	boolean isWindows = false;
	char logo = 'A';
	String BrandName = "Apple";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop features = new Laptop();

		features.turnOn();
		features.turnOnWifi();
		features.turnOnLocation();
		features.turnOnBluetooth();
		features.sleep();
		features.attendingMeeting();
		features.watchMovies();
		features.playGames();
		features.shutdown();
		features.takeScreenshot();

		System.out.println();
		System.out.println();

		System.out.println(features.ram);
		System.out.println(features.manufacturedOn);
		System.out.println(features.price);
		System.out.println(features.modelNo);
		System.out.println(features.weight);
		System.out.println(features.size);
		System.out.println(features.isWindows);
		System.out.println(features.logo);
		System.out.println(features.BrandName);

	}

}

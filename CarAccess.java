package week1.day4;

class CarAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car features = new Car();
		features.puncturing();
	  //features.openWindow();           // openWindow() is protected,so it gets executed only from inherited class.
		features.applyHandbrake();
		features.wearSeatbelt();

	}

}

package week1.day3;

public class Dog {

	public void walk() {
		System.out.println("Walking");
	}

	public void run() {
		System.out.println("Running");
	}

	public void bark() {
		System.out.println("Barking");
	}

	public void bite() {
		System.out.println("Biting");
	}

	public void stand() {
		System.out.println("Standing");
	}

	public void sit() {
		System.out.println("Sitting");
	}

	public void eat() {
		System.out.println("Eating");
	}

	public void catchBall() {
		System.out.println("Catching the ball");
	}

	public void smell() {
		System.out.println("Smelling");
	}

	byte legs = 4;
	short sense = 5;
	int height = 50;
	float weight = 4.5f;
	boolean isAdopted = true;
	char gender = 'M';
	String Name = "Jimmy";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog character = new Dog();

		character.walk();
		character.run();
		character.bark();
		character.bite();
		character.stand();
		character.sit();
		character.eat();
		character.catchBall();
		character.smell();

		System.out.println();
		System.out.println();

		System.out.println(character.legs);
		System.out.println(character.sense);
		System.out.println(character.height);
		System.out.println(character.weight);
		System.out.println(character.isAdopted);
		System.out.println(character.gender);
		System.out.println(character.Name);

	}

}

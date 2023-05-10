package week1.day4;

public class Calculator {

	public void addTwoNumber(int a, int b) {
		int add = a + b;
		System.out.println("Addition of two numbers is " + add);
	}

	public void subtractTwoNumber(int e, int f) {
		int sub = e - f;
		System.out.println("Subtraction of two numbers is " + sub);
	}

	public void multipleTwoNumber(double i, double j) {
		double mul = i * j;
		System.out.println("Multiplication of two numbers is " + mul);
	}

	public void divideTwoNumber(float x, float y) {
		float div = x / y;
		System.out.println("Division of two numbers is " + div);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator functions = new Calculator();
		functions.addTwoNumber(5, 8);
		functions.subtractTwoNumber(79, 18);
		functions.multipleTwoNumber(7.13742, 8.98994721);
		functions.divideTwoNumber(7.54f, 8.56f);

	}

}

package week1.day4;

public class ReturnType {

	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public void sub(int total, int b) {
		int c = total - b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnType calc = new ReturnType();
		int total = calc.add(10, 15);
		System.out.println(total);
		calc.sub(total, 20);
	}

}

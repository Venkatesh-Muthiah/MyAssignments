package week1.day4;

public class Student {

	public void studentName(String name) {
		System.out.println("Your name is " + name);

	}

	public void studentAge(int year, int dob) {
		int age = year - dob;
		System.out.println("Your age is " + age);
	}

	public void bloodGroup(String bloodGroup) {
		System.out.println("Your bloodgroup is " + bloodGroup);

	}

	public void percentage(float scoredMarks, float totalMarks) {
		float percentage = (scoredMarks / totalMarks) * 100;
		System.out.println("Your percentage is " + percentage + "%");
	}

	public void passedOutYear(int joinedYear, int courseDuration) {
		int passedOutYear = joinedYear + courseDuration;
		System.out.println("You are " + passedOutYear + " passedout");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student details = new Student();
		details.studentName("Revi");
		details.studentAge(2023, 2001);
		details.bloodGroup("A -ve");
		details.percentage(1026, 1200);
		details.passedOutYear(2018, 4);
	}

}

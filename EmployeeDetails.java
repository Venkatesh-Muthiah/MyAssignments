package week1.day4;

public class EmployeeDetails {

	public void printEmployeeName(String empName, int empId) {
		System.out.println("Name: " + empName);
		System.out.println("ID: " + empId);
	}

	public void getEmployeeAddress(String empAddress) {
		System.out.println("Address: " + empAddress);
	}

	public void printEmployeeSalary(double empSalary) {
		System.out.println("Salary: " + empSalary);
	}

	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("Mobile number: " + mobNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDetails details = new EmployeeDetails();
		details.printEmployeeName("Somesh", 5529);
		details.getEmployeeAddress("Bengaluru");
		details.printEmployeeSalary(3550.15678d);
		details.printEmployeeMobileNumber(9876543210L);

	}

}

package Abstractclass;

public class Main {

	public static void main(String[] args) {
		Employee emp1 =new Contractor();
		Employee emp2 =new Fulltimeemployee();
		emp1.CalculateSalary();
		emp2.CalculateSalary();

	}

}

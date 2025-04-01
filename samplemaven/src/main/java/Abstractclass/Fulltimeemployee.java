package Abstractclass;

public class Fulltimeemployee extends Employee{

	@Override
	public void CalculateSalary() {
		
		int constanthours =8;
		int totalsalary = paymentperhour*constanthours;
		
		System.out.println("TotalSalary of fulltimeemployee:" +totalsalary );
	}

}

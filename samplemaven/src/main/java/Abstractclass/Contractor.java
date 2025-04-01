package Abstractclass;

public class Contractor extends Employee  {

	@Override
	public void CalculateSalary() {
		
		int givenworkinghours = 4;
		
		int salary =paymentperhour*givenworkinghours;
		
		System.out.println("TotalSalary of contractoremployee:" +salary );
	}

}

package AccessModifiers;

public class AccessModifiersHomework {

	public static void main(String[] args) {
		AccessModifiersHomework obj = new AccessModifiersHomework();
		obj.display1();
		obj.display2();
		obj.display3();
		

	}
	String accountHolderName = "Chikku";
	int Balance =100;
	String accountType = "Savings";
	
	double Accountnumber =500103;
	
public void display1() {
	System.out.println(" accountHolderName:" +accountHolderName);
}
	private void display2()
	{
		System.out.println("Balance:" +Balance);	
	}
		protected void display3()
		{
			System.out.println("accountType:"  +accountType);
		}
		public void display()
		{
			
			System.out.println("Accountnumber:"  +Accountnumber);
			
			
			
		}
	}
	



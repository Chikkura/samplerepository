package Encapsulation;

public class EncapsulationClass1 {

	 private int pin1;
	    private int pin2;
	    private int pin3;
	public void setDetails(int pin1, int pin2,int pin3)
	{
	this.pin1= pin1;
	this.pin2= pin2;
	this.pin3= pin3;
	
	
	}
	
	public void getDetails()
	{
		 System.out.println("Valid pins are: " + pin1 + ", " + pin2 + ", " + pin3);
	}
}
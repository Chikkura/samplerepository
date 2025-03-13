package Encapsulation;

public class HomworkEncapsulation1 {

	String model;
	int year;
public void setter(String model,int year)
{
	this.model=model;
	this.year =year;
}
public void getter()
{
	
	System.out.println("Car Model:"  +model);
	System.out.println("Year:"  +year);
}
}

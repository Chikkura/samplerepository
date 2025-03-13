package Encapsulation;

public class Encapsulation1 {
	String name;
	int age;
	public void setDetails(String name, int age)
	{
	this.name = name;
	this.age = age;
	}
public void getDetails() {
	 System.out.println("My name is:"  +name);
	 System.out.println("My age is:"  +age);
	}
}

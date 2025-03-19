package Polymorphism;

public class Homeowrkclass extends HomeworkVehicleclass{

	public static void main(String[] args) {
		Homeowrkclass obj = new Homeowrkclass();
		obj.sum();

	}
	int c= 30;
	int g =90;
	int sum = c+g;
	
public void sum() {
	System.out.println("Sum is :" +sum);
	super.sum();
}
}

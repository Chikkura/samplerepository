package Polymorphism;

public class Polymorphism_OFFseason extends Polymorphism_OnSeason {

	public static void main(String[] args) {
		Polymorphism_OFFseason obj= new Polymorphism_OFFseason();
		obj.discount(2000);

	}
public void discount(int a) {
	int total = a* 15/100;
	System.out.println("Offseason Discount :"  +total);
	super.discount(4000);
}
}

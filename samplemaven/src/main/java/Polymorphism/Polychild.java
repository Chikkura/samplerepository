package Polymorphism;

public class Polychild extends Polyparent {

	public static void main(String[] args) {
		Polychild obj = new Polychild();
		obj.display(10, 20);
	

	}
	public void display(int a , int b) {
		int sum = a+b;
		System.out.println("Child Sum is :"  +sum);
		super.display(80, 20);
		
	}

}

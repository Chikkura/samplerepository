package Polymorphism;

public class HomeworkPolymorphismChild extends HomeworkPolymorphismParent {

	public static void main(String[] args) {
		HomeworkPolymorphismChild obj = new HomeworkPolymorphismChild();
obj.area();
	}
public void area() {
	int base = 10;
	int height =20;
	double area = 0.5 * base * height;
System.out.println("Area of Traingle is:"  +area);
super.area();
}
}

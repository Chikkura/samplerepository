package Abstractclass;

public class AbstractionChild extends AbstractionParent {

	public static void main(String[] args) {
		AbstractionChild obj = new AbstractionChild();
		obj.display();
		obj.show();

	}

	@Override
	public void display() {
		System.out.println("Show Child");
		
		
	}

}

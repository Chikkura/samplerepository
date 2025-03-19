package Abstractclass;

public class HOMEWORKABSTRACTIONCHILD extends HOMEWORKAbstraction {

	public static void main(String[] args) {
		HOMEWORKABSTRACTIONCHILD obj = new HOMEWORKABSTRACTIONCHILD();
		obj.sum();

	}

	@Override
	public void sum() {
	int a= 20;
	int b =60;
	int sum = a+b;
	System.out.println("Sum is :" +sum);
	
		
	}


}

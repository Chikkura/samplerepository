package Abstractclass;

public class AbstractChildReferenceclass extends AbstractParentReferenceclass {

	public static void main(String[] args) {
		AbstractParentReferenceclass obj= new AbstractChildReferenceclass();//created ref class of Parent
obj.print();
obj.sum();
	}

	@Override
	public void sum() {
		int a=10;
		int  b=40;
		int sum=a+b;
		System.out.println(sum);
		 
		
	}

}

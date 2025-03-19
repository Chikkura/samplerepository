package Interface;

public class homeworkinterface2 implements homeworkinterface1 {

	public static void main(String[] args) {
		homeworkinterface2 obj = new homeworkinterface2();
		obj.sum();

	}

	@Override
	public void sum() {
		int a =10;
		int b =9;
		int c =a+b;
		System.out.println(c);
		
	}

}

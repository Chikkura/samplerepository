package SuperKeyword;

public class ClassSuperKeywordChild extends ClassworkSuperKeywordParent {

	public static void main(String[] args) {
		ClassSuperKeywordChild obj =new ClassSuperKeywordChild();
		obj.sum(25,15);
		obj.divisible(12,17);

	}
public void divisible(int a, int b) {
	 int sum = super.sum(a, b);
	 if (sum % 10 == 0) 
	 {
 System.out.println("The sum " + sum + " is divisible by 10.");
     } 
	 else 
	 {
         System.out.println("The sum " + sum + " is NOT divisible by 10.");
     }
}
}

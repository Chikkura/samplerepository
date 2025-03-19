package ExceptionHandling;

public class Throwexample {

	public static void main(String[] args) {
		int a =10;
		if(a>18)
			
		{System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException("Age under 18");
			
		}
		}

	}



package inheritance;

public class HomeworkChild extends HomeworkParent{

	public static void main(String[] args) {
		HomeworkChild  obj = new HomeworkChild ();
		obj.display();
		obj.display1();

	}
public void display1()
{
	System.out.println("Hi");
}
}

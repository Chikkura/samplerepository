package SuperKeyword;

public class supermethodchild extends supermethod {

	public static void main(String[] args) {
		
		supermethodchild obj = new supermethodchild();
		obj.display2();

	}
public void display2()
{
	System.out.println("This is Child");
	super.display1();
}
}

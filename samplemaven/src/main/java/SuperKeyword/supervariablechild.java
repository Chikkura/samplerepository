package SuperKeyword;

public class supervariablechild extends  supervariable{

	public static void main(String[] args) {
		supervariablechild obj = new supervariablechild();
		obj.display1();
	}
String colour = "Red";
public void display1()
{
	System.out.println(colour);
	System.out.println(super.colour);
}
}

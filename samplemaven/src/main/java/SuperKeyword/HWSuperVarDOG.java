package SuperKeyword;

public class HWSuperVarDOG extends HWSuperVarAnimal {

	public static void main(String[] args) {
		
		HWSuperVarDOG obj = new HWSuperVarDOG();
		obj.makessound1();
	}
public void makessound1()
{
	System.out.println("Dog Barks");
	super.makesound();
	
}
}

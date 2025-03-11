package SuperKeyword;

public class HWSuperVarCAR extends HWSuperVarVehicle{

	public static void main(String[] args) {
		
		HWSuperVarCAR obj = new HWSuperVarCAR();
		obj.displaySpeed();
		
	}
	int speed =120;
public void displaySpeed()
{
	System.out.println(speed);
	System.out.println(super.speed);
}
}

package inheritance;

public class HomeworkChild_Library extends HomeWorkParent1_Library {
	String studentname = "Chikku";
	int Rollnum = 45;

	public static void main(String[] args) {
		
		HomeworkChild_Library obj = new HomeworkChild_Library();
	obj.display();
	obj.display1();
	obj.display2();
		
		}

	public void display2() {
		 System.out.println("Display Student details: " + studentname +  " Rollnumber: " + Rollnum);

	
	}
}

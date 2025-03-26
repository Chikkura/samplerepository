package Collections;

import java.util.ArrayList;
import java.util.List;

public class HomeworkGenericexample {

	public static void main(String[] args) {
		List <Integer> a = new ArrayList <Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(20);
		System.out.println(a);
	
		System.out.println(a.get(3));

	a.set(1, 25);
	System.out.println(a);

	System.out.println(a.indexOf(20));
	a.remove(4);
	System.out.println(a);
	System.out.println(a.lastIndexOf(20));
	System.out.println(a.contains(60));

	
	
		
		

	}

}

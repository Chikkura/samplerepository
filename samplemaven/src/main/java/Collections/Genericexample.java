package Collections;

import java.util.ArrayList;
import java.util.List;

public class Genericexample {

	public static void main(String[] args) {
		List <String> s = new ArrayList <String>();
		s.add("Orange");
		s.add("Pineapple");
		s.add("Grapes");
		s.add("Mango");
		s.add("Cherry");
		s.add("Grapes");
		System.out.println(s);
		System.out.println(s.get(2));
		s.set(0, "Apple");
		System.out.println(s);
		System.out.println(s.indexOf("Grapes"));
		System.out.println(s.lastIndexOf("Grapes"));
		s.remove(0);
		System.out.println(s);
		
		System.out.println(s.contains("Cherry"));
		

	}

}

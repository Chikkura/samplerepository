package Collections;

import java.util.HashSet;
import java.util.Set;

public class Setmethods {

	public static void main(String[] args) {
	Set<String> s = new HashSet<String>();
	s.add("Red");
	s.add("Grey");
	s.add("White");
	s.add("Black");
	Set<String> s1 = new HashSet<String>();
	s1.add("Yellow");
	s1.add("Pink");
	s.addAll(s1);
	System.out.println(s);
	System.out.println(s.containsAll(s1));
	System.out.println(s.isEmpty());
	s.removeAll(s1);
	System.out.println(s);
	System.out.println(s.size());
	s1.clear();
	System.out.println(s1);
	
	

	}

}

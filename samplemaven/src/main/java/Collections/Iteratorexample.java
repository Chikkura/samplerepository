package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorexample {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("Chikku");
		s.add("Resmi");
		s.add("Mamtha");
		s.add("Renjini");
		System.out.println(s);
		Iterator i = s.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
		
		i.remove();
		System.out.println(s);
			
		
		
		

	}

}

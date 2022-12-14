package collection;

import java.util.HashSet;
import java.util.Iterator;

import org.checkerframework.checker.units.qual.h;

public class HashSetStudy {

	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<>();
		
		hs.add("one");
		System.out.println(hs.add(999));
		hs.add(null);
		hs.add(null);
		System.out.println(hs.add(999));
		hs.add(true);
		hs.add('A');
		
		System.out.println(hs);//output gives Random insertion.
		
	// set does not support traversing using for loop
		
	   //using for each loop
		
		for(Object h:hs)
		{
			System.out.println(h);
		}
		
		Iterator<Object> it = hs.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		//complete
	}

}

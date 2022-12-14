package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public LinkedHashSetStudy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	
	{
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		
		lhs.add("Pune");
		lhs.add("Pune");
		lhs.add(null);
		lhs.add(null);
		lhs.add(true);
		lhs.add('M');
		lhs.add(125.45f);
		
		System.out.println(lhs);
		
	System.out.println("============for each=====");
	
	for(Object h:lhs)
	{
		System.out.println(h);
	}
	System.out.println("=====iterator=======");
	Iterator<Object> it = lhs.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	//complete
	}

}

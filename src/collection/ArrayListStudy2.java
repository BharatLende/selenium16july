package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy2 {

	public ArrayListStudy2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		ArrayList<Object>al=new ArrayList<>();
		
		al.add("Bharat");
		al.add(null);
		al.add(null);
		al.add(1234);
		al.add(12.45f);
	    al.add('A');
	    al.add(true);
	    
	    System.out.println(al);
	    al.add(0,"Katraj");
	    System.out.println(al);
	    
	    // al.add(al.isEmpty());
	    //System.out.println(al);
	    System.out.println(al.isEmpty());
	    
	    //al.add(al.contains(1235));
	    //System.out.println(al);
	    System.out.println(al.contains(1235));
	    
	    Object al1 = al.clone();	
	    System.out.println(al1);
	    
	    System.out.println(al.equals(al1));
	    
	    System.out.println(al.get(3));
	    
	    System.out.println(al.get(2));
	  
	    System.out.println(al.indexOf('A'));
	    
	    System.out.println(al.remove(2));
	    System.out.println(al);
	    
	    System.out.println(al.size());
	    System.out.println("==========For Loop===============");
	    
	    for(int i=0;i<=al.size()-1;i++)
	    {
	    	System.out.println(al.get(i));
	    	
	    }
	   System.out.println("========for each loop==============");
	   for(Object a:al)
	   {
		   System.out.println(a);
	   }
	   System.out.println("===========iterator================");
	   
	   Iterator<Object> it = al.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }
	    System.out.println("============List-iterator============");
	    ListIterator<Object> li = al.listIterator();
	    while(li.hasNext())
	    {
	    	System.out.println(li.next());
	    }
	}

}

package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public VectorStudy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
	     Vector<Integer> v=new Vector<>();
	     
	     v.add(12);
	     v.add(12);
	     v.add(null);
	     v.add(null);
	     v.add(1);
	     v.add(212);
	     System.out.println(v);
	     v.add(1, 999);
	     
	     System.out.println(v.isEmpty());
	     
	     System.out.println(v.capacity());
	     System.out.println(v.size());
	     v.add(125);
	     v.add(245);
	     v.add(284);
	     v.add(212);
	     System.out.println(v.capacity());
	     System.out.println(v.size());
	System.out.println(v.elementAt(0)); 
	System.out.println("==========for loop==============");
	for(int i=0; i<=v.size()-1;i++)
	{
		System.out.println(v.get(i));
	}
	System.out.println("==========each loop===============");
	
	for(Integer ve:v)
	{
		System.out.println(ve);
	}
	System.out.println("===========Iterator==================");
	
	Iterator<Integer> it = v.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("===============List-Iterator============");
	
	ListIterator<Integer> il = v.listIterator();
	while(il.hasNext())
	{
		System.out.println(il.next());
	}
		
	System.out.println("========Enumaration==========");
	
	Enumeration<Integer> ev = v.elements();
	while(ev.hasMoreElements())
	{
		System.out.println(ev.nextElement());
	}
	}

}

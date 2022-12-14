package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public LinkedListStudy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		LinkedList<Object>ll=new LinkedList<>();
		
		ll.add("Pune");
		ll.add("Pune");
		ll.add(null);
		ll.add(null);
		ll.add(true);
		ll.add('M');
		ll.add(125.45f);
		System.out.println(ll);
		
		ll.add(2, "Bharat");
		System.out.println(ll);
		
		ll.addFirst("acp");
		System.out.println(ll);
		
		ll.addLast("Mh");
		System.out.println(ll);
		
		ll.offer("ind");
		System.out.println(ll);
		
		ll.offerFirst("Test");
		System.out.println(ll);
		System.out.println("============peek=========");
		
		System.out.println(ll.peek());//declair/show first object/peek and also show LinkedLis
		System.out.println(ll);
		
		System.out.println(ll.peekFirst());//declair/show first object/peek and also show LinkedLis
		System.out.println(ll);
		
		System.out.println(ll.peekLast());//declair/show last object/peek and also show LinkedList
		System.out.println(ll);
		System.out.println("================poll===============");
		
		System.out.println(ll.poll());//declair first poll and delete from LinkedList
		System.out.println(ll);
		
		System.out.println(ll.pollFirst());//first poll declair and delete from LinkedList
	    System.out.println(ll);
		
		System.out.println(ll.pollLast());//last poll declair and delet from LinkedList
		System.out.println(ll);
		System.out.println("============pop===========");
		System.out.println(ll.pop());//first object declair and delete from LinkedList
		System.out.println(ll);
		
		ll.push("Mum");//insert start index
		System.out.println(ll);
		//System.out.println(ll.size());
		
		System.out.println("==========for loop===========");
		
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("===============each loop============");
		
		for(Object l:ll)
		{
			System.out.println(l);
		}
		System.out.println("============Iterator================");
		
		Iterator<Object> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			System.out.println("=================ListIterator=============");
			
			ListIterator<Object> li = ll.listIterator();
			
			while(li.hasNext())
			{
				System.out.println(li.next());
			}
	}

}

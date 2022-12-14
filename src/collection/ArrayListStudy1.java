package collection;

import java.util.ArrayList;

public class ArrayListStudy1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<Object>al=new ArrayList<>();//
		
		al.add("Pune");
		al.add(123);
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(12.123f);
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		al.add(1, "Bharat");
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.contains(1234));
		
		Object al1 = al.clone();
		System.out.println(al1);
		
		System.out.println(al.equals(al1));
		System.out.println(al.get(1));
		System.out.println(al.indexOf('A'));
		
		System.out.println(al.remove(0));
		System.out.println(al);
		
		System.out.println(al.remove(true));
		System.out.println(al);
		
		System.out.println(al.set(3,"Hi"));
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println("================================");
		ArrayList<Integer>al2 =new ArrayList<>();
		
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(4);
		al2.add(5);
		
		System.out.println(al2);
		System.out.println(al2.isEmpty());
		System.out.println(al2.contains(12));	
		
		System.out.println(al2.equals(al1));
		
		System.out.println(al2.get(2));
		System.out.println(al2.indexOf(3));
		
		System.out.println(al2.remove(4));
		System.out.println(al2);
		System.out.println(al2.get(2));
		System.out.println(al2.size());
		
		al2.clear();
		System.out.println(al2);
	}

}

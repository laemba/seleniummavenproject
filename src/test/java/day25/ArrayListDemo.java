package day25;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		//List li=new ArrayList();
		// It accepts heterogenous data
		//It follows insertion order
		//It accepts duplicate values
		//It accepts multiple nulls
		
		ArrayList al=new ArrayList();
	//	ArrayList<String> arrlist=new ArrayList<>();
		
		al.add(123);
		al.add(15.25);
		al.add("venkat");
		al.add("welcome");
		al.add("welcome");
		al.add(null);
		al.add(null);
		
		System.out.println(al);
//		
//		for(Object a:al)
//		{
//			System.out.println(a);
//		}
//		
		
		al.add("25");	
		al.add(2,"Sanjay");
		System.out.println(al);		
		System.out.println(al.get(2));
		
		System.out.println(al.size());
		// this is recommended
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		al.remove(0);
		System.out.println(al);
		System.out.println(al.get(5));
		

	}

}

package day25;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
	//Accepts heterogenous data
	//Does not follow insertion order
	//Does not accept duplicate values
	//Does not accept mulitple nulls
		//Set hs=new HashSet();
		HashSet hs=new HashSet();
	
		hs.add(123);
		hs.add("welcome");
		hs.add(15.50);
		hs.add("welcome");
		hs.add(200);
		hs.add("sanjay");
		hs.add(null);
		hs.add(null);
		
		for(Object x:hs)
		{
			System.out.println(x);
		}
		
	
		//converting the set into list
		ArrayList al=new ArrayList(hs);
		
		System.out.println(al);
		
		
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println(al.get(3));
		
		
		
	//	System.out.println(hs);
	
		

	}

}

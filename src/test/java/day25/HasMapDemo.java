package day25;

import java.util.HashMap;
import java.util.Map;

public class HasMapDemo {

	
	public static void main(String args[])
	{
		//Keys should be unique
		//it accepts duplicate values
				
		//Map map=new HashMap();
		HashMap hm=new HashMap();
		
		hm.put(101, "abhi");
		hm.put(102, "abhi");
		hm.put(103, "arjun");
		hm.put(104, "arjun");
		hm.put(101,"arjun");
		hm.put(101,"xxx");
		
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
		
		System.out.println(hm.get(101));
		
		for(Object x:hm.keySet())
		{
			System.out.println(x +" "+ hm.get(x));
		}
		
		
		
		
		
	}
}

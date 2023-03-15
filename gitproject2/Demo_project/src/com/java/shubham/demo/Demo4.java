package com.java.shubham.demo;

import java.util.HashSet;
import java.util.Iterator;

public class Demo4 {
	
	public static void main(String[] args) {
		
		
		HashSet hs=new HashSet();
		
		hs.add("Ram");
		hs.add("sham");
		
		hs.add("sheetal");
		
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		//jr project explorer mdhe jr question mark yet asel tr samjaych ki 
		//file ajun loacal repository vr nahi geliy.
		
		
		
		
	}

}

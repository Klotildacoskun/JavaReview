package iQJava;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDublicates {

	public static void main(String[] args) {
		
		ArrayList<String> alist= new ArrayList<>();
		
		alist.add("John");
		alist.add("James");
		alist.add("John");
		alist.add("Jack");
		alist.add("Jesica");
		alist.add("Jane");
		alist.add("Jane");
		System.out.println(alist);
		
		HashSet<String>set= new HashSet<>();
		for (String string : alist) {
			set.add(string);
		}
		
		System.out.println(set);
		

	}

}

package iQJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseStringCorrectPunct {

	public static void main(String[] args) {
		String first="Wherever you go, you can always find beauty.";
		System.out.println(reverse(first));

	}

	private static String reverse(String first) {
		String reversed="";
		
		List<String>list=new ArrayList<>(Arrays.asList(first.toLowerCase().replaceAll("\\.", "").replaceAll(",", "").split(" ")));
		System.out.println(list);
		for (int i=list.size()-1;i>=0;i--) {
			if(i==5) {
				reversed+= list.get(i);
				continue;
			}else {
			reversed+=list.get(i)+" ";}
		}
		reversed=reversed.toUpperCase().charAt(0) + reversed.substring(1).replaceAll(","," ").trim()+".";
		return reversed;
	}

}

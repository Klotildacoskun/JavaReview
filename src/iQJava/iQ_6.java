package iQJava;

import java.util.Set;
import java.util.TreeSet;

public class iQ_6 {

	public static void main(String[] args) {
		String str="As Pennsylvania small businesses shuttered by coronavirus stay-at-home orders take their fight against Democratic Gov. Tom Wolf to the Supreme Court, Judge Andrew Napolitano said Tuesday that he's not sure the justices will hear the case.\r\n" + 
				"\r\n" + 
				"Appearing on \"America's Newsroom\" with host Ed Henry, Napolitano said that the Pennsylvania state Supreme Court has ruled 4-3 in favor of the governor already, so the Supreme Court would likely not get involved.\r\n" + 
				"";
		str=str.toLowerCase().replaceAll("[^A-Za-z ]","");
		String [] temp= str.trim().split(" ");
		
		Set<String>wordSet=new TreeSet<>();
		for (int i = 0; i < temp.length; i++) {
			wordSet.add(temp[i]);
			
		}
		System.out.println(wordSet);
		
		for (String word : wordSet) {
			int count=0;
			for (int i = 0; i < temp.length; i++) {
				if(word.equals(temp[i])) {
					count++;
				}
			}
			System.out.println(word+ " is repeated "+ count + " times");
			
		}

	}

}

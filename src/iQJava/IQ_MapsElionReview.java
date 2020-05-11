package iQJava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IQ_MapsElionReview {
	public static void main(String[] args) {
	Map<String, String> englishAlbanian = new HashMap<>();
	
	englishAlbanian.put("good", "mire");
	englishAlbanian.put("house", "shtepi");
	englishAlbanian.put("hi", "ckemi");
	englishAlbanian.put("hi", "pershendetje");
	System.out.println(englishAlbanian);
	
	//insertion order is not maintained for entries.
	//treemap alfabetik siralar
	//linkedhashmap insertion orderi korur
	
	String englishHouse = "house";
	String albanianHouse = englishAlbanian.get(englishHouse);
	System.out.println(englishHouse + " -> "+albanianHouse );
	
	Map<String, String> albanianEnglish = new HashMap<String, String>();
	
	albanianEnglish.put("mire" , "good");
	albanianEnglish.put("shtepi" , "house");
	albanianEnglish.put("pershendetje" , "hi");
	System.out.println(" The English for shtepi is: "+ albanianEnglish.get("shtepi"));
	
	Set<String> keys = englishAlbanian.keySet();
	Iterator<String> keyIt = keys.iterator();
	keyIt.hasNext();
//	if(keyIt.hasNext()) { // if there is a next element, it is safe to get it
//		keyIt.hasNext();
//	}
	System.out.println("----Iterator-----");
	while(keyIt.hasNext()) {
		String key = keyIt.next();
		System.out.println(key);
	}
	System.out.println("----for each-----");
	for (String string : keys) {
		System.out.println(string);
	}
	System.out.println("----for each-Values----");
	Collection<String>values= englishAlbanian.values();
	for (String string : values) {
		System.out.println(string);
	}
	
	System.out.println("-------Entry Set--------");
	Set<Entry<String,String>> entries=englishAlbanian.entrySet();
	for (Entry<String, String> entry : entries) {
		System.out.println(entry.getKey()+"-->"
				+ " "+entry.getValue());
	}
}
}


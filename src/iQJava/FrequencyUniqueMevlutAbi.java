package iQJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyUniqueMevlutAbi {

	public static void main(String[] args) {
		String str = "AAABBBCCCDDDaFGH";
		System.out.println(removeDup(str));
		System.out.println(removeLetter(str));
		System.out.println(frequency(str));
	}

	private static char[] frequency(String str) {
		
		return null;
	}

	public static String removeDup(String string) {
		
//		String [] strArr=string.split("");
//		List<String> list= new ArrayList<>(Arrays.asList(strArr));
//		System.out.println(list);
		
		return Arrays.stream(string.split("")).distinct().reduce("", (x, y) -> x + y);

	}
	public static String removeLetter(String string) {
		return Arrays.stream(string.split("")).filter(x->!x.equalsIgnoreCase("a")).reduce("", (x, y) -> x + y);

	}
	
	public String unique(String string) {
		
		String [] strArr=string.split("");
		Map<String,Integer> mapping= new HashMap<>();
		for (String str : strArr) {
			if(!mapping.containsKey(str)) {
				mapping.put(str,1);
			}else {
				mapping.put(str,mapping.get(str)+1);
			}
		}
		
		return mapping.entrySet().stream().filter(x->x.getValue()==1).map(x->x.getKey()).collect(Collectors.joining());
	}

}

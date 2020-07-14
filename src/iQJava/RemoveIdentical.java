package iQJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RemoveIdentical {

	public static void main(String[] args) {
		String [] elementArray= {"Ahmet","Ahmet","Mehmet","Ali","Veli"};
		//removeSameElement(elementArray);
		String str="tilda99";
		char [] strToCharArr=str.toCharArray();
		Increment(strToCharArr);
		System.out.println(strToCharArr);
	}
	static void Increment(char[] referenceNumber) {
		
		 int incremented=referenceNumber[referenceNumber.length-1]+1;
		
	}

//	private static void removeSameElement(String[] elementArray) {
//		List<String> newList=Arrays.asList(elementArray);
//		
//		List<String>noDublicates=newList.stream().distinct().collect(Collectors.toList());
//		System.out.println(noDublicates);
//		
//	}

}

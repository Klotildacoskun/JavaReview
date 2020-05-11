package iQJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Lambda {

	public static void main(String[] args) {
		String str = "AAAAABBBBCCCDDDEFGGGG";
		List<Integer> number = new ArrayList<>(Arrays.asList(1, 1, 3, 3, 3, 3, 5, 5, 5, 5, 7, 7, 7, 7, 8, 8, 8, 8, 8));
		List<String> kutuphane = new ArrayList<>(Arrays.asList("Kitap 0", "Kitap 7", "Kitap 1", "Kitap 2", "Kitap 3",
				"Kitap 4", "Kitap 1", "Kitap 2", "Kitap 3", "Kitap 4", "Kitap 1", "Kitap 2", "Kitap 3", "Kitap 4"));
		Map<String, Integer> mapKutuphane = new TreeMap<>();
		kutuphane.forEach(x -> {
			mapKutuphane.put(x, mapKutuphane.getOrDefault(x, 0) + 1);
		});// first it checks whether the element
		// is in the map, if not the index is assigned as 0, then it is added 1-> 1 of
		// the first element.
		// when it encounters for the second time it just adds one more.

		System.out.println(mapKutuphane);
	}

	public static String unique(String s) {
		Map<String, Integer> uni = new HashMap<>();
		for (String st : s.split("")) {
			uni.put(st, uni.getOrDefault(st, 0) + 1);
		}

		return uni.entrySet().stream().filter(x -> x.getValue() == 1).map(x -> x.getKey())
				.collect(Collectors.joining());

	}

	public static String frequency(String s) {
		Map<String, Integer> uni = new HashMap<>();
		for (String st : s.split("")) {
			uni.put(st, uni.getOrDefault(st, 0) + 1);
		}

		return uni.entrySet().stream().map(x -> x.getKey() + x.getValue()).collect(Collectors.joining());

	}

	public static String removeDup(String s) {
		Map<String, Integer> uni = new HashMap<>();
		for (String st : s.split("")) {
			uni.put(st, uni.getOrDefault(st, 0) + 1);
		}

		return uni.entrySet().stream().map(x -> x.getKey()).collect(Collectors.joining());

	}
}

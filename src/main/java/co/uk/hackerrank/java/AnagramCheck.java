package co.uk.hackerrank.java;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {

	public static boolean isAnagram(String s, String t) {
		Map<Character, Integer> stringMap = new HashMap<>();
		if(s.length() != t.length()) {
			return false;
		}

		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			char key = s.toLowerCase().charAt(i);
			if(stringMap.containsKey(key)) {
				count = stringMap.get(key);
				stringMap.replace(key, count + 1);
			} else {
				stringMap.put(key, count + 1);
			}
		}

		for (int i = 0; i < t.length(); i++) {
			char key = t.toLowerCase().charAt(i);
			if(stringMap.containsKey(key)) {
				int count = stringMap.get(key);
				stringMap.replace(key, count - 1);
			} else {
				return false;
			}
		}

		return stringMap.entrySet().parallelStream().allMatch(map -> map.getValue() == 0);

	}

	public static void main(String[] args) {
		String s = "racecar";
		String t = "carrace";
		System.out.println(AnagramCheck.isAnagram(s, t));
	}
}

package co.rays.string_interview;

import java.util.Map;
import java.util.TreeMap;

public class StringCharacterCount {

	public static void main(String[] args) {
		String input="hello";
		Map<Character, Integer> map=new TreeMap<Character, Integer>();
		char words[]=input.toCharArray();
		for (char word : words) {
			if(!map.containsKey(word)) {
				map.put(word, 1);
			}
			else {
				int value=map.get(word);
				map.put(word, value+1);
			}
			
		}
		System.out.println(map);

	}

}

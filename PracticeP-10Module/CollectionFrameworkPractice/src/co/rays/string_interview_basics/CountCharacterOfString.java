package co.rays.string_interview_basics;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOfString {

	public static void main(String[] args) {
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		String str="HelloWorld";
		char []charArr=str.toCharArray();
		for(int i=0;i<charArr.length;i++) {
			if(!map.containsKey(charArr[i])) {
				
			map.put(charArr[i], 1);
			}
			else {
				int cons=map.get(charArr[i]);
			
				map.put(charArr[i], cons+1);
			}
			
		}
		System.out.println(map);
	}

}

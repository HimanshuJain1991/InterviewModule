package cm.rays.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map  map=new HashMap();
		map.put("1", "One");
		map.put("2", "Two");
		map.put("3", "Three");
		map.put("4", "Four");
		System.out.println(map);
		System.out.println("map size is= "+map.size());
		System.out.println(map.containsKey("3"));
		System.out.println(map.containsValue("Three"));
		//System.out.println(map.get("1"));
		Set keys=map.keySet();
		for (Object object : keys) {
			System.out.println(object);
		}
		Collection values=map.values();
		System.out.println(values);
		
		Set keySet=map.entrySet();
		System.out.println(keySet);

	}

}

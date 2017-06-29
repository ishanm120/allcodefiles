package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Ishan", "QA1");
		map.put("Kuldip", "QA2");
		map.put("Himanshu", "QA3");
		map.put("Nalin", "QA4");
		map.put("Palak", "QA5");
		map.put("Rathin", "QA6");

		System.out.println(map);
		System.out.println(map.get("Ishan"));

		for (Entry<String, String> s : map.entrySet()) {

			System.out.println(s.getKey() + " : " + s.getValue());

		}

	}
}

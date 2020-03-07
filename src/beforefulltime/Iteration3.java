package beforefulltime;

import java.util.HashMap;
import java.util.Map;

public class Iteration3 {
	public static void main(String[] args) {
		HashMap<String, Integer>hm=new HashMap<String, Integer>();
		hm.put("apple", 12);
		hm.put("kiwi", 13);
		hm.put("orange", 14);
		hm.put("ots", 15);
		hm.put("staberry", 16);
		for(Map.Entry<String, Integer>entry:hm.entrySet()) {
			System.out.println("item:"+entry.getKey()+",price"+entry.getValue());
		}
		
	}

}

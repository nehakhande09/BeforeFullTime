package beforefulltime;

import java.util.HashMap;
import java.util.Map;

public class Iteration2 {
public static void main(String[] args) {
	HashMap<String, String> map=new HashMap<String, String>();
	map.put("guj", "nagar");
	map.put("jam", "nagar");
	map.put("kerala", "nagar");
	for(String state:map.keySet()) 
		System.out.println("state:"+state);
	for(String capital:map.values())
		System.out.println("capital:"+capital);
	
	}
	
	
}


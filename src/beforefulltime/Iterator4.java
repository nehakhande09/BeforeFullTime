package beforefulltime;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Iterator4 {
	public static void main(String[] args) {
		HashMap<String, String>hm=new HashMap<String, String>();
		hm.put("neha", "khande");
		hm.put("sneha", "k");
		hm.put("snehall", "khandelwal");
		hm.put("nehal", "khandale");
		
		for(String name:hm.keySet()) {
			
			Set<String> lasttname=hm.keySet();
			//System.out.print(hm);
			//System.out.println("firstname:"+name+   " lastname:"+hm.get(name));
			System.out.println(hm.get(name));
		}
		
		
		
		//for(Map.Entry<String, String>entry:hm.entrySet()) {
			
			//System.out.println("first name:"+entry.getKey()+",lastname:"   +entry.getKey());
		//}
		
	}

}

package beforefulltime;

import java.util.HashMap;
import java.util.Iterator;

public class Iteratorhashmap {
	public static void main(String[] args) {
		HashMap<Integer, String>hm=new HashMap<Integer, String>();
		hm.put(110, "neha");
		hm.put(110, "abcd");
		hm.put(110, "efgh");
		hm.put(110, "ijkl");
		hm.put(110, "mnop");
		Iterator<Integer> itr =hm.keySet().iterator();
		while(itr.hasNext()) {
			
			int key=(int)itr.next();
			
			System.out.println("roll no:"+key+   "name:"+hm.get(key));
		}
		
		
	}

}

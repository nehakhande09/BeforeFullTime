package Singleton;


import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class test {
@SuppressWarnings("rawtypes")
public static void main(String[] args) {
	Properties p=System.getProperties();
	Set set=p.entrySet();
	java.util.Iterator itr=set.iterator();
	while(itr.hasNext()){  
		Map.Entry entry=(Map.Entry)itr.next();  
		System.out.println(entry.getKey()+" = "+entry.getValue());  
		}  
		  
}
}

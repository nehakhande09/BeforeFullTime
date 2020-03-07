package Singleton;

import java.io.FileWriter;
import java.util.Properties;

public class Test1 {
	
	public static void main(String[] args)throws Exception{  
	  
	Properties p=new Properties();  
	p.setProperty("name","neha k");  
	p.setProperty("email","nehak@gmail.com");  
	  
	p.store(new FileWriter("efg.properties"),"Singletone");  
	  
	}  
	}  



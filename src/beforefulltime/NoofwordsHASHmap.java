package beforefulltime;

import java.util.Scanner;

public class NoofwordsHASHmap {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		System.out.println("number of words in the string:"+count_words(str)+"\n");
	}
public static int count_words( String str) {
	int count=0;
	if(!("".equals(str.substring(0,1)))||("".equals(str.substring(str.length()-1)))){
		for(int i=0;i<str.length();i++) {
			
			 {
			if(str.charAt(i))""{
				count++;
			}
			
			count=count+1;
		}
		return count;
	}
	
	
}
}}

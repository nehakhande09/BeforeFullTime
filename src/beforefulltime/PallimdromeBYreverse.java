package beforefulltime;

import java.util.Scanner;

public class PallimdromeBYreverse {
	public static void main(String[] args) {
		String original,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string/no to chk");
		original=sc.nextLine();
		int length=original.length();
		
		for(int i=length-1;i>=0;i--) 
			
			reverse=reverse+original.charAt(i);
		if(original.equals(reverse))
			System.out.println("enter string/no is palimdrome");
		else
			System.out.println("is not palimdrome");
		
	}

}

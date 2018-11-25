package logics;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=new String(scanner.nextLine());
		
		char[] ch=s.toCharArray();
		String rev="";
		System.out.println(ch.length);
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
	}
}

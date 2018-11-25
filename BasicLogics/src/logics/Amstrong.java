package logics;

import java.util.Scanner;


public class Amstrong {


	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=scanner.nextInt();
		Amstrong p=new Amstrong();
	    p.findPalindrome(n);
	}

	private void findPalindrome(int n) {
		
		int length=findLength(n);
		
		int rem=0;
		int temp=n;
		int sum=0;
		
		while(n>0) {
			
			rem=n%10;
			sum=sum+power(rem,length);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is a palindorme");
		}
		else {
			System.out.println(temp+" is not a  palindorme");
		}
		
		
	}

	private int power(int rem, int length) {
		
		int pow=1;
		while(length>0) {
			pow=pow*rem;
			length--;
		}
		return pow;
	}

	private int findLength(int n) {
		
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}
	
	
}



package logics;

import java.util.Scanner;

public class EvenOrOdd {
	
public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=scanner.nextInt();
		
	
		if(n%2==0) {
			System.out.println(n+ " is EVEN number");
		}
		else {
			System.out.println(n+" is ODD number");
		}
	}

}

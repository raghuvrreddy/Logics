package logics;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {

		int temp;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the array size:");

		int[] arr = new int[scanner.nextInt()];
		System.out.println("Enter the elements");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = scanner.nextInt();
		}
		
		for(int i = 0; i <arr.length; i++) {

             for(int j=i+1;j<arr.length;j++) {
            	 
            	 if(arr[i]>arr[j]) {
            		 
            		 temp=arr[i];
            		 arr[i]=arr[j];
            		 arr[j]=temp;
            	 }
             }
      

		}
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

	}

}

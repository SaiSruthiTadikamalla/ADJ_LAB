package programs;


//Java program to demonstrate the 
//working of ArrayList in Java 

import java.io.*; 
import java.util.*; 

class AL { 
	public static void main(String[] args) 
	{ 
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		int n = sc.nextInt();
		ArrayList<Integer> ar = new ArrayList<Integer>(n); 
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter values: ");
			int num = sc.nextInt();
			ar.add(num);
		} 
		for (int i = 0; i < ar.size(); i++) 
			sum += ar.get(i);
		System.out.println("Sum of elements in array list =" + sum);
	} 
} 


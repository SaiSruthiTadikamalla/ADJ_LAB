package programs;


import java.io.*; 
import java.util.*; 

public class HT { 
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		int n = sc.nextInt();
		Hashtable<Integer, String> hash = new Hashtable<>(n); 
		for(int i = 0; i < n; i++) {
			System.out.println("Enter values: ");
			String s = sc.next();
			hash.put(i + 1,  s);
		}
		System.out.println("Key, value pairs in the hash map are: " + hash);  
	} 
}


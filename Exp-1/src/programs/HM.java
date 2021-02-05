package programs;

import java.util.Hashtable;
import java.util.*;

public class HM {
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		int n = sc.nextInt();
		HashMap<Integer, String> hash = new HashMap<>(n); 
		for(int i = 0; i < n; i++) {
			System.out.println("Enter values: ");
			String s = sc.next();
			hash.put(i + 1,  s);
		}
		System.out.println("Key, value pairs in the hash map are: " + hash);  
	} 
}

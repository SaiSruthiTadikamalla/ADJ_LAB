import java.rmi.*;
import java.util.*;
import java.util.Arrays; 

public class RMIClient {
	public static void main(String args[]) throws Exception{

		int x,n;
		String result;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of elements:");
		x = sc.nextInt();
		int[] intArray = new int[x];
		System.out.println("Enter elements:");
		for(int i = 0; i < x; i++){
			intArray[i] = sc.nextInt();
		}

		SortArray so=(SortArray)Naming.lookup("rmi://localhost:1099/sortServer");

		result = so.arraySort(x, intArray);

		System.out.println("Sorted Array:"+result);


	}
}
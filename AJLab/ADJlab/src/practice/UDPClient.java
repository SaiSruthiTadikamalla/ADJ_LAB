package practice;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter elements separated by space: ");
		String elementString = sc.nextLine();
		try {
			InetAddress ia = InetAddress.getLocalHost(); 
			DatagramSocket ds = new DatagramSocket(1800,ia);
			byte[]  elements= elementString.getBytes();
			DatagramPacket dp = new DatagramPacket(elements,elements.length,ia,10);
			ds.send(dp);
			byte[] result = new byte[100];
			DatagramPacket in = new DatagramPacket(result,result.length);
			ds.receive(in);
			System.out.println("Data received from server");
			System.out.println("\nMinimum and maximum elements are: "+(new String(result)));
			ds.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
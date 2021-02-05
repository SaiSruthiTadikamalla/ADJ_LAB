package practice;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) throws IOException, UnknownHostException {
		Socket s = new Socket("Localhost", 5050);
		DataInputStream d = new DataInputStream(s.getInputStream());
		PrintStream ps = new PrintStream(s.getOutputStream());
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		String st = String.valueOf(num);
		ps.println(st);
		System.out.println("Sum of digits:" + d.readLine());
		s.close();
		System.out.println("Server is closed");
		

	}

}

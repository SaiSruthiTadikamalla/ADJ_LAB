package practice;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	static int digitSum(int n){
		int s = 0, d;
		while(n != 0){
			d = n % 10;
			s += d;
			n /= 10;
		}
		return s;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket s = new ServerSocket(5050);
		System.out.println("Server ready");
		Socket client = s.accept();
		DataInputStream d = new DataInputStream(client.getInputStream());
		PrintStream p = new PrintStream(client.getOutputStream());
		String st = d.readLine();
		int num =Integer.parseInt(st);
		System.out.println("Server: " + num);
		int fact = digitSum(num);
		p.print(String.valueOf(fact));;
		client.close();
		

	}

}

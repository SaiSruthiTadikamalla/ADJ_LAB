package exp8A;

import java.sql.*;
import java.io.*;
public class Register
{
	public static void main(String arg[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con;
			String url="jdbc:mysql://localhost:3306/onlinestore";
			con=DriverManager.getConnection(url,"root","root");
					Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from user");
			System.out.println("Name\tPassword\teMail\tPhoneNo");
			while(rs.next())
			{
				System.out.print(rs.getString(1)+ "\t"+ rs.getString(2) +"\t"); 
				System.out.println(rs.getString(3) +"\t"+ rs.getString(4));
			}
		} 
		catch(SQLException e)
		{
			System.out.println("Error is:"+e);
		}
		catch(Exception e)
		{
			System.out.println("Error is:"+e);
		}
	}
} 
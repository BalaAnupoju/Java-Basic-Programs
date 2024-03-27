package com.jdbc;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.*;

public class connection {

	
	
		static String url="jdbc:mysql://localhost:3306/jdbc";
		static String username="root";
		static String password="root";
		static String insert_Query="insert into Employee value(3,'sarika',30)";
		static String update_Query="update Employee set name='sravanti' where sno=4";
		static String delete_Query="delete from Employee where sno=4";
		static String select_Query="select * from Employee";
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con= DriverManager.getConnection(url,username,password);
				System.out.println("connection established");
				Statement stmt=con.createStatement();
				//int i=stmt.executeUpdate(delete_Query);//insert or update or delete
				
				ResultSet rs=stmt.executeQuery(select_Query);
				while(rs.next()){
					System.out.print("id : "+rs.getInt("sno"));
					System.out.print("name : "+rs.getString("name"));
					System.out.print("age : "+rs.getInt("age"));
					System.out.println();
				}
				
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
		
	}
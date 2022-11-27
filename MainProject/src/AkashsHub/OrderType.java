package AkashsHub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OrderType extends Types{
	int choice111=0;
	public void Order_type() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IceCreamShop", "root", "");
		Statement stm3 = con.createStatement();
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("\n\t\t\t Dine in or Parcel ");
		System.out.println("\n Enter no. to select");
		System.out.println(" ");
		System.out.println("1 - Dine in \n 2 - Parcel");
		System.out.println("0 For Exit\" ");
		System.out.print("Enter your choice: ");
		int choice111 = sc.nextInt();
		switch (choice111) {
		case 1:
			stm3.executeUpdate("update orders set Order_type='Dine in' where order_id=1");
			System.out.println("order placed");
			break;
		case 2:
			stm3.executeUpdate("update orders set Order_type='Parcel' where order_id=1");
			System.out.println("order placed");
		}
		}while(choice111 != 0);
	}

}

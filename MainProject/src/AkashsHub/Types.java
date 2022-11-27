package AkashsHub;

import java.util.*;
import java.sql.*;
public class Types extends Orders {
	int choice11=0;
	public void types()throws SQLException, ClassNotFoundException{
		Scanner sc=new Scanner(System.in);
		do {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IceCreamShop","root", "");
			Statement stm2 = con.createStatement();
		System.out.println("\n\t\t\t Types");
		System.out.println("\n Enter no. to select type");
		System.out.println(" ");
		System.out.println("1 - Cone \n 2 - Cup \n 3 - Candy \n 4 - Tub \n 5 - Plate");
		System.out.println("0 For Exit\" ");
		System.out.print("Enter your choice: ");
		int choice11=sc.nextInt();
		switch (choice11)
		{
		case 1:
			OrderType ot1=new OrderType();
			ot1.Order_type();
			stm2.executeUpdate("update orders set type='Cone' where order_id=1");
			break;
		case 2:
			OrderType ot2=new OrderType();
			ot2.Order_type();
			stm2.executeUpdate("update orders set type='Cup' where order_id=1");
			break;
		case 3:
			OrderType ot3=new OrderType();
			ot3.Order_type();
			stm2.executeUpdate("update orders set type='Candy' where order_id=1");
			break;
		case 4:
			OrderType ot4=new OrderType();
			ot4.Order_type();
			stm2.executeUpdate("update orders set type='Tub' where order_id=1"
					+ "");
			break;
		case 5:
			OrderType ot5=new OrderType();
			ot5.Order_type();
			stm2.executeUpdate("update orders set type='Plate' where order_id=1");
			break;
			
			
		}
		}while(choice11 != 0);
		
	}

}

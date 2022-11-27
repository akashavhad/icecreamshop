package AkashsHub;
import java.util.Scanner;
import java.sql.*;
class customer
{
	int cust_id;
	String name;
	long phone_no;

	public customer(int cust_id, String name,long phone_no)
	{
		this.cust_id = cust_id;
		this.name = name;
		this.phone_no = phone_no;
	}

	public String toString()
	{
		return (cust_id + " " + name + " " + phone_no);
	}
}

public class Customers
{
	public void main() throws SQLException, ClassNotFoundException
	{
		try { 
		int choice = 0;
		int cust_id;
		String name;
		long phone_no;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IceCreamShop", "root", "");
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n\t\t CUSTOMER DETAILS");
			System.out.println(" ");
			System.out.println(" Enter no. For given choises");
			System.out.println("1 - For Insert New Record");
			System.out.println("2 - For Update Records");
			System.out.println("3 - For Delete Records");
			System.out.println("4 - For View All Records");
			System.out.println("0 - For Exit");
			System.out.println(" ");
			System.out.print("Enter your choice: ");
			int choice2 = sc.nextInt();
			switch (choice2)
			{
			case 1:
			{
				System.out.println("\n\tEnter Details");
				Statement stm = con.createStatement();
				System.out.println("Enter Customer Id:");
				cust_id = sc.nextInt();
				System.out.println("Enter Customer Name:");
				name = sc.next();
				System.out.println("Enter Customer Phone no.:");
				phone_no = sc.nextLong();
				
stm.executeUpdate("insert into customers values ('" + cust_id + "','" + name + "','" + phone_no + "')");
				System.out.println("Inserted New Record !");
				break;
			}

			case 2:
			{
				Statement stm = con.createStatement();
				System.out.println("1 - Name\n 2 - phoneno\n");
				int info = sc.nextInt();
				switch (info)
				{
				case 1:
					System.out.println("Enter Customer Id To Update Name:");
					cust_id = sc.nextInt();
					System.out.println("Enter Customer's New Name:");
					name = sc.next();
					stm.executeUpdate("update customers set name='" + name + "' where cust_id='" + cust_id + "'");
					System.out.println("Updated Name To: "+name);
					break;
				case 2:
					System.out.println("Enter Customer Id To Update Phone Number:");
					cust_id = sc.nextInt();
					System.out.println("Enter Customer's New Phone Number:");
					phone_no = sc.nextLong();
					stm.executeUpdate("update customers set phone_no=" + phone_no + "' where cust_id='" + cust_id + "'");
					System.out.println("Updated Phone Number To: "+phone_no);
					break;
				}
				break;
			}
            case 3:
            {
				System.out.println("Enter Customer Id To Delete Record:");
				Statement stm = con.createStatement();
				System.out.println("Enter Customer Id:");
				cust_id = sc.nextInt();
				int c = stm.executeUpdate("delete from customers where cust_id=" + cust_id);
				if (c == 0) {
					System.out.println("Record Do not Exist");
				} else {
					System.out.println("Record Deleted!");

				}
				break;

			}
			case 4:
			{
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery("select * from customers");

				while (rs.next()) {
					System.out.print("\t\tcustomer Customer Id: " + rs.getInt(1));
					System.out.print("\t\tcustomer Name: " + rs.getString(2));
					System.out.print("\t\tcustomer Phone No.: " + rs.getString(3));
					System.out.println("\n");
					break;
				}
				break;

			}
			case 0:
			
				System.out.println("Exit");
				break;
			default:
				System.out.println("Enter The Correct Option");
				break;
			}
		} while (choice != 0);
	}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
}
}

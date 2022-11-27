package AkashsHub;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class orderdetail {
	int order_id;
	String flavour;
	String type;
	int price;
	

public orderdetail(int order_id, String flavour, String type, int price)
	{
this.order_id=order_id;
this.flavour=flavour;
this.type=type;
this.price = price;
	}

public String toString()
	{
return (order_id + " " + flavour + " " + type + " " + price);
    }
}

public class Orders {
	int choice1=0;

public void main() throws ClassNotFoundException, SQLException 
	{	
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IceCreamShop", "root", "");
Statement stm1 = con.createStatement();
Scanner sc = new Scanner(System.in);
do {
System.out.println("\n\t\t\t MENU");
System.out.println("\n Enter no. to select flavour");
System.out.println(" ");
System.out.println("1 - Guava \n 2 - Mango \n 3 - Apple \n 4 - Choclate \n 5 - Black Currant");System.out.println("0 For Exit\" ");
System.out.print("Enter your choice: ");
int choice1 = sc.nextInt();
try
{
switch (choice1) {
			case 1: 
Types t1=new Types();
t1.types();
stm1.executeUpdate("insert into customers values ('Guava')");
break;
			case 2:
Types t2=new Types();
t2.types();
stm1.executeUpdate("insert into customers values ('Mango')");
break;
case 3:
Types t3=new Types();
t3.types();
stm1.executeUpdate("insert into customers values ('Apple')");
break;
case 4:
Types t4=new Types();
t4.types();
stm1.executeUpdate("insert into customers values ('Choclate')");
break;
case 5:
Types t5=new Types();
t5.types();
stm1.executeUpdate("insert into customers values ('Black Currant')");
break;
     }}
catch(Exception e) 
{
	System.out.println(e);
}
	}while(choice1 != 0);
		
	}
}


				
				
			
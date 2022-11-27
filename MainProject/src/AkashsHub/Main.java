package AkashsHub;
import java.util.Scanner;
import java.sql.*;
public class Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			
			System.out.println("\n\t\tICECREAM HOUSE\t\t");
			System.out.println(" ");
			System.out.println(" Enter no.  ");
			System.out.println(" ");
			System.out.println(" 1 - For Order \n 2 - For Customer Details");
			System.out.println(" 3 - For Sales \n 0 - For Exit");
		    choice = sc.nextInt();
		 switch(choice)
		 {
		 case 1:
			 Orders o = new Orders();
			 o.main();
			 break;
		 case 2:
			 Customers c = new Customers();
			 c.main();
			 break;
		 case 3:
			Sales s = new Sales();
			 s.main();
			 break;
			 default:
				 System.out.println("Invalid Number");
				 break;
		 }
		
		}while(choice != 0);

	}

}



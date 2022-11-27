package AkashsHub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sales {
	public void main() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IceCreamShop", "root", "");
		Statement stm1 = con.createStatement();
		ResultSet rs = stm1.executeQuery("select sum(price) from orders");
		while (rs.next()) {
			System.out.print("\t\tTotal sales is.: " + rs.getString(1));
			System.out.println("\n");
	}

}
}
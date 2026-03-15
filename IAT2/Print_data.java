package IAT2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Print_data {

	public static void main(String[] b) {

		try {
			String url = "jdbc:mysql://LocalHost:3306/student2";
			String User = "root";
			String pass = "123456";
			// 1. get connection
			Connection con = DriverManager.getConnection(url, User, pass);
			// 2.create statement
			Statement st = con.createStatement();

			// 3.query
			String s_q = "select * from std1";

			ResultSet data = st.executeQuery(s_q);

			// 4. print data
			while (data.next()) // 1 chk for row-data presence-one cell
			{
				System.out.print(data.getString("rollno") + "\t");

				System.out.print(data.getString("name") + "\t");

				System.out.println("\n");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

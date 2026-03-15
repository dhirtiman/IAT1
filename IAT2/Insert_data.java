package IAT2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

// 1 . insert data 

public class Insert_data {
	public static void main(String[] k) {

		try {
			// 1. get connection

			String url = "jdbc:mysql://LocalHost:3306/student2";
			String user = "root";
			String pw = "123456";

			Connection con = DriverManager.getConnection(url, user, pw);

			// 2.create statement

			Statement st = con.createStatement();

			// 3. insert/update

			String ss = "insert into std1  (rollno,name) values('7','bb')";

			// INSERT INTO std1 (id, name) VALUES ('8', 'ee');

			// String ss = " UPDATE std1 SET name='sita' WHERE rollno='1' " ;

			st.executeUpdate(ss); // insert // UPDATE

			JOptionPane.showMessageDialog(null, "DATA inserted...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

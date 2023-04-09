package tester;

import static utils.DBUtils.*;
import java.sql.*;

public class TestStatement {

	public static void main(String[] args) {
		try (// establish database connection
				Connection cn = openConnection();
				// 2. create a statement object to hold query
				Statement st = cn.createStatement();
				// 3.pass the sql and exec it
				ResultSet rst = st.executeQuery("select * from users");) {
			// processing of the RST
			while (rst.next()) {
				System.out.println("ID: " + rst.getInt(1) + "\n Name: " + rst.getString(2) + "\n Email " + rst.getString(3)
						+ "\n Password " + rst.getString(4) + "\n reg amt " + rst.getDouble(5) + "\n reg on " + rst.getDate(6)
						+ "\n role " + rst.getString(7));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}// end of main

}// end of TestConnection

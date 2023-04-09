package tester;

import static utils.DBUtils.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class TestPreparedStatement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);
				Connection cn = openConnection();
				// create java.sql.PreparedStatement
				PreparedStatement pst = cn.prepareStatement("Select * from users where id=?");) {
			System.out.println("enter user id");
			// PST API public void setTYPE(int paramIndex, Type value)
			pst.setInt(1, sc.nextInt());

			// execute the query and process resultset
			try (ResultSet rst = pst.executeQuery()) {

				if (rst.next())
					System.out.println("ID: " + rst.getInt(1) + "\n Name: " + rst.getString(2) + "\n Email "
							+ rst.getString(3) + "\n Password " + rst.getString(4) + "\n reg amt " + rst.getDouble(5)
							+ "\n reg on " + rst.getDate(6) + "\n role " + rst.getString(7));
				else // replace the below code by throwing custom exception
					System.out.println("invalid user id: user not found");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}// end of main

}// end of TestConnection

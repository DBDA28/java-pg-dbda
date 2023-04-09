package dao;

import java.sql.*;
import java.util.List;

import static utils.DBUtils.*;

import pojo.User;

public class UserDaoImplement implements UserDao {
	// state
	private Connection conn;

	public UserDaoImplement() throws SQLException {
		super();
		// open db conn
		conn = openConnection();
		// create PST
		pst1 = conn.prepareStatement("select * from users where id=?");
		pst2 = conn.prepareStatement("select * from users where ")
		System.out.println("user dao created");

	}// end of ctor

	@Override
	public List<User> getCustomerByRegDate(Date begin, Date end) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	private PreparedStatement pst1;

	@Override
	public User getUserDetatilsByid(int userId) throws SQLException {
		// 1. set IN parameter: user id
		pst1.setInt(1, userId);
		// 2. execute query(Select) --> RST --> process the RST
		try (ResultSet rst = pst1.executeQuery()) {
			if (rst.next())
				// int userId, String name, String email, String password, double regAmount,
				// Date regDate, String role
				return new User(userId, rst.getString(2), rst.getString(3), rst.getString(4), rst.getDouble(5),
						rst.getDate(6), rst.getString(7));
		}
		return null;// this can be replace by throwing cutom exception
	}

	// clean PST
	public void cleanUp() throws SQLException {
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();
		// close cn
		closeConnection();

	}

}

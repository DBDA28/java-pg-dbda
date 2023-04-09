package dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import pojo.User;

public interface UserDao {
	//add a method decalaration to get user details by id
	
	User getUserDetatilsByid(int userId) throws SQLException;
	//add a method to get users by their reg data
	List<User> getCustomerByRegDate(Date begin, Date end) throws SQLException;


}

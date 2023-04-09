package tester;

import java.sql.SQLException;
import java.util.Scanner;

import dao.UserDaoImplement;
import pojo.User;

public class TestUserCRUD {
	public static void main(String[] args) throws SQLException {
		try (Scanner sc = new Scanner(System.in)) {
			// create dao instance
			UserDaoImplement dao = new UserDaoImplement();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options: 1. get use details by ID 0. exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("enter use id");
						User user=dao.getUserDetatilsByid(sc.nextInt());
						if(user!=null)
							System.out.println("Detail"+user);
						else
							System.out.println("invalide user ID!");

						break;

					case 0:
						exit=true;
						//clean up the resources
						dao.cleanUp();
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}

		}
	}

}

package model;

import java.sql.Connection;
import java.util.ArrayList;

import dao.LoginAccess;
import dao.Database;
import dto.Login;

public class User_ProfileAccess {
	public ArrayList<User_Details> getUser_Profilepage() throws Exception {
		ArrayList<User_Details> loginList = new ArrayList<User_Details>();
		Database db = new Database();
		Connection con = db.getConnection();
		User_Profileaccess = new User_Profile();
		user_profileList = access.getUser_ProfilePage(con);
		return user_profileList;
	}
}
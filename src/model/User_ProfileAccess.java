package model;

import java.sql.Connection;
import java.util.ArrayList;

import dao.Database;
import dao.User_Profile;
import dto.User_Details;


public class User_ProfileAccess {
	public ArrayList<User_Details> getUser_Profilepage() throws Exception {
		ArrayList<User_Details> User_DetailsList = new ArrayList<User_Details>();
		Database db = new Database();
		Connection con = db.getConnection();
		User_Profile newProfile = new User_Profile();
		User_DetailsList = newProfile.getUser_ProfilePage(con);
		return User_DetailsList;
	}
}
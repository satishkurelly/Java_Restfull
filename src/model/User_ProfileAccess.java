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
		User_Details = new User_Details();
		user_details = access.getUser_DetailsPage(con);
		return User_DetailsList;
	}
}
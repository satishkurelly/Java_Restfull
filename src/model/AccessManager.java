package model;

import java.sql.Connection;
import java.util.ArrayList;

import dao.Access;
import dao.Database;
import dto.Login;

public class AccessManager {
	public ArrayList<Login> getLoginpage() throws Exception {
		ArrayList<Login> loginList = new ArrayList<Login>();
		Database db = new Database();
		Connection con = db.getConnection();
		Access access = new Access();
		loginList = access.getLoginPage(con);
		return loginList;
	}
}
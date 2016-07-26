package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Login;


public class Access {
	public ArrayList<Login> getLoginPage(Connection con) throws SQLException {
		ArrayList<Login> loginList = new ArrayList<Login>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM login_table");
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Login loginObj = new Login();
				loginObj.setUsername(rs.getString("username"));
				loginObj.setPassword(rs.getString("password"));
				loginObj.setRole(rs.getString("role"));
				loginList.add(loginObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return loginList;

	}
}
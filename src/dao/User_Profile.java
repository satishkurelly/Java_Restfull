package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Login;
import dto.User_Details;


public class User_Profile {
	public ArrayList<User_Details> getUser_ProfilePage(Connection con) throws SQLException {
		ArrayList<User_Details> user_profileList = new ArrayList<User_Details>();
		PreparedStatement stmt = con.prepareStatement("Insert * FROM User_Profile");
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				User_Details user_profileObj = new User_Details();
				user_profileObj.setUser_Name(rs.getString("User_Name"));
				user_profileObj.setRole(rs.getString("Role"));
				user_profileObj.setEmployee_Id(rs.getString("Employee_Id"));
				user_profileObj.setFirst_Name(rs.getString("First_Name"));
				user_profileObj.setMiddle_Name(rs.getString("Middle_Name"));
				user_profileObj.setLast_Name(rs.getString("Last_Name"));
				user_profileObj.setWork_Email(rs.getString("Work_Email"));
				user_profileObj.setPersonal_Email(rs.getString("Personal_Email"));
				user_profileObj.setCell_Phone(rs.getString("Cell_Phone"));
				user_profileObj.setOffice_Phone(rs.getString("Office_Phone"));
				user_profileObj.setOffice_Address(rs.getString("Office_Address"));
				user_profileObj.setHome_Address(rs.getString("Home_Address"));
				user_profileObj.setPrimary_City(rs.getString("Primary_City"));
				user_profileObj.setSecondary_City(rs.getString("Secondary_City"));
				user_profileObj.setPrimary_State(rs.getString("Primary_State"));
				user_profileObj.setSecondary_State(rs.getString("Secondary_State"));
				user_profileObj.setPrimary_Country(rs.getString("Primary_Country"));
				user_profileObj.setSecondary_Country(rs.getString("Secondary_Country"));
				user_profileObj.setPrimary_Zip(rs.getString("Primary_Zip"));
				user_profileObj.setSecondary_Zip(rs.getString("Secondary_Zip"));
				user_profileList.add(user_profileObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user_profileList;
	}
}
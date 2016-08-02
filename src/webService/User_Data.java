package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import dto.User_Details;
import model.AccessManager;
import model.User_ProfileAccess;

@Path("/timeportal")
public class User_Data {
	@GET
	@Path("/user_profile")
	@Produces("application/json")
	public String user_profile() {
		String user_profile = null;
		ArrayList<User_Details> user_profileList = new ArrayList<User_Details>();
		try {
			user_profileList = new User_ProfileAccess().getUser_Profilepage();
			Gson gson = new Gson();
			user_profile = gson.toJson(user_profileList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user_profile;
	}
}
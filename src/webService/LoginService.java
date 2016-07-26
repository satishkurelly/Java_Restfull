package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import dto.Login;
import model.AccessManager;

@Path("/timeportal")
public class LoginService {
	@GET
	@Path("/login")
	@Produces("application/json")
	public String login() {
		String login = null;
		ArrayList<Login> loginList = new ArrayList<Login>();
		try {
			loginList = new AccessManager().getLoginpage();
			Gson gson = new Gson();
			login = gson.toJson(loginList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return login;
	}
}
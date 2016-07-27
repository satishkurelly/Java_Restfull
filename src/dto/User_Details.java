package dto;

public class User_Details {
	private String User_Name;
	private String Employee_Id;
	private String role;
	private String First_Name;
	private String Middle_Name;
	private String Last_Name;
	private String Work_Email;
	private String Personal_Email;
	private String Cell_Phone;
	private String Office_Phone;
	private String Office_Address;
	private String Home_Address;
	private String Primary_City;
	private String Secondary_City;
	private String Primary_State;
	private String Secondary_State;
	private String Primary_Country;
	private String Secondary_Country;
	private String Primary_Zip;
	private String Secondary_Zip;

	public User_Details() {

	}

	public User_Details(String User_Name, String Employee_Id, String role, String First_Name, String Middle_Name, String Last_Name, String Work_Email, String Personal_Email, String Cell_Phone, String Office_Phone, String Office_Address, String Home_Address, String Primary_City, String Secondary_City, String Primary_State, String Secondary_State, String Primary_Country, String Secondary_Country, String Primary_Zip, String Secondary_Zip){
		super();
		this.User_Name = User_Name;
		this.Employee_Id = Employee_Id;
		this.role = role;
		this.First_Name = First_Name;
		this.Middle_Name = Middle_Name;
		this.Last_Name = Last_Name;
		this.Work_Email = Work_Email;
		this.Personal_Email = Personal_Email;
		this.Cell_Phone = Cell_Phone;
		this.Office_Phone = Office_Phone;
		this.Office_Address = Office_Address;
		this.Home_Address = Home_Address;
		this.Primary_City = Primary_City;
		this.Secondary_City = Secondary_City;
		this.Primary_State = Primary_State;
		this.Secondary_State = Secondary_State;
		this.Primary_Country = Primary_Country;
		this.Secondary_Country = Secondary_Country;
		this.Primary_Zip = Primary_Zip;
		this.Secondary_Zip = Secondary_Zip;
	}

	public String getUser_Name() {
		return User_Name;
	}

	public void setUser_Name(String User_Name) {
		this.User_Name = User_Name;
	}

	public String getEmployee_Id() {
		return Employee_Id;
	}

	public void setEmployee_Id(String Employee_Id) {
		this.Employee_Id = Employee_Id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String First_Name) {
		this.First_Name = First_Name;
	}
	
	public String getMiddle_Name() {
		return Middle_Name;
	}

	public void setMiddle_Name(String Middle_Name) {
		this.Middle_Name = Middle_Name;
	}
	
	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String Last_Name) {
		this.Last_Name = Last_Name;
	}
	
	public String getWork_Email() {
		return Work_Email;
	}

	public void setWork_Email(String Work_Email) {
		this.Work_Email = Work_Email;
	}
	
	public String getPersonal_Email() {
		return Personal_Email;
	}

	public void setPersonal_Email(String Personal_Email) {
		this.Personal_Email = Personal_Email;
	}
	
	public String getCell_Phone() {
		return Cell_Phone;
	}

	public void setCell_Phone(String Cell_Phone) {
		this.Cell_Phone = Cell_Phone;
	}
	
	public String getOffice_Phone() {
		return Office_Phone;
	}

	public void setOffice_Phone(String Office_Phone) {
		this.Office_Phone = Office_Phone;
	}
	
	public String getOffice_Address() {
		return Office_Address;
	}

	public void setOffice_Address(String Office_Address) {
		this.Office_Address = Office_Address;
	}
	
	public String getHome_Address() {
		return Home_Address;
	}

	public void setHome_Address(String Home_Address) {
		this.Home_Address = Home_Address;
	}
	
	public String getPrimary_City() {
		return Primary_City;
	}

	public void setPrimary_City(String Primary_City) {
		this.Primary_City = Primary_City;
	}
	
	public String getSecondary_City() {
		return Secondary_City;
	}

	public void setSecondary_City(String Secondary_City) {
		this.Secondary_City = Secondary_City;
	}
	
	public String getPrimary_State() {
		return Primary_State;
	}

	public void setPrimary_State(String Primary_State) {
		this.Primary_State = Primary_State;
	}
	
	public String getSecondary_State() {
		return Secondary_State;
	}

	public void setSecondary_State(String Secondary_State) {
		this.Secondary_State = Secondary_State;
	}
	
	public String getPrimary_Country() {
		return Primary_Country;
	}

	public void setPrimary_Country(String Primary_Country) {
		this.Primary_Country = Primary_Country;
	}
	
	public String getSecondary_Country() {
		return Secondary_Country;
	}

	public void setSecondary_Country(String Secondary_Country) {
		this.Secondary_Country = Secondary_Country;
	}
	
	public String getPrimary_Zip() {
		return Primary_Zip;
	}

	public void setPrimary_Zip(String Primary_Zip) {
		this.Primary_Zip = Primary_Zip;
	}
	
	public String getSecondary_Zip() {
		return Secondary_Zip;
	}

	public void setSecondary_Zip(String Secondary_Zip) {
		this.Secondary_Zip = Secondary_Zip;
	}

	@Override
	public String toString() {
		return "User_Profile[User_Name=" + User_Name + ", Employee_Id=" + Employee_Id + ", role=" + role + "First_Name =" + First_Name + ",Middle_Name =" + Middle_Name + ",Last_Name =" + Last_Name + ",Work_Email =" + Work_Email + ",Personal_Email =" + Personal_Email + ",Cell_Phone =" + Cell_Phone + ",Office_Phone =" + Office_Phone + ",Office_Address =" + Office_Address + ",Home_Address =" + Home_Address + ",Primary_City =" + Primary_City + ",Secondary_City =" + Secondary_City + ",Primary_State =" + Primary_State + ",Secondary_State =" + Secondary_State + ",Primary_Country =" + Primary_Country + ",Secondary_Country =" + Secondary_Country + ",Primary_Zip =" + Primary_Zip + ",Secondary_Zip =" + Secondary_Zip + ", ]";
	}

}
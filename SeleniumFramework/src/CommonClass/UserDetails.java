package CommonClass;

import java.io.IOException;

public class UserDetails {
	
	public String userName;
	public String password;
	public String firstName;
	public String lastName;
	
	public  UserDetails GetUserDetails() throws IOException
	{
		    UserDetails userDetails=new UserDetails();
			userDetails.userName=ExcelReader.GetDataByColumn("UserName");
			userDetails.password=ExcelReader.GetDataByColumn("Password");
			userDetails.firstName=ExcelReader.GetDataByColumn("FirstName");
			userDetails.lastName=ExcelReader.GetDataByColumn("LastName");		
		    return userDetails;
		
	}
	
	

}

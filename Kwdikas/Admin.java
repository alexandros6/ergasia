package Hotel;

public class Admin {

	/*
 * (non-javadoc)
 */
private int AdminID;
 
/**
 * Getter of the property <tt>AdminID</tt>
 *
 * @return Returns the AdminID.
 * 
 */
public int getAdminID()
{
	return AdminID;
}

/**
 * Setter of the property <tt>AdminID</tt>
 *
 * @param AdminID The AdminID to set.
 *
 */
public void setAdminID(int AdminID ){
	this.AdminID = AdminID;
}

/*
 * (non-javadoc)
 */
private String Username;
 
/**
 * Getter of the property <tt>Username</tt>
 *
 * @return Returns the Username.
 * 
 */
public String getUsername()
{
	return Username;
}

/**
 * Setter of the property <tt>Username</tt>
 *
 * @param Username The Username to set.
 *
 */
public void setUsername(String Username ){
	this.Username = Username;
}

/*
 * (non-javadoc)
 */
private String Password;
 
/**
 * Getter of the property <tt>Password</tt>
 *
 * @return Returns the Password.
 * 
 */
public String getPassword()
{
	return Password;
}

/**
 * Setter of the property <tt>Password</tt>
 *
 * @param Password The Password to set.
 *
 */
public void setPassword(String Password ){
	this.Password = Password;
}

public Hotel.Customer addCustomer(){
	return null;

}

/*
 * (non-javadoc)
 */
private String addAdvertisment;
 
/**
 * Getter of the property <tt>addAdvertisment</tt>
 *
 * @return Returns the addAdvertisment.
 * 
 */
public String getAddAdvertisment()
{
	return addAdvertisment;
}

/**
 * Setter of the property <tt>addAdvertisment</tt>
 *
 * @param addAdvertisment The addAdvertisment to set.
 *
 */
public void setAddAdvertisment(String addAdvertisment ){
	this.addAdvertisment = addAdvertisment;
}

public String login(){
	return "";

}

public boolean checkPass(){
	return false;

}

public boolean setLoginStatus(){
	return false;

}

public void ShowMessage(){

}

}

package Hotel;

import java.util.Date;

public class Book {

	/*
 * (non-javadoc)
 */
public String RoomID;
 
/**
 * Getter of the property <tt>RoomID</tt>
 *
 * @return Returns the RoomID.
 * 
 */
public String getRoomID()
{
	return RoomID;
}

/**
 * Setter of the property <tt>RoomID</tt>
 *
 * @param RoomID The RoomID to set.
 *
 */
public void setRoomID(String RoomID ){
	this.RoomID = RoomID;
}

/*
 * (non-javadoc)
 */
private Date BookDay;
 
/**
 * Getter of the property <tt>BookDay</tt>
 *
 * @return Returns the BookDay.
 * 
 */
public Date getBookDay()
{
	return BookDay;
}

/**
 * Setter of the property <tt>BookDay</tt>
 *
 * @param BookDay The BookDay to set.
 *
 */
public void setBookDay(Date BookDay ){
	this.BookDay = BookDay;
}

/*
 * (non-javadoc)
 */
private Date LeaveDay;
 
/**
 * Getter of the property <tt>LeaveDay</tt>
 *
 * @return Returns the LeaveDay.
 * 
 */
public Date getLeaveDay()
{
	return LeaveDay;
}

/**
 * Setter of the property <tt>LeaveDay</tt>
 *
 * @param LeaveDay The LeaveDay to set.
 *
 */
public void setLeaveDay(Date LeaveDay ){
	this.LeaveDay = LeaveDay;
}

/*
 * (non-javadoc)
 */
private double MoneyCost;
 
/**
 * Getter of the property <tt>MoneyCost</tt>
 *
 * @return Returns the MoneyCost.
 * 
 */
public double getMoneyCost()
{
	return MoneyCost;
}

/**
 * Setter of the property <tt>MoneyCost</tt>
 *
 * @param MoneyCost The MoneyCost to set.
 *
 */
public void setMoneyCost(double MoneyCost ){
	this.MoneyCost = MoneyCost;
}

public void newBook(){

}

public void printReceipt(){

}

public double costCalculation(){
	return 0;

}

public Boolean searchBook(String RoomID){
	return null;
	

}}

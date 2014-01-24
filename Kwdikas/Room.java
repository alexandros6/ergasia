package Hotel;

public class Room {

	/*
 * (non-javadoc)
 */
private int NumPersons;
 
/**
 * Getter of the property <tt>NumPersons</tt>
 *
 * @return Returns the NumPersons.
 * 
 */
public int getNumPersons()
{
	return NumPersons;
}

/**
 * Setter of the property <tt>NumPersons</tt>
 *
 * @param NumPersons The NumPersons to set.
 *
 */
public void setNumPersons(int NumPersons ){
	this.NumPersons = NumPersons;
}

/*
 * (non-javadoc)
 */
private String RoomId;
 
/**
 * Getter of the property <tt>RoomId</tt>
 *
 * @return Returns the RoomId.
 * 
 */
public String getRoomId()
{
	return RoomId;
}

/**
 * Setter of the property <tt>RoomId</tt>
 *
 * @param RoomId The RoomId to set.
 *
 */
public void setRoomId(String RoomId ){
	this.RoomId = RoomId;
}

/*
 * (non-javadoc)
 */
private boolean Availability;
 
/**
 * Getter of the property <tt>Availability</tt>
 *
 * @return Returns the Availability.
 * 
 */
public boolean getAvailability()
{
	return Availability;
}

/**
 * Setter of the property <tt>Availability</tt>
 *
 * @param Availability The Availability to set.
 *
 */
public void setAvailability(boolean Availability ){
	this.Availability = Availability;
}

/*
 * (non-javadoc)
 */
private double RentPrice;
 
/**
 * Getter of the property <tt>RentPrice</tt>
 *
 * @return Returns the RentPrice.
 * 
 */
public double getRentPrice()
{
	return RentPrice;
}

/**
 * Setter of the property <tt>RentPrice</tt>
 *
 * @param RentPrice The RentPrice to set.
 *
 */
public void setRentPrice(double RentPrice ){
	this.RentPrice = RentPrice;
}

public Hotel.Room searchRoom(){
	return null;

}

public void returnBook(){

}

}

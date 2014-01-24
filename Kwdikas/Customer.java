package Hotel;

import java.util.Collection;
import java.util.Iterator;

public class Customer {

	/*
 * (non-javadoc)
 */
private String Surname;
 
/**
 * Getter of the property <tt>Surname</tt>
 *
 * @return Returns the Surname.
 * 
 */
public String getSurname()
{
	return Surname;
}

/**
 * Setter of the property <tt>Surname</tt>
 *
 * @param Surname The Surname to set.
 *
 */
public void setSurname(String Surname ){
	this.Surname = Surname;
}

/*
 * (non-javadoc)
 */
private String Name;
 
/**
 * Getter of the property <tt>Name</tt>
 *
 * @return Returns the Name.
 * 
 */
public String getName()
{
	return Name;
}

/**
 * Setter of the property <tt>Name</tt>
 *
 * @param Name The Name to set.
 *
 */
public void setName(String Name ){
	this.Name = Name;
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
private int UserId;
 
/**
 * Getter of the property <tt>UserId</tt>
 *
 * @return Returns the UserId.
 * 
 */
public int getUserId()
{
	return UserId;
}

/**
 * Setter of the property <tt>UserId</tt>
 *
 * @param UserId The UserId to set.
 *
 */
public void setUserId(int UserId ){
	this.UserId = UserId;
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

/**
 *
 */
private Collection<Client> client;

/**
 * Getter of the property <tt>client</tt>
 *
 * @return Returns the client.
 * 
 */
public Collection<Client> getClient()
{
	return client;
}
 
/**
 * Returns an iterator over the elements in this collection. 
 *
 * @return an <tt>Iterator</tt> over the elements in this collection
 * @see	java.util.Collection#iterator()
 * 
 */
public Iterator<Client> clientIterator(){
	return client.iterator();
}

/**
 * Returns <tt>true</tt> if this collection contains no elements.
 *
 * @return <tt>true</tt> if this collection contains no elements
 * @see	java.util.Collection#isEmpty()
 *
 */
public boolean isClientEmpty(){
	return client.isEmpty();
}

/**
 * Returns <tt>true</tt> if this collection contains the specified element. 
 *
 * @param element whose presence in this collection is to be tested.
 * @see	java.util.Collection#contains(Object)
 *
 */
public boolean containsClient(Client client){
	return this.client.contains(client);
}

/**
 * Returns <tt>true</tt> if this collection contains all of the elements
 * in the specified collection.
 *
 * @param elements collection to be checked for containment in this collection.
 * @see	java.util.Collection#containsAll(Collection)
 *
 */
public boolean containsAllClient(Collection<Client> client){
	return this.client.containsAll(client);
}

/**
 * Returns the number of elements in this collection.
 *
 * @return the number of elements in this collection
 * @see	java.util.Collection#size()
 *
 */
public int clientSize(){
	return client.size();
}

/**
 * Returns all elements of this collection in an array.
 *
 * @return an array containing all of the elements in this collection
 * @see	java.util.Collection#toArray()
 *
 */
public Client[] clientToArray(){
	return client.toArray(new Client[client.size()]);
}


/**
 * Ensures that this collection contains the specified element (optional
 * operation). 
 *
 * @param element whose presence in this collection is to be ensured.
 * @see	java.util.Collection#add(Object)
 *
 */
public boolean addClient(Client client){
	return this.client.add(client);
}

/**
 * Setter of the property <tt>client</tt>
 *
 * @param client the client to set.
 *
 */
public void setClient(Collection<Client> client){
	this.client = client;
}

/**
 * Removes a single instance of the specified element from this
 * collection, if it is present (optional operation).
 *
 * @param element to be removed from this collection, if present.
 * @see	java.util.Collection#add(Object)
 *
 */
public boolean removeClient(Client client){
	return this.client.remove(client);
}

/**
 * Removes all of the elements from this collection (optional operation).
 *
 * @see	java.util.Collection#clear()
 *
 */
public void clearClient(){
	this.client.clear();
}

/**
 *
 */
private Collection<Book> book;

/**
 * Getter of the property <tt>book</tt>
 *
 * @return Returns the book.
 * 
 */
public Collection<Book> getBook()
{
	return book;
}
 
/**
 * Returns an iterator over the elements in this collection. 
 *
 * @return an <tt>Iterator</tt> over the elements in this collection
 * @see	java.util.Collection#iterator()
 * 
 */
public Iterator<Book> bookIterator(){
	return book.iterator();
}

/**
 * Returns <tt>true</tt> if this collection contains no elements.
 *
 * @return <tt>true</tt> if this collection contains no elements
 * @see	java.util.Collection#isEmpty()
 *
 */
public boolean isBookEmpty(){
	return book.isEmpty();
}

/**
 * Returns <tt>true</tt> if this collection contains the specified element. 
 *
 * @param element whose presence in this collection is to be tested.
 * @see	java.util.Collection#contains(Object)
 *
 */
public boolean containsBook(Book book){
	return this.book.contains(book);
}

/**
 * Returns <tt>true</tt> if this collection contains all of the elements
 * in the specified collection.
 *
 * @param elements collection to be checked for containment in this collection.
 * @see	java.util.Collection#containsAll(Collection)
 *
 */
public boolean containsAllBook(Collection<Book> book){
	return this.book.containsAll(book);
}

/**
 * Returns the number of elements in this collection.
 *
 * @return the number of elements in this collection
 * @see	java.util.Collection#size()
 *
 */
public int bookSize(){
	return book.size();
}

/**
 * Returns all elements of this collection in an array.
 *
 * @return an array containing all of the elements in this collection
 * @see	java.util.Collection#toArray()
 *
 */
public Book[] bookToArray(){
	return book.toArray(new Book[book.size()]);
}


/**
 * Ensures that this collection contains the specified element (optional
 * operation). 
 *
 * @param element whose presence in this collection is to be ensured.
 * @see	java.util.Collection#add(Object)
 *
 */
public boolean addBook(Book book){
	return this.book.add(book);
}

/**
 * Setter of the property <tt>book</tt>
 *
 * @param book the book to set.
 *
 */
public void setBook(Collection<Book> book){
	this.book = book;
}

/**
 * Removes a single instance of the specified element from this
 * collection, if it is present (optional operation).
 *
 * @param element to be removed from this collection, if present.
 * @see	java.util.Collection#add(Object)
 *
 */
public boolean removeBook(Book book){
	return this.book.remove(book);
}

/**
 * Removes all of the elements from this collection (optional operation).
 *
 * @see	java.util.Collection#clear()
 *
 */
public void clearBook(){
	this.book.clear();
}

/**
 *
 */
private Collection<Room> room;

/**
 * Getter of the property <tt>room</tt>
 *
 * @return Returns the room.
 * 
 */
public Collection<Room> getRoom()
{
	return room;
}
 
/**
 * Returns an iterator over the elements in this collection. 
 *
 * @return an <tt>Iterator</tt> over the elements in this collection
 * @see	java.util.Collection#iterator()
 * 
 */
public Iterator<Room> roomIterator(){
	return room.iterator();
}

/**
 * Returns <tt>true</tt> if this collection contains no elements.
 *
 * @return <tt>true</tt> if this collection contains no elements
 * @see	java.util.Collection#isEmpty()
 *
 */
public boolean isRoomEmpty(){
	return room.isEmpty();
}

/**
 * Returns <tt>true</tt> if this collection contains the specified element. 
 *
 * @param element whose presence in this collection is to be tested.
 * @see	java.util.Collection#contains(Object)
 *
 */
public boolean containsRoom(Room room){
	return this.room.contains(room);
}

/**
 * Returns <tt>true</tt> if this collection contains all of the elements
 * in the specified collection.
 *
 * @param elements collection to be checked for containment in this collection.
 * @see	java.util.Collection#containsAll(Collection)
 *
 */
public boolean containsAllRoom(Collection<Room> room){
	return this.room.containsAll(room);
}

/**
 * Returns the number of elements in this collection.
 *
 * @return the number of elements in this collection
 * @see	java.util.Collection#size()
 *
 */
public int roomSize(){
	return room.size();
}

/**
 * Returns all elements of this collection in an array.
 *
 * @return an array containing all of the elements in this collection
 * @see	java.util.Collection#toArray()
 *
 */
public Room[] roomToArray(){
	return room.toArray(new Room[room.size()]);
}


/**
 * Ensures that this collection contains the specified element (optional
 * operation). 
 *
 * @param element whose presence in this collection is to be ensured.
 * @see	java.util.Collection#add(Object)
 *
 */
public boolean addRoom(Room room){
	return this.room.add(room);
}

/**
 * Setter of the property <tt>room</tt>
 *
 * @param room the room to set.
 *
 */
public void setRoom(Collection<Room> room){
	this.room = room;
}

/**
 * Removes a single instance of the specified element from this
 * collection, if it is present (optional operation).
 *
 * @param element to be removed from this collection, if present.
 * @see	java.util.Collection#add(Object)
 *
 */
public boolean removeRoom(Room room){
	return this.room.remove(room);
}

/**
 * Removes all of the elements from this collection (optional operation).
 *
 * @see	java.util.Collection#clear()
 *
 */
public void clearRoom(){
	this.room.clear();
}

public Hotel.Client searchClient(){
	return null;

}

public double printReceipt(){
	return 0;

}

public void ShowMessage(){

}}

///**
// * Setter of the property <tt>client</tt>
// *
// * @param client The client to set.
// *
// */
//public void setClient(Client client ){
//	this.client = client;
//}
///**
// * Getter of the property <tt>client</tt>
// *
// * @return Returns the client.
// * 
// */
//public Client getClient()
//{
//	return client;
//}
///**
// * Setter of the property <tt>book</tt>
// *
// * @param book The book to set.
// *
// */
//public void setBook(Book book ){
//	this.book = book;
//}
///**
// * Getter of the property <tt>book</tt>
// *
// * @return Returns the book.
// * 
// */
//public Book getBook()
//{
//	return book;
//}
///**
// * Setter of the property <tt>room</tt>
// *
// * @param room The room to set.
// *
// */
//public void setRoom(Room room ){
//	this.room = room;
//}
///**
// * Getter of the property <tt>room</tt>
// *
// * @return Returns the room.
// * 
// */
//public Room getRoom()
//{
//	return room;
//}
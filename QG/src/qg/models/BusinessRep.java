package qg.models;

/**
 * <h1>BusinessRep Class</h1>
 * <p>Holds the info for a business/company representatives</p>
 * @author Alex Nieto
 * @version 1.0
 * @since 2018-11-20
 */
public class BusinessRep extends User {

    //Private data members:
    
	private String title;
	private Business bus;
	
	//Constructors:
	
	/**
	 * Default constructor
	 */
	public BusinessRep() {
		super();
		title = "";
		bus = null;
	}
	
	/**
	 * Constructor initializer - takes all user info individually
	 * @param ID - User ID
	 * @param email - User email
	 * @param password - User password
	 * @param fname - User first name
	 * @param lname - User last name
	 * @param username - User username
	 * @param title - Business rep title
	 * @param bus - Business rep's associated business/company
	 */
	public BusinessRep(int ID, String email, String password, String fname, String lname, String username, String title, Business bus) {
		super(ID,email,password,fname,lname,username);
		this.title = title;
		this.bus = bus;
	}
	
	//Setters:
	
	/**
	 * setTitle(String title) - 
	 * method used to set title value
	 * @param title - Business rep title
	 */
	public void setTitle(String title){
	    this.title = title;
	}
	
	/**
	 * setBusiness(Business bus) - 
	 * method used to set bus value
	 * @param bus - Business rep's associated business/company
	 */
	public void setBusiness(Business bus) {
		this.bus = bus;
	}
	
	//Getters:
	
	/**
	 * getTitle() - method returns business rep's title
	 * @return business rep's title
	 */
	public String getTitle(){
	    return title;
	}
	
	/**
	 * getBusiness() - method returns business rep's associated business/company
	 * @return business rep's associated business/company
	 */
	public Business getBusiness() {
		return bus;
	}
}

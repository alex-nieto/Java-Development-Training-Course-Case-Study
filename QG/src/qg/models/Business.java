package qg.models;

/**
 * <h1>Business Class</h1>
 * <p>Holds all info for a business</p>
 * @author Alex Nieto
 * @version 1.0
 * @since 2018-11-20
 */
public class Business {

    //Private data members:
	private int ID;
	private String name;
	private String website;
	private String type;
	private int avgRating;
	private boolean safe;
	private boolean tsafe;
	private boolean self;
	private Address busAddress;
	
	//Constructors:
	
	/**
	 * Default constructor
	 */
	public Business() {
		ID = 0;
		name = "";
		website = "";
		type = "";
		avgRating = 0;
		safe = false;
		busAddress = null;
	}
	
	/**
	 * Constructor initializer - takes all user info individually
	 * @param ID - Business ID
	 * @param name - Business name
	 * @param website - Business website
	 * @param type - Business type
	 * @param avgRating - Business average review rating
	 * @param safe - Is business LGB safe?
	 * @param tsafe - Is business safe for transgender individuals?
	 * @param self - Is business self identifying as LGBT safe?
	 * @param busAddress - Business address
	 */
	public Business(int ID, String name, String website, String type, int avgRating, boolean safe, boolean tsafe, boolean self, Address busAddress) {
		this.ID = ID;
		this.name = name;
		this.website = website;
		this.type = type;
		this.avgRating = avgRating;
		this.safe = safe;
		this.tsafe = tsafe;
		this.self = self;
		this.busAddress = busAddress;
	}
	
	//Setters:
	
	/**
	 * setID(int ID) - 
	 * method used to set ID value
	 * @param ID - Business ID
	 */
	public void setID(int ID) {
		this.ID = ID;
	}
	
	/**
	 * setName(String name) - 
	 * method used to set name value
	 * @param name - Business name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * setType(String type) - 
	 * method used to set type value
	 * @param type - Business type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * setWeb(String website) - 
	 * method used to set website value
	 * @param website - Business website
	 */
	public void setWeb(String website) {
		this.website = website;
	}
	
	/**
	 * setRate(int avgRating) - 
	 * method used to set avgRating value
	 * @param avgRating - Business average review rating
	 */
	public void setRate(int avgRating) {
		this.avgRating = avgRating;
	}
	
	/**
	 * setSafe(boolean safe) - 
	 * method used to set safe value
	 * @param safe - Is business LBG safe?
	 */
	public void setSafe(boolean safe) {
		this.safe = safe;
	}
	
	/**
	 * setTsafe(boolean tsafe) - 
	 * method used to set tsafe value
	 * @param tsafe - Is business safe for transgender individuals?
	 */
	public void setTsafe(boolean tsafe){
	    this.tsafe = tsafe;
	}
	
	/**
	 * setSelf(boolean self) - 
	 * method used to set self value
	 * @param self - Does business identify as LGBT safe?
	 */
	public void setSelf(boolean self){
	    this.self = self;
	}
	
	/**
	 * setAddress(Address busAddress) - 
	 * method used to set busAddress value
	 * @param busAddress - Business address object
	 */
	public void setAddress(Address busAddress){
	    this.busAddress = busAddress;
	}
	
	//Getters:
	
	/**
	 * getID() - method returns business ID
	 * @return business ID
	 */
	public int getID(){
	    return ID;
	}
	
	/**
	 * getName() - method returns business name
	 * @return business name
	 */
	public String getName(){
	    return name;
	}
	
	/**
	 * getType() - method returns business type
	 * @return business type
	 */
	public String getType(){
	    return type;
	}
	
	/**
	 * getWebsite() - method returns business website
	 * @return business website
	 */
	public String getWebsite(){
	    return website;
	}
	
	/**
	 * getAvgRating() - method returns business average review rating
	 * @return business average review rating
	 */
	public int getAvgRating(){
	    return avgRating;
	}
	
	/**
	 * getSafe() - method returns boolean indication of business LGB safety
	 * @return if business LBG safe?
	 */
	public boolean getSafe(){
	    return safe;
	}
	
	/**
	 * getTsafe() - method returns boolean indication of business Trans safety
	 * @return if business safe for transgender individuals?
	 */
	public boolean getTsafe(){
	    return tsafe;
	}
	
	/**
	 * getSelf() - method returns boolean indication of business self identification of safety
	 * @return if business declares safety
	 */
	public boolean getSelf(){
	    return self;
	}
	
	/**
	 * getAddress() - method returns business address object
	 * @return business address
	 */
	public Address getAddress(){
	    return busAddress;
	}
}

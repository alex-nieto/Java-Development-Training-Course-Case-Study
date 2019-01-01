package qg.models;

import java.util.Date;

/**
 * <h1>Review Class</h1>
 * <p>Holds the info for a review</p>
 * @author Alex Nieto
 * @version 1.0
 * @since 2018-11-20
 */
public class Review {

    //Private data members:
    private int ID;
    private Date rdate;
	private boolean safe;
	private boolean tsafe;
	private int rating;
	private String notes;
	private Customer cust;
	private Business bus;
	
	//Constructors:
	
	/**
	 * Default constructor
	 */
	public Review(){
	    ID = 0;
	    rdate = null;
	    rating = 0;
	    safe = false;
	    tsafe = false;
	    notes = "";
	    cust = null;
	    bus = null;
	}
	
	/**
	 * Constructor initializer - takes all user info individually
	 * @param ID - review ID
	 * @param date - date the review was made
	 * @param rating - rating the customer gave the business
	 * @param safe - according to this customer, is the business LGB safe
	 * @param tsafe - according to this customer, is the business trans safe
	 * @param notes - any additional notes the customer made on the business
	 * @param cust - customer reviewing
	 * @param bus - business the review is about
	 */
	public Review(int ID, Date rdate, int rating, boolean safe, boolean tsafe, String notes, Customer cust, Business bus){
	    this.ID = ID;
	    this.cust = cust;
	    this.bus = bus;
	    this.rdate = rdate;
	    this.rating = rating;
	    this.safe = safe;
	    this.tsafe = tsafe;
	    this.notes = notes;
	}
	
	//Setters:
	
	 /**
	 * setID(int ID) - 
	 * method used to set ID value
	 * @param ID - review ID
	 */
	 public void setID(int ID){
	     this.ID = ID;
	 }
	
	/**
	 * setCustomer(Customer cust) - 
	 * method used to set cust value
	 * @param cust - customer reviewing
	 */
	public void setCustomer(Customer cust){
	    this.cust = cust;
	}
	
	/**
	 * setBusiness(Business bus) - 
	 * method used to set bus value
	 * @param cust - business being reviewed
	 */
	public void setBusiness(Business bus){
	    this.bus = bus;
	}
	
	/**
	 * setDate(String date) - 
	 * method used to set date value
	 * @param date - date review made
	 */
	public void setDate(Date rdate){
	    this.rdate = rdate;
	}
	
	/**
	 * setRating(int rating) - 
	 * method used to set rating value
	 * @param rating - rating the customer gave the business
	 */
	public void setRating(int rating){
	    this.rating = rating;
	}
	
	/**
	 * setSafe(boolean safe) - 
	 * method used to set safe value
	 * @param safe - according to this customer, is the business LGB safe
	 */
	public void setSafe(boolean safe){
	    this.safe = safe;
	}
	
	/**
	 * setTsafe(boolean tsafe) - 
	 * method used to set tsafe value
	 * @param tsafe - according to this customer, is the business trans safe
	 */
	public void setTsafe(boolean tsafe){
	    this.tsafe = tsafe;
	}
	
	/**
	 * setNotes(String notes) - 
	 * method used to set notes value
	 * @param notes - any additional notes the customer made on the business
	 */
	public void setNotes(String notes){
	    this.notes = notes;
	}
	
	//Getters:
	
	/**
	 * getID() - method returns review ID
	 * @return review ID
	 */
	 public int getID(){
	     return ID;
	 }
	 
	/**
	 * getCustomer() - method returns review customer
	 * @return customer making review
	 */
	public Customer getCustomer(){
	    return cust;
	}
	
	/**
	 * getBusiness() - method returns business being reviewed
	 * @return business being reviewed
	 */
	public Business getBusiness(){
	    return bus;
	}
	
	/**
	 * getDate() - method returns date review made
	 * @return date review made
	 */
	public Date getDate(){
	    return rdate;
	}
	
	/**
	 * getRating() - method returns rating the customer gave the business
	 * @return rating the customer gave the business
	 */
	public int getRating(){
	    return rating;
	}
	
	/**
	 * getSafe() - method returns if the business LGB safe according to this customer
	 * @return if the business LGB safe
	 */
	public boolean getSafe(){
	    return safe;
	}
	
	/**
	 * getTsafe() - method returns if the business trans safe according to this customer
	 * @return if the business trans safe
	 */
	public boolean getTsafe(){
	    return tsafe;
	}
	
	/**
	 * getNotes() - method returns any additional notes the customer made on the business
	 * @return notes the customer made on the business
	 */
	public String getNotes(){
	    return notes;
	}
	
}
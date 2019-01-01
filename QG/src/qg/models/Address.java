package qg.models;

/**
 * <h1>User Class</h1>
 * <p>Holds address info for a customer or business</p>
 * @author Alex Nieto
 * @version 1.0
 * @since 2018-11-20
 */
public class Address{
    
    //Private data members:
    private int ID;
    private String street;
    private String city;
    private String state;
    private String zipcode;
    private String country;
    
    //Constructors:
    
    /**
	 * Default constructor
	 */
    public Address(){
        ID = 0;
        street = "";
        city = "";
        state = "";
        zipcode = "";
        country = "USA";
    }
    
    /**
	 * Constructor initializer - takes all address info
	 * @param ID - address ID associated with a particular user or business
	 * @param street - street address
	 * @param city - city
	 * @param state - state
	 * @param zipcode - zipcode
	 * @param country - country
	 */
    public Address(int ID, String street, String city,String state,String zipcode,String country){
        this.ID = ID;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }
    
    //Setters:
    
    /**
	 * getID() - method returns address ID
	 * @return address ID associated with a user or business
	 */
	 public int getID(){
	     return ID;
	 }
    
     /**
	 * setID(int ID) - 
	 * method used to set ID value
	 * @param ID - address ID associated with a user or business
	 */
	 public void setID(int ID){
	     this.ID = ID;
	 }
	 
    /**
	 * setStreet(String street) - 
	 * method used to set street value
	 * @param street - street address
	 */
    public void setStreet(String street){
        this.street = street;
    }
    
    /**
	 * setCity(String city) - 
	 * method used to set city value
	 * @param city - city
	 */
    public void setCity(String city){
        this.city = city;
    }
    
    /**
	 * setState(String state) - 
	 * method used to set state value
	 * @param state - state
	 */
    public void setState(String state){
        this.state = state;
    }
    
    /**
	 * setZipcode(String zipcode) - 
	 * method used to set zipcode value
	 * @param zipcode - zipcode
	 */
    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
    }
    
    /**
	 * setCountry(String country) - 
	 * method used to set country value
	 * @param country - country
	 */
    public void setCountry(String country){
        this.country = country;
    }
    
    //Getters:
    
    /**
	 * getStreet() - method returns street address
	 * @return street address
	 */
    public String getStreet(){
        return street;
    }
    
    /**
	 * getCity() - method returns city
	 * @return city
	 */
    public String getCity(){
        return city;
    }
    
    /**
	 * getState() - method returns state
	 * @return state
	 */
    public String getState(){
        return state;
    }
    
    /**
	 * getZipcode() - method returns zipcode
	 * @return zipcode
	 */
    public String getZipcode(){
        return zipcode;
    }
    
    /**
	 * getCountry() - method returns country
	 * @return country
	 */
    public String getCountry(){
        return country;
    }
}

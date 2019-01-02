package qg.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * <h1>Person Class</h1>
 * <p>Holds the info for a person</p>
 * @author Alex Nieto
 * @version 1.0
 * @since 2018-11-20
 */
@Entity
@Table(name = "Person")
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
    
    //Private data members:
	@Id
	@Column(name = "id")
    private int ID;
	@Basic
	@Column(name = "firstname")
    private String fname;
	@Basic
	@Column(name = "lastname")
	private String lname;
	@Basic
	@Column(name = "username")
	private String username;
	
	//Constructors:
	
	/**
	 * Default constructor
	 */
	public Person() {
		ID = 0;
		fname = "";
		lname = "";
		username = "";
	}
	
	/**
	 * Constructor initializer - takes all user info individually
	 * @param ID - Person ID
	 * @param fname - Person first name
	 * @param lname - Person last name
	 * @param username - Person username
	 */
	public Person(int ID, String fname, String lname, String username) {
		this.ID = ID;
		this.fname = fname;
		this.lname = lname;
		this.username = username;
	}
	
	//Setters:
	
	/**
	 * setID(int ID) - 
	 * method used to set ID value
	 * @param ID - person ID
	 */
	public void setID(int ID) {
		this.ID = ID;
	}
	
	/**
	 * setFname(String fname) - method to set first name value
	 * @param fname - person first name
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	/**
	 * setLname(String lname) - method to set last name value
	 * @param lname - person last name
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	/**
	 * setUsername(String username) - method to set username value
	 * @param username - person username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	//Getters:
	
	/**
	 * getID() - method returns user ID
	 * @return person ID
	 */
	public int getID() {
		return ID;
	}
	
	/**
	 * getFname() - method returns user first name
	 * @return person first name
	 */
	public String getFname() {
		return fname;
	}
	
	/**
	 * getLname() - method returns user last name
	 * @return person last name
	 */
	public String getLname() {
		return lname;
	}
	
	/**
	 * getUsername() - method returns user username
	 * @return person username
	 */
	public String getUsername() {
		return username;
	}
}

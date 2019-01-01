package qg.models;

/**
 * <h1>Customer Class</h1>
 * <p>Holds all info for a customer</p>
 * @author Alex Nieto
 * @version 1.0
 * @since 2018-11-20
 */
public class Customer extends User {

    //Private data members:
    private DemoInfo demoInfo;
	private Address custAddress;
    
    //Constructors:
    
    /**
	 * Default constructor
	 */
    public Customer(){
        super();
        custAddress = null;
        demoInfo = null;
    }
    
    /**
	 * Constructor initializer - takes all customer info
	 * @param ID - Customer ID
	 * @param email - Customer email
	 * @param password - Customer password
	 * @param fname - Customer first name
	 * @param lname - Customer last name
	 * @param username - Customer username
	 * @param demoInfo - Customer demographic info
	 * @param custAddress - Customer Address
	 */
    public Customer(int ID, String email, String password, String fname, String lname, String username, DemoInfo demoInfo,Address custAddress){
        super(ID, email, password, fname, lname, username);
        this.demoInfo = demoInfo;
        this.custAddress = custAddress;
    }
    
    //Setters:
    
    /**
	 * setAddress(Address custAddress) - 
	 * method used to set address value
	 * @param custAddress - customer address
	 */
    public void setAddress(Address custAddress){
        this.custAddress = custAddress;
    }
    
    /**
	 * setDemoInfo(DemoInfo demoInfo) - method to set demographic info
	 * @param demoInfo - DemoInfo object holding all demographic info
	 */
	public void setDemoInfo(DemoInfo demoInfo){
	    this.demoInfo = demoInfo;
	}
    
    //Getter:
    
    /**
	 * getAddress() - method returns customer address
	 * @return customer address
	 */
    public Address getAddress(){
        return custAddress;
    }
    
    /**
	 * getDemoInfo() - method returns user demographic info
	 * @return customer demographic info - DemoInfo object
	 */
	public DemoInfo getDemoInfo(){
	    return demoInfo;
	}
}

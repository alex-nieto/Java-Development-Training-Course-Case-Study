package qg.models;

/**
 * <h1>DemoInfo Class</h1>
 * <p>Holds the demographic info for a customer</p>
 * @author Alex Nieto
 * @version 1.0
 * @since 2018-11-20
 */
public class DemoInfo{
    
    //Private data members:
    private int ID;
    private String gender;
    private String sex;
    private boolean transgender;
    private String sexOrientation;
    private boolean latinx;
    private String race;
    
    //Constructors:
	
	/**
	 * Default constructor
	 */
	 public DemoInfo(){
	     ID = 0;
	     gender = "";
	     sex = "";
	     transgender = false;
	     sexOrientation = "";
	     latinx = false;
	     race = "";
	 }
	 
	 /**
	 * Constructor initializer
	 * @param ID - demoInfo ID associated with a particular user
	 * @param gender - User gender
	 * @param sex - User sex
	 * @param transgender - Is user transgender?
	 * @param sexOrientation - User sexual orientation
	 * @param latinx - Is user latinx?
	 * @param race - User race
	 */
	 public DemoInfo(int ID, String gender, String sex, boolean transgender, String sexOrientation, boolean latinx, String race){
	     this.ID = ID;
	     this.gender = gender;
	     this.sex = sex;
	     this.transgender = transgender;
	     this.sexOrientation = sexOrientation;
	     this.latinx = latinx;
	     this.race = race;
	 }
	 
	 //Setters:
	 
	  /**
	 * setID(int ID) - 
	 * method used to set ID value
	 * @param ID - demoInfo ID associated with a user
	 */
	 public void setID(int ID){
	     this.ID = ID;
	 }
	 
	 /**
	 * setGender(String gender) - 
	 * method used to set gender value
	 * @param gender - User gender
	 */
	 public void setGender(String gender){
	     this.gender = gender;
	 }
	 
	 /**
	 * setSex(String sex) - 
	 * method used to set sex value
	 * @param sex - User sex
	 */
	 public void setSex(String sex){
	     this.sex = sex;
	 }
	 
	 /**
	 * setTrans(boolean transgender) - 
	 * method used to set transgender value
	 * @param transgender - Is user transgender?
	 */
	 public void setTrans(boolean transgender){
	     this.transgender = transgender;
	 }
	 
	 /**
	 * setSexOrient(String sexOrientation) - 
	 * method used to set sexOrientation value
	 * @param sexOrientation - User sexual orientation
	 */
	 public void setSexOrient(String sexOrientation){
	     this.sexOrientation = sexOrientation;
	 }
	 
	 /**
	 * setLatinx(boolean latinx) - 
	 * method used to set latinx value
	 * @param latinx - Is user latinx?
	 */
	 public void setLatinx(boolean latinx){
	     this.latinx = latinx;
	 }
	 
	 /**
	 * setRace(String race) - 
	 * method used to set race value
	 * @param race - User race
	 */
	 public void setRace(String race){
	     this.race = race;
	 }
	 
	 //Getters:
	 
	  /**
	 * getID() - method returns demoInfo ID
	 * @return demoInfo ID associated with a user
	 */
	 public int getID(){
	     return ID;
	 }
	 
	 /**
	 * getGender() - method returns user gender
	 * @return user gender
	 */
	 public String getGender(){
	     return gender;
	 }
	 
	 /**
	 * getSex() - method returns user sex
	 * @return user sex
	 */
	 public String getSex(){
	     return sex;
	 }
	 
	 /**
	 * getTrans() - method returns transgender bool value
	 * @return if user transgender
	 */
	 public boolean getTrans(){
	     return transgender;
	 }
	 
	 /**
	 * getSexOrient() - method returns user sexOrientation
	 * @return user sexual orientation
	 */
	 public String getSexOrient(){
	     return sexOrientation;
	 }
	 
	 /**
	 * getLatinx() - method returns latinx bool value
	 * @return if user latinx
	 */
	 public boolean getLatinx(){
	     return latinx;
	 }
	 
	 /**
	 * getRace() - method returns user race
	 * @return user race
	 */
	 public String getRace(){
	     return race;
	 }
}

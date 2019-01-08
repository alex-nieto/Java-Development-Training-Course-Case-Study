package qg.interfaces;

import java.util.List;

import qg.models.Customer;
import qg.models.Business;

/**
 * <h1>CustomerServiceI (interface)</h1>
 * <p>Holds the methods needed to be implemented by the CustomerService class</p>
 * @author Alex Nieto
 * @version 1.0
 * @since 2018-12-28
 */
public interface CustomerServiceI {

	/**
	 * createCustomer(Customer newCustomer) - 
	 * method adds a new customer to the database
	 * @param newCustomer - new customer to be added to the system
	 */
	public void createCustomer(Customer newCustomer);
	/**
	 * getCustomerByEmail(String email) - 
	 * method obtains a customer with a specific email
	 * @param email - email of customer we are looking for
	 * @return customer with associated email
	 */
	public Customer getCustomerByEmail(String email);
	/**
	 * createCustomer(Customer newCustomer) - 
	 * method updates customer information in the database
	 * @param updatedCustomer - customer info to be updated in the system
	 */
	public void updateCustomerInfo(Customer updatedCustomer);
	/**
	 * getCustomerFavorites(String email) - 
	 * method obtains all the customer's favorite businesses
	 * @param cust - customer we are looking for
	 * @return list of favorite businesses of the indicated Customer
	 */
	public List<Business> getCustomerFavorites(Customer cust);
}

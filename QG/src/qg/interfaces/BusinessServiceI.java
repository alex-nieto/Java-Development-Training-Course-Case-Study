package qg.interfaces;

import java.util.List;

import qg.models.Business;

/**
 * <h1>BusinessServiceI (interface)</h1>
 * <p>Holds the methods needed to be implemented by the BusinessService class</p>
 * @author Alex Nieto
 * @version 1.0
 * @since 2019-01-01
 */
public interface BusinessServiceI {
	
	/**
	 * getAllBusinesses() -
	 * method gets all businesses in the system
	 * @return list of all businesses
	 */
	public List<Business> getAllBusinesses();
	/**
	 * getAllSelfSafeBusinesses() -
	 * method gets all businesses that are self marked safe
	 * @return list of all safe self marked businesses
	 */
	public List<Business> getAllSelfSafeBusinesses();
	/**
	 * getBusinessByName(String name) -
	 * method gets a business info given its name
	 * @param name - name of the company or business
	 * @return business object with all info for given business
	 */
	public Business getBusinessByName(String name);
	/**
	 * createNewBusiness(Business newBus) -
	 * method adds a new business to the system
	 * @param newBus - business to be added to the system
	 */
	public void createNewBusiness(Business newBus);
	/**
	 * updateBusiness(Business updatedBus) -
	 * method updates any info for a given business
	 * @param updatedBus - business to be updated
	 */
	public void updateBusiness(Business updatedBus);

}

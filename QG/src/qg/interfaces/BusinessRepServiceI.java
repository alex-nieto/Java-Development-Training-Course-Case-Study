package qg.interfaces;

import qg.models.Business;
import qg.models.BusinessRep;

/**
 * <h1>BusinessRepServiceI (interface)</h1>
 * <p>Holds the methods needed to be implemented by the BusinessRepService class</p>
 * @author Alex Nieto
 * @version 1.0
 * @since 2018-12-28
 */
public interface BusinessRepServiceI {

	/**
	 * createBusinessRep(BusinessRep rep) -
	 * method adds a new business representative to the database 
	 * @param newRep - new business rep to be added to the system
	 */
	public void createBusinessRep(BusinessRep newRep);
	/**
	 * getRepByEmail(String email) - 
	 * method obtains a business rep with a specific email
	 * @param email - business rep email
	 * @return business rep with associated email
	 */
	public BusinessRep getRepByEmail(String email);
	/**
	 * updateBusinessRepInfo(BusinessRep updatedRep) -
	 * method updates business rep information in the database
	 * @param updatedRep - rep info to be updated in the system
	 */
	public void updateBusinessRepInfo(BusinessRep updatedRep);
	/**
	 * deleteBusinessRep(BusinessRep rep) - 
	 * method deletes a particular business rep
	 * @param rep
	 */
	public void deleteBusinessRep(BusinessRep rep);
	/**
	 * getAssociatedBusiness(BusinessRep rep) - 
	 * method obtains the business associated with a given rep
	 * @param rep - representative who's business is sought
	 * @return business associated with given rep
	 */
	public Business getAssociatedBusiness(BusinessRep rep);
}

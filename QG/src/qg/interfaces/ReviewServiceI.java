package qg.interfaces;

import java.util.List;

import qg.models.Business;
import qg.models.Customer;
import qg.models.Review;

/**
 * <h1>ReviewServiceI (interface)</h1>
 * <p>Holds the methods needed to be implemented by the ReviewService class</p>
 * @author Alex Nieto
 * @version 1.0
 * @since 2019-01-01
 */
public interface ReviewServiceI {
	
	/**
	 * getReviewsByBusiness(Business bus) - 
	 * method gets all reviews for a particular business
	 * @param bus - business who's review we want
	 * @return list of reviews of that particular business
	 */
	public List<Review> getReviewsByBusiness(Business bus);
	/**
	 * getReviewByCustomer(Customer cust) - 
	 * method gets all reviews made by a particular customer
	 * @param cust - customer who's reviews we seek
	 * @return list of reviews made by the customer
	 */
	public List<Review> getReviewByCustomer(Customer cust);
	/**
	 * createReview(Review newReview) - 
	 * method creates a new review in the database
	 * @param newReview - review object that holds all info for the review being made
	 */
	public void createReview(Review newReview);

}

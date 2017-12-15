package org.mahikero01.repository;

import java.util.ArrayList;
import java.util.List;

import org.mahikero01.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUsername}")
	private String dbusername;
	
	/* (non-Javadoc)
	 * @see org.mahikero01.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		
		System.out.println(dbusername);
		
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		
		customer.setFirstname("Rico");
		customer.setLasstname("Sarm");
		
		customers.add(customer);
		
		return customers;
	}

}

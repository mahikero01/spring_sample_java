package org.mahikero01.service;

import java.util.List;

import org.mahikero01.model.Customer;
import org.mahikero01.repository.CustomerRepository;
import org.mahikero01.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see org.mahikero01.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}

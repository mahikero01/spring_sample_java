package org.mahikero01.repository;

import java.util.List;

import org.mahikero01.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}
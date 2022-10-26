package pl.piomin.microservices.customer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.piomin.microservices.customer.exceptions.CustomerNotFoundException;
import pl.piomin.microservices.customer.model.;

public interface JobApplicantsService {
	Customer createCustomer(Customer customer);

	Customer updateCustomer(Customer customer) throws CustomerNotFoundException;

	List<Customer> getAllCustomers();

	Customer getCustomerById(int customerId);

	String deleteCustomer(int id);

    
}

package pl.piomin.microservices.customer.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.piomin.microservices.customer.exceptions.CustomerNotFoundException;
import pl.piomin.microservices.customer.model.Customer;
import pl.piomin.microservices.customer.service.CustomerService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@Slf4j
public class Api {

    @Autowired
	private CustomerService customerService;


    @RequestMapping(method = RequestMethod.GET, value = "/get-all-customers")
    public List<Customer> findAll() {
        log.info("Customer.findAll()");
        return customerService.getAllCustomers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Customer findById(@PathVariable("id") Integer id) throws CustomerNotFoundException {
         Customer customer = customerService.getCustomerById(id);
        return customer;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create-customer")
    public Customer createNewCustomer(@RequestBody Customer customer) {
        Customer c = customerService.createCustomer(customer);
        return c;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean deleteCustomer(@PathVariable Integer id) {
        log.info("Customer.deleteCustomer()");
        customerService.deleteCustomer(id);
        return true;
    }

}

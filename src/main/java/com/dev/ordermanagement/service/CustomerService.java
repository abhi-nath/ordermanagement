package com.dev.ordermanagement.service;

import com.dev.ordermanagement.entity.Customer;
import com.dev.ordermanagement.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
   public List<Customer> getAllCustomers();

}

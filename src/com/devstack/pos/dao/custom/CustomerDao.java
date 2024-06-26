package com.devstack.pos.dao.custom;

import com.devstack.pos.entity.Customer;

import java.util.List;

public interface CustomerDao {
    public boolean saveCustomer(Customer customer);
    public boolean updateCustomer(Customer customer);
    public boolean deleteCustomer(String email);
    public Customer findCustomer(String email);
    public List<Customer> findAllCustomers();
}

package com.celal.unittest.sample2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepository {

	private Map<Integer, Customer> list =new HashMap<Integer, Customer>();
	
	
	public void save(Customer customer) {
		list.put(customer.getId(), customer);
		System.out.println("save Customer with "+customer.getFullName()+" "+customer.getEmail());
	}

	public void delete (int  id) {
		list.remove(id);
		System.out.println("deleted Customer "+id);
	}
	
	public Customer findCustomer(int id) {
		return list.get(id);
	}
	
	
	public Map<Integer, Customer> getList() {
		return list;
	}

	public void deleteAll() {
		list.clear();
		System.out.println("deleted all");
		
	}
	
	

}

package com.celal.unittest.sample2;

public class CustomerService {

	private CustomerRepository customerRepository;
	private NotifyCustomer notifyCustomer;
	public CustomerService() {
		// TODO Auto-generated constructor stub
	}
	
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
		notifyCustomer.sendMail(customer);
		
	}
	public void deleteCustomer(int id) {
		customerRepository.delete(id);
		
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	public void setNotifyCustomer(NotifyCustomer notifyCustomer) {
		this.notifyCustomer = notifyCustomer;
	}
}

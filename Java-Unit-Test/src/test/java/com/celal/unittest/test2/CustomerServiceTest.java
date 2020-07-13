package com.celal.unittest.test2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.celal.unittest.sample2.Customer;
import com.celal.unittest.sample2.CustomerRepository;
import com.celal.unittest.sample2.CustomerService;
import com.celal.unittest.sample2.NotifyCustomer;

public class CustomerServiceTest {

	private CustomerService customerService ;
	private CustomerRepository customerRepository ;
	private NotifyCustomer notifyCustomer ;
	
	@Before
	public void before() {
		customerService =new CustomerService();
		
		// it is used for testSaveCustomer
		// customerRepository = Mockito.mock(CustomerRepository.class);
		
		customerRepository = new CustomerRepository();
		notifyCustomer = Mockito.mock(NotifyCustomer.class);
		customerService.setCustomerRepository(customerRepository);
		customerService.setNotifyCustomer(notifyCustomer);
	}
	
	@After
	public void after() {
		customerRepository.deleteAll();
	}
	@Test
	public void testSaveCustomer() {
		Customer customer =new Customer(1234,"celal aygar","celal.aygar@gmail.com");
		customerService.saveCustomer(customer);
		
		//Mockito.verify(customerRepository).save(customer);
		//assertTrue(customerRepository.getList().containsValue(customer));
		// assertNotNull(customerRepository.findCustomer(customer.getId()));
		
		assertEquals(customer,customerRepository.findCustomer(customer.getId()));
		Mockito.verify(notifyCustomer).sendMail(customer);
	}
	@Test
	public void testDeleteCustomer() {
		
		customerService.saveCustomer(new Customer(123,"celal aygar","celal.aygar@gmail.com"));
		assertNotNull(customerRepository.findCustomer(123));
		
		customerService.deleteCustomer(123); 
		assertNull( customerRepository.findCustomer(123));
	}
}

package com.peaasInter.viram.BootJpa.Controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.peaasInter.viram.BootJpa.dao.CustomerRepository;
import com.peaasInter.viram.BootJpa.model.Customer;

@RestController
public class CustomerController 
{
	@Autowired
	CustomerRepository repo;
	
	
//	To show home page in browser  
	@RequestMapping("/home")
	public String home()
	{
		return "home.jsp";
	}
	
//	add customer object in database using postman request  
	@PostMapping("/Customer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		repo.save(customer);
		return customer;
	}
// search or retrive a customer object from back end  
	@GetMapping("/Customer")
	public List<Customer> getCustomer()
	{
		return repo.findAll();
	}
//  get customer one by one using id 
	@RequestMapping("/Customer/{id}")
	public Optional<Customer> getCustomer (@PathVariable("id") int id)
	{
		return repo.findById(id);
	}	
	
//	delete customer from DBs
	@DeleteMapping("/Customer/{id}")
	public String deleteCustomer(@PathVariable("id") int id)
	{
		Customer cus=repo.getOne(id);
		repo.delete(cus);
		
		return "deleted";
		
	}
	
//	add customer object in database using postman request  
	@PutMapping("/Customer")
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		repo.save(customer);
		return customer;
	}
	
	
	
	/**
	@RequestMapping("/addCustomer")
	public String addCustomer(Customer customer)
	{
		repo.save(customer);
		return "home.jsp";
	}
	
	@RequestMapping("/getCustomer")
	public ModelAndView getCustomer(@RequestParam int id)
	{
		ModelAndView mv=new ModelAndView("show.jsp");
		
		Customer customer=repo.findById(id).orElse(new Customer());
		repo.save(customer);
		
		//System.out.println(repo.findByName("viram"));
		//System.out.println(repo.findByNameSorted("viram"));

		mv.addObject(customer);
		return mv;
	}
	*/
	
}

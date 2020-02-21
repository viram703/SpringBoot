package com.peaasInter.viram.BootJpa.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.peaasInter.viram.BootJpa.model.Customer;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer >
{
//		List<Customer> findByName(String name);
//		@Query("from Customer where name=?1 order by anemail")
//		List<Customer> findByNameSorted(String name);		 
}

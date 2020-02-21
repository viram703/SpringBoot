package com.peaasInter.viram.SpringDataJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.peaasInter.viram.SpringDataJpa.model.Employe;

  
@RepositoryRestResource(collectionResourceRel ="employe",path="employe")
public interface EmployeRepository extends JpaRepository<Employe, Integer>
{

}

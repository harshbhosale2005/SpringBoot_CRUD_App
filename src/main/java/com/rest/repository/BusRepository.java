package com.rest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.model.Bus;

@Repository
public interface BusRepository extends CrudRepository<Bus, Integer> {
	
	public List<Bus> findBybusname(String busname);
	
	public List<Bus> findByfromlocation(String fromlocation);
	
	public List<Bus> findByFromlocationAndTolocation(String fromlocation, String tolocation);

	
	
}

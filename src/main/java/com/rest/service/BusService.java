package com.rest.service;


import java.util.List;

import com.rest.model.Bus;


public interface BusService {
	
	
	public void saveData(Bus s);
	
	public List<Bus> getAllData();
	
	public Bus getSingleData(Integer busid);
	
	public void deleteByid(Integer busid);
	
	public List<Bus> findByBusName(String busname);
	
	public List<Bus> findByfromlocation(String fromlocation);
	
	public List<Bus> findByFromlocationAndTolocation(String fromlocation, String tolocation);


}

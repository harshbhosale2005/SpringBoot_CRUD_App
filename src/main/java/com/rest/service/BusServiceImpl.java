package com.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.model.Bus;
import com.rest.repository.BusRepository;

@Service
public class BusServiceImpl implements BusService {

	BusRepository sr;
	
	public BusServiceImpl(BusRepository sr) {
		
		this.sr=sr;
	}
	
	
	@Override
	public void saveData(Bus b) {
	
		System.out.println("In service : "+b.getBusname());
		
		sr.save(b);

		
	}


	@Override
	public List<Bus> getAllData() {

		List<Bus> list =(List<Bus>)sr.findAll();
		
		return list;
	}


	@Override
	public Bus getSingleData(Integer busid) {

		Bus b=sr.findById(busid).get();
		
		return b;
	}


	@Override
	public void deleteByid(Integer busid) {

		sr.deleteById(busid);
		
		
	}


	@Override
	public List<Bus> findByBusName(String busname) {
		
		List<Bus> b=sr.findBybusname(busname);

		return b;
	}


	@Override
	public List<Bus> findByfromlocation(String fromlocation) {

		List<Bus> b=sr.findByfromlocation(fromlocation);
		
		return b;
	}


	@Override
	public List<Bus> findByFromlocationAndTolocation(String fromlocation, String tolocation) {

		List<Bus> b=sr.findByFromlocationAndTolocation(fromlocation, tolocation);

		return b;
	}


	

}

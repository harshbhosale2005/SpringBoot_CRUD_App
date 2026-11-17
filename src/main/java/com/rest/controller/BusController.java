package com.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Bus;
import com.rest.service.BusService;

@RestController
public class BusController {
	
	BusService si;
	
	public BusController(BusService si) {
		this.si=si;
	}

	@PostMapping("/save")
	public Bus saveData(@RequestBody Bus b) {
		
		si.saveData(b);
		
		return b;
	}
	
	@GetMapping("getAllData")
	public List<Bus> findallData(){
		
		
		 List<Bus> list = si.getAllData();
		 
		 return list;
	}
	
	
	@GetMapping("/getSingleData/{busid}")
	public Bus findSingleData(@PathVariable Integer busid) {
		
		Bus b=si.getSingleData(busid);
		
		return b;
		
	}
	
	
	@DeleteMapping("/deleteData/{busid}")
	public String deleteData(@PathVariable Integer busid) {
		
		si.deleteByid(busid);
		
		return " record deleted "+busid;
		
	}
	
	@GetMapping("/findByName/{busname}")
	public List<Bus> findByName(@PathVariable String busname) {
		
		List<Bus> b=si.findByBusName(busname);
		
		return b;
	}
	
	@GetMapping("/findByfromlocation/{fromlocation}")
	public List<Bus> findByFromLocation(@PathVariable String fromlocation){
		
		List<Bus> b=si.findByfromlocation(fromlocation);
		
		return b;
	}
	
	@GetMapping("/findByFromAndTo/{fromlocation}/{tolocation}")
	public List<Bus> findByFAndTlocation(@PathVariable String fromlocation,@PathVariable String tolocation){
		
		List<Bus> b=si.findByFromlocationAndTolocation(fromlocation, tolocation);
		
		return b;
	}
	
}

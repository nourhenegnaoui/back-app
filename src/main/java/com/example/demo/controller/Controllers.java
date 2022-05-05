package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Don;
import com.example.demo.entities.Ticket;
import com.example.demo.repository.Repositories;
import com.example.demo.services.Services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
@CrossOrigin("*")
@RestController
@RequestMapping({"/api"})
public class Controllers {
	
	@Autowired
	Repositories repository ;
	@Autowired
	Services service;
	
 
    @GetMapping(value = {"/getAll"})
    public List<Ticket> getAlltickets() {
    	
        return repository.findAll();
    }
 
    @PostMapping(value = {"/create"})
    public  void create(@RequestBody Ticket t) {
      service.create(t);
    }
   @PostMapping(value = {"/login"})
    public  void check(@RequestBody Don d) {
     service.check(d);
   }
    @GetMapping(value={"/{id}"})
    public Optional<Ticket>  getByid(@PathVariable int id) {
		return repository.findById(id);
    }
    
                                  
    @DeleteMapping(value={"/delete/{id}"})
    public void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
    
    @DeleteMapping(value={"/deleteAll"})
    public void deleteAlltickets() {
        repository.deleteAll();
    }
    
    
    @PutMapping(value= {"update/{id}"})
    public Ticket update(@PathVariable("id") int id, @RequestBody Ticket t) {
    	t.setId(id);
    	Ticket ticketUpdate = service.update(t);
    	
		return ticketUpdate;
    }

}

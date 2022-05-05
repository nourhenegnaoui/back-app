package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Optional;
import com.example.demo.entities.Don;
import com.example.demo.entities.Ticket;
import com.example.demo.repository.Repositories;
import com.example.demo.repository.Repo;

@Service

public class Services {

	@Autowired
	Repositories repository;
	Repo r;
	Don d;

	public Ticket create(Ticket t) {
		return repository.save(t);

	}

	public Don check(Don d) {
		return r.save(d);
	}

	public Optional<Ticket> getticket(int id) {
		return repository.findById(id);
	}

	public void saveOrUpdate(Ticket ticket) {
		repository.save(ticket);
	}

	public Ticket update(Ticket ticket) {
		return repository.save(ticket);
	}

	public void delete(int id) {
		repository.deleteById(id);
	}

}
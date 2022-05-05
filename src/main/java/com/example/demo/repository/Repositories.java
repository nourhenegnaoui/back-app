package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Ticket;

@Repository
public interface Repositories extends JpaRepository<Ticket, Integer> {

	Ticket findById(Ticket t); // select * from Ticket where id = 5;

}
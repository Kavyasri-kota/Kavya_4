package com.catchup.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catchup.demo.entity.Events;
import com.catchup.demo.entity.Users;
import com.catchup.demo.repository.EventRepository;
import com.catchup.demo.repository.UserRepository;

@Service
public class CatchupService {

	@Autowired
	EventRepository eventsRepo;
	
	@Autowired
	UserRepository usersRepo;
	
	public List<Events> getEvents(String name) {
		List<Events> events = eventsRepo.findAll();
		return events;
	}
}

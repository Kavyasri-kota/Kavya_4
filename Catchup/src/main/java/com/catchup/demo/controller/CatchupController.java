package com.catchup.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.catchup.demo.entity.Events;
import com.catchup.demo.entity.Users;
import com.catchup.demo.service.CatchupService;

@RestController
public class CatchupController {

	@Autowired
	public  CatchupService serv;
	
	@GetMapping("/events/{city}")
	public List<Events> getEvents(@PathVariable String city) {
		List<Events> events = serv.getEvents(city);
		return events;
	}
}

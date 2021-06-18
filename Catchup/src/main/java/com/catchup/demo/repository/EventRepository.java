package com.catchup.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catchup.demo.entity.Events;

public interface EventRepository extends JpaRepository<Events, Long>{

}

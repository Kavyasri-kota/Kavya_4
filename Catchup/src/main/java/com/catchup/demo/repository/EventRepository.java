package com.catchup.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catchup.demo.entity.Events;
@Repository
public interface EventRepository extends JpaRepository<Events, Long>{

	List<Events> findByCity(String city);

}

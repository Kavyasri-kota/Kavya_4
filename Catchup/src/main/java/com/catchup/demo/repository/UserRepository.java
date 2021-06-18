package com.catchup.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catchup.demo.entity.Users;

public interface UserRepository extends JpaRepository<Users, String>{

	
}

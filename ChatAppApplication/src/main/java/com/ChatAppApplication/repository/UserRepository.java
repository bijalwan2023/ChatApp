package com.ChatAppApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ChatAppApplication.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	 User findByUsername(String username);


}

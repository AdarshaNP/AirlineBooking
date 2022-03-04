package com.AirlinTravel.AirlineProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AirlinTravel.AirlineProject.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

	}




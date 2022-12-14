package com.jonatas.tasks.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonatas.tasks.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, UUID>{
    
}

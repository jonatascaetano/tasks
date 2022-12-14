package com.jonatas.tasks.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonatas.tasks.model.TaskModel;

public interface TaskRepository extends JpaRepository<TaskModel, UUID> {
    
}

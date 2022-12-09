package com.jonatas.tasks.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class TaskModel {
    
    private UUID id;
    private String title;
    private String description;
    private LocalDateTime date;
    private boolean completed;
    
    public TaskModel() {
    }

    public TaskModel(String title, String description, LocalDateTime date, boolean completed) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.completed = completed;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    
    
}

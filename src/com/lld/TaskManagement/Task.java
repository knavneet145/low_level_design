package com.lld.TaskManagement;

import java.util.Date;

public class Task {
    private String id;
    private Date dueDate;
    private TaskStatus taskStatus;
    private TaskPriority taskPriority;
    private String title;
    private String description;
    private String userId;

    public Task(String title, Date dueDate, TaskPriority taskPriority, String description, String id, String userId, TaskStatus taskStatus) {
        this.title = title;
        this.dueDate = dueDate;
        this.taskPriority = taskPriority;
        this.description = description;
        this.id = id;
        this.userId = userId;
        this.taskStatus = taskStatus;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public String getId() { return id; }

    public Date getDueDate() {
        return dueDate;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public TaskPriority getTaskPriority() {
        return taskPriority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public void setTaskPriority(TaskPriority taskPriority) {
        this.taskPriority = taskPriority;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package com.lld.TaskManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class TaskManager {
    private final ConcurrentHashMap<String, Task> tasks;
    private final ConcurrentHashMap<String, User> users;
    public static TaskManager instance;

    public static TaskManager getInstance() {
        if (instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }

    private TaskManager() {
        tasks = new ConcurrentHashMap<>();
        users = new ConcurrentHashMap<>();
    }

    public void createTask (Task task) {
        tasks.put(task.getId(), task);
    }

    public void createUser (User user) {
        users.put(user.getId(), user);
    }

    public void updateTask (Task task) {
        if (!tasks.containsKey(task.getId())) {
            tasks.put(task.getId(), task);
            return;
        }

        Task existing = tasks.get(task.getId());
        existing.setId(task.getId());
        existing.setDescription(task.getDescription());
        existing.setTaskPriority(task.getTaskPriority());
        existing.setTaskStatus(task.getTaskStatus());
        existing.setDueDate(task.getDueDate());
        existing.setTitle(task.getTitle());
        tasks.put(task.getId(), existing);
    }

    public void assignTask (String userId, String taskId) {
        Task task = tasks.get(taskId);
        if (task == null) {
            System.out.println("Task id is not valid!");
            return;
        }

        User user = users.get(userId);
        if (user == null) {
            System.out.println("User is not valid!");
            return;
        }

        task.setUserId(userId);
    }

    public List<Task> filterTask (String userId) {
        if (!users.containsKey(userId)) {
            System.out.println("Invalid UserId!");
            return new ArrayList<>();
        }

        List<Task> result = new ArrayList<>();
        for (Task task : tasks.values()) {
            if (task.getUserId() == userId) {
                result.add(task);
            }
        }
        return result;
    }

    public List<Task> filterTask (Date dueDate) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks.values()) {
            if (task.getDueDate().compareTo(dueDate) <= 0) {
                result.add(task);
            }
        }
        return result;
    }

    public List<Task> filterTask (TaskStatus taskStatus) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks.values()) {
            if (task.getTaskStatus() == taskStatus) {
                result.add(task);
            }
        }
        return result;
    }

    public List<Task> filterTask (TaskPriority taskPriority) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks.values()) {
            if (task.getTaskPriority() == taskPriority) {
                result.add(task);
            }
        }
        return result;
    }

    public void deleteTask(String taskId) {
        Task task = tasks.get(taskId);
        if (tasks.get(taskId) == null) {
            System.out.println("Invalid task id!");
            return;
        }
        tasks.remove(taskId);
    }
}

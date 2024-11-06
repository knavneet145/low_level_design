package com.lld.TaskManagement;

import java.util.Date;
import java.util.List;

public class TaskManagementDemo extends Thread {

    private static long userId = 0;
    private static long taskId = 0;

    @Override
    public void run() {
        TaskManager taskManager = TaskManager.getInstance();
        User user1 = new User(String.valueOf(userId++), "user1", "user1@gmail.com");
        User user2 = new User(String.valueOf(userId++), "user2", "user2@gmail.com");

        Task task1 = new Task("task1", new Date(1), TaskPriority.MAJOR, "task description 1", String.valueOf(taskId++), user1.getId(), TaskStatus.TODO);
        Task task2 = new Task("task2", new Date(1000), TaskPriority.CRITICAL, "task description 2", String.valueOf(taskId++), user2.getId(), TaskStatus.INPROGRESS);

        taskManager.createUser(user1);
        taskManager.createUser(user2);
        taskManager.createTask(task1);
        taskManager.createTask(task2);

        List<Task> result = taskManager.filterTask(TaskStatus.TODO);
        for (Task task: result) {
            System.out.println("after filtering on task status  : " + task.getTitle());
        }

        result = taskManager.filterTask(new Date(0));
        for (Task task: result) {
            System.out.println("after filtering on date  : " + task.getTitle());
        }

        result = taskManager.filterTask(user1.getId());
        for (Task task: result) {
            System.out.println("after filtering on user  : " + task.getTitle());
        }

        result = taskManager.filterTask(TaskPriority.CRITICAL);
        for (Task task: result) {
            System.out.println("after filtering on task priority  : " + task.getTitle());
        }

        taskManager.assignTask(user1.getId(), task2.getId());
        result = taskManager.filterTask(user1.getId());
        for (Task task: result) {
            System.out.println("after filtering on user  : " + task.getTitle());
        }

        taskManager.deleteTask(task2.getId());
        taskManager.assignTask(user1.getId(), task2.getId());

        Task task3 = new Task("task3", new Date(99), TaskPriority.MAJOR, "description task3", task1.getId(), user1.getId(), TaskStatus.TODO);
        taskManager.updateTask(task3);

        result = taskManager.filterTask(user1.getId());
        for (Task task: result) {
            System.out.println("after updating the task from 1 to 3  : " + task.getTitle());
        }
    }
}

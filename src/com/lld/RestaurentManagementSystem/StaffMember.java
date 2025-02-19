package com.lld.RestaurentManagementSystem;

public class StaffMember {
    private final String name;
    private final String id;
    private final String role;
    private final String schedule;
    private double averageRating;
    private int countTask;

    public StaffMember(String name, String id, String role, String schedule) {
        this.name = name;
        this.id = id;
        this.role = role;
        this.schedule = schedule;
        this.averageRating = 0.0;
        this.countTask = 0;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getSchedule() {
        return schedule;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public int getCountTask() {
        return countTask;
    }

    public void setCountTaskAndAverageRating(int countTask, int rating) {
        this.averageRating = (this.averageRating * this.countTask + rating) / (this.countTask + 1);
        this.countTask = countTask;
    }
}

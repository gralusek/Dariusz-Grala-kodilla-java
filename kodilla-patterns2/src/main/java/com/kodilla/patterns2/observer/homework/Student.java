package com.kodilla.patterns2.observer.homework;

public class Student implements Observer {
    private final String usernam;
    private int updateCount;

    public Student(String usernam) {
        this.usernam = usernam;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(usernam + ": New task: " + taskQueue.getName() + "\n"
        + "(total: " + taskQueue.getHomework().size() + " tasks)");
        updateCount++;
    }

    public String getUsernam() {
        return usernam;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}

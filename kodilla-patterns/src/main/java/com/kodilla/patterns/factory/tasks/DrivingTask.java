package com.kodilla.patterns.factory.tasks;

import java.time.LocalDate;

public class DrivingTask implements Task {

    String taskName;
    String where;
    String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing Driving task: " + taskName);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (LocalDate.now().getDayOfMonth() > 10) {
            return true;
        } else {
            return false;
        }
    }
}

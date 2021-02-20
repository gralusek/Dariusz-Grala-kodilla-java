package com.kodilla.patterns.factory.tasks;

import java.time.LocalDate;

public class PaintingTask implements Task {

    String taskName;
    String color;
    String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing Paintign task: " + taskName);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (LocalDate.now().getDayOfMonth() > 25) {
            return true;
        } else {
            return false;
        }
    }
}

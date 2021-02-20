package com.kodilla.patterns.factory.tasks;

import java.time.LocalDate;

public class ShoppingTask implements Task {

    String taskName;
    String whatToBuy;
    double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing task: " + taskName);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (LocalDate.now().getDayOfMonth() > 5) {
            return true;
        } else {
            return false;
        }
    }
}

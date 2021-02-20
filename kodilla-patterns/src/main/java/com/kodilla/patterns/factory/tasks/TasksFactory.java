package com.kodilla.patterns.factory.tasks;

public class TasksFactory {
    public final static String DRIVING = "DRIVING";
    public final static String PAINTING = "PAINTING";
    public final static String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Go drive", "to shopping centre", "use car");
            case PAINTING:
                return new PaintingTask("go painting", "brown", "roof");
            case SHOPPING:
                return new ShoppingTask("go shopping", "buy trousers", 1.0);
            default:
                return null;
        }
    }
}

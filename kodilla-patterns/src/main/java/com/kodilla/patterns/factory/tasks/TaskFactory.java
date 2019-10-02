package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTasks(final String tasksClass) {
        switch (tasksClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping task", "Shoes", 2.0);
            case PAINTING:
                return new PaintingTask("Painting task", "Green", "grass");
            case DRIVING:
                return new DrivingTask("Driving task", "Home", "car");
            default:
                return null;
        }
    }
}

package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public final Task makeTasks(TaskType tasksClass) {
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

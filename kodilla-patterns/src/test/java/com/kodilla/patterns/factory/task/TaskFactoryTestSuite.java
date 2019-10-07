package com.kodilla.patterns.factory.task;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import com.kodilla.patterns.factory.tasks.TaskType;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping(){
        //Given
        TaskFactory factory = new TaskFactory();
        //Where
        Task shopping = factory.makeTasks(TaskType.SHOPPING);
        Task shoppingDone = factory.makeTasks(TaskType.SHOPPING);
        shoppingDone.executeTask();
        //Given
        Assert.assertEquals("Shopping task", shopping.getTaskName());
        Assert.assertFalse(shopping.isTaskExecuted());
        Assert.assertEquals("Shopping task", shopping.getTaskName());
        Assert.assertTrue(shoppingDone.isTaskExecuted());
    }
    @Test
    public void testFactoryPainting(){
        //Given
        TaskFactory factory = new TaskFactory();
        //Where
        Task painting = factory.makeTasks(TaskType.PAINTING);
        Task paintingDone = factory.makeTasks(TaskType.PAINTING);
        paintingDone.executeTask();
        //Given
        Assert.assertEquals("Painting task", painting.getTaskName());
        Assert.assertFalse(painting.isTaskExecuted());
        Assert.assertEquals("Painting task", painting.getTaskName());
        Assert.assertTrue(paintingDone.isTaskExecuted());
    }
    @Test
    public void testFactoryDriving(){
        //Given
        TaskFactory factory = new TaskFactory();
        //Where
        Task driving = factory.makeTasks(TaskType.DRIVING);
        Task drivingDone = factory.makeTasks(TaskType.DRIVING);
        drivingDone.executeTask();
        //Given
        Assert.assertEquals("Driving task", driving.getTaskName());
        Assert.assertFalse(driving.isTaskExecuted());
        Assert.assertEquals("Driving task", driving.getTaskName());
        Assert.assertTrue(drivingDone.isTaskExecuted());
    }
}

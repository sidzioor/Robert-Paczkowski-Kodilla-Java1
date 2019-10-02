package com.kodilla.patterns.factory.task;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping(){
        //Given
        TaskFactory factory = new TaskFactory();
        //Where
        Task shopping = factory.makeTasks(TaskFactory.SHOPPING);
        Task shoppingDone = factory.makeTasks(TaskFactory.SHOPPING);
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
        Task painting = factory.makeTasks(TaskFactory.PAINTING);
        Task paintingDone = factory.makeTasks(TaskFactory.PAINTING);
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
        Task driving = factory.makeTasks(TaskFactory.DRIVING);
        Task drivingDone = factory.makeTasks(TaskFactory.DRIVING);
        drivingDone.executeTask();
        //Given
        Assert.assertEquals("Driving task", driving.getTaskName());
        Assert.assertFalse(driving.isTaskExecuted());
        Assert.assertEquals("Driving task", driving.getTaskName());
        Assert.assertTrue(drivingDone.isTaskExecuted());
    }
}

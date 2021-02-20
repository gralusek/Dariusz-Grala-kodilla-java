package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDrining() {
        //Given
        TasksFactory tasksFactory = new TasksFactory();
        //When
        Task driving = tasksFactory.makeTask(TasksFactory.DRIVING);
        //Then
        assertEquals("Go drive", driving.getTaskName());
        assertEquals(true, driving.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        //Given
        TasksFactory tasksFactory = new TasksFactory();
        //When
        Task painting = tasksFactory.makeTask(TasksFactory.PAINTING);
        //Then
        assertEquals("go painting", painting.getTaskName());
        assertEquals(false, painting.isTaskExecuted());
    }

    @Test
    void testFactoryShopping() {
        //Given
        TasksFactory tasksFactory = new TasksFactory();
        //When
        Task shopping = tasksFactory.makeTask(TasksFactory.SHOPPING);
        //Then
        assertEquals("go shopping", shopping.getTaskName());
        assertEquals(true, shopping.isTaskExecuted());
    }
}

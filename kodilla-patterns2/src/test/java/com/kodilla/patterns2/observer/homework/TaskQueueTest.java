package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskQueueTest {

    @Test
    public void testUpdate() {
        //Given
        LongTasks longTasks = new LongTasks();
        ShortTasks shortTasks = new ShortTasks();
        Student student1 = new Student("Bolek");
        Student student2 = new Student("Lolek");
        Student student3 = new Student("Andy");
        longTasks.registerObserver(student1);
        shortTasks.registerObserver(student2);
        longTasks.registerObserver(student3);
        shortTasks.registerObserver(student3);
        //When
        longTasks.addTask("Do the homework");
        longTasks.addTask("Fix the car");
        longTasks.addTask("Learn java");
        shortTasks.addTask("Do the dishes");
        shortTasks.addTask("tidy up your room");
        //Then
        assertEquals(3, student1.getUpdateCount());
        assertEquals(2, student2.getUpdateCount());
        assertEquals(5, student3.getUpdateCount());
    }

}
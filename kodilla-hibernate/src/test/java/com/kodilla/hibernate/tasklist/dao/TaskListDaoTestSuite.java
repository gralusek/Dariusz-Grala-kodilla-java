package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class TaskListDaoTestSuite {

    @AfterEach
    void tearDown() {
        //tasklistDao.deleteAll();
        System.out.println("AfterEach");
    }

    @Autowired
    private TaskListDao taskListDao;
    private static final String NAME = "Test Name";
    private static final String DESCRIPTION = "Test: Learn Hibernate v2";

    @Test
    void testFindByListName() {
        //Given
        TaskList tasklist = new TaskList(NAME, DESCRIPTION);
        TaskList tasklist1 = new TaskList("Test Task List", "Some description");

        //When
        taskListDao.save(tasklist);
        taskListDao.save(tasklist1);
        String name = tasklist.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(name);
        //Then
        //assertEquals(1, readTaskList.size());
        assertEquals(name, readTaskList.get(0).getListName());
        //CleanUp
        int id = tasklist.getId();
        taskListDao.deleteById(id);
    }

}

package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.Tasklist;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class TasklistDaoTestSuite {

    @Autowired
    private TasklistDao tasklistDao;
    private static final String NAME = "Test Name";
    private static final String DESCRIPTION = "Test: Learn Hibernate v2";

    @Test
    void testFindByListName() {
        //Given
        Tasklist tasklist = new Tasklist(NAME, DESCRIPTION);

        //When
        tasklistDao.save(tasklist);
        String name = tasklist.getListName();
        List<Tasklist> readTaskList = tasklistDao.findByListName(name);
        //Then
        assertEquals(1, readTaskList.size());
        assertEquals(name, readTaskList.get(0).getListName());
        //CleanUp
        int id = tasklist.getId();
        tasklistDao.deleteById(id);

    }

}

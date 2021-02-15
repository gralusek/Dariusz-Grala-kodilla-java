package com.kodilla.spring.portfolio;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PortfolioTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("Task to do");
        board.getInProgressList().getTasks().add("In Progress Task");
        board.getDoneList().getTasks().add("Done task");
        //Then
        assertEquals("Task to do", board.toDoList.getTasks().get(0));
        assertEquals("In Progress Task", board.inProgressList.getTasks().get(0));
        assertEquals("Done task", board.getDoneList().getTasks().get(0));
        System.out.println(board);

    }
}

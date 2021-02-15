package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDateTime;

@Configuration
public class BoardConfig {

/*    @Autowired // druga możliwość tworzenia - bezpośredni w @Bean board wpisać metody
    @Qualifier("toDoList")
    TaskList toDoList;

    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    TaskList doneList;*/

    @Bean(name = "toDoList")
    @Scope("singleton")
    public TaskList getToDoList() {
        System.out.println(LocalDateTime.now());
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    @Scope("singleton")
    public TaskList getInProgressList() {
        System.out.println(LocalDateTime.now());
        return new TaskList();
    }

    @Bean(name = "doneList")
    @Scope("singleton")
    public TaskList getDoneList() {
        System.out.println(LocalDateTime.now());
        return new TaskList();
    }

/*    @Bean // jeszcze inny sposób poniżej
    public Board board() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    };*/

    @Bean // sposób nr 3 - najbardziej uniwersalny
    public Board board(@Qualifier("toDoList") TaskList taskList1,@Qualifier("inProgressList") TaskList taskList2,
                       @Qualifier("doneList") TaskList taskList3) {
        return new Board(taskList1, taskList2, taskList3);
    }
}

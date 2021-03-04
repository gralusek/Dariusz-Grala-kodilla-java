package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.Tasklist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface TasklistDao extends CrudRepository<Tasklist, Integer> {
    List<Tasklist> findByListName(String listName);
}

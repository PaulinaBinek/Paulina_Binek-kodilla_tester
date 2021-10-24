package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;



@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String LISTNAME = "Test: Hibernate";

    @Test
    public void testTaskListFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, "kot Eren");
        taskListRepository.save(taskList);
        String listname = taskList.getListName();

        //When
        List<TaskList> readTasksList = taskListRepository.findByListName(listname);

        //Then
        Assert.assertEquals(1, readTasksList.size());

        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListRepository.deleteById(id);
    }
}
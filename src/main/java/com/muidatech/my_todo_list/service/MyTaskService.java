package com.muidatech.my_todo_list.service;

import com.muidatech.my_todo_list.models.MyTask;

import java.util.List;

public interface MyTaskService {
    MyTask create(MyTask myTask);
    MyTask update(MyTask myTask);
    void remove(long id);
    List<MyTask> getMyTasks();
    MyTask getMyTask(long id);
}

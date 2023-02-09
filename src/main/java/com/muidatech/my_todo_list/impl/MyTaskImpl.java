package com.muidatech.my_todo_list.impl;

import com.muidatech.my_todo_list.models.MyTask;
import com.muidatech.my_todo_list.models.Users;
import com.muidatech.my_todo_list.repo.MyTaskRepo;
import com.muidatech.my_todo_list.repo.UsersRepo;
import com.muidatech.my_todo_list.service.MyTaskService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MyTaskImpl implements MyTaskService {

    MyTaskRepo myTaskRepo;
    UsersRepo usersRepo;

    public MyTaskImpl(MyTaskRepo myTaskRepo, UsersRepo usersRepo) {
        this.myTaskRepo = myTaskRepo;
        this.usersRepo = usersRepo;
    }

    @Override
    public MyTask create(MyTask myTask) {
        return myTaskRepo.save(myTask);
    }

    @Override
    public MyTask update(MyTask myTask) {
        return myTaskRepo.save(myTask);
    }

    @Override
    public void remove(long id) {
        myTaskRepo.deleteById(id);
    }

    @Override
    public List<MyTask> getMyTasks() {
        long userId = 1;
        Optional<Users> users = usersRepo.findById(userId);

        if (users.isPresent()){
            return myTaskRepo.findAllByUsers(users.get());
        }

        return new ArrayList<>();
    }

    @Override
    public MyTask getMyTask(long id) {
        return myTaskRepo.findById(id).orElse(new MyTask());
    }
}

package com.muidatech.my_todo_list.repo;

import com.muidatech.my_todo_list.models.MyTask;
import com.muidatech.my_todo_list.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyTaskRepo extends JpaRepository<MyTask, Long> {
    List<MyTask> findAllByUsers(Users users);
}

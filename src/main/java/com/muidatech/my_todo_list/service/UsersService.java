package com.muidatech.my_todo_list.service;

import com.muidatech.my_todo_list.models.Users;

import java.util.List;

public interface UsersService {
    Users create(Users users);
    Users update(Users users);
    void remove(long id);
    Users me();
}

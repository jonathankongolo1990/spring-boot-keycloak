package com.muidatech.my_todo_list.impl;

import com.muidatech.my_todo_list.models.Users;
import com.muidatech.my_todo_list.repo.UsersRepo;
import com.muidatech.my_todo_list.service.UsersService;
import org.springframework.stereotype.Service;

@Service
public class UsersImpl implements UsersService {

    UsersRepo usersRepo;

    public UsersImpl(UsersRepo usersRepo){
        this.usersRepo = usersRepo;
    }

    @Override
    public Users create(Users users) {
        return usersRepo.save(users);
    }

    @Override
    public Users update(Users users) {
        return usersRepo.save(users);
    }

    @Override
    public void remove(long id) {
        usersRepo.deleteById(id);
    }

    @Override
    public Users me() {
        long id = 1;
        return usersRepo.findById(1L).orElse(new Users());
    }
}

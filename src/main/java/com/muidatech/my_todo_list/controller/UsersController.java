package com.muidatech.my_todo_list.controller;

import com.muidatech.my_todo_list.models.Users;
import com.muidatech.my_todo_list.service.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping
    public ResponseEntity<Users> create(@RequestBody Users users){
        return ResponseEntity.ok(usersService.create(users));
    }

    @PutMapping
    public ResponseEntity<Users> update(@RequestBody Users users){
        return ResponseEntity.ok(usersService.update(users));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") long id){
        usersService.remove(id);
        return ResponseEntity.ok(true);
    }

    @GetMapping("/me")
    public ResponseEntity<Users> me(){
        return ResponseEntity.ok(usersService.me());
    }
}

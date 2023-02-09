package com.muidatech.my_todo_list.controller;

import com.muidatech.my_todo_list.models.MyTask;
import com.muidatech.my_todo_list.service.MyTaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class MyTaskController {
    MyTaskService myTaskService;

    public MyTaskController(MyTaskService myTaskService) {
        this.myTaskService = myTaskService;
    }

    @PostMapping
    public ResponseEntity<MyTask> create(@RequestBody MyTask myTask){
        return ResponseEntity.ok(myTaskService.create(myTask));
    }

    @PutMapping
    public ResponseEntity<MyTask> update(@RequestBody MyTask myTask){
        return ResponseEntity.ok(myTaskService.update(myTask));
    }

    @GetMapping
    public  ResponseEntity<List<MyTask>> getMyTasks(){
        return ResponseEntity.ok(myTaskService.getMyTasks());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable long id){
        myTaskService.remove(id);
        return ResponseEntity.ok(true);
    }
}

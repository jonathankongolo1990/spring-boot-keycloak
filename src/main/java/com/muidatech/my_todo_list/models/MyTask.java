package com.muidatech.my_todo_list.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MyTask {

    @Id
    @GeneratedValue
    private long Id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users users;
}

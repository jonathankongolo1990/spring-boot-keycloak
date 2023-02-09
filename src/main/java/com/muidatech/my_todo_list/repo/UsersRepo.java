package com.muidatech.my_todo_list.repo;

import com.muidatech.my_todo_list.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<Users, Long> {

}

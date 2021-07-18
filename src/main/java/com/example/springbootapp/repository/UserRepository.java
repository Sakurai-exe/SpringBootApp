package com.example.springbootapp.repository;

import com.example.springbootapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//JpaRepository способна генерить запросы
public interface UserRepository extends JpaRepository <User, Long> {
    List<User> findByLastName(String lastName);

}

package com.example.springbootapp.model;


import lombok.Data; /* Это я сделал чтобы сделать код по короче,
                                     и не писать например геттеры и сеттеры*/

import javax.persistence.*;

@Data
@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name ")
    private String lastName;

}

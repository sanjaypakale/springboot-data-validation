package com.learning.validation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Data
@Entity
@Table(name = "UserTable")
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserEntity {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String email;
    private Integer age;
    private String address;
}

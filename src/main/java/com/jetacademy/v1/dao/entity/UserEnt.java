package com.jetacademy.v1.dao.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user_tr")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class UserEnt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String userName;
    Integer age;
}

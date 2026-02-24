package com.jetacademy.v1.dao.entity;
import com.jetacademy.v1.util.CardNumber;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.NoArgsConstructor;

@Entity
@Table(name="person_bank")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class PersonEnt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstname;
    String surname;
    Integer age;
    Double balance;
    @Column(unique = true)
    String cardNumber;
    @PrePersist
    public void CreatCardNumber(){
        cardNumber= CardNumber.cardNumber();
    }




}

package com.javaguides.springboot.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "ADDRESS_INFO")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String address;

    //One to one mapping means one employee stays at one address only
    @OneToOne
    private Employee employee;
}

package com.dev.ordermanagement.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name="customer")
@Getter
public class Customer {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;
}

package com.dev.ordermanagement.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="cart")
@Getter
public class Cart {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "ORDER_DATE", nullable = false)
    private LocalDateTime orderDate;

   @OneToMany(
            mappedBy = "cart",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    private List<CartItem> cartItems;
}

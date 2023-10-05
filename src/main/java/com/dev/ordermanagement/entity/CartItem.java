package com.dev.ordermanagement.entity;

import lombok.Getter;

import javax.persistence.*;


@Entity
@Table(name="cartitem")
@Getter
public class CartItem {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "ORDER_ITEM_ID", nullable = false)
    private int id;

    @Column(name = "QUANTITY", nullable = false)
    private int quantity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ID")
    private Cart cart;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "PRODUCT_ID")
    private Product product;
}
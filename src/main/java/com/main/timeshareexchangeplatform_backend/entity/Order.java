package com.main.timeshareexchangeplatform_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;

    @Column(unique = true, columnDefinition = "varchar(50)")
    private String order_number;

    @Column
    private float total;

    @Column
    private boolean status;

    @OneToOne(mappedBy = "order")
    private Order_Detail order_detail;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}

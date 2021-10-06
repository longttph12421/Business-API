package com.fis.business.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "OrderDetails")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    String name;
    float price;
    int quantity;
    String images;
    String address;
    String status;
    @ManyToOne
    @JoinColumn(name = "order_id")
    Orders orders;
    @ManyToOne
    @JoinColumn(name = "Product_id")
    Product product;

}

package com.fis.business.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @ManyToOne
    @JoinColumn(name = "id_customer")
    Customer customer;
    Date create_date;
    String status;
    @JsonIgnore
    @OneToMany(mappedBy = "orders")
    List<OrderDetail> orderDetails;
}

package com.fis.business.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fis.business.config.Constants;
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

    @JsonFormat(pattern = Constants.DATE_FORMAT.DATE_TIME)
    Date create_date;

    String status;

    @JsonIgnore
    @OneToMany(mappedBy = "orders")
    List<OrderDetail> orderDetails;
}

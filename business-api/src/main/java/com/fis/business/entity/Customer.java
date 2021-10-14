package com.fis.business.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String email;
    String photo;
    String fullname;
    String adress;
    Long phone;

    @JsonIgnore
    @OneToOne()
    @JoinColumn(name = "username")
    Users user;

    @JsonIgnore
    @OneToMany(mappedBy ="customer")
    List<Booking> bookings;

    @JsonIgnore
    @OneToMany(mappedBy = "customer")
    List<Orders> orders;
}

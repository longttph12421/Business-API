package com.fis.business.entity;

<<<<<<< HEAD
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
    @OneToOne()
    @JoinColumn(name = "username")
    Users user;
    @OneToMany(mappedBy ="customer")
    List<Booking> bookings;
    @JsonIgnore
    @OneToMany(mappedBy = "customer")
    List<Orders> orders;
=======
public class Customer {
>>>>>>> 38ed01fd083728af239e1a2dbc234d57f58b0c5b
}

package com.fis.business.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "Bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String status;

    @ManyToOne
    @JoinColumn(name = "id_customer")
    Customer customer;

    @ManyToOne
    @JoinColumn(name = "id_staff")
    Staff staff;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "id_time",insertable = false,updatable = false)
    Time time;

    @JsonIgnore
    @OneToMany(mappedBy = "booking")
    List<BookingDetail> bookingDetails;


}

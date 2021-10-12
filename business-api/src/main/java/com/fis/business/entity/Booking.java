package com.fis.business.entity;

import lombok.Data;

<<<<<<< HEAD
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
    @OneToOne
    @JoinColumn(name = "id_time",insertable = false,updatable = false)
    Time time;
    @OneToMany(mappedBy = "booking")
    List<BookingDetail> bookingDetails;


=======
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Booking")
public class Booking implements Serializable {
    @Id
    Integer id;
>>>>>>> 38ed01fd083728af239e1a2dbc234d57f58b0c5b
}

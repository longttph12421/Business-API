package com.fis.business.entity;

<<<<<<< HEAD
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Booking_Details")
public class BookingDetail {
    @Id
    String bookingid;
    Date time_start;
    Date time_end;
    String address;
    String note;
    String status;
    @ManyToOne
    @JoinColumn(name = "service_id")
    ServiceCustomer serviceCustomer;
    @ManyToOne
    @JoinColumn(name="booking_id")
    Booking booking;
=======
public class BookingDetail {
>>>>>>> 38ed01fd083728af239e1a2dbc234d57f58b0c5b
}

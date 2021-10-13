package com.fis.business.entity;

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
    Service service;
    @ManyToOne
    @JoinColumn(name="booking_id")
    Booking booking;
}

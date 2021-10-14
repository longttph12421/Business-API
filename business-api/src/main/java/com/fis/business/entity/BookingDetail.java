package com.fis.business.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fis.business.config.Constants;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Booking_Details")
public class BookingDetail {
    @Id
    Integer bookingid;
    @JsonFormat(pattern = Constants.DATE_FORMAT.DATE_TIME)
    Date time_start;
    @JsonFormat(pattern = Constants.DATE_FORMAT.DATE_TIME)
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
}

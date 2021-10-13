package com.fis.business.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Re_Bookings")
public class ReBooking {
    @Id
    String id_booking;
    String id_service;
    Date booking_date;
    Date time_start;
    Date time_end;
    String status;

}

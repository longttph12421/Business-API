package com.fis.business.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fis.business.config.Constants;
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

    @JsonFormat(pattern = Constants.DATE_FORMAT.DATE_TIME)
    Date booking_date;

    @JsonFormat(pattern = Constants.DATE_FORMAT.DATE_TIME)
    Date time_start;

    @JsonFormat(pattern = Constants.DATE_FORMAT.DATE_TIME)
    Date time_end;

    String status;

}

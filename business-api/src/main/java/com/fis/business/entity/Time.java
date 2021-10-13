package com.fis.business.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fis.business.config.Constants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Timer;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Times")
public class Time {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @JsonFormat(pattern = Constants.DATE_FORMAT.DATE_TIME)
    Date date;
    @JsonFormat(pattern = Constants.DATE_FORMAT.DATE_TIME)
    Date time_start;
    @JsonFormat(pattern = Constants.DATE_FORMAT.DATE_TIME)
    Date time_end;
    String status;
    @OneToOne(mappedBy = "time")
    Booking booking;
}

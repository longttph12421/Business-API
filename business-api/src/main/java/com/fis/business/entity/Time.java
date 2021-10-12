package com.fis.business.entity;

<<<<<<< HEAD
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
    Date date;
    Date time_start;
    Date time_end;
    String status;
    @OneToOne(mappedBy = "time")
    Booking booking;
=======
public class Time {
>>>>>>> 38ed01fd083728af239e1a2dbc234d57f58b0c5b
}

package com.fis.business.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Staffs")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String work_experience;
    String level;
    String skills;
    String fullname;
    String adress;
    Long phone;
    String photo;
    @OneToOne
    @JoinColumn(name = "username")
    Users user;
   @OneToMany(mappedBy = "staff")
    List<Calender> calenders;
   @OneToMany(mappedBy = "staff")
    List<Booking> bookings;
}

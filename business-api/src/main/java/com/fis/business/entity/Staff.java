package com.fis.business.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private Integer id;

    private String work_experience;

    private String level;

    private String skills;

    private String fullname;

    private String adress;

    private Long phone;

    private String photo;

    @OneToOne
    @JoinColumn(name = "username")
    private Users user;

    @JsonIgnore
    @OneToMany(mappedBy = "staff")
    private List<Calender> calenders;

    @JsonIgnore
    @OneToMany(mappedBy = "staff")
    private List<Booking> bookings;
}

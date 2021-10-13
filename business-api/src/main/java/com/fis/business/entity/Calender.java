package com.fis.business.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Calenders")
public class Calender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Date date_work = new Date();
    Date shif_1;
    Date shif_2;
    Date shif_3;
    Date Time_work;
    @ManyToOne
    @JoinColumn(name = "id_staff",insertable = false,updatable = false)
    Staff staff;
}

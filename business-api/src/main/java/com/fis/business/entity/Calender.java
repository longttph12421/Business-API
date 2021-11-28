package com.fis.business.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fis.business.config.Constants;
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
    private Integer id;

    @JsonFormat(pattern = Constants.DATE_FORMAT.DATE_TIME)
    private Date date_work = new Date();

    @JsonFormat(pattern = Constants.DATE_FORMAT.DATE_TIME)
    private Date shif_1;

    @JsonFormat(pattern = Constants.DATE_FORMAT.DATE_TIME)
    private Date shif_2;

    @JsonFormat(pattern = Constants.DATE_FORMAT.DATE_TIME)
    private Date shif_3;

    @JsonFormat(pattern = Constants.DATE_FORMAT.DATE_TIME)
    private Date Time_work;

    @ManyToOne
    @JoinColumn(name = "id_staff",insertable = false,updatable = false)
    private Staff staff;
}

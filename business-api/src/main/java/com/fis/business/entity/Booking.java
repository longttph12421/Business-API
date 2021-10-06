package com.fis.business.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Booking")
public class Booking implements Serializable {
    @Id
    Integer id;
}

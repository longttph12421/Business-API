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
@Table(name = "ServiceCustomer")
public class ServiceCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String price;
    String photo;
    String time_examination;
    @JsonIgnore
    @OneToMany(mappedBy = "serviceCustomer")
    List<BookingDetail> bookingDetails;

}

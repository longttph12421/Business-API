package com.fis.business.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUCTS")
public class Product {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

    @Column(name = "NAME", columnDefinition = "nvarchar(100)")
    String name;
    @Column(name = "PRICE")
    float price;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATEDATE")
    Date CreateDate = new Date();
    @Column(name = "QUANTITY")
    int Quantity;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "CATEGORYID")
    Category category;

}

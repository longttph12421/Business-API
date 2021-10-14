package com.fis.business.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fis.business.config.Constants;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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

    @JsonFormat(pattern = Constants.DATE_FORMAT.DATE_TIME)
    @Column(name = "CREATEDATE")
    Date CreateDate = new Date();

    @Column(name = "QUANTITY")
    int Quantity;

    @ManyToOne
    @JoinColumn(name = "CATEGORYID")
    Category category;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    List<OrderDetail> orderDetails;

}

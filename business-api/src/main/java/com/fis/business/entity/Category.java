package com.fis.business.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "Categorys")
public class Category implements Serializable {
    @Id
    String id;
    @Column(columnDefinition = "nvarchar(100)")
    String name;

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    List<Product> products;

}

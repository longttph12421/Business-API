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
@Table(name = "Users")
public class Users {
    @Id
    @Column(name = "Username")
    String Username;
    String password;

    @JsonIgnore
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    List<Authority> authorities;

    @OneToOne(mappedBy = "user")
    Staff staff;

    @OneToOne(mappedBy = "user")
    Customer customer;

}

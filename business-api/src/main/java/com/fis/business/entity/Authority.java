package com.fis.business.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Authoritys", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"Username", "Roleid"})
})
public class Authority  {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id;
        @ManyToOne
        @JoinColumn(name = "Username")
        private Users user;
        @ManyToOne
        @JoinColumn(name = "Roleid")
        private Role role;
}

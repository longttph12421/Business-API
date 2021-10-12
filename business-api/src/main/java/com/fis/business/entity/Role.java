package com.fis.business.entity;

<<<<<<< HEAD
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
@Table(name = "Roles")
public class Role {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;
    @Column(name = "NAME")
    String role;
    @JsonIgnore
    @OneToMany(mappedBy = "role")
    List<Authority> authorities;

=======
public class Role {
>>>>>>> 38ed01fd083728af239e1a2dbc234d57f58b0c5b
}

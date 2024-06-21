package com.riwi.LibrosYa.domain.entities;


import com.riwi.LibrosYa.utils.enaums.RoleTyeUser;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

import java.util.List;

@Entity( name = "user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id_user;

    @Column(length = 50,nullable = false)
    String username;
    @Column(length = 100,nullable = false)
    String password;
    @Column(length =100,nullable = false)
    String email;
    @Column(length =100,nullable = false)
    String full_name;
    @Enumerated(EnumType.STRING)
    RoleTyeUser role;


    @OneToMany(mappedBy = "user")
    private List<loan> loans;

    @OneToMany(mappedBy = "user")
    private List<reservation> reservations;

}

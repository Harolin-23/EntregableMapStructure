package com.riwi.LibrosYa.domain.entities;


import com.riwi.LibrosYa.utils.enaums.loanVerifier;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity( name = "loan")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id_lean;
    @Column(nullable = false)
    Date loan_date;
    @Column(nullable = false)
    Date return_date;
    @Enumerated(EnumType.STRING)
    loanVerifier status;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private user user;

    @ManyToOne
    @JoinColumn(name = "id_book", nullable = false)
    private book book;

}

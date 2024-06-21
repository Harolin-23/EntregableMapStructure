package com.riwi.LibrosYa.domain.entities;


import com.riwi.LibrosYa.utils.enaums.ReservattionStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

import java.util.Date;

@Entity( name = "reservation")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id_reservation;

    @Column(nullable = false)
    Date Reservation_date;
    @Enumerated(EnumType.STRING)
    ReservattionStatus status;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private user user;

    @ManyToOne
    @JoinColumn(name = "id_book", nullable = false)
    private book book;



}

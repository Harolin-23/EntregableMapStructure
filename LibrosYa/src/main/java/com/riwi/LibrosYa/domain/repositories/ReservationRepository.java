package com.riwi.LibrosYa.domain.repositories;

import com.riwi.LibrosYa.domain.entities.reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<reservation, Long> {
}

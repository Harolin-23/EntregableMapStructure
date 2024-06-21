package com.riwi.LibrosYa.domain.repositories;

import com.riwi.LibrosYa.domain.entities.loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface loanRepository extends JpaRepository<loan, Long> {
}

package com.riwi.LibrosYa.domain.repositories;


import com.riwi.LibrosYa.domain.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user, Long> {
}

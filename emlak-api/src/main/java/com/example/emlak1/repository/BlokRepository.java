package com.example.emlak1.repository;

import com.example.emlak1.model.Blok;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlokRepository extends JpaRepository<Blok, Long> {
    // Blok ile ilgili veritabanı işlemleri için metotlar
}

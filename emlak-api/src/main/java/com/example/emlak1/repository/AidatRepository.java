package com.example.emlak1.repository;

import com.example.emlak1.model.Aidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AidatRepository extends JpaRepository<Aidat, Long> {
    // Aidat ile ilgili veritabanı işlemleri için metotlar
}
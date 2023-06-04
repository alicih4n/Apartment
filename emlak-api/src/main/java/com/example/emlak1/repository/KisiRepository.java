package com.example.emlak1.repository;

import com.example.emlak1.model.Kisi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KisiRepository extends JpaRepository<Kisi, Long> {
    // Kisi ile ilgili veritabanı işlemleri için metotlar
}

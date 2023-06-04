package com.example.emlak1.repository;

import com.example.emlak1.model.Odeme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdemeRepository extends JpaRepository<Odeme, Long> {
    // Odeme ile ilgili veritabanı işlemleri için metotlar
}

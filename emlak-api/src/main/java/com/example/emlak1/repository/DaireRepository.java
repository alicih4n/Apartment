package com.example.emlak1.repository;

import com.example.emlak1.model.Daire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaireRepository extends JpaRepository<Daire, Long> {
    // Daire ile ilgili veritabanı işlemleri için metotlar
}

package com.example.emlak1.repository;

import com.example.emlak1.model.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteRepository extends JpaRepository<Site, Long> {
    // Site ile ilgili veritabanı işlemleri için metotlar
}

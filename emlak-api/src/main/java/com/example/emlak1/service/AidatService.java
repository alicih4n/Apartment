package com.example.emlak1.service;

import com.example.emlak1.repository.AidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AidatService {
    private final AidatRepository aidatRepository;

    @Autowired
    public AidatService(AidatRepository aidatRepository) {
        this.aidatRepository = aidatRepository;
    }

    // Aidat ile ilgili işlemleri gerçekleştiren metotlar
}
package com.example.emlak1.service;

import com.example.emlak1.repository.KisiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KisiService {
    private final KisiRepository kisiRepository;

    @Autowired
    public KisiService(KisiRepository kisiRepository) {
        this.kisiRepository = kisiRepository;
    }

    // Kisi ile ilgili işlemleri gerçekleştiren metotlar
}

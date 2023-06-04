package com.example.emlak1.service;

import com.example.emlak1.repository.OdemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OdemeService {
    private final OdemeRepository odemeRepository;

    @Autowired
    public OdemeService(OdemeRepository odemeRepository) {
        this.odemeRepository = odemeRepository;
    }

    // Odeme ile ilgili işlemleri gerçekleştiren metotlar
}

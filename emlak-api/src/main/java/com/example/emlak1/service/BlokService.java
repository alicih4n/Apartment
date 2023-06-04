package com.example.emlak1.service;

import com.example.emlak1.model.Blok;
import com.example.emlak1.repository.BlokRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlokService {
    private final BlokRepository blokRepository;

    @Autowired
    public BlokService(BlokRepository blokRepository) {
        this.blokRepository = blokRepository;
    }

    public List<Blok> getAllBlocks() {
        return blokRepository.findAll();
    }

    // Blok ile ilgili işlemleri gerçekleştiren metotlar
}

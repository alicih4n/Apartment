package com.example.emlak1.service;

import com.example.emlak1.model.Daire;
import com.example.emlak1.repository.DaireRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DaireService {
    private final DaireRepository daireRepository;

    public DaireService(DaireRepository daireRepository) {
        this.daireRepository = daireRepository;
    }

    public Optional<Daire> findDaireById(Long id) {
        return daireRepository.findById(id);
    }

    public Daire createDaire(Daire daire) {
        return daireRepository.save(daire);
    }

    public List<Daire> getDaireList() {
      return daireRepository.findAll()
                .stream()
                .collect(Collectors.toList());
    }

    // Daire ile ilgili işlemleri gerçekleştiren metotlar
}

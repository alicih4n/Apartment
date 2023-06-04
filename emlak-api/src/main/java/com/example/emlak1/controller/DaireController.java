package com.example.emlak1.controller;

import com.example.emlak1.model.Daire;
import com.example.emlak1.service.DaireService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/daire")
public class DaireController {
    // Daire ile ilgili işlemleri gerçekleştirecek metotlar
    public final DaireService daireService;

    public DaireController(DaireService daireService) {
        this.daireService = daireService;
    }

    @GetMapping("/asd")
    public ResponseEntity<Optional<Daire>> getCustomerById(){
        Long a = 0L;
        return ResponseEntity.ok(daireService.findDaireById(a));
    }

    @GetMapping("/showdaires")
    public ResponseEntity<List<Daire>> getDaireById(){
        return ResponseEntity.ok(daireService.getDaireList());
    }

    @GetMapping("/{daireId}")
    public ResponseEntity<Optional<Daire>> getDaireById(@PathVariable String daireId){
        return ResponseEntity.ok(daireService.findDaireById(Long.valueOf(daireId)));
    }

    @PostMapping(value = "/daire", consumes = "application/json;charset=UTF-8")
    public ResponseEntity<Daire> createDaire(@RequestBody Daire daire) {
        Daire createdDaire = daireService.createDaire(daire);
        return ResponseEntity.ok(createdDaire);
    }



}
package com.example.emlak1.dto;

import com.example.emlak1.model.Daire;

import java.util.Date;

public class AidatDTO {

    private Long aidatId;
    private Date tarih;
    private double miktar;
    private Daire daireDTO;

    public AidatDTO(Long aidatId, Date tarih, double miktar, Daire daireDTO) {
        this.aidatId = aidatId;
        this.tarih = tarih;
        this.miktar = miktar;
        this.daireDTO = daireDTO;
    }
}

package com.example.emlak1.dto;

import com.example.emlak1.model.Daire;
import jakarta.persistence.*;

import java.util.Date;

public class OdemeDTO {

    private Long odemeId;


    private Date tarih;


    private double miktar;


    private DaireDTO daireDTO;

    public OdemeDTO(Long odemeId, Date tarih, double miktar, DaireDTO daireDTO) {
        this.odemeId = odemeId;
        this.tarih = tarih;
        this.miktar = miktar;
        this.daireDTO = daireDTO;
    }
}

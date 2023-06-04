package com.example.emlak1.dto;

import com.example.emlak1.model.Daire;
import jakarta.persistence.*;

import java.util.Date;

public class KisiDTO {

    private Long kisiId;
    private String ad;
    private String soyad;
    private String telefon;
    private String email;
    private Date girisTarihi;
    private DaireDTO daireDTO;

    public KisiDTO(Long kisiId, String ad, String soyad, String telefon, String email, Date girisTarihi, DaireDTO daireDTO) {
        this.kisiId = kisiId;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.email = email;
        this.girisTarihi = girisTarihi;
        this.daireDTO = daireDTO;
    }
}

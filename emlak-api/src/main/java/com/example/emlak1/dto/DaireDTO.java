package com.example.emlak1.dto;

import com.example.emlak1.model.Aidat;
import com.example.emlak1.model.Blok;
import com.example.emlak1.model.Kisi;
import com.example.emlak1.model.Odeme;
import jakarta.persistence.*;

import java.util.List;

public class DaireDTO {
    private Long daireId;
    private int daireNo;
    private int katNo;
    private double metrekare;
    private Blok blok;
    private List<KisiDTO> kisilerDto;
    private List<AidatDTO> aidatlarDto;
    private List<OdemeDTO> odemelerDto;


}

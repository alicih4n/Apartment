package com.example.emlak1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "aidat")
public class Aidat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aidatId;

    @Column(name = "tarih")
    private Date tarih;

    @Column(name = "miktar")
    private double miktar;

    @ManyToOne
    @JoinColumn(name = "daire_id")
    private Daire daire;

    // Getter ve Setter metotları

    public Aidat(Long aidatId, Date tarih, double miktar, Daire daire) {
        this.aidatId = aidatId;
        this.tarih = tarih;
        this.miktar = miktar;
        this.daire = daire;
    }
    public Aidat(){

    }
}
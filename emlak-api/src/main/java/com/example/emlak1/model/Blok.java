package com.example.emlak1.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "blok")
public class Blok {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long blokId;

    @Column(name = "blok_ismi")
    private String blokIsmi;

    @Column(name = "kat_sayisi")
    private int katSayisi;

    @Column(name = "taban_metrekare")
    private double tabanMetrekare;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "site_id")
    @JsonBackReference
    private Site site;

    @OneToMany(mappedBy = "blok", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Daire> daireler;

    // Getter ve Setter metotları

    public Blok(Long blokId, String blokIsmi, int katSayisi, double tabanMetrekare, Site site, List<Daire> daireler) {
        this.blokId = blokId;
        this.blokIsmi = blokIsmi;
        this.katSayisi = katSayisi;
        this.tabanMetrekare = tabanMetrekare;
        this.site = site;
        this.daireler = daireler;
    }
    public Blok(){

    }
}

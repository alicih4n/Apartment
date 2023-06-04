package com.example.emlak1.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "daire")
public class Daire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long daireId;

    @Column(name = "daire_no")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private int daireNo;

    @Column(name = "kat_no")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private int katNo;

    @Column(name = "metrekare")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private double metrekare;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "blok_id")
    @JsonBackReference
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Blok blok;

    @OneToMany(mappedBy = "daire", fetch = FetchType.LAZY)
    private List<Kisi> kisiler;

    @OneToMany(mappedBy = "daire", fetch = FetchType.LAZY)
    private List<Aidat> aidatlar;

    @OneToMany(mappedBy = "daire", fetch = FetchType.LAZY)
    private List<Odeme> odemeler;

    // Getter ve Setter metotları

    public Daire(int daireNo, int katNo, double metrekare, Blok blok, List<Kisi> kisiler, List<Aidat> aidatlar, List<Odeme> odemeler) {
        this.daireNo = daireNo;
        this.katNo = katNo;
        this.metrekare = metrekare;
        this.blok = blok;
        this.kisiler = kisiler;
        this.aidatlar = aidatlar;
        this.odemeler = odemeler;
    }

    public Daire() {
    }
}

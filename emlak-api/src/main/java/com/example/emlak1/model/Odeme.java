package com.example.emlak1.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "odeme")
public class Odeme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long odemeId;

    @Column(name = "tarih")
    private Date tarih;

    @Column(name = "miktar")
    private double miktar;

    @ManyToOne
    @JoinColumn(name = "daire_id")
    private Daire daire;

    // Getter ve Setter metotları

    public Odeme(Long odemeId, Date tarih, double miktar, Daire daire) {
        this.odemeId = odemeId;
        this.tarih = tarih;
        this.miktar = miktar;
        this.daire = daire;
    }
    public Odeme(){

    }
}

package com.example.emlak1.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "kisi")
public class Kisi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kisiId;

    @Column(name = "ad")
    private String ad;

    @Column(name = "soyad")
    private String soyad;

    @Column(name = "telefon")
    private String telefon;

    @Column(name = "email")
    private String email;

    @Column(name = "giris_tarihi")
    private Date girisTarihi;

    @ManyToOne
    @JoinColumn(name = "daire_id")
    private Daire daire;

    // Getter ve Setter metotları

    public Kisi(Long kisiId, String ad, String soyad, String telefon, String email, Date girisTarihi, Daire daire) {
        this.kisiId = kisiId;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.email = email;
        this.girisTarihi = girisTarihi;
        this.daire = daire;
    }
    public Kisi(){

    }
}

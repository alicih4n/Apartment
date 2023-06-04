package com.example.emlak1.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "site")
public class Site {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long siteId;

    @Column(name = "site_adi")
    @JsonProperty(access = JsonProperty.Access.AUTO)
    private String siteAdi;

    @OneToMany(mappedBy = "site", fetch = FetchType.LAZY)
    @JsonBackReference
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private List<Blok> bloklar;

    // Getter ve Setter metotları

    public Site(Long siteId, String siteAdi, List<Blok> bloklar) {
        this.siteId = siteId;
        this.siteAdi = siteAdi;
        this.bloklar = bloklar;
    }
    public Site(){

    }
}

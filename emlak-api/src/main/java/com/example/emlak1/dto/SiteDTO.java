package com.example.emlak1.dto;

import com.example.emlak1.model.Blok;
import jakarta.persistence.*;

import java.util.List;

public class SiteDTO {
    private Long siteId;
    private String siteAdi;
    private List<BlokDTO> bloklar;
    // Getter ve Setter metotları


    public SiteDTO(Long siteId, String siteAdi, List<BlokDTO> bloklar) {
        this.siteId = siteId;
        this.siteAdi = siteAdi;
        this.bloklar = bloklar;
    }
}

package com.example.emlak1.dto;

public class BlokDTO {
    private Long id;
    private String blokAdi;
    private int katSayisi;
    private double tabanMetrekare;
    private int toplamDaireSayisi;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBlokAdi() {
        return blokAdi;
    }

    public void setBlokAdi(String blokAdi) {
        this.blokAdi = blokAdi;
    }

    public int getKatSayisi() {
        return katSayisi;
    }

    public void setKatSayisi(int katSayisi) {
        this.katSayisi = katSayisi;
    }

    public double getTabanMetrekare() {
        return tabanMetrekare;
    }

    public void setTabanMetrekare(double tabanMetrekare) {
        this.tabanMetrekare = tabanMetrekare;
    }

    public int getToplamDaireSayisi() {
        return toplamDaireSayisi;
    }

    public void setToplamDaireSayisi(int toplamDaireSayisi) {
        this.toplamDaireSayisi = toplamDaireSayisi;
    }
}

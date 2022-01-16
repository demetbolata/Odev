package com.example.odev.entities;

import javax.persistence.*;

@Entity
@Table(name = "Coin")
public class CoinEntity {

    private Long id;
    private String isim;
    private String deger;
    private String tarih;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "isim")
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Basic
    @Column(name = "deger")
    public String getDeger() {
        return deger;
    }

    public void setDeger(String deger) {
        this.deger = deger;
    }

    @Basic
    @Column(name = "tarih")
    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }


}

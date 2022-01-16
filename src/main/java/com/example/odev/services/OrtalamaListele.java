package com.example.odev.services;

import com.example.odev.Enum;
import com.example.odev.entities.CoinEntity;
import com.example.odev.repositories.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrtalamaListele {

    @Autowired
    private CoinRepository coinRepository;

    public float dakikaOrtalamaBul(String coinType) {
        int d = 0;
        float toplam = 0;
        float ort = 0;
        List<CoinEntity> coinEntityList = coinRepository.findByIsim(coinType);
        for (CoinEntity coinEntity : coinEntityList) {
            String date = coinEntity.getTarih();
            int x = Integer.parseInt(date.substring(14, 16));
            for (int k = 0; k < coinEntityList.size(); k++) {
                if (x == Integer.parseInt(coinEntityList.get(k).getTarih().substring(14, 16))) {
                    String mm = coinEntityList.get(k).getDeger();
                    if (coinType.equals("BTC") || coinType.equals("ETH")) {
                        mm = mm.replace(".", "");
                        mm = mm.replace(",", ".");
                        float c = Float.parseFloat(mm);
                        toplam += c;
                        d++;
                    }
                    else {
                        float c1 = Float.parseFloat(mm);
                        toplam += c1;
                        d++;
                    }
                }
                ort = toplam / d;
            }
        }
        return ort;
    }

    public float saatOrtalamaBul(String coinType){
        int d = 0;
        float toplam = 0;
        float ort = 0;
        List<CoinEntity> coinEntityList = coinRepository.findByIsim(coinType);
        for (CoinEntity coinEntity : coinEntityList) {
            String date = coinEntity.getTarih();
            int x = Integer.parseInt(date.substring(11, 13));
            for (int k = 0; k < coinEntityList.size(); k++) {
                if (x == Integer.parseInt(coinEntityList.get(k).getTarih().substring(11, 13))) {
                    String mm = coinEntityList.get(k).getDeger();
                    if (coinType.equals("BTC") || coinType.equals("ETH")) {
                        mm = mm.replace(".", "");
                        mm = mm.replace(",", ".");
                        float c = Float.parseFloat(mm);
                        toplam += c;
                        d++;
                    }
                    else {
                        float c1 = Float.parseFloat(mm);
                        toplam += c1;
                        d++;
                    }
                }
                ort = toplam / d;
            }
        }
        return ort;
    }

    public float gunOrtalamaBul(String coinType){
        int d = 0;
        float toplam = 0;
        float ort = 0;
        List<CoinEntity> coinEntityList = coinRepository.findByIsim(coinType);
        for (CoinEntity coinEntity : coinEntityList) {
            String date = coinEntity.getTarih();
            int x = Integer.parseInt(date.substring(8, 10));
            for (int k = 0; k < coinEntityList.size(); k++) {
                if (x == Integer.parseInt(coinEntityList.get(k).getTarih().substring(8, 10))) {
                    String mm = coinEntityList.get(k).getDeger();
                    if (coinType.equals("BTC") || coinType.equals("ETH")) {
                        mm = mm.replace(".", "");
                        mm = mm.replace(",", ".");
                        float c = Float.parseFloat(mm);
                        toplam += c;
                        d++;
                    }
                    else {
                        float c1 = Float.parseFloat(mm);
                        toplam += c1;
                        d++;
                    }
                }
                ort = toplam / d;
            }
        }
        return ort;
    }

}

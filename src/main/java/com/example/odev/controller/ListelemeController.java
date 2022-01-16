package com.example.odev.controller;

import com.example.odev.services.OrtalamaListele;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ortalama")
public class ListelemeController {

    @Autowired
    private OrtalamaListele ortalamaListele;

    @RequestMapping(value = "/ortalamaDakika/{coinType}", method = RequestMethod.GET)
    public float ortalamaDonDakika(@PathVariable(value = "coinType") String coinType) {
        return ortalamaListele.dakikaOrtalamaBul(coinType);
    }

    @RequestMapping(value = "/ortalamaSaat/{coinType}", method = RequestMethod.GET)
    public float ortalamaDonSaat(@PathVariable(value = "coinType") String coinType) {
        return ortalamaListele.saatOrtalamaBul(coinType);
    }

    @RequestMapping(value = "/ortalamaGun/{coinType}", method = RequestMethod.GET)
    public float ortalamaDonGun(@PathVariable(value = "coinType") String coinType) {
        return ortalamaListele.gunOrtalamaBul(coinType);
    }

}

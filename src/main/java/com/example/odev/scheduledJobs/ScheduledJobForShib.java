package com.example.odev.scheduledJobs;

import com.example.odev.Enum;
import com.example.odev.entities.CoinEntity;
import com.example.odev.repositories.CoinRepository;
import com.example.odev.schedule.ScheduledInterface;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class ScheduledJobForShib implements ScheduledInterface {

    @Autowired
    private CoinRepository coinRepository;

    @Override
    @Scheduled(fixedDelay = 10000)
    public void bul() throws IOException {
        Document document = Jsoup.connect("https://www.binance.com/en/markets").maxBodySize(50000000).get();
        Element element = (Element) document.getElementsByClass("css-ydcgk2").get(13).childNode(0);
        String shibValue = element.html();


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        CoinEntity coinEntity = new CoinEntity();
        coinEntity.setDeger(shibValue.substring(1));
        coinEntity.setIsim(Enum.SHIB.toString());
        coinEntity.setTarih(dtf.format(now));
        coinRepository.save(coinEntity);
    }

}

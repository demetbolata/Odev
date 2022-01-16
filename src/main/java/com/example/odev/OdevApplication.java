package com.example.odev;

import com.example.odev.schedule.ScheduledInterface;
import com.example.odev.scheduledJobs.ScheduledJobForBtc;
import com.example.odev.scheduledJobs.ScheduledJobForEth;
import com.example.odev.scheduledJobs.ScheduledJobForShib;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.IOException;

@SpringBootApplication
@EnableScheduling
public class OdevApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(OdevApplication.class, args);
        ScheduledInterface scheduledJobForShib = new ScheduledJobForShib();
        ScheduledInterface scheduledJobForEth = new ScheduledJobForEth();
        ScheduledInterface scheduledJobForBtc = new ScheduledJobForBtc();
        scheduledJobForShib.bul();
        scheduledJobForEth.bul();
        scheduledJobForBtc.bul();
    }

}

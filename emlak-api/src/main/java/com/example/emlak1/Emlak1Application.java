package com.example.emlak1;

import com.example.emlak1.dto.AidatDTO;
import com.example.emlak1.dto.converter.AidatDTOConverter;
import com.example.emlak1.model.Aidat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Emlak1Application implements Runnable {

    public static void main(String[] args) {
        SpringApplication.run(Emlak1Application.class, args);
    }

    @Override
    public void run() {
        Aidat b = new Aidat(null,null,1012,null);
        AidatDTO a = new AidatDTOConverter().convert(b);
        System.out.println(a);

    }
}

package com.example.emlak1.dto.converter;

import com.example.emlak1.dto.AidatDTO;
import com.example.emlak1.model.Aidat;
import com.example.emlak1.repository.AidatRepository;
import org.springframework.stereotype.Component;

@Component
public class AidatDTOConverter {
   public AidatDTO convert(Aidat from){
       return new AidatDTO(from.getAidatId(),
               from.getTarih(),
               from.getMiktar(),
               from.getDaire());
   }

}

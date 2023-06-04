package com.example.emlak1.service;

import com.example.emlak1.model.Site;
import com.example.emlak1.repository.SiteRepository;
import org.springframework.stereotype.Service;
import java.lang.*;

@Service
public class SiteService {
    private final SiteRepository siteRepository;

    public SiteService(SiteRepository siteRepository) {
        this.siteRepository = siteRepository;
    }

    public Site createSite(Site site){
        return siteRepository.save(site);
    }

    public boolean deleteSite(Long id){
         siteRepository.deleteById(id);
         return true;
    }


}


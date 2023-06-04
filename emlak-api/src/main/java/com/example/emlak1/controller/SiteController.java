package com.example.emlak1.controller;

import com.example.emlak1.model.Site;
import com.example.emlak1.service.SiteService;
import org.apache.coyote.Response;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/site")
public class SiteController {

    private final SiteService siteService;

    public SiteController(SiteService siteService) {
        this.siteService = siteService;
    }

    // Site ile ilgili işlemleri gerçekleştirecek metotlar
    @PostMapping(value="/add", consumes = "application/json;charset=UTF-8")
    public ResponseEntity<Site> siteEkle(@RequestBody Site site){
        Site a1 = siteService.createSite(site);
        return ResponseEntity.ok(a1);
    }


    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteSite(@PathVariable Long id){
        boolean detect = siteService.deleteSite(id);
        if(detect){
            return ResponseEntity.noContent().build();
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
}

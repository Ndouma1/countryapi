package com.boc.countryapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boc.countryapi.model.Continent;
import com.boc.countryapi.service.ContinentService;

@RestController
@RequestMapping("/api/continents")
public class ContinentController {

    ContinentService continentService;

    public ContinentController(ContinentService continentService){
        this.continentService = continentService;
    }

    @GetMapping
    List<Continent> get(){
        return continentService.get();
    }

    @GetMapping("/{continentId}")
    Optional<Continent> getById(@PathVariable(name = "continentId") Long id){
        return continentService.getById(id);
    }
    
}

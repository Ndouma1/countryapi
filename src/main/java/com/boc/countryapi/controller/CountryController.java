package com.boc.countryapi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boc.countryapi.controller.dto.CountryRequestDto;
import com.boc.countryapi.model.Continent;
import com.boc.countryapi.model.Country;
import com.boc.countryapi.service.CountryService;

@RestController
@RequestMapping("/api/countries")
public class CountryController {
    
    CountryService countryService;
    private Long countryId;

    CountryController(CountryService countryService){
        this.countryService = countryService;
    }

    @GetMapping
    List<Country> get(){
        return countryService.get();
        
    }

    @GetMapping("/{countryId}")
    Optional<Country> getById(@PathVariable(name= "countryId") Long id){
        return countryService.getById(id);
    }

    @PostMapping
    ResponseEntity<Map<String, Object>> create(final @RequestBody CountryRequestDto countryRequestDto){
            Country countryToCreate = new Country();

            countryToCreate.setTName(countryRequestDto.getTname());
            countryToCreate.setCapitalString(countryRequestDto.getCapitalString());
            countryToCreate.setThPopulation(countryRequestDto.getThpopulation());
            countryToCreate.setDateOfIndependance(countryRequestDto.getDateOfindependance());

            countryService.create(countryToCreate);

            Map<String, Object> responses = new HashMap<>();
            
            responses.put( "created",  "true");

            return ResponseEntity.ok(responses);

    }

    @DeleteMapping("/{countryId}")
    ResponseEntity<Map<String, Object>> delete(@PathVariable Long studentId){
        countryService.delete(countryId);

        Map<String, Object> responses = new HashMap<>();
        responses.put(  "deleted", "true");

        return ResponseEntity.ok(responses);
    }


}

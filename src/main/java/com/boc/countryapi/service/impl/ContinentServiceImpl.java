package com.boc.countryapi.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.hibernate.engine.config.spi.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boc.countryapi.model.Continent;
import com.boc.countryapi.repository.ContinentRepository;
import com.boc.countryapi.repository.CountryRepository;
import com.boc.countryapi.service.ContinentService;

@Service
public class ContinentServiceImpl implements ContinentService  {

    @Autowired
    ContinentRepository continentRepository;
    @Autowired
    CountryRepository countryRepository;

    @Override
    public void create(Continent continent) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Optional<Continent> getById(Long id) {
        // TODO Auto-generated method stub
        return continentRepository.findById(id);
    }

    @Override
    public List<Continent> get() {
        // TODO Auto-generated method stub
        return continentRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Optional<Continent> update(Continent continent) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }


    
}
    


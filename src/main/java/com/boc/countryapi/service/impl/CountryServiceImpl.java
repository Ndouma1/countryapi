package com.boc.countryapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boc.countryapi.model.Continent;
import com.boc.countryapi.model.Country;
import com.boc.countryapi.repository.CountryRepository;
import com.boc.countryapi.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryRepository countryRepository;

    @Override
    public void create(Country country) {
        // TODO Auto-generated method stub
        countryRepository.save(country);
    }

    @Override
    public Optional<Country> getById(Long id) {
        // TODO Auto-generated method stub
        return countryRepository.findById(id);
    }

    @Override
    public List<Country> get() {
        // TODO Auto-generated method stub
        return countryRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        Optional<Country> countryToDelete = getById(id);
        countryRepository.delete(countryToDelete.get());
    }

    @Override
    public Optional<Country> update(Country country) {
        // TODO Auto-generated method stub
        countryRepository.save(country);
        return Optional.empty();
    }

    
}

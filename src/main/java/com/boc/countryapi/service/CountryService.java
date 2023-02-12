package com.boc.countryapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.boc.countryapi.model.Continent;
import com.boc.countryapi.model.Country;

@Service
public interface CountryService {
    /*@Autowired
    private CountryRepository countryRepository;
    public Country save(Country country) {
        return countryRepository.save(country);
    }
    // ...
    public List<Country> get() {
        return null;
    }
    public Optional<Continent> getById(Long id) {
        return null;
    }
    public void create(Country countryToCreate) {
    }
    public void delete(Long studentId) {
    } */

    void create(Country country);
    Optional<Country> getById(Long id);
    List<Country> get();
    void delete(Long id);
    Optional<Country> update(Country country);
}

package com.boc.countryapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boc.countryapi.model.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    
}

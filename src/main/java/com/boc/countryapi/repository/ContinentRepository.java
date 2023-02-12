package com.boc.countryapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boc.countryapi.model.Continent;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {
    
}

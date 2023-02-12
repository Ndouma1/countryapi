package com.boc.countryapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.boc.countryapi.model.Continent;

@Service
public interface ContinentService {

   /*  public static List<Continent> get() {
        return null;
    }

    public default Optional<Continent> getById(Long id) {
        return null;
    } */

    void create(Continent continent);
    Optional<Continent> getById(Long id);
    List<Continent> get();
    void delete(Long id);
    Optional<Continent> update(Continent continent);
    
    
}

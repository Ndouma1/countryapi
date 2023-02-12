package com.boc.countryapi.model;

import java.sql.Date;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
    public Country(){
       

    }
    public Country(Long id, String tname, String capitalString, int thpopulation, Date dateOfindependance) {
        this.id = id;
        this.tname = tname;
        this.capitalString = capitalString;
        this.thpopulation = thpopulation;
        this.dateOfIndependance = dateOfIndependance;
        //this.createdAt = createdAt;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tname;
    private String capitalString;
    private Date dateOfIndependance;
    private int thpopulation;
    //private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "continent_id")
    private Continent continent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTName() {
        return tname;
    }
    public void setTName(String tname) {
        this.tname = tname;
    }
    public String getCapitalString() {
        return capitalString;
    }
    public void setCapitalString(String capitalString) {
        this.capitalString = capitalString;
    }
    public Date getDateOfIndependance() {
        return dateOfIndependance;
    }
    public void setDateOfIndependance(Date dateOfIndependance) {
        this.dateOfIndependance = dateOfIndependance;
    }
    public int getThPopulation(){
        return thpopulation;
    }
    public void setThPopulation(int thpopulation){
        this.thpopulation = thpopulation;
    }
   /*  public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }*/

    public Continent getContinent () {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    
}

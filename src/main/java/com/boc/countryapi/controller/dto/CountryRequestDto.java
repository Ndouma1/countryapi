package com.boc.countryapi.controller.dto;

import java.sql.Date;
public class CountryRequestDto {
    
    private String tname;
    private String capitalString;
    private Date dateOfindependance;
    private int thpopulation;
    //private Date createdAt;

    public String getTname() {
        return tname;
        
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getCapitalString() {
        return capitalString;
    }

    public void setCapitalString(String capitalString) {
        this.capitalString = capitalString;
    }

    public Date getDateOfindependance(){
        return dateOfindependance;
    }

    public void setDateOfindependance(Date dateOfindependance) {
        this.dateOfindependance = dateOfindependance;
    }

    public int getThpopulation(){
        return thpopulation;

    }

    public void setThpopulation(int thpopulation){
        this.thpopulation = thpopulation;
    }

   /*  public Date getCreatedAt(){
        return createdAt;
    }

    public void setCreatedAt(Date createdAt){
        this.createdAt = createdAt;
    }*/

}

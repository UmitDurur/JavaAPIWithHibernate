package com.task.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class Country {
    private long id;
    private String iso_code;
    private String country_name;
    private int phone_code;
    
    public Country(){

    }

    public Country(long id,String iso_code,String country_name,int phone_code){
        this.id=id;
        this.iso_code=iso_code;
        this.country_name=country_name;
        this.phone_code=phone_code;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }
    public void setId(long id){
        this.id=id;
    }

    @Column(name = "iso_code", nullable = false)
    public String GetIsoCode() {
        return iso_code;
    }
    public void setIsoCode(String iso_code) {
        this.iso_code = iso_code;
    }
 
    @Column(name = "country_name", nullable = false)
    public String getCountryName() {
        return country_name;
    }
    public void setCountryName(String country_name) {
        this.country_name = country_name;
    }

    @Column(name = "phone_code", nullable = false)
    public int getPhoneCode() {
        return phone_code;
    }
    public void setPhoneCode(int phone_code) {
        this.phone_code = phone_code;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + iso_code + ", surname=" + country_name+", surname=" + phone_code
       + "]";
    }
}
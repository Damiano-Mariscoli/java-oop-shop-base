package org.lesson.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{
    private String color;
    private Boolean wireless;

    public Cuffie(String nome, String descrizione, BigDecimal prezzo, String color, Boolean wireless){
        super(nome, descrizione, prezzo);
        this.color = color;
        this.wireless = wireless;

    }
    public String getColor(){
        return this.color;
    }
    public Boolean getWireless(){
        return this.wireless;
    }
}
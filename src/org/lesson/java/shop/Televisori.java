package org.lesson.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto{
    private String dimensioni;
    private Boolean smart;
    public Televisori(String dimensioni, Boolean smart, String nome, String descrizione, BigDecimal prezzo){
        super(nome, descrizione, prezzo);
        this.dimensioni = dimensioni;
        this.smart = smart;

    }

    public String getDimensioni(){
        return this.dimensioni;
    }
    public Boolean getSmart(){
        return this.smart;
    }
}

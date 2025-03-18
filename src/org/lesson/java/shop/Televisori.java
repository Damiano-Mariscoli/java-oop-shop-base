package org.lesson.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto{
    private int dimensioni;
    private Boolean smart;
    public Televisori(int dimensioni, Boolean smart, String nome, BigDecimal prezzo){
        super(nome, prezzo);
        this.dimensioni = dimensioni;
        this.smart = smart;

    }

    public int getDimensioni(){
        return this.dimensioni;
    }
    public Boolean getSmart(){
        return this.smart;
    }

    @Override
   public String toString(){
      return super.toString() + getDimensioni() + getSmart();
   }
}

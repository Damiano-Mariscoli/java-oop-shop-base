package org.lesson.java.shop;
import java.math.BigDecimal;
import java.util.Random;
public class Smartphone extends Prodotto {
    private int IMEI;
    private int memoria;

    public Smartphone(String nome, String descrizione, BigDecimal prezzo, int memoria){
        Random rand =  new Random();
        super(nome, descrizione, prezzo);
        this.IMEI = rand.nextInt(99999);
        this.memoria = memoria;
    }

    public int getIMEI() {
        return this.IMEI;
    }
    public int getMemory(){
        return this.memoria;
    }    


}

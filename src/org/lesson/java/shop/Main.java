package org.lesson.java.shop;
import java.math.BigDecimal;

public class Main {

   public static void main(String args[]){
    Prodotto penna = new Prodotto("penna", "penna bella", new BigDecimal(100),new BigDecimal(0.22));

    System.out.println(penna.getPrezzoBase());
    System.out.println(penna.getPrezzoIva());
    System.out.println(penna.getNomeEsteso());
    System.out.println(penna.nome +": "+ penna.descrizione);
   
   }
    
}

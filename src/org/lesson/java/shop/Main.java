package org.lesson.java.shop;
import java.math.BigDecimal;

public class Main {

   public static void main(String args[]){
   //  Prodotto penna = new Prodotto("penna", "penna bella", new BigDecimal(100),new BigDecimal(0.22));
    
   //  System.out.println(penna.getPrezzoBase());
   //  System.out.println(penna.getPrezzoIva());
   //  System.out.println(penna.getNomeEsteso());
   //  System.out.println(penna.getCodice());
   //  System.out.println(penna.getDescrizione());
   //  System.out.println(penna.getNome());
   //    penna.setName("cuaio");
   //    System.out.println(penna.getNome());
   //    System.out.println(penna.getNomeEsteso());

   
   Cuffie Cuffie = new Cuffie("BoseSupreme", "Cuffie belle", new BigDecimal(235), "white", false);   

   Televisori Televisori = new Televisori("120 x 200", true, "TSamsung212", "televisore bello", new BigDecimal(850) );
   Smartphone Smartphone = new Smartphone("iphone 16", "telefono bello", new BigDecimal(1500), 256);

   // System.out.println(Smartphone.getIMEI());
   // System.out.println(Smartphone.getNome());
   // System.out.println(Smartphone.getMemory());
   

   // System.out.println(Televisori.getCodice());
   // System.out.println(Televisori.getDimensioni());
   // System.out.println(Televisori.getSmart());

   System.out.println(Cuffie.getNomeEsteso());
   System.out.println(Cuffie.getColor());
   System.out.println(Cuffie.getWireless());
   }
   
  
    
}

// Nel progetto java-oop-shop, package org.lessons.java.shop, creare la classe Prodotto che gestisce i prodotti dello shop. 

// Un prodotto è caratterizzato da:
// - codice (numero intero)
// - nome
// - descrizione
// - prezzo
// - iva

// Usate opportunamente costruttori, attributi ed eventuali altri metodi di “utilità” per fare in modo che:
// - alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
// - il prodotto esponga un metodo per avere il prezzo base 
// - il prodotto esponga un metodo per avere il prezzo comprensivo di iva
// - il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome

// Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.


package org.lesson.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {

    Random rand = new Random();

   
    private String nome;
   private String descrizione;
   private BigDecimal prezzo;
   private BigDecimal iva;
   private int codice;
   private String  concatenato;

   public Prodotto(String nome, BigDecimal prezzo){
    this.nome = nome;
    this.codice = rand.nextInt(99999);
    this.prezzo = prezzo;
    this.iva = new BigDecimal(0.22);
    this.concatenato = nome + "-" + codice;
   }
   public String getNome(){
    return this.nome;
   }
   public String getDescrizione(){
    return this.descrizione;
   }

   public int getCodice(){
    return this.codice;
   }

   public BigDecimal getPrezzoBase(){
    return this.prezzo;
   }

   public BigDecimal getPrezzoIva(){
    if(prezzo != null && iva != null){
        return prezzo.add(prezzo.multiply(iva));
    }
    return null;
   }
   public String getNomeEsteso(){
    if (nome != null){
      return this.concatenato = nome + "-" + codice;
    }
    return null;
   }


   public void setName(String nome){
    this.nome = nome;
   }

   @Override
   public String toString(){
    if(nome != null){
      return codice + "-" + nome;
    }
    return null;
   }
}

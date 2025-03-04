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

import java.util.Random;

public class Prodotto {

    Random rand = new Random();

   
   public String nome;
   public String descrizione;
   public float prezzo;
   public float iva;
   public int codice;
   public String  concatenato;

   public Prodotto(String nome, String descrizione, float prezzo){
    this.nome = nome;
    this.codice = rand.nextInt(123131 , 906708798);
    this.descrizione = descrizione;
    this.prezzo = prezzo;
    this.iva = prezzo + (prezzo * 0.22f);
    this.concatenato = nome + "-" + codice;
   }
}

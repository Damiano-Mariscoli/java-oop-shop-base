package org.lesson.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;


public class Carrello{

    public static void main(String args[]){
        Scanner scan =  new Scanner(System.in);
        
        String[] carrello = new String[2];
        BigDecimal sommaPrezzo =  new BigDecimal(0);

        for (int i = 0; i < carrello.length; i++){
            
            System.out.println("Inserisci il prodotto che vuoi comprare (Cuffie, Televisori, Smartphone):");
            String prodotto = scan.nextLine();

            if (prodotto.equals("Cuffie")){

                System.out.println("Inserisci il nome delle cuffie che vuoi comprare:");

                String nome = scan.nextLine();
                
                System.out.println("Inserisci il prezzo:");

                String prezzoStr = scan.nextLine();
                BigDecimal prezzo = new BigDecimal(prezzoStr);

                System.out.println("Wireless true or false:");

                Boolean wireless;
                String wirelessStr = scan.nextLine();
                if (wirelessStr.equals("true")){
                    wireless = true;
                }else {
                    wireless = false;
                }

                System.out.println("Inserisci il colore:");

                String colore = scan.nextLine();
           
                Cuffie Cuffie = new Cuffie(nome, prezzo, colore, wireless);
                carrello[i] = Cuffie.toString();
                System.out.println(prezzo);
                System.out.println(Cuffie);
                sommaPrezzo = sommaPrezzo.add(prezzo);

            }
            if (prodotto.equals("Televisori")){
                
                System.out.println("Inserisci il nome del televisore che vuoi comprare:");

                String nome = scan.nextLine();

                System.out.println("Inserisci il prezzo:");

                String prezzoStr = scan.nextLine();
                BigDecimal prezzo = new BigDecimal(prezzoStr);

                System.out.println("Inserisci i pollici del televisore");

                String dimensioniStr = scan.nextLine();
                int dimensioni = Integer.parseInt(dimensioniStr);
                
                

                System.out.println("Smart true or false:");

                Boolean smart;
                String smartStr = scan.nextLine();
                if (smartStr.equals("true")){
                    smart = true;
                }else {
                   smart = false;
                }

           
                Televisori Televisore = new Televisori(dimensioni , smart ,nome, prezzo);
                carrello[i] = Televisore.toString();
                System.out.println(prezzo);
                System.out.println(Televisore);
                sommaPrezzo = sommaPrezzo.add(prezzo);
            }
            
        }

        for( int i = 0; i < carrello.length; i++){
            System.out.println(carrello[i]);
        }
        System.out.println(sommaPrezzo);

    }

}



package Baralhoo;

import java.util.Random;

public class Baralho {
   private final String[] naipes = {"Ouros" , "Pau " , "Copas " , "Espadas"};
   private final String[] ranks = {"Às","2","3","4","5","6","7","8","9","10","Valete","Dama","Reis"};
   private final int quantidadeCartas = 52;
   private Cartas[] cartas = new Cartas[quantidadeCartas];
   private Random sorteador = new Random();

    public Baralho(){
        int i = 0;

        for (String rank : ranks) {
            for(String naipe : naipes){
               Cartas carta = new Cartas(rank, naipe);
               cartas[i] = carta;
               i++;
            }
        }
    }

  public  Cartas sortear(){
    int numero = sorteador.nextInt(0, quantidadeCartas);
    return cartas[numero];
  }
}




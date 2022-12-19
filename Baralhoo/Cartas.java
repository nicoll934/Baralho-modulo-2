package Baralhoo;

public class Cartas {
    private String naipe;
    private String rank;

    public Cartas(String rank, String naipe){
         this.naipe = naipe;
         this.rank = rank;

    }
    public String toString(){
        return String.format("%s de %s", rank,naipe);
    }
}

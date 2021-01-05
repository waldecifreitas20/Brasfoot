package competicoes;

import classes.Clube;
import java.util.ArrayList;

public class SuperClassico{   
    private final String nome = "Super Classico";
    private final Clube real, barcelona;
    private final double PREMIO = 50;
   
    public SuperClassico(Clube real, Clube barcelona) {             
        this.barcelona = barcelona;
        this.real = real;
    }
    public void finalIda() {
        int golBarca = 0, golReal = 0;
        System.out.println("** "+this.nome+" - Jogo de Ida **");
        if(this.barcelona.getOver() > this.real.getOver()) {
            golBarca++;      
        }else if(this.barcelona.getOver() < this.real.getOver()){
            golReal++;
        }
        if (this.barcelona.getRelevancia() > this.real.getRelevancia()) {
            golBarca++;
        } else if(this.barcelona.getRelevancia() < this.real.getRelevancia()){
            golReal++;
        }        
        System.out.println("Barcelona " + golBarca + " X " + golReal);
        
    }
    private void finalVolta(int golsMandante, int golsVisitante) {
    }
}

package classes.competicoes;

import classes.clube.Clube;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class SuperLiga {
    private List<Clube> participantes;
    private Stack<Clube> timeDisponivel;
    private List<Confronto> rodada;
    private List<Confronto> historico;
    
    public SuperLiga(List<Clube> participantes) {
        this.participantes = participantes;
        this.timeDisponivel = new Stack<>();
        this.historico = new ArrayList<>(); 
        this.rodada = new ArrayList();
        
    }
   
    public Confronto sortearAdversario() {
        Confronto jogo = null;       
        this.timeDisponivel.addAll(participantes);
      
        
        return jogo;
    }
   
    public void sortearRodada() {
        for (int i = 0; i < 3; i++) {
            Collections.shuffle(this.timeDisponivel);
            this.rodada.add(sortearAdversario());
            System.out.println(rodada.get(i).getMandante().getNome() + " x " + rodada.get(i).getVisitante().getNome());
        }
    }
   
}

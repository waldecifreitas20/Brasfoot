package classes.clube;

import java.util.ArrayList;

public class SemClube extends BaseClube{   

    public SemClube() {
        super("Sem Clube", new ArrayList<>());      
        
    }
    
    public void addAtleta(Jogador jogador) {
        this.jogadores.add(jogador);
    }
    public void removerAtleta(Jogador jogador) {
        this.jogadores.remove(jogador);
    }
     
}

package classes;

import java.util.ArrayList;

public class SemClube extends BaseClube{
    private ArrayList<Jogador> jogadores;

    public SemClube(String nome) {
        super(nome);       
    }

    public SemClube(String nome, ArrayList<Jogador> jogadores) {
        super(nome);
        this.jogadores = jogadores;
    }
   
    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }
    
    public void addAtleta(Jogador jogador) {
        this.jogadores.add(jogador);
    }
    public void removreAtleta(Jogador jogador) {
        this.jogadores.remove(jogador);
    }
     
}

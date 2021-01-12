package classes.clube;

import java.util.List;

public class BaseClube {
    protected String nome;
    protected List<Jogador> jogadores;

    public BaseClube(String nome, List<Jogador> jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }
    
    public String getNome() {
        return nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }
    
}

package classes.clube;

import static classes.ClassePrincipal.baseDadosJogadores;
import static classes.ClassePrincipal.getJogador;

public class Manager {
    private final String nome;
    private int exp;
    private Clube clube;
    
    public Manager(String nome, Clube clube) {
        this.nome = nome;
        this.exp = 0;
        this.clube = clube;
    }
    
    public String contratarJogadorSemClube(String nomeJogador) {
        Jogador jogador = null;
        for (int i = 0; i < baseDadosJogadores().size(); i++) {
            if (nomeJogador.equals(baseDadosJogadores().get(i).getNome())) {
                jogador = baseDadosJogadores().get(i);
            }
        }
        return this.clube.contratarJogadorSemClube(jogador);
    }
    
    public String contratarJogador(Clube clube, String nomeJogador, double oferta) {
        Jogador jogador = getJogador(nomeJogador);        
        if (!jogador.getNome().equals("null")) {
            return this.clube.negociarComClube(clube, jogador, oferta);            
        }
        return "false";
    }
    
    public void dispensarJogador(String nomeJogador) {        
        this.clube.rescindirContrato(getJogador(nomeJogador));
    } 
    
    public String venderJogador(String nomeJogador) {
        this.clube.venderJogador(getJogador(nomeJogador));
        return getJogador(nomeJogador).getStatus();
    }   
    
    public String getNome() {
        return nome;
    }

    public int getExp() {
        return exp;
    }

    public Clube getClube() {
        return clube;
    }
    
    
}

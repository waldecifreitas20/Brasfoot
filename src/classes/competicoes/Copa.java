package classes.competicoes;

import classes.clube.Clube;
import java.util.ArrayList;

public abstract class Copa {
    private final String nome;
    private final ArrayList<Clube> participantes;
    private int fases;
    private final double PREMIACAO;

    public Copa(String nome, ArrayList<Clube> participantes, int fases, double PREMIACAO) {
        this.nome = nome;
        this.participantes = participantes;
        this.fases = fases;
        this.PREMIACAO = PREMIACAO;
    }
    
    public Clube partida(Clube t1, Clube t2) {
        if(t1.getOver() > t2.getOver()){          
            return t1;
        } else {
            return t2;
        }
    }

    public ArrayList<Clube> getParticipantes() {
        return participantes;
    }
}

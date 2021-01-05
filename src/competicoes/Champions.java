package competicoes;

import classes.Clube;
import java.util.ArrayList;

public class Champions extends Copa {
    private Clube finalista1, finalista2;
    public Champions(ArrayList<Clube> participantes) {
        super("UEFA Champions League", participantes, 2, 200);
    }
    
     public void quartasDeFinal() {
        this.finalista1 = this.partida(this.getParticipantes().get(0), this.getParticipantes().get(1));
        this.finalista2 = this.partida(this.getParticipantes().get(2), this.getParticipantes().get(3));
        
     }
    
}


package classes.competicoes;

import classes.clube.Clube;
import java.util.ArrayList;

public class Confronto {         
    private Clube mandante, visitante;   
    private final String key, invertKey;
    public Confronto(Clube mandante, Clube visitante) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.key = mandante.getNome()+","+visitante.getNome();
        this.invertKey = visitante.getNome()+","+mandante.getNome();
    }

    public void novoConfronto(Clube mandante, Clube visitante) {
        this.mandante = mandante;
        this.visitante = visitante;
    }

    public String getKey() {
        return key;
    }

    public String getInvertKey() {
        return invertKey;
    }
    
    public Clube getMandante() {
        return mandante;
    }

    public Clube getVisitante() {
        return visitante;
    } 
}

package classes;

import java.util.ArrayList;

public class Tabela {
    private ArrayList<Clube> participantes;

    
    public Tabela(ArrayList<Clube> participantes) {
        this.participantes = participantes;
    }
    
    public void addVitoria (Clube clube) {
        for (int i = 0; i < participantes.size(); i++) {
            if (participantes.get(i).equals(clube)) {
                this.participantes.get(i).getStats().addVitorias();
            }
        }
        
        
    }
    
    public void addEmpate (Clube clube) {
        for (int i = 0; i < participantes.size(); i++) {
            if (participantes.get(i).equals(clube)) {
                this.participantes.get(i).getStats().addEmpates();
            }
        }
       
    }
    
    public void addDerrota (Clube clube) {
        for (int i = 0; i < participantes.size(); i++) {
            if (participantes.get(i).equals(clube)) {
                this.participantes.get(i).getStats().addDerrotas();
            }
        }        
    }
    
    private void updateTabela() {
       int tam = this.participantes.size();
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (this.participantes.get(i).getStats().getPontos() > 
                        this.participantes.get(j).getStats().getPontos()) {
                    Clube aux = this.participantes.get(i);
                    this.participantes.set(i, this.participantes.get(j));
                    this.participantes.set(j, aux);
                }
            }           
        }
    }
    
    public void listar() {
        for (int i = 0; i < this.participantes.size(); i++) {
            System.out.printf("%d| %s  - %d pts. | %dV  %dE %dD\n", i+1, this.participantes.get(i).getNome(), 
                    this.participantes.get(i).getStats().getPontos(), 
                    participantes.get(i).getStats().getVitorias(),
                    participantes.get(i).getStats().getEmpates(),
                    participantes.get(i).getStats().getDerrotas());
        }
    }
    
    public ArrayList<Clube> getParticipantes() {
        updateTabela();
        return participantes;
    }
    
}

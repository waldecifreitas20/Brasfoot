package classes;

public class Estatistica {
    private int 
        pontos,
        golsSofridos,
        golsFeitos,
        saldo,
        vitorias,
        empates,
        jogos,
        derrotas;

    public Estatistica() {
        this.pontos = 0;
        this.golsSofridos = 0;
        this.golsFeitos = 0;
        this.saldo = 0;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
    }

    public int getJogos() {
        return jogos;
    }
    
    public void addJogos() {
        ++this.jogos;
    }
    
    public int getPontos() {
        return pontos;
    }   

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void addGolsSofridos(int golsSofridos) {
        this.golsSofridos += golsSofridos;
    }

    public int getGolsFeitos() {
        return golsFeitos;
    }

    public void addGolsFeitos(int golsFeitos) {
        this.golsFeitos += golsFeitos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void updateSaldo() {
        this.saldo = this.golsFeitos - this.golsSofridos;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void addVitorias() {
        this.pontos += 3;
        ++this.vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void addEmpates() {
        ++this.pontos;
        ++this.empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void addDerrotas() {
        ++this.derrotas;
    }
    
    
    
}

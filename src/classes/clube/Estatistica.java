package classes.clube;

import static classes.ClassePrincipal.baseDadosClubes;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    
    private ArrayList<Clube> clubesEnfrentados;
   
    
    public Estatistica(Clube self) {
        this.clubesEnfrentados = new ArrayList<>();
        this.pontos = 0;
        this.golsSofridos = 0;
        this.golsFeitos = 0;
        this.saldo = 0;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
//        System.out.println(this.clubesNaoEnfrentados.isEmpty());
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
        updateSaldo();
    }

    public int getGolsFeitos() {
        return golsFeitos;
    }

    public void addGolsFeitos(int golsFeitos) {
        this.golsFeitos += golsFeitos;
        updateSaldo();
    }

    public int getSaldo() {
        return saldo;
    }

    private void updateSaldo() {
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

    public List<Clube> getClubesEnfrentados() {
        return clubesEnfrentados;
    }

    public void addClubesEnfrentados(Clube clubeEnfrentado) {
        this.clubesEnfrentados.add(clubeEnfrentado);
       
    }

}

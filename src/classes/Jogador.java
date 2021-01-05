package classes;

import exceptions.CannotInstanciedObject;
import javax.swing.JOptionPane;

public class Jogador {
    private final String nome; 
    private String status, posicao;
    private double valor, over, salario;
    private short ataque, meio, defesa, goleiro, idade;
   
    public Jogador(String nome, String posicao, int ataque, int meio, int defesa,
            int goleiro, int idade, String status) {
        
        this.nome = nome;        
        this.ataque = (short)ataque;
        this.meio = (short) meio;
        this.defesa = (short) defesa;
        this.goleiro = (short) goleiro;        
        this.status = status;
        
        if(idade < 16 || idade > 42) {
            try {
                throw new CannotInstanciedObject("Jogador com idade inválida");
            } catch(CannotInstanciedObject ex) {
                ex.printStackTrace();
                this.idade = 24;
            }
        }else {
            this.idade =(short) idade;
        }        
        try {    
            this.posicao = posicao;
            this.initJogador();
        } catch (CannotInstanciedObject ex) {
            ex.printStackTrace();            
        }
        this.salario = ((this.over - 39) + (43 - this.idade) + (this.valor/12))/5;
    }

    public Jogador() {
        this.nome = "null";      
        this.salario = 0;             
        this.status = "não listado";
        this.over = 0;
    }
    
    private void initJogador() throws CannotInstanciedObject {
        String posic = this.posicao.toLowerCase();
        switch(posic) {
            case "goleiro" :
                this.over = (this.goleiro*10 + this.defesa*0.5)/10;                
            break;
            case "defensor" :
                this.over = (this.defesa*10 + this.meio)/10.5;               
            break;
            case "meio-campo" :
                this.over = (this.defesa*2 + this.meio*10 + this.ataque*2)/13;                
            break;
            case "atacante" :
                this.over = (this.meio*2.1 + this.ataque*10)/12;            
            break;
            default :
                throw new CannotInstanciedObject("Não foi possível instaciar "
                        + "objeto da classe 'Jogador.java' no pacote 'brasfoot';"
                        + " inicilização ilegal da variavel 'this.posicao'");
        }
        this.valor = (this.over - 39) * (42.1 - this.idade)/8;        
    }
    
    //Metodos publicos//
    public boolean analisarProposta(Clube clube) {        
        if (clube.getOver() < this.over * 0.9) {
            return false;
        }else {
            this.status = clube.getNome(); 
            this.salario = ((this.over - 39) + (43 - this.idade) + (this.valor/12))/5;
            return true;            
        }
    }
    public void trocarDeClube(Clube clube) {
        this.status = clube.getNome();
    }
    
    public void receberRecisaoContratual() {
        this.status = "Sem Clube";       
        this.salario = 0;
    }
    
    //Getters//
    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public double getValor() {
        return valor;
    }

    public double getOver() {
        return over;
    }
    
    public short getIdade() {
        return idade;
    }

    public String getStatus() {
        return status;
    }

    public double getSalario() {
        return salario;
    }

    public short getAtaque() {
        return ataque;
    }

    public short getMeio() {
        return meio;
    }

    public short getDefesa() {
        return defesa;
    }

    public short getGoleiro() {
        return goleiro;
    }

}
package classes.clube;

import exceptions.CannotInstanciedObject;
import javax.swing.JOptionPane;

public class Jogador {
    private final String nome; 
    private String status;
    private final String posicao;
    private double valor, over, salario;
    private Habilidade habilidades;
    private int idade;
   
    public Jogador(String nome, String posicao, Habilidade habilidades, int idade, String status) {   
        this.posicao = posicao;  
        this.nome = nome;        
        this.habilidades = habilidades;        
        this.status = status;
        
        if(idade < 16 || idade > 42) {
            try {
                throw new CannotInstanciedObject("Jogador com idade inválida");
            } catch(CannotInstanciedObject ex) {
                ex.printStackTrace();
                this.idade = 24; 
            }
        }else {
            this.idade = idade;
        }                     
        initJogador(this.posicao);
        this.salario = ((this.over - 39) + (43 - this.idade) + (this.valor/12))/5;
    }

    public Jogador() {
        this.nome = "null";      
        this.salario = 0;             
        this.status = "não listado";
        this.over = 0;
        this.posicao = "";
    }
    
    private void initJogador(String posicao) {
       
        switch(posicao.toLowerCase()) {
            case "goleiro" :
                this.over = (habilidades.GOLEIRO*10 + habilidades.DEFESA*0.5)/10;                
            break;
            case "defensor" :
                this.over = (habilidades.DEFESA*10 + habilidades.MEIO)/10.5;               
            break;
            case "meio-campo" :
                this.over = (habilidades.DEFESA*2 + habilidades.MEIO*10 + habilidades.ATAQUE*2)/13;                
            break;
            case "atacante" :
                this.over = (habilidades.MEIO*2.1 + habilidades.ATAQUE*10)/12;            
            break;
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
    
    public int getIdade() {
        return idade;
    }

    public String getStatus() {
        return status;
    }

    public double getSalario() {
        return salario;
    }

    public Habilidade getHabilidades() {
        return habilidades;
    }

    public static class Posicao {
        public static String ATACANTE = "Atacante";
        public static String MEIO_CAMPO = "Meio-Campo";
        public static String DEFENSOR = "Defensor";
        public static String GOLEIRO = "Goleiro";
    }
    
    public static class Habilidade {
        private int ATAQUE;
        private int MEIO;
        private int DEFESA;
        private int GOLEIRO;

        public Habilidade(int ATAQUE, int MEIO, int DEFESA, int GOLEIRO) {
            this.ATAQUE = ATAQUE;
            this.MEIO = MEIO;
            this.DEFESA = DEFESA;
            this.GOLEIRO = GOLEIRO;
        }

        public int getATAQUE() {
            return ATAQUE;
        }

        public int getMEIO() {
            return MEIO;
        }

        public int getDEFESA() {
            return DEFESA;
        }

        public int getGOLEIRO() {
            return GOLEIRO;
        }
        
        
        
        
    }
}
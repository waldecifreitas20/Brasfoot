package classes;

import static classes.Brasfoot.baseDadosClubes;
import static classes.Brasfoot.updateBaseDados;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

public class Clube extends BaseClube{
    //<editor-fold desc="Variaveis">
    private ArrayList<Jogador> 
            elenco, 
            reservas = new ArrayList(),
            titulares = new ArrayList(); 
    
    private final int 
            id,
            relevancia;
    
    private Estatistica 
            stats = new Estatistica();
    
    private double 
            dinheiro, 
            gastos, 
            over,
            forcaAtaque,
            forcaDefesa;
    
    private final ImageIcon 
            background,  
            emblema, 
            emblemaMini; 
    
    private final Color 
            FOREGROUND;
    //</editor-fold>
    
    public Clube(String nome, ArrayList<Jogador> elenco, short relevancia, 
            double dinheiro, String emblema, String emblemaPequeno, 
            String background, Color foreground, int id ) {
        super(nome);
        this.elenco = elenco;
        this.relevancia = relevancia;
        this.dinheiro = dinheiro;
        initGastos();       
        this.id = id;
        calcOver(); 
        this.FOREGROUND = foreground;
        this.emblema = getEmblema(emblema);
        this.emblemaMini = getEmblemaMini(emblemaPequeno);  
        this.background = getBackground(background);
    }

    //<editor-fold desc=" Métodos internos">
    private ImageIcon getBackground(String arq) {
       ImageIcon background;
        try {           
            background = new ImageIcon(getClass().getResource("../img/"+arq));
            return background;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }   
    }
    
    private ImageIcon getEmblema(String arq) {
        ImageIcon img;
        try {           
            img = new ImageIcon(getClass().getResource("../emblemas/"+arq));
            return img;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }       
    }
    
    private ImageIcon getEmblemaMini(String arq) {
        ImageIcon img;
        try {           
            img = new ImageIcon(getClass().getResource("../emblemas/"+arq));
            return img;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }       
    }
    
    private void calcOver() {
        double 
            forca = 0,
            ataque = 0, 
            defesa = 0;
        
        for (int i = 0; i < this.elenco.size(); i++) {
            forca += this.elenco.get(i).getOver();
            ataque += (double)(this.elenco.get(i).getAtaque()*10 + 
                    this.elenco.get(i).getMeio()*8)/18;
            defesa += (double)(this.elenco.get(i).getMeio()*2 + 
                    this.elenco.get(i).getDefesa()*10 + 
                    this.elenco.get(i).getGoleiro()*10)/20;
        }
        this.forcaAtaque = ataque/this.elenco.size();
        this.forcaDefesa = defesa/this.elenco.size();
        this.over = forca/this.elenco.size();
    }
    
    private void initGastos() {
        this.gastos = 0;
        for (int i = 0; i < getElenco().size(); i++) {
            this.gastos += this.elenco.get(i).getSalario();
        }
        this.dinheiro -= this.gastos;
    }
    
    private boolean jaExiste(Jogador jogador) {
        for (int i = 0; i < this.elenco.size(); i++) {
            if (this.elenco.get(i).getNome().equals(jogador.getNome())) {
                return true;
            }
        }
        return false;
    }
    //</editor-fold>
    
    //<editor-fold  desc=" Getters ">
    public double getForcaAtaque() {
        return forcaAtaque;
    }

    public double getForcaDefesa() {
        return forcaDefesa;
    }
    
    public ArrayList<Jogador> getReservas() {
        return reservas;
    }

    public ArrayList<Jogador> getTitulares() {
        return titulares;
    }
        
    public double getDinheiro() {
        return dinheiro;
    }

    public double getOver() {
        return over;
    }       

    public ArrayList<Jogador> getElenco() {
        return elenco; 
    } 
 
    public int getRelevancia() {
        return relevancia;
    }

    public double getGastos() {
        return gastos;
    }
    
    public ImageIcon getEmblema() {
        return emblema;
    }
    
    public ImageIcon getEmblemaMini() {
        return emblemaMini;
    }

    public ImageIcon getBackground() {
        return background;
    }

    public Color getFOREGROUND() {
        return FOREGROUND;
    }
    public int getId() {
        return id;
    }

    public Estatistica getStats() {
        return stats;
    }    
    //</editor-fold>
    
    //Metodos Publicos//    
    public void rescindirContrato(Jogador jogador) {
        for (int i = 0; i < this.elenco.size(); i++) {
            if(jogador.equals(this.elenco.get(i).getNome())) {
                jogador.receberRecisaoContratual();
                this.elenco.remove(i);     
                
            }
        }
    }
   
    public void rescindirContrato(int jogador) {   
        this.elenco.get(jogador).receberRecisaoContratual();
        this.elenco.remove(jogador);
    }
    
    public String analisarProposta(double oferta, Jogador jogador) {
        double taxa = this.over - jogador.getOver();
        double contraProposta = 0 ;        
        if(taxa > 10 && jogador.getValor()*0.9 < oferta) {  
            
            return "true";
        }else if((taxa < 10 || taxa < 0) && jogador.getValor()*1.3 < oferta){
            return "true";
        }else {
            if (taxa > 10) {
                contraProposta = jogador.getValor();
            } else {
                contraProposta = jogador.getValor()*1.3;
            }
            return " não aceita menos que " + ((int)contraProposta+1) + " Mi \npelo " +jogador.getNome();
        }
    }
    
    public String negociarComClube (Clube clube, Jogador jogador, double oferta) {  
        if (!this.jaExiste(jogador)) {
            String resposta = clube.analisarProposta(oferta, jogador);
            if(resposta.equals("true")) {
                if (jogador.analisarProposta(clube)) {   
                    if (this.dinheiro > oferta && (this.dinheiro-oferta) > jogador.getSalario()) {
                        this.gastos += oferta;
                        this.dinheiro -= oferta;
                        jogador.trocarDeClube(this);
                        this.elenco.add(jogador);
                        clube.getElenco().remove(jogador);                        
                        updateBaseDados(clube);
                        updateBaseDados(this);                
                        return clube.getNome() + " aceitou sua proposta por " + jogador.getNome();                        
                    } else {
                       return "Você não dinheiro suficiente para realizar essa transferência!";
                    }
                }else {
                    return jogador.getNome() + " não quer jogar pelo seu clube!";
                }                
            } 
            return "O " + clube.getNome() + resposta;
        } else {
            return "Você já contratou esse jogador!";
        }
        
    }
    
    public Clube venderJogador(Jogador jogador) {
        Random gerador = new Random(); 
        int index = 0; 
        do {
            index = gerador.nextInt(baseDadosClubes().size());           
        } while (baseDadosClubes().get(index).getId() == this.id);
   
        Clube clube = baseDadosClubes().get(index);  
        clube.getElenco().add(jogador);
        this.getElenco().remove(jogador);
        jogador.trocarDeClube(clube);
        updateBaseDados(clube);
        
        clube.dinheiro -= jogador.getValor()*1.3;
        this.dinheiro += jogador.getValor()*1.3;
        
        return clube;
    }
    
    public String contratarJogadorSemClube(Jogador jogador) {
        if (!this.jaExiste(jogador)) {
            if (this.dinheiro > jogador.getSalario()) {
                if (jogador.analisarProposta(this)) {
                    jogador.trocarDeClube(this);
                    this.elenco.add(jogador);
                    this.gastos += jogador.getSalario();
                    this.dinheiro -= jogador.getSalario();
                    updateBaseDados(this);
                    return jogador.getNome() + " aceitou sua proposta" ;
                } else {
                    return jogador.getNome() + " não jogar pelo seu clube";
                }
            } else {
                return "Você não dinheiro suficiente para contratar esse jogador!";
            }
        } else {
            return "Você já contratou esse jogador!";
        }
    }
    
    public boolean adicionarTitular(Jogador jogador) {
        if (this.titulares.size() < 11) {
            this.titulares.add(jogador);
            return true;
        }
        return false;
    }
        
    public boolean removerTitular(Jogador jogador) {
        for (int i = 0; i < this.titulares.size(); i++) {
            if (this.titulares.get(i).equals(jogador)) {
                this.titulares.remove(jogador);
                return true;
            }
        }
        return false;
    }
       
    public boolean adicionarReserva(Jogador jogador) {
        if (this.reservas.size() < 7) {
            this.reservas.add(jogador);
            return true;
        }
        return false;
    }
    
    public boolean removerReserva(Jogador jogador) {
        for (int i = 0; i < this.reservas.size(); i++) {
            if (this.reservas.get(i).equals(jogador)) {
                this.reservas.remove(jogador);
                return true;
            }
        }
        return false;
    }
           
}

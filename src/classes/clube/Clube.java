package classes.clube;

import static classes.ClassePrincipal.ADD;
import static classes.ClassePrincipal.REMOVE;
import static classes.ClassePrincipal.baseDadosClubes;
import static classes.ClassePrincipal.updateBaseDados;
import static classes.ClassePrincipal.updateSemClube;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;

public class Clube extends BaseClube{
    //<editor-fold desc="Variaveis">
    private final int id,relevancia;    
    private final Color FOREGROUND;
    private final ImageIcon BACKGROUND,EMBLEMA,EMBLEMA_MINE;     
    private Estatistica stats;   
    //declarar variaveis uma por linha
    //usar nomes de variaveis/metodos/classes em uma unica lingua
    private double dinheiro,gastos,over,forcaAtaque,forcaDefesa;    
    private List<Jogador> reservas,titulares;   
    private List<Clube> timesEnfrentados;
    //</editor-fold>
    
    
    //pensar em ter metodos com menos parametros
    public Clube(String nome, List<Jogador> elenco, short relevancia, 
            double dinheiro, String EMBLEMA, String EMBLEMAPequeno, 
            String BACKGROUND, Color foreground, int id ) {
        super(nome, elenco);
        this.reservas = new ArrayList<>();
        this.titulares = new ArrayList<>();
        this.timesEnfrentados = new ArrayList<>();
        this.stats = new Estatistica(this);
        this.relevancia = relevancia;
        this.dinheiro = dinheiro;
        initGastos();       
        this.id = id;
        calcOver(); 
        this.FOREGROUND = foreground;
        this.EMBLEMA = getEMBLEMA(EMBLEMA);
        this.EMBLEMA_MINE = getEMBLEMA_MINE(EMBLEMAPequeno);  
        this.BACKGROUND = getBACKGROUND(BACKGROUND);
    }

    //<editor-fold desc=" Métodos internos">
    private ImageIcon getBACKGROUND(String arq) {
       ImageIcon BACKGROUND;
        try {
            //sempre uso o caminho absoluto
            BACKGROUND = new ImageIcon(getClass().getResource("../../BACKGROUNDs/"+arq));
            return BACKGROUND;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }   
    }
    
    private ImageIcon getImagemDoClube(String arq, String tipo_de_imagem) {
       ImageIcon BACKGROUND;
        try {
            //sempre uso o caminho absoluto
            //File.separator
            BACKGROUND = new ImageIcon(getClass().getResource("../../"+tipo_de_imagem+"/"+arq));
            return BACKGROUND;
        } catch (Exception ex) {
            ex.printStackTrace();
            //lembre-se sempre: nunca retorne nulos; retorne objetos.
            //nesse caso, seria uma exceção (FileNotFound / FileNotFoundException)
            return null;
        }   
    }
    
    private ImageIcon getEMBLEMA(String arq) {
        ImageIcon img;
        try {           
            img = new ImageIcon(getClass().getResource("../../EMBLEMAs/"+arq));
            return img;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }       
    }
    
    private ImageIcon getEMBLEMA_MINE(String arq) {
        ImageIcon img;
        try {           
            img = new ImageIcon(getClass().getResource("../../EMBLEMAs/"+arq));
            return img;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }       
    }
    
    //pensar em nomes de metodos mais descritivos
    //private void calcularPontuacaoDoClube
    private void calcOver() {
        double forca = 0, ataque = 0, defesa = 0;
        int qtdAtq = 0, qtdDef = 0;
        
        for (int i = 0; i < getJogadores().size(); i++) {
            Jogador jogador = getJogadores().get(i);
            
            forca += jogador.getOver();
            
            if (jogador.getPosicao().equals("Atacante")) {                
                qtdAtq++;
                ataque += calcularHabilidadeAtacante(jogador);
            }
            if (jogador.getPosicao().equals("Meio-Campo")) {
                qtdAtq++;
                ataque += (double)(jogador.getHabilidades().getATAQUE()*0.5 + jogador.getHabilidades().getMEIO()*10)/10;
            }
            if (jogador.getPosicao().equals("Defensor")) {
                qtdDef++;
                defesa += (double)(jogador.getHabilidades().getDEFESA()*10 + jogador.getHabilidades().getMEIO())/10;
            }
            if (jogador.getPosicao().equals("Goleiro")) {
                qtdDef++;                
                defesa += jogador.getHabilidades().getGOLEIRO();
            }
          
        }
        this.forcaAtaque = ataque/qtdAtq;
        this.forcaDefesa = defesa/qtdDef;
        this.over = forca/this.jogadores.size();
    }
    
    private double calcularHabilidadeAtacante(Jogador jogador){
        return (double)(jogador.getHabilidades().getATAQUE()*10 + jogador.getHabilidades().getMEIO()*0.5)/10;
    }


    private void initGastos() {
        this.gastos = 0;
        for (int i = 0; i < getJogadores().size(); i++) {
            this.gastos += this.jogadores.get(i).getSalario();
        }
        this.dinheiro -= this.gastos;
    }
    
    private boolean jaExiste(Jogador jogador) {
        for (int i = 0; i < this.jogadores.size(); i++) {
            if (this.jogadores.get(i).getNome().equals(jogador.getNome())) {
                return true;
            }
        }
        return false;
    }
    //</editor-fold>
    
    //<editor-fold  desc=" Getters ">

    public List<Clube> getTimesEnfrentados() {
        return timesEnfrentados;
    }

    public ImageIcon getBackground() {
        return BACKGROUND;
    }
        
    public double getForcaAtaque() {
        return forcaAtaque;
    }

    public double getForcaDefesa() {
        return forcaDefesa;
    }
    
    public List<Jogador> getReservas() {
        return reservas;
    }

    public List<Jogador> getTitulares() {
        return titulares;
    }
        
    public double getDinheiro() {
        return dinheiro;
    }

    public double getOver() {
        return over;
    } 
    
    public int getRelevancia() {
        return relevancia;
    }

    public double getGastos() {
        return gastos;
    }
    
    public ImageIcon getEmblema() {
        return EMBLEMA;
    }
    
    public ImageIcon getEmblemaMini() {
        return EMBLEMA_MINE;
    } 

    public Color getForeground() {
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
        for (int i = 0; i < this.jogadores.size(); i++) {
            if(jogador.getNome().equals(this.jogadores.get(i).getNome())) {
                jogador.receberRecisaoContratual();                
                this.jogadores.remove(jogador);                
                updateSemClube(jogador, ADD);  
                updateBaseDados(this);
                System.out.println("aaa");
            }
        }
    }
    
    private void valeApenaProposta(double oferta, Jogador jogador) {
        double taxa = this.over - jogador.getOver();
        return taxa > 10 && jogador.getValor()*0.9 < oferta || (taxa < 10 || taxa < 0) && jogador.getValor()*1.3 < oferta;
    }
        
    
    //chamar esse metodo uma linha antes do JOptionPane 
    //depois que tiver o resultado, passar pro JOptionPane...
    public Proposta analisarProposta(double oferta, Jogador jogador) {
        if(valeApenaProposta(oferta, jogador)) {              
            // se voltar esse codigo assim, ta reprovado!
            return new Proposta (true);
        }else {
            double contraProposta;        
            if (taxa > 10) {
                contraProposta = jogador.getValor();
            } else {
                contraProposta = jogador.getValor()*1.3;
            }
            return new Proposta (false, contraProposta+1, jogador);
            //return " não aceita menos que " + ((int)contraProposta+1) + " Mi \npelo " +jogador.getNome();
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
                        this.jogadores.add(jogador);
                        clube.jogadores.remove(jogador);                        
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
        clube.jogadores.add(jogador);
        this.jogadores.remove(jogador);
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
                    this.jogadores.add(jogador);
                    this.gastos += jogador.getSalario();
                    this.dinheiro -= jogador.getSalario();
                    updateBaseDados(this);
                    updateSemClube(jogador, ADD);
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

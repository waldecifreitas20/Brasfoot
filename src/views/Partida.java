
package views;

import static classes.Brasfoot.baseDadosClubes;
import classes.Clube;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

public class Partida extends javax.swing.JFrame {
    private Clube mandante, visitante;
    private Timer cronometro = new Timer();
    private boolean pausado = false;
    private final JFrame telaInicial;
    
    public Partida(Clube mandante, Clube visitante, JFrame telaInicial) {
        initComponents();
        this.telaInicial = telaInicial;
        this.telaInicial.setVisible(false);
        this.mandante = mandante;
        this.visitante = visitante;
        btnPause.setVisible(false);
        initAssets();
        iniciarPartida();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblVisitante = new javax.swing.JLabel();
        lblMandante = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblGolMandante = new javax.swing.JLabel();
        lblGolVisitante = new javax.swing.JLabel();
        emblemaVisitante = new javax.swing.JLabel();
        emblemaMandante = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();
        btnPause = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTitulares = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAdversario = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 153));

        lblVisitante.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblVisitante.setForeground(new java.awt.Color(0, 0, 0));
        lblVisitante.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVisitante.setText("Paris Saint-Germain");

        lblMandante.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMandante.setForeground(new java.awt.Color(0, 0, 0));
        lblMandante.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMandante.setText("Paris Saint-Germain");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");

        lblGolMandante.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblGolMandante.setForeground(new java.awt.Color(0, 0, 0));
        lblGolMandante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGolMandante.setText("0");

        lblGolVisitante.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblGolVisitante.setForeground(new java.awt.Color(0, 0, 0));
        lblGolVisitante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGolVisitante.setText("0");

        emblemaVisitante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emblemas/barcelona_mini.png"))); // NOI18N

        emblemaMandante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emblemas/barcelona_mini.png"))); // NOI18N

        lblTempo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTempo.setForeground(new java.awt.Color(0, 0, 0));
        lblTempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTempo.setText("- - -");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emblemaMandante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMandante, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblGolMandante, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGolVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emblemaVisitante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(emblemaVisitante)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMandante)
                            .addComponent(lblGolMandante)
                            .addComponent(jLabel2)
                            .addComponent(lblGolVisitante)
                            .addComponent(lblVisitante))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(emblemaMandante)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        btnPause.setText("Pausar");
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        listTitulares.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10", "Item 11" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listTitulares);

        listAdversario.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listAdversario);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "item 6 ", "item 7" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        jButton1.setText("Substituir  Jogador");

        jButton2.setText("Ir para home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnPause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initAssets() {
        this.lblMandante.setText(this.mandante.getNome());
        this.emblemaMandante.setIcon(this.mandante.getEmblemaMini());
        this.lblVisitante.setText(this.visitante.getNome());
        this.emblemaVisitante.setIcon(this.visitante.getEmblemaMini());
    }
    
    private void iniciarPartida() {
        this.btnPause.setVisible(true);        
        this.lblGolMandante.setText("0");
        this.lblGolVisitante.setText("0");
        this.cronometro.scheduleAtFixedRate(new TimerTask() {
            private Random relatividade = new Random();

            private int
            tempo = 0,
            golVisitante = 0,
            golMandante = 0;           

            private double
            chanceGolmandante,
            chanceGolvisitante,
            chanceDefesamandante,
            chanceDefesavisitante;

            @Override
            public void run() {
                lblTempo.setText("'" + this.tempo);             
                if (!pausado) {
                    ++this.tempo;                                     
                    if (this.tempo > 90) {
                        this.cancel();
                        lblTempo.setText("Fim de Jogo");
                        mandante.getStats().addJogos();
                        visitante.getStats().addJogos();
                        if (this.golMandante > this.golVisitante) {
                            mandante.getStats().addVitorias();
                            visitante.getStats().addDerrotas();                           
                        } else if (this.golVisitante > this.golMandante) {
                            mandante.getStats().addDerrotas();
                            visitante.getStats().addVitorias();
                        } else {
                            mandante.getStats().addEmpates();
                            visitante.getStats().addEmpates();
                        }                            
                    }
                    this.chanceGolmandante = this.relatividade.nextFloat() + (mandante.getForcaAtaque()/100);
                    this.chanceGolvisitante = this.relatividade.nextFloat() + (visitante.getForcaAtaque()/100);
                    this.chanceDefesamandante = this.relatividade.nextFloat() + (mandante.getForcaDefesa()/100);
                    this.chanceDefesavisitante = this.relatividade.nextFloat() + (visitante.getForcaDefesa()/100);

                    if (this.chanceGolmandante > 0.99+mandante.getForcaAtaque()/100
                        && this.chanceDefesavisitante < this.chanceGolmandante) {

                        ++this.golMandante;
                        lblGolMandante.setText("" + this.golMandante);
                        mandante.getStats().addGolsFeitos(this.golMandante);
                        visitante.getStats().addGolsSofridos(this.golVisitante);
                    }
                    if (this.chanceGolvisitante > 0.99+visitante.getForcaAtaque()/100
                        && this.chanceGolvisitante > this.chanceDefesamandante) {

                        ++this.golVisitante;
                        lblGolVisitante.setText("" + this.golVisitante);
                        visitante.getStats().addGolsFeitos(this.golVisitante);
                        mandante.getStats().addGolsSofridos(this.golMandante);
                    }
                }
            }
        }, 0, 100);
    }
            
    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        this.pausado = !this.pausado;
        if (pausado == true) {
            this.btnPause.setText("Reiniciar");            
        } else {
            this.btnPause.setText("Pausar");            
        }
                
    }//GEN-LAST:event_btnPauseActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        this.telaInicial.setVisible(true);        
    }//GEN-LAST:event_jButton2ActionPerformed
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPause;
    private javax.swing.JLabel emblemaMandante;
    private javax.swing.JLabel emblemaVisitante;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblGolMandante;
    private javax.swing.JLabel lblGolVisitante;
    private javax.swing.JLabel lblMandante;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JLabel lblVisitante;
    private javax.swing.JList<String> listAdversario;
    private javax.swing.JList<String> listTitulares;
    // End of variables declaration//GEN-END:variables
}

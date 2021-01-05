
package views;

import static classes.Brasfoot.baseDadosClubes;
import classes.Clube;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Partida extends javax.swing.JFrame {
    private Clube t1 = baseDadosClubes().get(1), t2 = baseDadosClubes().get(0);
    private Timer cronometro = new Timer();
    
    
    public Partida() {
        initComponents();         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMandante = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblVisitante = new javax.swing.JLabel();
        lblGolMandante = new javax.swing.JLabel();
        lblGolVisitante = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        lblTempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 51));

        lblMandante.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblMandante.setForeground(new java.awt.Color(0, 0, 0));
        lblMandante.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMandante.setText("Mandante");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");

        lblVisitante.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblVisitante.setForeground(new java.awt.Color(0, 0, 0));
        lblVisitante.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVisitante.setText("Visitante");

        lblGolMandante.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblGolMandante.setForeground(new java.awt.Color(0, 0, 0));
        lblGolMandante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGolMandante.setText("0");

        lblGolVisitante.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblGolVisitante.setForeground(new java.awt.Color(0, 0, 0));
        lblGolVisitante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGolVisitante.setText("0");

        btnStart.setText("Nova Partida");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        lblTempo.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblTempo.setForeground(new java.awt.Color(0, 0, 0));
        lblTempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTempo.setText("- - -");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMandante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGolMandante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGolVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)))
                .addGap(125, 125, 125))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMandante, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGolVisitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGolMandante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
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

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        this.lblGolMandante.setText("0");
        this.lblGolVisitante.setText("0");
        this.cronometro.scheduleAtFixedRate(new TimerTask() {             
            private Random relatividade = new Random();
            
            private int 
                tempo = 0, 
                golVisitante = 0, 
                golMandante = 0,                
                minGol = 0;
            
            private double 
                chanceGolT1, 
                chanceGolT2,
                chanceDefesaT1,
                chanceDefesaT2;
            
            @Override
            public void run() {            
                double atqM = t1.getForcaAtaque(), defM = t2.getForcaAtaque();
                double atqV = t2.getForcaDefesa(), defV = t2.getForcaDefesa();
                lblTempo.setText("'" + this.tempo);
                ++this.tempo;
                if (this.tempo > 90) {
                    this.cancel();
                }
                int m = 85, v = 95;
                this.chanceGolT1 = this.relatividade.nextFloat() + m/1000;
                this.chanceGolT2 = this.relatividade.nextFloat() + m/1000;
                this.chanceDefesaT1 = this.relatividade.nextFloat() ;
                this.chanceDefesaT2 = this.relatividade.nextFloat() ;
                
                if (this.chanceGolT1 > 0.99) {
                    this.minGol = this.relatividade.nextInt(90);                                        
                        ++this.golMandante;                    
                        lblGolMandante.setText("" + this.golMandante);            
                }
                if (this.chanceGolT2 > 0.99) {
                    this.minGol = this.relatividade.nextInt(90);                         
                        ++this.golVisitante;
                        lblGolVisitante.setText("" + this.golVisitante);                    
                }      
            }            
        }, 0, 50);        
    }//GEN-LAST:event_btnStartActionPerformed
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Partida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Partida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Partida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Partida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Partida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGolMandante;
    private javax.swing.JLabel lblGolVisitante;
    private javax.swing.JLabel lblMandante;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JLabel lblVisitante;
    // End of variables declaration//GEN-END:variables
}

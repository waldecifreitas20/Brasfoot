package views;

import static classes.ClassePrincipal.baseDadosClubes;
import classes.clube.Clube;
import classes.clube.Manager;
import exceptions.FileNotFound;
import java.util.List;
import javax.swing.DefaultListModel;

public class SelecionarEquipe extends javax.swing.JFrame {
    private final String nomeManager;
    private Clube clube;
    public SelecionarEquipe(String nomeManager) {
        initComponents();  
        this.nomeManager = nomeManager;
        this.setLocationRelativeTo(null);
        DefaultListModel model = new DefaultListModel();
       
        for (int i = 0; i < baseDadosClubes().size(); i++) {
            this.boxSelectionClub.addItem(baseDadosClubes().get(i).getNome());
        }               
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaSelection = new javax.swing.JPanel();
        lblEmblema = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        boxSelectionClub = new javax.swing.JComboBox<>();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1024, 768));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 678));

        telaSelection.setBackground(new java.awt.Color(255, 255, 255));
        telaSelection.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmblema.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblEmblema.setForeground(new java.awt.Color(255, 255, 255));
        lblEmblema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telaSelection.add(lblEmblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        btnIniciar.setText("Começar Jogo");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        telaSelection.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 240, 40));

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecione uma equipe");
        telaSelection.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 270, 40));

        boxSelectionClub.setBackground(new java.awt.Color(0, 0, 0));
        boxSelectionClub.setEditable(true);
        boxSelectionClub.setForeground(new java.awt.Color(255, 255, 255));
        boxSelectionClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSelectionClubActionPerformed(evt);
            }
        });
        telaSelection.add(boxSelectionClub, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 240, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/orig_515247.jpg"))); // NOI18N
        telaSelection.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 944, 484));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telaSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        Manager manager = new Manager(this.nomeManager, this.clube);
        this.dispose();
        new Jogar(manager).setVisible(true);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void boxSelectionClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSelectionClubActionPerformed
        this.lblEmblema.setIcon(null);
        this.lblEmblema.setText("");
        String item = (String) this.boxSelectionClub.getSelectedItem();
        List<Clube> allClubes = baseDadosClubes();  
       
        for (int i = 0; i < allClubes.size(); i++) {
            if (item.equals(allClubes.get(i).getNome())) 
                if (allClubes.get(i).getEmblema() == null) {
                    try {
                        throw new FileNotFound("nenhum arquivo encontrado");
                    } catch(FileNotFound ex) {
                        ex.printStackTrace();
                        this.lblEmblema.setText("Arquivo não encontrado");
                    }                    
                } else {
                    this.clube = allClubes.get(i);
                    this.lblEmblema.setIcon(allClubes.get(i).getEmblema());                    
                }           
        }
        
        
    }//GEN-LAST:event_boxSelectionClubActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelecionarEquipe("aa").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> boxSelectionClub;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEmblema;
    private javax.swing.JPanel telaSelection;
    // End of variables declaration//GEN-END:variables
}

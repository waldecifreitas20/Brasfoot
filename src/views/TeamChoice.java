package views;

import static classes.ClassePrincipal.clubsDataBase;
import classes.club.Club;
import classes.club.Manager;
import java.io.FileNotFoundException;
import java.util.List;
import javax.swing.DefaultListModel;

public class TeamChoice extends javax.swing.JFrame {
    private final String managerName;
    private Club club;
    public TeamChoice(String managerName) {
        initComponents();  
        this.managerName = managerName;
        this.setLocationRelativeTo(null);
        DefaultListModel model = new DefaultListModel();
       
        for (int i = 0; i < clubsDataBase().size(); i++) {
            this.boxSelectionClub.addItem(clubsDataBase().get(i).getName());
        }               
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaSelection = new javax.swing.JPanel();
        lblEmblem = new javax.swing.JLabel();
        btnStartGame = new javax.swing.JButton();
        lblStaticTeamChoice = new javax.swing.JLabel();
        boxSelectionClub = new javax.swing.JComboBox<>();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1024, 768));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 678));

        telaSelection.setBackground(new java.awt.Color(0, 51, 51));
        telaSelection.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmblem.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblEmblem.setForeground(new java.awt.Color(255, 255, 255));
        lblEmblem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telaSelection.add(lblEmblem, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        btnStartGame.setText("Começar Jogo");
        btnStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartGameActionPerformed(evt);
            }
        });
        telaSelection.add(btnStartGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 240, 40));

        lblStaticTeamChoice.setBackground(new java.awt.Color(255, 0, 51));
        lblStaticTeamChoice.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblStaticTeamChoice.setForeground(new java.awt.Color(255, 255, 255));
        lblStaticTeamChoice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStaticTeamChoice.setText("Selecione uma equipe");
        telaSelection.add(lblStaticTeamChoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 270, 40));

        boxSelectionClub.setBackground(new java.awt.Color(0, 0, 0));
        boxSelectionClub.setEditable(true);
        boxSelectionClub.setForeground(new java.awt.Color(255, 255, 255));
        boxSelectionClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSelectionClubActionPerformed(evt);
            }
        });
        telaSelection.add(boxSelectionClub, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 240, 30));
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

    private void btnStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartGameActionPerformed
        Manager manager = new Manager(this.managerName, this.);
        this.dispose();
        new Jogar(manager).setVisible(true);
    }//GEN-LAST:event_btnStartGameActionPerformed

    private void boxSelectionClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSelectionClubActionPerformed
        this.lblEmblem.setIcon(null);
        this.lblEmblem.setText("");
        String item = (String) this.boxSelectionClub.getSelectedItem();
        List<Club> allClubs = clubsDataBase();  
       
        for (int i = 0; i < allClubs.size(); i++) {
            if (item.equals(allClubs.get(i).getName())) 
                if (allClubs.get(i).getEmblemBig() == null) {
                    try {
                        throw new FileNotFoundException("nenhum arquivo encontrado");
                    } catch(FileNotFoundException ex) {
                        ex.printStackTrace();
                        this.lblEmblem.setText("Arquivo não encontrado");
                    }                    
                } else {
                    this. = allClubs.get(i);
                    this.lblEmblem.setIcon(allClubs.get(i).getEmblem());                    
                }           
        }
        
        
    }//GEN-LAST:event_boxSelectionClubActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeamChoice("aa").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> boxSelectionClub;
    private javax.swing.JButton btnStartGame;
    private javax.swing.JLabel lblEmblem;
    private javax.swing.JLabel lblStaticTeamChoice;
    private javax.swing.JPanel telaSelection;
    // End of variables declaration//GEN-END:variables
}

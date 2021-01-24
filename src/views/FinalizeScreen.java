package views;

import classes.MainClass;
import classes.club.Club;
import classes.club.Manager;
import exceptions.ObjectNotFoundException;
import static java.lang.System.exit;

public class FinalizeScreen extends javax.swing.JFrame {
    private Club champion;
    private LeaderboardWindow leaderboard;
    private Manager manager;
    private int finalPosition;
    
    public FinalizeScreen(LeaderboardWindow leaderboard, Manager manager) {
        initComponents();
        this.leaderboard = leaderboard;
        this.manager = manager;
        try {        
            initData();
            this.champion = this.leaderboard.getClubByPosition(0);
        } catch (ObjectNotFoundException ex) {
            ex.printStackTrace();
        }
        this.initMessage();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titlePane = new javax.swing.JPanel();
        lblForManager = new javax.swing.JLabel();
        lblMesagePosition = new javax.swing.JLabel();
        btnNewGame = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlePane.setBackground(new java.awt.Color(78, 78, 78));

        lblForManager.setBackground(new java.awt.Color(255, 255, 255));
        lblForManager.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblForManager.setForeground(new java.awt.Color(255, 255, 255));
        lblForManager.setText("-------------------");

        lblMesagePosition.setBackground(new java.awt.Color(255, 255, 255));
        lblMesagePosition.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblMesagePosition.setForeground(new java.awt.Color(255, 255, 255));
        lblMesagePosition.setText("----------------------");

        javax.swing.GroupLayout titlePaneLayout = new javax.swing.GroupLayout(titlePane);
        titlePane.setLayout(titlePaneLayout);
        titlePaneLayout.setHorizontalGroup(
            titlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(titlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblForManager)
                    .addComponent(lblMesagePosition, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1089, 1089, 1089))
        );
        titlePaneLayout.setVerticalGroup(
            titlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblForManager)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMesagePosition)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(titlePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 750, -1));

        btnNewGame.setBackground(new java.awt.Color(204, 204, 204));
        btnNewGame.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNewGame.setForeground(new java.awt.Color(0, 0, 0));
        btnNewGame.setText("Nova temporada");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });
        mainPanel.add(btnNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 200, 60));

        btnExit.setBackground(new java.awt.Color(204, 204, 204));
        btnExit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 0, 0));
        btnExit.setText("Sair");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        mainPanel.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 200, 60));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgrounds/background Juventus FC Winner.png"))); // NOI18N
        mainPanel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        this.dispose();
        String [] str = {"a","b"};
        MainClass.main(str);
    }//GEN-LAST:event_btnNewGameActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void initData() throws ObjectNotFoundException {
        Club club = this.manager.getClub();        
        for (int i = 0; i < 6; i++) {
            if (this.leaderboard.getClubByPosition(i).equals(club)) {
                this.finalPosition = i+1;
            }
        }
    }
    
    private void initMessage() {
        String firstLine;
        String secondLine;
       
        if (this.finalPosition == 1) {
            firstLine = "Parabéns, " + this.manager.getName()+"!";
            secondLine = "Você foi campeão da Super Champions!";            
            this.background.setIcon(this.manager.getClub().getBackgroundChampions());
        } else {
            firstLine = "Game Over";
            secondLine = "Você terminou na posição " + this.finalPosition;
            this.background.setIcon(this.champion.getBackgroundChampions());
        }
        this.lblForManager.setText(firstLine);
        this.lblMesagePosition.setText(secondLine);
        
    }
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JLabel lblForManager;
    private javax.swing.JLabel lblMesagePosition;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel titlePane;
    // End of variables declaration//GEN-END:variables
}

package views;

import static classes.MainClass.updateDataBase;
import classes.club.Club;
import classes.club.Player;
import classes.competicoes.Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListModel;

public class MachDayScreen extends javax.swing.JFrame {
    private Club homeTeam, awayTeam;
    private List<Match> round;
    private Timer cronometer = new Timer();
    private boolean paused = false;
    private final JFrame clubManagementScreen;
    
    public MachDayScreen(Club homeTeam, Club awayTeam, List<Match> round, JFrame clubManagementScreen) {
        initComponents();
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(this);
        this.clubManagementScreen = clubManagementScreen;
        this.clubManagementScreen.setVisible(false);
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.round = round;
        this.btnGoToHome.setVisible(false);
        this.btnChangePlayer.setEnabled(false);
        initAssets();
        System.out.println("asdsadsdas");
        initTeamList(this.listAwayTeamPlayers, this.awayTeam);
        initTeamList(this.listHomeTeamPlayers, this.homeTeam);
        System.out.println("2222");
        start();   
        otherMatchs();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        topScoreboardPanel = new javax.swing.JPanel();
        lblAwayTeamName = new javax.swing.JLabel();
        lblHomeTeamName = new javax.swing.JLabel();
        lblStaticX = new javax.swing.JLabel();
        lblGoalHomeTeam = new javax.swing.JLabel();
        lblGoalAwayTeam = new javax.swing.JLabel();
        lblAwayTeamBadge = new javax.swing.JLabel();
        lblHomeTeamBadge = new javax.swing.JLabel();
        lblTimer = new javax.swing.JLabel();
        btnPause = new javax.swing.JButton();
        scrollPaneHomeTeam = new javax.swing.JScrollPane();
        listHomeTeamPlayers = new javax.swing.JList<>();
        scrollPaneAwayTeam = new javax.swing.JScrollPane();
        listAwayTeamPlayers = new javax.swing.JList<>();
        scrollPaneSubstitutes = new javax.swing.JScrollPane();
        listSubstitutes = new javax.swing.JList<>();
        btnChangePlayer = new javax.swing.JButton();
        btnGoToHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(51, 255, 153));

        lblAwayTeamName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAwayTeamName.setForeground(new java.awt.Color(0, 0, 0));
        lblAwayTeamName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAwayTeamName.setText("Paris Saint-Germain");

        lblHomeTeamName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblHomeTeamName.setForeground(new java.awt.Color(0, 0, 0));
        lblHomeTeamName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHomeTeamName.setText("Paris Saint-Germain");

        lblStaticX.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblStaticX.setForeground(new java.awt.Color(0, 0, 0));
        lblStaticX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStaticX.setText("X");

        lblGoalHomeTeam.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblGoalHomeTeam.setForeground(new java.awt.Color(0, 0, 0));
        lblGoalHomeTeam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGoalHomeTeam.setText("0");

        lblGoalAwayTeam.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblGoalAwayTeam.setForeground(new java.awt.Color(0, 0, 0));
        lblGoalAwayTeam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGoalAwayTeam.setText("0");

        lblAwayTeamBadge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emblems/Juventus FC Small.png"))); // NOI18N

        lblHomeTeamBadge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emblems/FC Barcelona Small.png"))); // NOI18N

        lblTimer.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTimer.setForeground(new java.awt.Color(0, 0, 0));
        lblTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimer.setText("- - -");

        javax.swing.GroupLayout topScoreboardPanelLayout = new javax.swing.GroupLayout(topScoreboardPanel);
        topScoreboardPanel.setLayout(topScoreboardPanelLayout);
        topScoreboardPanelLayout.setHorizontalGroup(
            topScoreboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topScoreboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHomeTeamBadge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHomeTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(topScoreboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(topScoreboardPanelLayout.createSequentialGroup()
                        .addComponent(lblGoalHomeTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStaticX, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGoalAwayTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAwayTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAwayTeamBadge)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topScoreboardPanelLayout.setVerticalGroup(
            topScoreboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topScoreboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topScoreboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topScoreboardPanelLayout.createSequentialGroup()
                        .addComponent(lblHomeTeamBadge)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(topScoreboardPanelLayout.createSequentialGroup()
                        .addGroup(topScoreboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(topScoreboardPanelLayout.createSequentialGroup()
                                .addComponent(lblTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(topScoreboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHomeTeamName)
                                    .addComponent(lblGoalHomeTeam)
                                    .addComponent(lblStaticX)
                                    .addComponent(lblGoalAwayTeam)
                                    .addComponent(lblAwayTeamName)))
                            .addComponent(lblAwayTeamBadge))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        btnPause.setText("Pausar");
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        listHomeTeamPlayers.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10", "Item 11" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listHomeTeamPlayers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPaneHomeTeam.setViewportView(listHomeTeamPlayers);

        listAwayTeamPlayers.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo", "Cristiano Ronaldo" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPaneAwayTeam.setViewportView(listAwayTeamPlayers);

        listSubstitutes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "item 6 ", "item 7" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPaneSubstitutes.setViewportView(listSubstitutes);

        btnChangePlayer.setText("Substituir  Jogador");

        btnGoToHome.setText("Ir para home");
        btnGoToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addComponent(scrollPaneHomeTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnPause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnChangePlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGoToHome, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addComponent(scrollPaneAwayTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGap(243, 243, 243)
                            .addComponent(scrollPaneSubstitutes, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(topScoreboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(topScoreboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollPaneAwayTeam)
                            .addComponent(scrollPaneHomeTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnGoToHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChangePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(scrollPaneSubstitutes, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initAssets() {
        this.lblHomeTeamName.setText(this.homeTeam.getName());
        this.lblHomeTeamBadge.setIcon(this.homeTeam.getEmblemSmall());
        this.lblAwayTeamName.setText(this.awayTeam.getName());
        this.lblAwayTeamBadge.setIcon(this.awayTeam.getEmblemSmall());
    }
    private String shortPosition(String position){
        String[] positions = {"ATA", "MC", "DEF", "GOL"};
        
        switch (position.toLowerCase()) {
            case "atacante" :
                return positions[0];
            case "meio-campo":
                return positions[1];
            case "defensor":
                return positions[2];
            case "goleiro":
                return positions[3];           
        }
        return new String("---");
    }
    
    private void initSubstitutesList() {
        DefaultListModel model = (DefaultListModel) this.listSubstitutes.getModel();
        model.removeAllElements();       
        
        for (Player player: this.homeTeam.getSubstitutes() ) {
            String position = shortPosition(player.getPosition()); 
            
            model.addElement(
                    " [" + position + "] " +
                    player.getName() + " - " + 
                    (int) player.getOverall());
        }        
        
    }
    
    private void initTeamList(JList jlist,Club club) {       
        List<Player> team = club.getStartingPlayers();       
        DefaultListModel list = new DefaultListModel();
        for (int i = 0; i < team.size(); i++) {
            String player = team.get(i).getName();
            list.addElement(player);
        }
        jlist.setModel(list); 
        System.out.println(list);
    }
    
    private void start() {
        this.btnPause.setVisible(true);        
        this.lblGoalHomeTeam.setText("0");
        this.lblGoalAwayTeam.setText("0");
        this.cronometer.scheduleAtFixedRate(new TimerTask() {
            
            private final Random 
                    random = new Random();
            private int 
                    timer = 0, 
                    homeTeamGoal = 0, 
                    awayTeamGoal = 0; 
            private double 
                    homeTeamGoalChance, 
                    awayTeamGoalChance,
                    chanceDefesahomeTeam,
                    chanceDefesaawayTeam;
            
            private void loadStats() {
                homeTeam.getStats().addGolsFor(this.homeTeamGoal);
                homeTeam.getStats().addGoalsConceded(this.awayTeamGoal);
                awayTeam.getStats().addGolsFor(this.awayTeamGoal);
                awayTeam.getStats().addGoalsConceded(this.homeTeamGoal);
                homeTeam.addPlayedCLub(awayTeam);                
                if (this.homeTeamGoal > this.awayTeamGoal) {
                    homeTeam.getStats().addWin();
                    awayTeam.getStats().addLosses();                           
                } else if (this.awayTeamGoal > this.homeTeamGoal) {
                    homeTeam.getStats().addLosses();
                    awayTeam.getStats().addWin();
                } else {
                    homeTeam.getStats().addDraw();
                    awayTeam.getStats().addDraw();
                }
            }
            
            private double calculate(double power) {      
                return this.random.nextFloat() + power/100;
            }
            
            @Override
            public void run() {
                lblTimer.setText("'" + this.timer);             
                if (!paused) {
                    ++this.timer;                                     
                    if (this.timer > 90) {
                        this.cancel();
                        lblTimer.setText("Fim de Jogo");                       
                        this.loadStats();
                        btnGoToHome.setVisible(true);
                    }
                    
                    this.homeTeamGoalChance = calculate(awayTeam.getAttackPower()); 
                    this.awayTeamGoalChance = calculate(awayTeam.getAttackPower());  
                    this.chanceDefesahomeTeam = calculate(homeTeam.getDefensePower()); 
                    this.chanceDefesaawayTeam = calculate(awayTeam.getDefensePower());

                    if (this.homeTeamGoalChance > (0.99 + awayTeam.getAttackPower()/100) 
                        && this.chanceDefesaawayTeam < this.homeTeamGoalChance) { 

                        ++this.homeTeamGoal;
                        lblGoalHomeTeam.setText("" + this.homeTeamGoal);                        
                    }
                    if (this.awayTeamGoalChance > (0.99+awayTeam.getAttackPower()/100)
                        && this.awayTeamGoalChance > this.chanceDefesahomeTeam) {

                        ++this.awayTeamGoal;
                        lblGoalAwayTeam.setText("" + this.awayTeamGoal);                        
                    }
                }
            }
        }, 0, 50);
    }
        
    private void loadStatsCPU(Club home, int goalHome, Club away, int goalAway) {
        home.addPlayedCLub(away);          
        home.getStats().addGolsFor(goalHome);
        home.getStats().addGoalsConceded(goalAway);        
      
        away.getStats().addGolsFor(goalAway);
        away.getStats().addGoalsConceded(goalHome);        
        
        if (goalHome > goalAway) {
            home.getStats().addWin();
            away.getStats().addLosses();
        } else if (goalHome < goalAway) {       
            away.getStats().addWin();
            home.getStats().addLosses();            
        } else {
            away.getStats().addDraw();
            home.getStats().addDraw();
        }
        updateDataBase(home);
        updateDataBase(away);
    }
    
    private void otherMatchs() {
        for (int i = 0; i < round.size(); i++) {
            Club home = round.get(i).getHomeTeam();
            Club away = round.get(i).getAwayTeam();
            int goalHome = new Random().nextInt(5);
            int goalAway = new Random().nextInt(5);
            loadStatsCPU(home, goalHome, away, goalAway);
        }
    }
    
    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        this.paused = !this.paused;
        this.btnChangePlayer.setEnabled(paused);
        if (paused == true) {
            this.btnPause.setText("Reiniciar");  
        } else {
            this.btnPause.setText("Pausar");            
        }                
    }//GEN-LAST:event_btnPauseActionPerformed

    private void btnGoToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToHomeActionPerformed
        this.dispose();
        this.clubManagementScreen.setVisible(true);        
    }//GEN-LAST:event_btnGoToHomeActionPerformed
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePlayer;
    private javax.swing.JButton btnGoToHome;
    private javax.swing.JButton btnPause;
    private javax.swing.JLabel lblAwayTeamBadge;
    private javax.swing.JLabel lblAwayTeamName;
    private javax.swing.JLabel lblGoalAwayTeam;
    private javax.swing.JLabel lblGoalHomeTeam;
    private javax.swing.JLabel lblHomeTeamBadge;
    private javax.swing.JLabel lblHomeTeamName;
    private javax.swing.JLabel lblStaticX;
    private javax.swing.JLabel lblTimer;
    private javax.swing.JList<String> listAwayTeamPlayers;
    private javax.swing.JList<String> listHomeTeamPlayers;
    private javax.swing.JList<String> listSubstitutes;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane scrollPaneAwayTeam;
    private javax.swing.JScrollPane scrollPaneHomeTeam;
    private javax.swing.JScrollPane scrollPaneSubstitutes;
    private javax.swing.JPanel topScoreboardPanel;
    // End of variables declaration//GEN-END:variables
}

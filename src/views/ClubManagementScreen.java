package views;

import static classes.MainClass.ROUND;
import static classes.MainClass.clubsDataBase;
import static classes.MainClass.getPlayer;
import classes.club.Club;
import classes.club.Manager;
import classes.club.Player;
import classes.competitions.Match;
import classes.competitions.Schedule;
import classes.competitions.SuperChampions;
import exceptions.ObjectNotFoundException;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

public class ClubManagementScreen extends javax.swing.JFrame { 
    private final Manager manager;     
    private final JPopupMenu menuPopupCast;     
    private JMenuItem menuItem;    
   
    private Schedule calendar;
    private List<Match> otherMatchs;
    private List<Player> startTeam, substitutes;  
    private SuperChampions superChampions;    
    private Club homeTeam, awayTeam;
    private LeaderboardWindow leaderboard;    
    
    
    public ClubManagementScreen(Manager manager) {
        initComponents();      
        this.manager = manager;  
        this.calendar = new Schedule();
        this.menuPopupCast = new JPopupMenu();
        this.superChampions = new SuperChampions(clubsDataBase());    
        this.leaderboard = new LeaderboardWindow(superChampions.getParticipants());
        this.substitutes = new ArrayList<>();
        this.startTeam = new ArrayList<>();
        this.otherMatchs = new ArrayList<>();      
        this.superChampions.loadAllRounds();      
        this.setLocationRelativeTo(null);       
        this.tableCast.setAutoCreateRowSorter(true);  
        initPopupMenuElenco();        
        initAssets();
        initTable();
        initMoney();     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePanel = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        lblPlayGame = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblEmblem = new javax.swing.JLabel();
        lblSearchPlayer = new javax.swing.JLabel();
        lblStaticMoney = new javax.swing.JLabel();
        lblMoney = new javax.swing.JLabel();
        lblStaticMilion = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblStaticStartTeam = new javax.swing.JLabel();
        scrollCast = new javax.swing.JScrollPane();
        tableCast = new javax.swing.JTable();
        lblStartTeam = new javax.swing.JLabel();
        lblStaticMaxStartTeam = new javax.swing.JLabel();
        lblStaticSubstitutes = new javax.swing.JLabel();
        lblSubstitutes = new javax.swing.JLabel();
        lblLeaderbord = new javax.swing.JLabel();
        lblStaticMaxReservas = new javax.swing.JLabel();
        lblManager = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 0, 51));
        setBounds(new java.awt.Rectangle(320, 150, 0, 0));
        setUndecorated(true);
        setResizable(false);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emblems/btnSair.png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        homePanel.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, -1, -1));

        lblPlayGame.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPlayGame.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayGame.setText("Iniciar Partida");
        lblPlayGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlayGameMouseClicked(evt);
            }
        });
        homePanel.add(lblPlayGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 120, 50));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Real Madrid");
        homePanel.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 239, 40));

        lblEmblem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homePanel.add(lblEmblem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 127, 110));

        lblSearchPlayer.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSearchPlayer.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchPlayer.setText("Procurar Jogadores");
        lblSearchPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchPlayerMouseClicked(evt);
            }
        });
        homePanel.add(lblSearchPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 190, 50));

        lblStaticMoney.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticMoney.setForeground(new java.awt.Color(0, 0, 0));
        lblStaticMoney.setText("em caixa");
        homePanel.add(lblStaticMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, -1, 30));

        lblMoney.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblMoney.setForeground(new java.awt.Color(0, 0, 0));
        lblMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMoney.setText("555");
        homePanel.add(lblMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 60, 30));

        lblStaticMilion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticMilion.setForeground(new java.awt.Color(0, 0, 0));
        lblStaticMilion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStaticMilion.setText("Milhões");
        homePanel.add(lblStaticMilion, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 50, 30));

        lblDate.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 0, 0));
        lblDate.setText("00/00/0000");
        homePanel.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, 30));

        lblStaticStartTeam.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticStartTeam.setForeground(new java.awt.Color(0, 0, 0));
        lblStaticStartTeam.setText("Titulares:");
        homePanel.add(lblStaticStartTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 60, -1));

        tableCast.setBackground(new java.awt.Color(255, 255, 255));
        tableCast.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Nome", "Overall", "Posição", "Valor", "Idade", "Salario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCast.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableCast.setInheritsPopupMenu(true);
        tableCast.setRowHeight(18);
        tableCast.setRowMargin(5);
        tableCast.setShowHorizontalLines(false);
        tableCast.setShowVerticalLines(false);
        tableCast.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCastMouseClicked(evt);
            }
        });
        scrollCast.setViewportView(tableCast);
        if (tableCast.getColumnModel().getColumnCount() > 0) {
            tableCast.getColumnModel().getColumn(0).setResizable(false);
            tableCast.getColumnModel().getColumn(0).setPreferredWidth(15);
            tableCast.getColumnModel().getColumn(1).setResizable(false);
            tableCast.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableCast.getColumnModel().getColumn(2).setResizable(false);
            tableCast.getColumnModel().getColumn(2).setPreferredWidth(10);
            tableCast.getColumnModel().getColumn(3).setResizable(false);
            tableCast.getColumnModel().getColumn(3).setPreferredWidth(50);
            tableCast.getColumnModel().getColumn(4).setResizable(false);
            tableCast.getColumnModel().getColumn(4).setPreferredWidth(20);
            tableCast.getColumnModel().getColumn(5).setResizable(false);
            tableCast.getColumnModel().getColumn(5).setPreferredWidth(15);
            tableCast.getColumnModel().getColumn(6).setResizable(false);
            tableCast.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        homePanel.add(scrollCast, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 550, 380));

        lblStartTeam.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStartTeam.setForeground(new java.awt.Color(0, 0, 0));
        lblStartTeam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStartTeam.setText("0");
        homePanel.add(lblStartTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        lblStaticMaxStartTeam.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticMaxStartTeam.setForeground(new java.awt.Color(0, 0, 0));
        lblStaticMaxStartTeam.setText("/ 11");
        homePanel.add(lblStaticMaxStartTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        lblStaticSubstitutes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticSubstitutes.setForeground(new java.awt.Color(0, 0, 0));
        lblStaticSubstitutes.setText("Reservas:");
        homePanel.add(lblStaticSubstitutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 60, -1));

        lblSubstitutes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblSubstitutes.setForeground(new java.awt.Color(0, 0, 0));
        lblSubstitutes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubstitutes.setText("0");
        homePanel.add(lblSubstitutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 10, -1));

        lblLeaderbord.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblLeaderbord.setForeground(new java.awt.Color(0, 0, 0));
        lblLeaderbord.setText("Classficação");
        lblLeaderbord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLeaderbordMouseClicked(evt);
            }
        });
        homePanel.add(lblLeaderbord, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, 50));

        lblStaticMaxReservas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticMaxReservas.setForeground(new java.awt.Color(0, 0, 0));
        lblStaticMaxReservas.setText("/ 7");
        homePanel.add(lblStaticMaxReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        lblManager.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblManager.setForeground(new java.awt.Color(0, 0, 0));
        lblManager.setText("Manager");
        homePanel.add(lblManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 130, 20));
        homePanel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void initAssets(){    
        Color foreground = manager.getClub().getForeground();       
        this.lblDate.setText(this.calendar.getCurrentDate());
        this.lblDate.setForeground(foreground);
        this.lblTitle.setText(manager.getClub().getName());
        this.lblTitle.setForeground(foreground);
        this.lblMoney.setForeground(foreground);
        this.lblEmblem.setIcon(manager.getClub().getEmblemSmall());
        this.lblManager.setText(manager.getName());
        this.lblManager.setForeground(foreground);
        this.background.setIcon(manager.getClub().getBackground());
        this.lblPlayGame.setForeground(foreground);
        this.lblStartTeam.setForeground(foreground);
        this.lblLeaderbord.setForeground(foreground);
        this.lblSubstitutes.setForeground(foreground);
        this.lblStaticMoney.setForeground(foreground);
        this.lblSearchPlayer.setForeground(foreground);
        this.lblStaticMilion.setForeground(foreground);
        this.lblStaticStartTeam.setForeground(foreground);
        this.lblStaticMaxReservas.setForeground(foreground);
        this.lblStaticSubstitutes.setForeground(foreground);
        this.lblStaticMaxStartTeam.setForeground(foreground);      
    }
    
    private void initTable() {
        DefaultTableModel table =(DefaultTableModel) this.tableCast.getModel();
        this.startTeam.removeAll(this.startTeam);
        this.substitutes.removeAll(this.substitutes);
        List<Player> ob = new ArrayList();
        for (int i = 0; i < clubsDataBase().size(); i++) {
            if (clubsDataBase().get(i).getName().equals(this.manager.getClub().getName())) {
                ob = clubsDataBase().get(i).getPlayers();
            }
        }      
        table.setRowCount(0);
        for (int i = 0; i < ob.size(); i++) {
            Player um = ob.get(i);            
            Object[] club = {
                "---",
                um.getName(),
                (int) um.getOverall(), 
                um.getPosition(), 
                (int)um.getMarketValue()+"Mi", 
                um.getAge(),
                (int)um.getSalary()+"Mi/ano",
            };
            table.addRow(club);            
        }        
    }
        
    private void initMoney() {
        this.lblMoney.setText(""+(int)this.manager.getClub().getMoney());
    }
    
    private void letFreePlayer() {
         //Rescindir contrato com jogador//
        //<editor-fold desc="Method">
        this.menuItem = new JMenuItem ("Rescindir contrato");        
        this.menuItem.getAccessibleContext().setAccessibleDescription("rescindir contrato");
        this.menuItem.addActionListener((ActionEvent e) -> {          

            int index = this.tableCast.getSelectedRow();
            String playerName = (String)this.tableCast.getValueAt(index, 1);
            String message = "Rescindir contrato com " + playerName+"?";
            int resp = JOptionPane.showConfirmDialog(this, message, "Selecione", 2);
            
            if (resp == 0) {      
                try {
                    this.manager.LetFreePlayer(getPlayer(playerName));
                } catch (ObjectNotFoundException ex) {
                    ex.printStackTrace();
                }
                initTable();  
                initMoney();
            }               
        });
        this.menuPopupCast.add(menuItem);
        //</editor-fold>
    }
    
    private void sellPlayer() {
        //Vender jogador//
        //<editor-fold desc="Method">
        this.menuItem = new JMenuItem ("Vender Jogador");
        this.menuItem.getAccessibleContext().setAccessibleDescription("Vender Jogador");
        this.menuItem.addActionListener((ActionEvent evt) -> {
            
            int index = this.tableCast.getSelectedRow();
            String playerName = (String) this.tableCast.getValueAt(index, 1);
            int resp = JOptionPane.showConfirmDialog(this, 
                    "Vender "+playerName+"?", "Selecione uma opçao", 2);
            
            if (resp == 0) {
                try {
                    Player player = getPlayer(playerName);                    
                    Club club = this.manager.sellPlayer(player);
                    
                    String message = player.getName()+" foi vendido para o "+club.getName()
                            +" por "+ (int)(player.getMarketValue()*1.3)+" Milhões";
                            
                    JOptionPane.showMessageDialog(this, message);
                    initTable();
                    initMoney();
                } catch (ObjectNotFoundException ex) {
                    Logger.getLogger(ClubManagementScreen.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showConfirmDialog(this, "Esse jogador nao está mais no seu clube!");
                }
            }
            
        });
        this.menuPopupCast.add(menuItem);
        //</editor-fold>
    }    
      
    private void initPopupMenuElenco(){  
        letFreePlayer();
        sellPlayer();        
    }
          
    private void loadRivals() {        
     
        Match[] matchs = this.superChampions.getMatchs();
        this.otherMatchs = new ArrayList<>();
        String thisClub = manager.getClub().getName();        
        for (Match match : matchs) {
            String home = match.getHomeTeam().getName();
            String away = match.getAwayTeam().getName();
            if (home.equals(thisClub)){
                this.homeTeam = match.getHomeTeam();
                this.awayTeam = match.getAwayTeam();
                homeTeam.setStartingPlayers(startTeam);
                homeTeam.setSubstitutes(substitutes);
            } else if (away.equals(thisClub)) {
                this.homeTeam = match.getHomeTeam();
                this.awayTeam = match.getAwayTeam();
                awayTeam.setStartingPlayers(startTeam);
                awayTeam.setSubstitutes(substitutes);
            }else {
                this.otherMatchs.add(match);
            }
        }
       
    }
        
    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void tableCastMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCastMouseClicked
        int x = MouseInfo.getPointerInfo().getLocation().x;
        int y = MouseInfo.getPointerInfo().getLocation().y;
        if(evt.getButton() == 3){
            this.menuPopupCast.show(this, x-85, y-60);
        }
        
        if (evt.getButton() == 1) {
            int index = this.tableCast.getSelectedRow();
            String playerName = (String) this.tableCast.getValueAt(index, 1);
            Object state = this.tableCast.getValueAt(index, 0);            
            Player player = null;
            try {
                player = getPlayer(playerName);
            } catch (ObjectNotFoundException ex) {
                Logger.getLogger(ClubManagementScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (state.equals("---")) {
                if (this.startTeam.size() < 11) {
                    this.tableCast.setValueAt("Titular", index, 0);
                    this.startTeam.add(player);                    
                } else if (this.substitutes.size() < 7) {
                    this.tableCast.setValueAt("Reserva", index, 0);
                    this.startTeam.remove(player);
                    this.substitutes.add(player);
                }
            }else if (state.equals("Titular")) {
                if (this.substitutes.size() <7) {
                    this.tableCast.setValueAt("Reserva", index, 0);
                    this.startTeam.remove(player);
                    this.substitutes.add(player);                    
                } else {
                    this.tableCast.setValueAt("---", index, 0);
                    this.startTeam.remove(player);
                }
            } else if (state.equals("Reserva")) {
                this.tableCast.setValueAt("---", index, 0);
                this.substitutes.remove(player);
            }
            this.lblStartTeam.setText(""+this.startTeam.size());
            this.lblSubstitutes.setText(""+this.substitutes.size());
        }
        
    }//GEN-LAST:event_tableCastMouseClicked

    private void lblSearchPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchPlayerMouseClicked
        new PlayerSearcherWindow(this.manager).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblSearchPlayerMouseClicked

    private void lblLeaderbordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLeaderbordMouseClicked
        this.leaderboard.init();
        this.leaderboard.setVisible(true);     
    }//GEN-LAST:event_lblLeaderbordMouseClicked

    private void lblPlayGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlayGameMouseClicked
        if (startTeam.size() == 11) {                    
        loadRivals();           
        this.lblDate.setText(this.calendar.getNextDate());
        MatchDayScreen matchDay = new MatchDayScreen(homeTeam, awayTeam, otherMatchs, this); 
        matchDay.setVisible(true);             
            System.out.println(ROUND);
            if (ROUND == 10) {
                matchDay.setLeaderboard(leaderboard);
                matchDay.setYour(this.manager);
            }
        } else if(this.startTeam.size() < 11){
            String message = "Selecione ao menos 11 titulares!";
            JOptionPane.showMessageDialog(this, message, "Alerta!", 0);
        }
    }//GEN-LAST:event_lblPlayGameMouseClicked

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
      
    }//GEN-LAST:event_formWindowStateChanged
 
    //<editor-fold desc="Variaveis imutaveis">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnExit;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEmblem;
    private javax.swing.JLabel lblLeaderbord;
    private javax.swing.JLabel lblManager;
    private javax.swing.JLabel lblMoney;
    private javax.swing.JLabel lblPlayGame;
    private javax.swing.JLabel lblSearchPlayer;
    private javax.swing.JLabel lblStartTeam;
    private javax.swing.JLabel lblStaticMaxReservas;
    private javax.swing.JLabel lblStaticMaxStartTeam;
    private javax.swing.JLabel lblStaticMilion;
    private javax.swing.JLabel lblStaticMoney;
    private javax.swing.JLabel lblStaticStartTeam;
    private javax.swing.JLabel lblStaticSubstitutes;
    private javax.swing.JLabel lblSubstitutes;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollCast;
    private javax.swing.JTable tableCast;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>

}

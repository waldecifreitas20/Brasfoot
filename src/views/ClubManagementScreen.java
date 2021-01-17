package views;

import static classes.MainClass.clubsDataBase;
import static classes.MainClass.getPlayer;
import static classes.MainClass.playersDataBase;
import classes.club.BaseClub;
import classes.club.Club;
import classes.club.FreePlayer;
import classes.club.Manager;
import classes.club.Player;
import classes.competicoes.Leaderboard;
import classes.competicoes.Schedule;
import classes.competicoes.SuperChampions;
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
    private final Manager 
        manager;    
    private final JPopupMenu 
        menuPopupCast = new JPopupMenu(), 
        menuPopupSearch = new JPopupMenu();    
    private JMenuItem 
        menuItem = null;
    private String 
        data;
    private ArrayList<Player> 
            startTeam = new ArrayList(),
            substitutes = new ArrayList();
    private Leaderboard 
            leaderboard = new Leaderboard(clubsDataBase()) ;
    private SuperChampions superChampions = new SuperChampions(clubsDataBase());
    private Club homeTeam, awayTeam;
    
    public ClubManagementScreen(Manager manager) {
        initComponents();        
        this.manager = manager;
        this.frameLeaderboard.setVisible(false);
        this.frameSearch.setVisible(false);         
        this.setLocationRelativeTo(null);       
        initAssets();
        initTable();
        //loadRodada();
        this.tableCast.setAutoCreateRowSorter(true);
        this.tableSearch.setAutoCreateRowSorter(true);
        initPopupMenuElenco();        
        initMoney();
        JOptionPane.showMessageDialog(this, "Seja bem vindo ao "+ this.manager.getClub().getName()+ ","
                + " " +this.manager.getName()+
               ".\nAcreditamos que você possa levar esse grande clube"
                       + "\nao titulo dessa temporada. Boa sorte!"
                       + "\n\n              Atenciosamente, a diretoria.", "Boas Vindas!", 1
        
        
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home = new javax.swing.JPanel();
        frameLeaderboard = new javax.swing.JInternalFrame();
        btnQuitLeaderboard = new javax.swing.JLabel();
        scrollTableLeaderboard = new javax.swing.JScrollPane();
        tableLeaderboard = new javax.swing.JTable();
        frameSearch = new javax.swing.JInternalFrame();
        panelSearch = new javax.swing.JPanel();
        namePlayerInput = new javax.swing.JTextField();
        lblStaticName = new javax.swing.JLabel();
        btnSearchFor = new javax.swing.JButton();
        scrollPaneSearchTable = new javax.swing.JScrollPane();
        tableSearch = new javax.swing.JTable();
        btnQuitSearchWindow = new javax.swing.JLabel();
        backgroundSearchWindow = new javax.swing.JLabel();
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

        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        frameLeaderboard.setTitle("Classificação");
        frameLeaderboard.setVisible(true);

        btnQuitLeaderboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnQuitLeaderboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emblems/btnSair.png"))); // NOI18N
        btnQuitLeaderboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitLeaderboardMouseClicked(evt);
            }
        });

        tableLeaderboard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "P", "Clube", "Pts", "J", "V", "E", "D", "GF", "GS", "SG"
            }
        ));
        scrollTableLeaderboard.setViewportView(tableLeaderboard);
        if (tableLeaderboard.getColumnModel().getColumnCount() > 0) {
            tableLeaderboard.getColumnModel().getColumn(0).setPreferredWidth(1);
            tableLeaderboard.getColumnModel().getColumn(1).setResizable(false);
            tableLeaderboard.getColumnModel().getColumn(1).setPreferredWidth(500);
        }

        javax.swing.GroupLayout frameLeaderboardLayout = new javax.swing.GroupLayout(frameLeaderboard.getContentPane());
        frameLeaderboard.getContentPane().setLayout(frameLeaderboardLayout);
        frameLeaderboardLayout.setHorizontalGroup(
            frameLeaderboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLeaderboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameLeaderboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTableLeaderboard, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameLeaderboardLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnQuitLeaderboard)))
                .addContainerGap())
        );
        frameLeaderboardLayout.setVerticalGroup(
            frameLeaderboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLeaderboardLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnQuitLeaderboard, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollTableLeaderboard, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        home.add(frameLeaderboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 440, 250));

        frameSearch.setTitle("Procurar Jogador");
        frameSearch.setVisible(true);

        panelSearch.setBackground(new java.awt.Color(102, 102, 102));
        panelSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namePlayerInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namePlayerInputActionPerformed(evt);
            }
        });
        panelSearch.add(namePlayerInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 60, 177, -1));

        lblStaticName.setBackground(new java.awt.Color(0, 0, 0));
        lblStaticName.setForeground(new java.awt.Color(255, 255, 255));
        lblStaticName.setText("Nome:");
        panelSearch.add(lblStaticName, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 38, -1, -1));

        btnSearchFor.setText("Pesquisar");
        btnSearchFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchForActionPerformed(evt);
            }
        });
        panelSearch.add(btnSearchFor, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 102, 177, -1));

        tableSearch.setForeground(new java.awt.Color(0, 0, 0));
        tableSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Status", "Posição", "Overall", "Valor", "Idade", "Salario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSearch.setShowHorizontalLines(false);
        tableSearch.setShowVerticalLines(false);
        tableSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSearchMouseClicked(evt);
            }
        });
        scrollPaneSearchTable.setViewportView(tableSearch);
        if (tableSearch.getColumnModel().getColumnCount() > 0) {
            tableSearch.getColumnModel().getColumn(0).setResizable(false);
            tableSearch.getColumnModel().getColumn(1).setResizable(false);
            tableSearch.getColumnModel().getColumn(2).setPreferredWidth(10);
            tableSearch.getColumnModel().getColumn(3).setResizable(false);
            tableSearch.getColumnModel().getColumn(3).setPreferredWidth(5);
            tableSearch.getColumnModel().getColumn(4).setResizable(false);
            tableSearch.getColumnModel().getColumn(4).setPreferredWidth(10);
            tableSearch.getColumnModel().getColumn(5).setResizable(false);
            tableSearch.getColumnModel().getColumn(5).setPreferredWidth(5);
            tableSearch.getColumnModel().getColumn(6).setResizable(false);
            tableSearch.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        panelSearch.add(scrollPaneSearchTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 166, 790, 276));

        btnQuitSearchWindow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnQuitSearchWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emblems/btnSair.png"))); // NOI18N
        btnQuitSearchWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitSearchWindowMouseClicked(evt);
            }
        });
        panelSearch.add(btnQuitSearchWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, -1));
        panelSearch.add(backgroundSearchWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 480));

        javax.swing.GroupLayout frameSearchLayout = new javax.swing.GroupLayout(frameSearch.getContentPane());
        frameSearch.getContentPane().setLayout(frameSearchLayout);
        frameSearchLayout.setHorizontalGroup(
            frameSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(frameSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(frameSearchLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        frameSearchLayout.setVerticalGroup(
            frameSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(frameSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(frameSearchLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        home.add(frameSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 910, -1));

        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emblems/btnSair.png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        home.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, -1, -1));

        lblPlayGame.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPlayGame.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayGame.setText("Iniciar Partida");
        lblPlayGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlayGameMouseClicked(evt);
            }
        });
        home.add(lblPlayGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 120, 50));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Real Madrid");
        home.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 239, 40));

        lblEmblem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.add(lblEmblem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 127, 110));

        lblSearchPlayer.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSearchPlayer.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchPlayer.setText("Procurar Jogadores");
        lblSearchPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchPlayerMouseClicked(evt);
            }
        });
        home.add(lblSearchPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 190, 50));

        lblStaticMoney.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticMoney.setForeground(new java.awt.Color(0, 0, 0));
        lblStaticMoney.setText("em caixa");
        home.add(lblStaticMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, -1, 30));

        lblMoney.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblMoney.setForeground(new java.awt.Color(0, 0, 0));
        lblMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMoney.setText("555");
        home.add(lblMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 60, 30));

        lblStaticMilion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticMilion.setForeground(new java.awt.Color(0, 0, 0));
        lblStaticMilion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStaticMilion.setText("Milhões");
        home.add(lblStaticMilion, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 50, 30));

        lblDate.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 0, 0));
        lblDate.setText("00/00/0000");
        home.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, 30));

        lblStaticStartTeam.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticStartTeam.setForeground(new java.awt.Color(0, 0, 0));
        lblStaticStartTeam.setText("Titulares:");
        home.add(lblStaticStartTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 60, -1));

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

        home.add(scrollCast, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 550, 380));

        lblStartTeam.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStartTeam.setForeground(new java.awt.Color(0, 0, 0));
        lblStartTeam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStartTeam.setText("0");
        home.add(lblStartTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        lblStaticMaxStartTeam.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticMaxStartTeam.setForeground(new java.awt.Color(0, 0, 0));
        lblStaticMaxStartTeam.setText("/ 11");
        home.add(lblStaticMaxStartTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        lblStaticSubstitutes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticSubstitutes.setForeground(new java.awt.Color(0, 0, 0));
        lblStaticSubstitutes.setText("Reservas:");
        home.add(lblStaticSubstitutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 60, -1));

        lblSubstitutes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblSubstitutes.setForeground(new java.awt.Color(0, 0, 0));
        lblSubstitutes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubstitutes.setText("0");
        home.add(lblSubstitutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 10, -1));

        lblLeaderbord.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblLeaderbord.setForeground(new java.awt.Color(0, 0, 0));
        lblLeaderbord.setText("Classficação");
        lblLeaderbord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLeaderbordMouseClicked(evt);
            }
        });
        home.add(lblLeaderbord, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, 50));

        lblStaticMaxReservas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticMaxReservas.setForeground(new java.awt.Color(0, 0, 0));
        lblStaticMaxReservas.setText("/ 7");
        home.add(lblStaticMaxReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        lblManager.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblManager.setForeground(new java.awt.Color(0, 0, 0));
        lblManager.setText("Manager");
        home.add(lblManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 130, 20));
        home.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void initAssets(){    
        Color foreground = manager.getClub().getForeground();
        this.data = new Schedule().getCurrentDate();
        this.lblDate.setText(data);
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
                    "Vender "+playerName+"?", "Selecione uma opção", 2);
            
            if (resp == 0) {
                try {
                    Player player = getPlayer(playerName);                    
                    Club club = this.manager.sellPlayer(player);
                    
                    String message = player.getName()+" foi vendido para o"+club.getName()
                            +" por "+ (int)(player.getMarketValue()*1.3)+" Milhões";
                            
                    JOptionPane.showMessageDialog(this, message);
                    initTable();
                    initMoney();
                } catch (ObjectNotFoundException ex) {
                    Logger.getLogger(ClubManagementScreen.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showConfirmDialog(this, "Esse jogador não está mais no seu clube!");
                }
            }
            
        });
        this.menuPopupCast.add(menuItem);
        //</editor-fold>
    }
    
    private void buyPlayer(BaseClub club, String playerName) {
        //Comprar Jogador//        
        //<editor-fold desc="Method">
        this.menuItem = new JMenuItem("Contratar");
        this.menuItem.getAccessibleContext().setAccessibleDescription("Contratar");                   
       
        if(club.getName().equals(this.manager.getClub().getName())) {
            this.menuItem.setEnabled(false);                 
        }         
        
        this.menuItem.addActionListener((ActionEvent evt) -> {                
            if (this.menuItem.isEnabled()) {
                if (club.getName().equals("Sem Clube")) {
                    try {
                        Player player = getPlayer(playerName);
                        Club.NegotiationResponse resposta = this.manager.negotiateWithFreePlayer(player);
                        JOptionPane.showMessageDialog(this, resposta.getResponse());
                    } catch (ObjectNotFoundException ex) {
                        ex.printStackTrace();
                    }
                }else {
                    try {
                        String input = JOptionPane.showInputDialog(
                                this,
                                "Sua proposta por "+playerName+"(em Milhões):"
                        );                       
                       
                        double offer = Double.parseDouble(input);                        
                        Player player = getPlayer(playerName);
                        Club.NegotiationResponse response;
                        response = this.manager.buyPlayer((Club)club, player, offer);
                        JOptionPane.showMessageDialog(this, response.getResponse());
                    } catch (ObjectNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (NumberFormatException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(this, "Digite um valor válido!", "!!!", 2);
                    }
                }
                initMoney();
                initTable();
                this.scrollCast.setVisible(false);                 
            }
        });
        
        this.menuPopupSearch.removeAll();
        this.menuPopupSearch.add(menuItem);
        
        //</editor-fold>
    }
    
    private void initPopupMenuElenco(){  
        letFreePlayer();
        sellPlayer();        
    }
    
    private void initPopupMenuPesquisar(BaseClub club, String playerName) {
        buyPlayer(club, playerName);
    }        
        
    private void loadRodada() {
     /*
        this.supeLiga.sortearRodada();
        for (int i = 0; i < 3; i++) {
          
            Clube mandante = this.supeLiga.getRodada()[i].getMandante();
            Clube awayTeam = this.supeLiga.getRodada()[i].getawayTeam();
            if (this.manager.getClub().equals(mandante)) {               
                this.homeTeam = this.manager.getClub();
                this.awayTeam = awayTeam;             
            } else if (this.manager.getClub().equals(awayTeam)) {
                this.homeTeam = mandante;
                this.awayTeam = this.manager.getClub();
              
            }
        }
      
       */
    }
            
    private void btnQuitSearchWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitSearchWindowMouseClicked
        this.frameSearch.setVisible(false);
        this.scrollCast.setVisible(true);
    }//GEN-LAST:event_btnQuitSearchWindowMouseClicked

    private void namePlayerInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namePlayerInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namePlayerInputActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnSearchForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchForActionPerformed
        DefaultTableModel table = (DefaultTableModel) this.tableSearch.getModel();       
        table.setRowCount(0);
        String nameSearched = this.namePlayerInput.getText().trim().toLowerCase();
        List<Player> all = playersDataBase();
        
        for (int i = 0; i < all.size(); i++) {
            String nameFound = all.get(i).getName().toLowerCase();
            if (nameFound.contains(nameSearched)) {                
                Object[] players = {
                    all.get(i).getName(), 
                    all.get(i).getStatus(), 
                    all.get(i).getPosition(),
                    (int)all.get(i).getOverall(),
                    (int)all.get(i).getMarketValue()+"Mi",
                    all.get(i).getAge(),
                    (int)all.get(i).getSalary()+"Mi/ano"
                };
                table.addRow(players);
            }
        }       
    }//GEN-LAST:event_btnSearchForActionPerformed

    private void tableSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSearchMouseClicked
        int posicX = MouseInfo.getPointerInfo().getLocation().x;
        int posicY = MouseInfo.getPointerInfo().getLocation().y;
        if (evt.getButton() == 3) {
            String playerName = (String) this.tableSearch.getValueAt(this.tableSearch.getSelectedRow(), 0);
            String clubName = (String) this.tableSearch.getValueAt(this.tableSearch.getSelectedRow(), 1);
            BaseClub club = null;
            
            for (int i = 0; i < clubsDataBase().size(); i++) {
                if (clubName.equals(clubsDataBase().get(i).getName())) {
                    club = clubsDataBase().get(i);
                }        
            }
            if (club == null) {
                club = new FreePlayer();
            }        
            
            initPopupMenuPesquisar(club, playerName);
            this.menuPopupSearch.show(this, posicX-85, posicY-60);
        }
    }//GEN-LAST:event_tableSearchMouseClicked

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
        DefaultTableModel table = (DefaultTableModel) this.tableSearch.getModel();       
        table.setRowCount(0);
        this.frameSearch.setVisible(true);
        this.scrollCast.setVisible(false);
    }//GEN-LAST:event_lblSearchPlayerMouseClicked

    private void lblLeaderbordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLeaderbordMouseClicked
        DefaultTableModel table = (DefaultTableModel) this.tableLeaderboard.getModel();
        table.setRowCount(0);
        this.frameLeaderboard.setVisible(true);
        List<Club> clubesStats = this.leaderboard.getParticipants();
        for (int i = 0; i < clubsDataBase().size(); i++) {
            Object[] tabela = {
                i+1,
                clubesStats.get(i).getName(),
                clubesStats.get(i).getStats().getPoints(),
                clubesStats.get(i).getStats().getPlayed(),
                clubesStats.get(i).getStats().getWins(),
                clubesStats.get(i).getStats().getDraws(),
                clubesStats.get(i).getStats().getLosses(),
                clubesStats.get(i).getStats().getGolsFor(),
                clubesStats.get(i).getStats().getGoalsConceded(),
                clubesStats.get(i).getStats().getGoalDifference()
            }; 
            table.addRow(tabela);
        }
    }//GEN-LAST:event_lblLeaderbordMouseClicked

    private void btnQuitLeaderboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitLeaderboardMouseClicked
        this.frameLeaderboard.setVisible(false);
    }//GEN-LAST:event_btnQuitLeaderboardMouseClicked

    private void lblPlayGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlayGameMouseClicked
        
        if (this.startTeam.size() == 11) {
            this.loadRodada();
            if (this.homeTeam == null || this.awayTeam == null) {
                this.setVisible(false);
                System.out.println("deu merda aqui krl");
            } else {
               
              //  new MachDay(this.homeTeam, this.awayTeam, this).setVisible(true);
                
            }
        } else if(this.startTeam.size() < 11){
            JOptionPane.showMessageDialog(this, "Selecione ao menos 11 titulares!", "Alerta!", 0);
        }
    }//GEN-LAST:event_lblPlayGameMouseClicked
    
    //<editor-fold desc="Variaveis imutaveis">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel backgroundSearchWindow;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnQuitLeaderboard;
    private javax.swing.JLabel btnQuitSearchWindow;
    private javax.swing.JButton btnSearchFor;
    private javax.swing.JInternalFrame frameLeaderboard;
    private javax.swing.JInternalFrame frameSearch;
    private javax.swing.JPanel home;
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
    private javax.swing.JLabel lblStaticName;
    private javax.swing.JLabel lblStaticStartTeam;
    private javax.swing.JLabel lblStaticSubstitutes;
    private javax.swing.JLabel lblSubstitutes;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField namePlayerInput;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JScrollPane scrollCast;
    private javax.swing.JScrollPane scrollPaneSearchTable;
    private javax.swing.JScrollPane scrollTableLeaderboard;
    private javax.swing.JTable tableCast;
    private javax.swing.JTable tableLeaderboard;
    private javax.swing.JTable tableSearch;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>

}

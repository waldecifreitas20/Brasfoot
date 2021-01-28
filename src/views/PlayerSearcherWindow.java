package views;


import static classes.MainClass.clubsDataBase;
import static classes.MainClass.getClub;
import static classes.MainClass.getPlayer;
import static classes.MainClass.playersDataBase;
import classes.club.BaseClub;
import classes.club.Club;
import classes.club.FreePlayer;
import classes.club.Manager;
import classes.club.Player;
import exceptions.ObjectNotFoundException;
import java.awt.MouseInfo;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PlayerSearcherWindow extends javax.swing.JFrame {
    private final JPopupMenu menu; 
    private JMenuItem menuItem;
    private Manager manager;
    
    public PlayerSearcherWindow(Manager manager) {
        initComponents();      
        this.manager = manager;
        this.setLocationRelativeTo(this);
       
        this.searchResultsTable.setAutoCreateRowSorter(true);
        initInputs();
        this.lblFound.setVisible(false);
        this.lblStaticFound.setVisible(false);
        this.menu = new JPopupMenu();
        this.setAlwaysOnTop(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        topSearchInternalPanel = new javax.swing.JPanel();
        lblStaticName = new javax.swing.JLabel();
        clubNameInput = new javax.swing.JTextField();
        lblStaticClub = new javax.swing.JLabel();
        playerNameInput = new javax.swing.JTextField();
        lblStaticPostition = new javax.swing.JLabel();
        lblStaticOver = new javax.swing.JLabel();
        overInput = new javax.swing.JSlider();
        lblStaticAge = new javax.swing.JLabel();
        ageInput = new javax.swing.JSlider();
        lblStaticValue = new javax.swing.JLabel();
        marketValueInput = new javax.swing.JSlider();
        positionInput = new javax.swing.JComboBox<>();
        lblOver = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblMarketValue = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        checkBoxMarketValue = new javax.swing.JCheckBox();
        checkBoxOver = new javax.swing.JCheckBox();
        checkBoxAge = new javax.swing.JCheckBox();
        lblFound = new javax.swing.JLabel();
        lblStaticFound = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchResultsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentPanel.setOpaque(false);

        topSearchInternalPanel.setOpaque(false);
        topSearchInternalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStaticName.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticName.setForeground(new java.awt.Color(255, 255, 255));
        lblStaticName.setText("Nome:");
        topSearchInternalPanel.add(lblStaticName, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 22, -1, -1));
        topSearchInternalPanel.add(clubNameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 18, 202, 25));

        lblStaticClub.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticClub.setForeground(new java.awt.Color(255, 255, 255));
        lblStaticClub.setText("Clube:");
        topSearchInternalPanel.add(lblStaticClub, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 22, -1, -1));
        topSearchInternalPanel.add(playerNameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 17, 200, 26));

        lblStaticPostition.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticPostition.setForeground(new java.awt.Color(255, 255, 255));
        lblStaticPostition.setText("Posição");
        topSearchInternalPanel.add(lblStaticPostition, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 22, -1, -1));

        lblStaticOver.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticOver.setForeground(new java.awt.Color(255, 255, 255));
        lblStaticOver.setText("Overall:");
        topSearchInternalPanel.add(lblStaticOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 71, -1, -1));

        overInput.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                overInputStateChanged(evt);
            }
        });
        topSearchInternalPanel.add(overInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 71, -1, -1));

        lblStaticAge.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticAge.setForeground(new java.awt.Color(255, 255, 255));
        lblStaticAge.setText("Idade:");
        topSearchInternalPanel.add(lblStaticAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 71, -1, -1));

        ageInput.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ageInputStateChanged(evt);
            }
        });
        topSearchInternalPanel.add(ageInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 71, -1, -1));

        lblStaticValue.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticValue.setForeground(new java.awt.Color(255, 255, 255));
        lblStaticValue.setText("Valor:");
        topSearchInternalPanel.add(lblStaticValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 71, -1, -1));

        marketValueInput.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                marketValueInputStateChanged(evt);
            }
        });
        topSearchInternalPanel.add(marketValueInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 66, 200, 20));

        positionInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionInputActionPerformed(evt);
            }
        });
        topSearchInternalPanel.add(positionInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 17, 211, -1));

        lblOver.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblOver.setForeground(new java.awt.Color(255, 255, 255));
        lblOver.setText("100");
        topSearchInternalPanel.add(lblOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 71, -1, -1));

        lblAge.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblAge.setForeground(new java.awt.Color(255, 255, 255));
        lblAge.setText("42");
        topSearchInternalPanel.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 71, -1, -1));

        lblMarketValue.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblMarketValue.setForeground(new java.awt.Color(255, 255, 255));
        lblMarketValue.setText("999Mi");
        topSearchInternalPanel.add(lblMarketValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 71, 40, -1));

        btnSearch.setText("Pesquisar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        topSearchInternalPanel.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 139, 190, -1));

        checkBoxMarketValue.setBackground(new java.awt.Color(0, 0, 70));
        checkBoxMarketValue.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxMarketValue.setText("Qualquer Valor de mercado");
        topSearchInternalPanel.add(checkBoxMarketValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 230, 20));

        checkBoxOver.setBackground(new java.awt.Color(0, 0, 102));
        checkBoxOver.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxOver.setText("Qualquer overall");
        topSearchInternalPanel.add(checkBoxOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 20));

        checkBoxAge.setBackground(new java.awt.Color(0, 0, 92));
        checkBoxAge.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxAge.setText("Qualquer idade");
        checkBoxAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAgeActionPerformed(evt);
            }
        });
        topSearchInternalPanel.add(checkBoxAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 130, 20));

        lblFound.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblFound.setForeground(new java.awt.Color(255, 255, 255));
        lblFound.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFound.setText("15621");
        topSearchInternalPanel.add(lblFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 160, 50, -1));

        lblStaticFound.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticFound.setForeground(new java.awt.Color(255, 255, 255));
        lblStaticFound.setText("jogadores encontrados");
        topSearchInternalPanel.add(lblStaticFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, -1, -1));

        searchResultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Clube", "Over", "Posição", "Valor (em milhões)", "Salário (Mi/ano)", "Idade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
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
        searchResultsTable.setShowHorizontalLines(false);
        searchResultsTable.setShowVerticalLines(false);
        searchResultsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchResultsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(searchResultsTable);
        if (searchResultsTable.getColumnModel().getColumnCount() > 0) {
            searchResultsTable.getColumnModel().getColumn(0).setResizable(false);
            searchResultsTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            searchResultsTable.getColumnModel().getColumn(1).setResizable(false);
            searchResultsTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            searchResultsTable.getColumnModel().getColumn(2).setResizable(false);
            searchResultsTable.getColumnModel().getColumn(3).setResizable(false);
            searchResultsTable.getColumnModel().getColumn(4).setResizable(false);
            searchResultsTable.getColumnModel().getColumn(5).setResizable(false);
            searchResultsTable.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fechar[X]");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(topSearchInternalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topSearchInternalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        getContentPane().add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 630));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgrounds/background champions.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void positionInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionInputActionPerformed

    private void overInputStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_overInputStateChanged
        String overInputTxt = "" + this.overInput.getValue();
        this.lblOver.setText(overInputTxt);
    }//GEN-LAST:event_overInputStateChanged

    private void ageInputStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ageInputStateChanged
        String ageTxt = "" + this.ageInput.getValue();
        this.lblAge.setText(ageTxt);
    }//GEN-LAST:event_ageInputStateChanged

    private void marketValueInputStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_marketValueInputStateChanged
        String marketValueTxt = "" + this.marketValueInput.getValue();
        this.lblMarketValue.setText(marketValueTxt+"Mi");
    }//GEN-LAST:event_marketValueInputStateChanged

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        JTable table = this.searchResultsTable;
        DefaultTableModel searchTable = (DefaultTableModel) table.getModel();
        searchTable.setRowCount(0);
        List<Player> allPlayers = playersDataBase();
        int playersFound = 0;
        for (int i = 0; i < allPlayers.size(); i++) {
            if (checkParameters(allPlayers.get(i))) {
                Player player = allPlayers.get(i);                
                Object[] data = {
                    player.getName(),
                    player.getStatus(),
                    (int)player.getOverall(),
                    player.getPosition(),
                    (int) player.getMarketValue(),
                    (int)player.getSalary(),
                    player.getAge()
                };
                playersFound++;
                searchTable.addRow(data);
            }
        }   
        this.lblStaticFound.setVisible(true);
        this.lblFound.setVisible(true);
        this.lblFound.setText(""+playersFound);
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void searchResultsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchResultsTableMouseClicked
        int button = evt.getButton();      
        if (button == 3) {
            int x = MouseInfo.getPointerInfo().getLocation().x;
            int y = MouseInfo.getPointerInfo().getLocation().y;    
            int row = this.searchResultsTable.getSelectedRow();
            String clubName = (String) this.searchResultsTable.getValueAt(row, 1);
            BaseClub club; 
            try {
                club = getClub(clubName);
            } catch (ObjectNotFoundException ex) {
                club = new FreePlayer();
            }
            initMenuItem(club);
            this.menu.show(this, x-143, y-98);
        }
          
    }//GEN-LAST:event_searchResultsTableMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
        new ClubManagementScreen(this.manager).setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void checkBoxAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxAgeActionPerformed
      
    private boolean firstCheckConditions(Player player) {
        String playerName = this.playerNameInput.getText();
        String club = this.clubNameInput.getText();
        String position = this.positionInput.getSelectedItem().toString();      
        
        boolean first = player.getName().toUpperCase().contains(playerName.toUpperCase()) 
                || playerName.equals("");
        boolean second = player.getStatus().toUpperCase().contains(club.toUpperCase()) 
                || club.equals("");
        boolean third = position.equals(player.getPosition()) 
                || position.equals("Qualquer");
        
        return first && second && third;
    }
    
    private boolean secondCheckConditions(Player player) {
        boolean anyAge = this.checkBoxAge.isSelected();
        boolean anyValue = this.checkBoxMarketValue.isSelected();
        boolean anyOver = this.checkBoxOver.isSelected();   
        
        int age = this.ageInput.getValue();
        int value = this.marketValueInput.getValue();
        int over = this.overInput.getValue();
        
        boolean first = (age == player.getAge());
        boolean second = (value >= (int) player.getMarketValue());
        boolean third = (over == (int) player.getOverall());
        
        if (anyAge && anyValue && anyOver) {
            return true;
        } else if (anyAge && anyValue) {
            return third;
        } else if (anyAge && anyOver) {
            return second;
        } else if (anyAge) {
            return second && third;
        } else if (anyValue && anyOver) {
            return first;
        } else if (anyValue) {
            return first && third;
        } else if (anyOver) {
            return first && second;
        } else {
            return first && second && third;
        }
        
    }
    
    private boolean checkParameters(Player player) {
        return firstCheckConditions(player) && secondCheckConditions(player);
    }
    
    private void initInputs() {
        //init list position
        String[] items = {
            "Qualquer", 
            "Atacante", 
            "Meio-Campo", 
            "Defensor", 
            "Goleiro"
        };
        for (String item : items) {
            this.positionInput.addItem(item);            
        }
       
        //init sliders
        this.ageInput.setMinimum(16);
        this.ageInput.setMaximum(42);
        this.checkBoxAge.getModel().setSelected(true);
        String ageTxt = "" + this.ageInput.getValue();
        this.lblAge.setText(ageTxt);
        
        this.marketValueInput.setMinimum(0);
        this.marketValueInput.setMaximum(500);
        this.checkBoxMarketValue.getModel().setSelected(true);
        String marketValueTxt = "" + this.marketValueInput.getValue();
        this.lblMarketValue.setText(marketValueTxt+"Mi");
        
        this.overInput.setMinimum(40);
        this.overInput.setMaximum(100);
        this.checkBoxOver.getModel().setSelected(true);
        String overInputTxt = "" + this.overInput.getValue();
        this.lblOver.setText(overInputTxt);
    }
    
    private void initMenuItem(BaseClub club) {
        this.menuItem = new JMenuItem("Contratar jogador");
        this.menuItem.getAccessibleContext().setAccessibleDescription("Contratar Jogador");
        this.menu.removeAll();
        
        if (club.equals(this.manager.getClub())) {
            this.menuItem.setEnabled(false);
        } 
        
        this.menuItem.addActionListener((var evt) -> {
            if (this.menuItem.isEnabled()) {                
                negotiate();
            }
        });
        this.menu.add(menuItem);
    }
    
    private void negotiate() {
        int row = this.searchResultsTable.getSelectedRow();
        String playerName = (String) this.searchResultsTable.getValueAt(row, 0);                                
        
        try {
            Player player = getPlayer(playerName);        

            if (player.getStatus().equals("Sem Clube")) {
                Club.NegotiationResponse response;
                response = this.manager.negotiateWithFreePlayer(player);
                JOptionPane.showMessageDialog(this, response.getResponse());
            } else {
                clubNegotiation(player);   
            }
        } catch (ObjectNotFoundException ex) {
            ex.printStackTrace();            
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Digite um valor válido");
        }
    }
    
    private void clubNegotiation(Player player) throws ObjectNotFoundException {
        Club.NegotiationResponse response;
        String message = "Sua oferta por " + player.getName();  
        String input = JOptionPane.showInputDialog(this, message, "", 1);
        
        double offer = Double.parseDouble(input);
        Club club = getClub(player.getStatus());
        response = this.manager.buyPlayer(club, player, offer);
        String title = "Diretoria de " +club.getName();
        JOptionPane.showMessageDialog(this, response.getResponse(), title, 1);
    }
            
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayerSearcherWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerSearcherWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerSearcherWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerSearcherWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        Manager manager = new Manager("Junior", clubsDataBase().get(1));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerSearcherWindow(manager).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider ageInput;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox checkBoxAge;
    private javax.swing.JCheckBox checkBoxMarketValue;
    private javax.swing.JCheckBox checkBoxOver;
    private javax.swing.JTextField clubNameInput;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFound;
    private javax.swing.JLabel lblMarketValue;
    private javax.swing.JLabel lblOver;
    private javax.swing.JLabel lblStaticAge;
    private javax.swing.JLabel lblStaticClub;
    private javax.swing.JLabel lblStaticFound;
    private javax.swing.JLabel lblStaticName;
    private javax.swing.JLabel lblStaticOver;
    private javax.swing.JLabel lblStaticPostition;
    private javax.swing.JLabel lblStaticValue;
    private javax.swing.JSlider marketValueInput;
    private javax.swing.JSlider overInput;
    private javax.swing.JTextField playerNameInput;
    private javax.swing.JComboBox<String> positionInput;
    private javax.swing.JTable searchResultsTable;
    private javax.swing.JPanel topSearchInternalPanel;
    // End of variables declaration//GEN-END:variables
}

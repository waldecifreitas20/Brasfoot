package views;

import classes.clube.BaseClube;
import static classes.ClassePrincipal.baseDadosClubes;
import static classes.ClassePrincipal.baseDadosJogadores;
import static classes.ClassePrincipal.getJogador;
import classes.competicoes.Calendario;
import classes.clube.Clube;
import classes.competicoes.Confronto;
import classes.clube.Jogador;
import classes.clube.Manager;
import classes.clube.SemClube;
import classes.competicoes.Tabela;
import classes.competicoes.SuperLiga;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

public class Jogar extends javax.swing.JFrame {
    private final Manager 
        manager;    
    private final JPopupMenu 
        menuPopupElenco = new JPopupMenu(), 
        menuPopupPesquisa = new JPopupMenu();    
    private JMenuItem 
        menuItem = null;
    private String 
        data;
    private ArrayList<Jogador> 
            titulares = new ArrayList(),
            reservas = new ArrayList();
    private Tabela 
            tableClassific = new Tabela(baseDadosClubes()) ;
    private SuperLiga supeLiga = new SuperLiga(baseDadosClubes());
    private Clube mandante, visitante;
    
    public Jogar(Manager manager) {
        initComponents();        
        this.manager = manager;
        this.frameClassificacao.setVisible(false);
        this.framePesquisa.setVisible(false);         
        this.setLocationRelativeTo(null);       
        initAssets();
        initTable();
        //loadRodada();
        this.tableElenco.setAutoCreateRowSorter(true);
        this.tabelaPesquisa.setAutoCreateRowSorter(true);
        initPopupMenuElenco(this);        
        initMoney();
        JOptionPane.showMessageDialog(this, "Seja bem vindo ao "+ this.manager.getClube().getNome()+ ","
                + " " +this.manager.getNome()+
               ".\nAcreditamos que você possa levar esse grande clube"
                       + "\nao titulo dessa temporada. Boa sorte!"
                       + "\n\n              Atenciosamente, a diretoria.", "Boas Vindas!", 1
        
        
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home = new javax.swing.JPanel();
        frameClassificacao = new javax.swing.JInternalFrame();
        btnFecharFrameClassific = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClassificacao = new javax.swing.JTable();
        framePesquisa = new javax.swing.JInternalFrame();
        painelPesquisa = new javax.swing.JPanel();
        inputNomeJogador = new javax.swing.JTextField();
        lblStaticNome = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaPesquisa = new javax.swing.JTable();
        btnFecharJanela = new javax.swing.JLabel();
        panelPesquisaBackground = new javax.swing.JLabel();
        btnSair = new javax.swing.JLabel();
        lblStart = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblEmblema = new javax.swing.JLabel();
        lblPesquisarJogador = new javax.swing.JLabel();
        staticLBL = new javax.swing.JLabel();
        lblMoney = new javax.swing.JLabel();
        staticLblMi = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblStaticTitulares = new javax.swing.JLabel();
        paneScrollElenco = new javax.swing.JScrollPane();
        tableElenco = new javax.swing.JTable();
        lblTitulares = new javax.swing.JLabel();
        lblStaticMaxTitulares = new javax.swing.JLabel();
        lblStaticReservas = new javax.swing.JLabel();
        lblReservas = new javax.swing.JLabel();
        lblClassificacao = new javax.swing.JLabel();
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

        frameClassificacao.setTitle("Classificação");
        frameClassificacao.setVisible(true);

        btnFecharFrameClassific.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFecharFrameClassific.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emblemas/btnSair.png"))); // NOI18N
        btnFecharFrameClassific.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharFrameClassificMouseClicked(evt);
            }
        });

        tabelaClassificacao.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaClassificacao);
        if (tabelaClassificacao.getColumnModel().getColumnCount() > 0) {
            tabelaClassificacao.getColumnModel().getColumn(0).setPreferredWidth(1);
            tabelaClassificacao.getColumnModel().getColumn(1).setResizable(false);
            tabelaClassificacao.getColumnModel().getColumn(1).setPreferredWidth(500);
        }

        javax.swing.GroupLayout frameClassificacaoLayout = new javax.swing.GroupLayout(frameClassificacao.getContentPane());
        frameClassificacao.getContentPane().setLayout(frameClassificacaoLayout);
        frameClassificacaoLayout.setHorizontalGroup(
            frameClassificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameClassificacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameClassificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameClassificacaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFecharFrameClassific)))
                .addContainerGap())
        );
        frameClassificacaoLayout.setVerticalGroup(
            frameClassificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameClassificacaoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnFecharFrameClassific, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        home.add(frameClassificacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 440, 250));

        framePesquisa.setTitle("Procurar Jogador");
        framePesquisa.setVisible(true);

        painelPesquisa.setBackground(new java.awt.Color(102, 102, 102));
        painelPesquisa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputNomeJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeJogadorActionPerformed(evt);
            }
        });
        painelPesquisa.add(inputNomeJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 60, 177, -1));

        lblStaticNome.setBackground(new java.awt.Color(0, 0, 0));
        lblStaticNome.setForeground(new java.awt.Color(255, 255, 255));
        lblStaticNome.setText("Nome:");
        painelPesquisa.add(lblStaticNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 38, -1, -1));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        painelPesquisa.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 102, 177, -1));

        tabelaPesquisa.setForeground(new java.awt.Color(0, 0, 0));
        tabelaPesquisa.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaPesquisa.setShowHorizontalLines(false);
        tabelaPesquisa.setShowVerticalLines(false);
        tabelaPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPesquisaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaPesquisa);
        if (tabelaPesquisa.getColumnModel().getColumnCount() > 0) {
            tabelaPesquisa.getColumnModel().getColumn(0).setResizable(false);
            tabelaPesquisa.getColumnModel().getColumn(1).setResizable(false);
            tabelaPesquisa.getColumnModel().getColumn(2).setPreferredWidth(10);
            tabelaPesquisa.getColumnModel().getColumn(3).setResizable(false);
            tabelaPesquisa.getColumnModel().getColumn(3).setPreferredWidth(5);
            tabelaPesquisa.getColumnModel().getColumn(4).setResizable(false);
            tabelaPesquisa.getColumnModel().getColumn(4).setPreferredWidth(10);
            tabelaPesquisa.getColumnModel().getColumn(5).setResizable(false);
            tabelaPesquisa.getColumnModel().getColumn(5).setPreferredWidth(5);
            tabelaPesquisa.getColumnModel().getColumn(6).setResizable(false);
            tabelaPesquisa.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        painelPesquisa.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 166, 790, 276));

        btnFecharJanela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFecharJanela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emblemas/btnSair.png"))); // NOI18N
        btnFecharJanela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharJanelaMouseClicked(evt);
            }
        });
        painelPesquisa.add(btnFecharJanela, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, -1));

        panelPesquisaBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/f01.jpg"))); // NOI18N
        painelPesquisa.add(panelPesquisaBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 480));

        javax.swing.GroupLayout framePesquisaLayout = new javax.swing.GroupLayout(framePesquisa.getContentPane());
        framePesquisa.getContentPane().setLayout(framePesquisaLayout);
        framePesquisaLayout.setHorizontalGroup(
            framePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(framePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(framePesquisaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(painelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        framePesquisaLayout.setVerticalGroup(
            framePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(framePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(framePesquisaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(painelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        home.add(framePesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 910, -1));

        btnSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emblemas/btnSair.png"))); // NOI18N
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });
        home.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, -1, -1));

        lblStart.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblStart.setForeground(new java.awt.Color(255, 255, 255));
        lblStart.setText("Iniciar Partida");
        lblStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStartMouseClicked(evt);
            }
        });
        home.add(lblStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 120, 50));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Real Madrid");
        home.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 239, 40));

        lblEmblema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmblema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emblemas/psg_mini.png"))); // NOI18N
        home.add(lblEmblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 127, 110));

        lblPesquisarJogador.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPesquisarJogador.setForeground(new java.awt.Color(255, 255, 255));
        lblPesquisarJogador.setText("Procurar Jogadores");
        lblPesquisarJogador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPesquisarJogadorMouseClicked(evt);
            }
        });
        home.add(lblPesquisarJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 190, 50));

        staticLBL.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        staticLBL.setForeground(new java.awt.Color(0, 0, 0));
        staticLBL.setText("em caixa");
        home.add(staticLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, -1, 30));

        lblMoney.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblMoney.setForeground(new java.awt.Color(0, 0, 0));
        lblMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        home.add(lblMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 40, 30));

        staticLblMi.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        staticLblMi.setForeground(new java.awt.Color(0, 0, 0));
        staticLblMi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        staticLblMi.setText("Milhões");
        home.add(staticLblMi, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 50, 30));

        lblData.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblData.setForeground(new java.awt.Color(0, 0, 0));
        lblData.setText("00/00/0000");
        home.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, 30));

        lblStaticTitulares.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticTitulares.setForeground(new java.awt.Color(0, 0, 0));
        lblStaticTitulares.setText("Titulares:");
        home.add(lblStaticTitulares, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 60, -1));

        tableElenco.setBackground(new java.awt.Color(255, 255, 255));
        tableElenco.setModel(new javax.swing.table.DefaultTableModel(
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
        tableElenco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableElenco.setInheritsPopupMenu(true);
        tableElenco.setRowHeight(18);
        tableElenco.setRowMargin(5);
        tableElenco.setShowHorizontalLines(false);
        tableElenco.setShowVerticalLines(false);
        tableElenco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableElencoMouseClicked(evt);
            }
        });
        paneScrollElenco.setViewportView(tableElenco);
        if (tableElenco.getColumnModel().getColumnCount() > 0) {
            tableElenco.getColumnModel().getColumn(0).setResizable(false);
            tableElenco.getColumnModel().getColumn(0).setPreferredWidth(15);
            tableElenco.getColumnModel().getColumn(1).setResizable(false);
            tableElenco.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableElenco.getColumnModel().getColumn(2).setResizable(false);
            tableElenco.getColumnModel().getColumn(2).setPreferredWidth(10);
            tableElenco.getColumnModel().getColumn(3).setResizable(false);
            tableElenco.getColumnModel().getColumn(3).setPreferredWidth(50);
            tableElenco.getColumnModel().getColumn(4).setResizable(false);
            tableElenco.getColumnModel().getColumn(4).setPreferredWidth(20);
            tableElenco.getColumnModel().getColumn(5).setResizable(false);
            tableElenco.getColumnModel().getColumn(5).setPreferredWidth(15);
            tableElenco.getColumnModel().getColumn(6).setResizable(false);
            tableElenco.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        home.add(paneScrollElenco, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 550, 380));

        lblTitulares.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblTitulares.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulares.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulares.setText("0");
        home.add(lblTitulares, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        lblStaticMaxTitulares.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticMaxTitulares.setForeground(new java.awt.Color(0, 0, 0));
        lblStaticMaxTitulares.setText("/ 11");
        home.add(lblStaticMaxTitulares, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        lblStaticReservas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticReservas.setForeground(new java.awt.Color(0, 0, 0));
        lblStaticReservas.setText("Reservas:");
        home.add(lblStaticReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 60, -1));

        lblReservas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblReservas.setForeground(new java.awt.Color(0, 0, 0));
        lblReservas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblReservas.setText("0");
        home.add(lblReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 10, -1));

        lblClassificacao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblClassificacao.setForeground(new java.awt.Color(0, 0, 0));
        lblClassificacao.setText("Classficação");
        lblClassificacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClassificacaoMouseClicked(evt);
            }
        });
        home.add(lblClassificacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, 50));

        lblStaticMaxReservas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblStaticMaxReservas.setForeground(new java.awt.Color(0, 0, 0));
        lblStaticMaxReservas.setText("/ 7");
        home.add(lblStaticMaxReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        lblManager.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblManager.setForeground(new java.awt.Color(0, 0, 0));
        lblManager.setText("Manager");
        home.add(lblManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 130, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/background_champions.jpg"))); // NOI18N
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
        Color foreground = manager.getClube().getForeground();
        this.data = new Calendario().getDataAtual();
        this.lblData.setText(data);
        this.lblData.setForeground(foreground);
        this.lblTitle.setText(manager.getClube().getNome());
        this.lblStart.setForeground(foreground);
        this.lblTitle.setForeground(foreground);
        this.lblMoney.setForeground(foreground);
        this.staticLBL.setForeground(foreground);
        this.lblManager.setText(manager.getNome());
        this.lblManager.setForeground(foreground);
        this.background.setIcon(manager.getClube().getBackground());
        this.lblEmblema.setIcon(manager.getClube().getEmblemaMini());
        this.lblReservas.setForeground(foreground);
        this.staticLblMi.setForeground(foreground);
        this.lblTitulares.setForeground(foreground);
        this.lblClassificacao.setForeground(foreground);
        this.lblStaticReservas.setForeground(foreground);
        this.lblStaticTitulares.setForeground(foreground);
        this.lblPesquisarJogador.setForeground(foreground);
        this.lblStaticMaxReservas.setForeground(foreground);
        this.lblStaticMaxTitulares.setForeground(foreground);      
    }
    
    private void initTable() {
        DefaultTableModel table =(DefaultTableModel) this.tableElenco.getModel();
        this.titulares.removeAll(titulares);
        this.reservas.removeAll(reservas);
        List<Jogador> ob = new ArrayList();
        for (int i = 0; i < baseDadosClubes().size(); i++) {
            if (baseDadosClubes().get(i).getNome().equals(this.manager.getClube().getNome())) {
                ob = baseDadosClubes().get(i).getJogadores();
            }
        }      
        table.setRowCount(0);
        for (int i = 0; i < ob.size(); i++) {
            Jogador um = ob.get(i);            
            Object[] club = {
                "---",
                um.getNome(),
                (int) um.getOver(), 
                um.getPosicao(), 
                (int)um.getValor()+"Mi", 
                um.getIdade(),
                (int)um.getSalario()+"Mi/ano",
            };
            table.addRow(club);            
        }        
    }
        
    private void initMoney() {
        this.lblMoney.setText(Integer.toString((int)this.manager.getClube().getDinheiro()));
    }
    
    private void initPopupMenuElenco(JFrame jframe) {  
        
        //Rescindir contrato com jogador//
        //<editor-fold desc="Method">
        this.menuItem = new JMenuItem ("Rescindir contrato");        
        this.menuItem.getAccessibleContext().setAccessibleDescription("rescindir contrato");
        this.menuItem.addActionListener((ActionEvent e) -> {          

            int index = this.tableElenco.getSelectedRow();
            String nomeJogador = (String)this.tableElenco.getValueAt(index, 1);
            int resp = JOptionPane.showConfirmDialog(jframe, "Rescindir contrato com " + nomeJogador+"?", "Selecione", 2);
            
            if (resp == 0) {             
               
                this.manager.dispensarJogador(nomeJogador);
                initTable();  
                initMoney();
            }               
        });
        this.menuPopupElenco.add(menuItem);
        //</editor-fold>
        //Vender jogador//
        //<editor-fold desc="Method">
        this.menuItem = new JMenuItem ("Vender Jogador");
        this.menuItem.getAccessibleContext().setAccessibleDescription("Vender Jogador");
        this.menuItem.addActionListener((ActionEvent evt) -> {
            
            int index = this.tableElenco.getSelectedRow();
            String nomeJogador = (String) this.tableElenco.getValueAt(index, 1);
            int resp = JOptionPane.showConfirmDialog(jframe, "Vender "+nomeJogador+"?", "Selecione uma opção", 2);
            
            if (resp == 0) {
                Jogador jogador = getJogador((String) this.tableElenco.getValueAt(index, 1));
                String clube = this.manager.venderJogador(nomeJogador);
                JOptionPane.showMessageDialog(jframe, jogador.getNome()+" foi vendido para "+clube
                        +" por "+ (int)(jogador.getValor()*1.3)+" Milhões");
                initTable();
                initMoney();
            }
            
        });
        this.menuPopupElenco.add(menuItem);
        //</editor-fold>
    }
    
    private void initPopupMenuPesquisar(JFrame jframe, BaseClube clube, String nomeJogador) {
        //Comprar Jogador//        
        this.menuItem = new JMenuItem("Contratar");
        this.menuItem.getAccessibleContext().setAccessibleDescription("Contratar");                   
       
        for (int i = 0; i < this.manager.getClube().getJogadores().size(); i++) { 
                if(clube.getNome() == this.manager.getClube().getNome()) {
                    this.menuItem.setEnabled(false);                 
                }               
            }  
        this.menuItem.addActionListener((ActionEvent evt) -> {                
            if (this.menuItem.isEnabled()) {
                if (clube.getNome().equals("Sem Club Systeme")) {
                   
                    String resposta = this.manager.contratarJogadorSemClube(nomeJogador);
                    JOptionPane.showMessageDialog(jframe, resposta);
                }else {
                    String input = JOptionPane.showInputDialog(
                        jframe, 
                        "Sua proposta por "+nomeJogador+"(em Milhões):"                        
                    );
                    double oferta = 0;                
                    if (!input.isBlank() && !input.isEmpty()) {
                        oferta = Double.parseDouble(input);
                    }

                    String resposta = this.manager.contratarJogador((Clube)clube, nomeJogador, oferta);
                    JOptionPane.showMessageDialog(jframe, resposta);  
                }
                initMoney();
                initTable();
                this.paneScrollElenco.setVisible(false);                 
            }
        });
        
        this.menuPopupPesquisa.removeAll();
        this.menuPopupPesquisa.add(menuItem);
    }        
        
    private void loadRodada() {
     /*
        this.supeLiga.sortearRodada();
        for (int i = 0; i < 3; i++) {
          
            Clube mandante = this.supeLiga.getRodada()[i].getMandante();
            Clube visitante = this.supeLiga.getRodada()[i].getVisitante();
            if (this.manager.getClube().equals(mandante)) {               
                this.mandante = this.manager.getClube();
                this.visitante = visitante;             
            } else if (this.manager.getClube().equals(visitante)) {
                this.mandante = mandante;
                this.visitante = this.manager.getClube();
              
            }
        }
      
       */
    }
            
    private void btnFecharJanelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharJanelaMouseClicked
        this.framePesquisa.setVisible(false);
        this.paneScrollElenco.setVisible(true);
    }//GEN-LAST:event_btnFecharJanelaMouseClicked

    private void inputNomeJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeJogadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeJogadorActionPerformed

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        exit(0);
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        DefaultTableModel table = (DefaultTableModel) this.tabelaPesquisa.getModel();       
        table.setRowCount(0);
        String nome = this.inputNomeJogador.getText().trim();
        List<Jogador> all = baseDadosJogadores();
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getNome().indexOf(nome) != -1) {
                
                Object[] jogadores = {
                    all.get(i).getNome(), 
                    all.get(i).getStatus(), 
                    all.get(i).getPosicao(),
                    (int)all.get(i).getOver(),
                    (int)all.get(i).getValor()+"Mi",
                    all.get(i).getIdade(),
                    (int)all.get(i).getSalario()+"Mi/ano"
                };
                table.addRow(jogadores);
            }
        }       
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tabelaPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPesquisaMouseClicked
        int posicX = MouseInfo.getPointerInfo().getLocation().x;
        int posicY = MouseInfo.getPointerInfo().getLocation().y;
        if (evt.getButton() == 3) {
            String nomeJogador = (String) this.tabelaPesquisa.getValueAt(this.tabelaPesquisa.getSelectedRow(), 0);
            String nomeClube = (String) this.tabelaPesquisa.getValueAt(this.tabelaPesquisa.getSelectedRow(), 1);
            BaseClube clube = null;
            
            for (int i = 0; i < baseDadosClubes().size(); i++) {
                if (nomeClube.equals(baseDadosClubes().get(i).getNome())) {
                    clube = baseDadosClubes().get(i);
                }        
            }
            if (clube == null) {
                clube = new SemClube();
            }
            initPopupMenuPesquisar(this, clube, nomeJogador);
            this.menuPopupPesquisa.show(this, posicX-85, posicY-60);
        }
    }//GEN-LAST:event_tabelaPesquisaMouseClicked

    private void tableElencoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableElencoMouseClicked
        int x = MouseInfo.getPointerInfo().getLocation().x;
        int y = MouseInfo.getPointerInfo().getLocation().y;
        if(evt.getButton() == 3){
            this.menuPopupElenco.show(this, x-85, y-60);
        }
        
        if (evt.getButton() == 1) {
            int index = this.tableElenco.getSelectedRow();
            String nomeJogador = (String) this.tableElenco.getValueAt(index, 1);
            Object state = this.tableElenco.getValueAt(index, 0);            
            
            if (state.equals("---")) {
                if (this.titulares.size() < 11) {
                    this.tableElenco.setValueAt("Titular", index, 0);
                    this.titulares.add(getJogador(nomeJogador));                    
                } else if (this.reservas.size() < 7) {
                    this.tableElenco.setValueAt("Reserva", index, 0);
                    this.titulares.remove(getJogador(nomeJogador));
                    this.reservas.add(getJogador(nomeJogador));
                }
            }else if (state.equals("Titular")) {
                if (this.reservas.size() <7) {
                    this.tableElenco.setValueAt("Reserva", index, 0);
                    this.titulares.remove(getJogador(nomeJogador));
                    this.reservas.add(getJogador(nomeJogador));                    
                } else {
                    this.tableElenco.setValueAt("---", index, 0);
                    this.titulares.remove(getJogador(nomeJogador));
                }
            } else if (state.equals("Reserva")) {
                this.tableElenco.setValueAt("---", index, 0);
                this.reservas.remove(getJogador(nomeJogador));
            }
            this.lblTitulares.setText(""+this.titulares.size());
            this.lblReservas.setText(""+this.reservas.size());
        }
        
    }//GEN-LAST:event_tableElencoMouseClicked

    private void lblPesquisarJogadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPesquisarJogadorMouseClicked
        DefaultTableModel table = (DefaultTableModel) this.tabelaPesquisa.getModel();       
        table.setRowCount(0);
        this.framePesquisa.setVisible(true);
        this.paneScrollElenco.setVisible(false);
    }//GEN-LAST:event_lblPesquisarJogadorMouseClicked

    private void lblClassificacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClassificacaoMouseClicked
        DefaultTableModel table = (DefaultTableModel) this.tabelaClassificacao.getModel();
        table.setRowCount(0);
        this.frameClassificacao.setVisible(true);
        List<Clube> clubesStats = this.tableClassific.getParticipantes();
        for (int i = 0; i < baseDadosClubes().size(); i++) {
            Object[] tabela = {
                i+1,
                clubesStats.get(i).getNome(),
                clubesStats.get(i).getStats().getPontos(),
                clubesStats.get(i).getStats().getJogos(),
                clubesStats.get(i).getStats().getVitorias(),
                clubesStats.get(i).getStats().getEmpates(),
                clubesStats.get(i).getStats().getDerrotas(),
                clubesStats.get(i).getStats().getGolsFeitos(),
                clubesStats.get(i).getStats().getGolsSofridos(),
                clubesStats.get(i).getStats().getSaldo()
            }; 
            table.addRow(tabela);
        }
    }//GEN-LAST:event_lblClassificacaoMouseClicked

    private void btnFecharFrameClassificMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharFrameClassificMouseClicked
        this.frameClassificacao.setVisible(false);
    }//GEN-LAST:event_btnFecharFrameClassificMouseClicked

    private void lblStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartMouseClicked
        
        if (this.titulares.size() == 11) {
            this.loadRodada();
            if (this.mandante == null || this.visitante == null) {
                this.setVisible(false);
                System.out.println("deu merda aqui krl");
            } else {
               
                new Partida(this.mandante, this.visitante, this).setVisible(true);
                
            }
        } else if(this.titulares.size() < 11){
            JOptionPane.showMessageDialog(this, "Selecione ao menos 11 titulares!", "Alerta!", 0);
        }
    }//GEN-LAST:event_lblStartMouseClicked
    
    //<editor-fold desc="Variaveis imutaveis">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnFecharFrameClassific;
    private javax.swing.JLabel btnFecharJanela;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel btnSair;
    private javax.swing.JInternalFrame frameClassificacao;
    private javax.swing.JInternalFrame framePesquisa;
    private javax.swing.JPanel home;
    private javax.swing.JTextField inputNomeJogador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClassificacao;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEmblema;
    private javax.swing.JLabel lblManager;
    private javax.swing.JLabel lblMoney;
    private javax.swing.JLabel lblPesquisarJogador;
    private javax.swing.JLabel lblReservas;
    private javax.swing.JLabel lblStart;
    private javax.swing.JLabel lblStaticMaxReservas;
    private javax.swing.JLabel lblStaticMaxTitulares;
    private javax.swing.JLabel lblStaticNome;
    private javax.swing.JLabel lblStaticReservas;
    private javax.swing.JLabel lblStaticTitulares;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitulares;
    private javax.swing.JPanel painelPesquisa;
    private javax.swing.JScrollPane paneScrollElenco;
    private javax.swing.JLabel panelPesquisaBackground;
    private javax.swing.JLabel staticLBL;
    private javax.swing.JLabel staticLblMi;
    private javax.swing.JTable tabelaClassificacao;
    private javax.swing.JTable tabelaPesquisa;
    private javax.swing.JTable tableElenco;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import static java.lang.System.exit;

/**
 *
 * @author downt
 */
public class TelaInicial extends javax.swing.JFrame {
    private String nomeManager;
    public TelaInicial() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.btnIStart.setVisible(false);   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputNome = new javax.swing.JTextField();
        lblSair = new javax.swing.JLabel();
        btnIStart = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(320, 150, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputNome.setText("Insira seu nome de Manager");
        inputNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputNomeMouseClicked(evt);
            }
        });
        inputNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputNomeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputNomeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputNomeKeyTyped(evt);
            }
        });
        getContentPane().add(inputNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 330, 30));

        lblSair.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblSair.setForeground(new java.awt.Color(255, 255, 255));
        lblSair.setText("X - Sair");
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });
        getContentPane().add(lblSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 56, -1));

        btnIStart.setText("Novo Jogo");
        btnIStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnIStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 180, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/tela_inicial.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        exit(0);
    }//GEN-LAST:event_lblSairMouseClicked

    private void inputNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputNomeMouseClicked
        this.inputNome.setText("");
    }//GEN-LAST:event_inputNomeMouseClicked

    private void inputNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNomeKeyTyped
        if (this.inputNome.getText().length() > 0) {
            this.btnIStart.setVisible(true);
            this.nomeManager = this.inputNome.getText();
        }
    }//GEN-LAST:event_inputNomeKeyTyped

    private void inputNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNomeKeyPressed
       
    }//GEN-LAST:event_inputNomeKeyPressed

    private void inputNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNomeKeyReleased
        if (this.inputNome.getText().length() == 0) {
            this.btnIStart.setVisible(false);
        }
    }//GEN-LAST:event_inputNomeKeyReleased

    private void btnIStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIStartActionPerformed
        this.dispose();
        new SelecionarEquipe(this.nomeManager).setVisible(true);
    }//GEN-LAST:event_btnIStartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnIStart;
    private javax.swing.JTextField inputNome;
    private javax.swing.JLabel lblSair;
    // End of variables declaration//GEN-END:variables
}

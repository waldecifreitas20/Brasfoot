
package views;

import java.io.File;
import java.io.IOException;
import static java.lang.System.exit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class StartScreen extends javax.swing.JFrame {
    private String managerName;
    public StartScreen() {
        initComponents();
        initBackground();
        this.setLocationRelativeTo(null);
        this.btnIStart.setVisible(false);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSair = new javax.swing.JLabel();
        btnIStart = new javax.swing.JButton();
        lblPlaceholder = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(320, 150, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        lblPlaceholder.setForeground(new java.awt.Color(153, 153, 153));
        lblPlaceholder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlaceholder.setText("Insira um nome de manager");
        getContentPane().add(lblPlaceholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 190, 30));

        nameInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameInputKeyReleased(evt);
            }
        });
        getContentPane().add(nameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 330, 30));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initBackground() {      
        String url = "/images/backgrounds/background StartScreen.jpg";
        ImageIcon background = new ImageIcon(getClass().getResource(url));        
        this.background.setIcon(background);
    }
    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        exit(0);
    }//GEN-LAST:event_lblSairMouseClicked

    private void btnIStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIStartActionPerformed
        if (this.nameInput.getText().length() > 0) {           
            this.managerName = this.nameInput.getText();
            this.dispose();
            new TeamChoice(this.managerName).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Nome inválido", "Alerta!", 0);
        }
    }//GEN-LAST:event_btnIStartActionPerformed

    private void nameInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameInputKeyReleased
         if (this.nameInput.getText().equals("")) {
            this.lblPlaceholder.setVisible(false);             
            this.btnIStart.setVisible(false);
        } else {
            this.btnIStart.setVisible(true);
        }
       
    }//GEN-LAST:event_nameInputKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnIStart;
    private javax.swing.JLabel lblPlaceholder;
    private javax.swing.JLabel lblSair;
    private javax.swing.JTextField nameInput;
    // End of variables declaration//GEN-END:variables
}

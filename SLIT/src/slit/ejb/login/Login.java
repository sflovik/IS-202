package slit.ejb.login;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import slit.Constants;
import slit.Main;
import slit.db;
import slit.localUser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erik-
 */
public class Login extends javax.swing.JFrame {
private String user = "";
private String pass = "";
private String role = "";
private int id = 0;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        getRootPane().setDefaultButton(jButtonLogin);
        addWindowListener(new WindowAdapter() {
        
            @Override
            public void windowClosing(WindowEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, 
                        "Are you sure you wish to exit?",null,
                        JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
                else {
                    
                    // Do nothing
                    // Return to application
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jPanelMainLeft = new javax.swing.JPanel();
        jPanelMainTop = new javax.swing.JPanel();
        jPanelMainRigth = new javax.swing.JPanel();
        jPanelMainBotoom = new javax.swing.JPanel();
        jPanelMainCenter = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxRoleLogin = new javax.swing.JComboBox();
        jButtonRegBruker = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        jPasswordFieldLogin = new javax.swing.JPasswordField();
        jTextFieldEmailLogin = new javax.swing.JTextField();
        jLabelEpost = new javax.swing.JLabel();
        jLabelPassord = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanelLogin.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanelMainLeftLayout = new javax.swing.GroupLayout(jPanelMainLeft);
        jPanelMainLeft.setLayout(jPanelMainLeftLayout);
        jPanelMainLeftLayout.setHorizontalGroup(
            jPanelMainLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelMainLeftLayout.setVerticalGroup(
            jPanelMainLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );

        jPanelLogin.add(jPanelMainLeft, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanelMainTopLayout = new javax.swing.GroupLayout(jPanelMainTop);
        jPanelMainTop.setLayout(jPanelMainTopLayout);
        jPanelMainTopLayout.setHorizontalGroup(
            jPanelMainTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        jPanelMainTopLayout.setVerticalGroup(
            jPanelMainTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelLogin.add(jPanelMainTop, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanelMainRigthLayout = new javax.swing.GroupLayout(jPanelMainRigth);
        jPanelMainRigth.setLayout(jPanelMainRigthLayout);
        jPanelMainRigthLayout.setHorizontalGroup(
            jPanelMainRigthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelMainRigthLayout.setVerticalGroup(
            jPanelMainRigthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );

        jPanelLogin.add(jPanelMainRigth, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanelMainBotoomLayout = new javax.swing.GroupLayout(jPanelMainBotoom);
        jPanelMainBotoom.setLayout(jPanelMainBotoomLayout);
        jPanelMainBotoomLayout.setHorizontalGroup(
            jPanelMainBotoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        jPanelMainBotoomLayout.setVerticalGroup(
            jPanelMainBotoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelLogin.add(jPanelMainBotoom, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        jComboBoxRoleLogin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Foreleser", "Hjelpelærer" }));

        jButtonRegBruker.setText("Registrer bruker ");
        jButtonRegBruker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegBrukerActionPerformed(evt);
            }
        });

        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jTextFieldEmailLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailLoginActionPerformed(evt);
            }
        });

        jLabelEpost.setText("E-post:");

        jLabelPassord.setText("Passord:");

        jLabel1.setText("Rolle:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonLogin)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRegBruker))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelEpost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelPassord, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                .addGap(15, 15, 15))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(55, 55, 55)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxRoleLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPasswordFieldLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldEmailLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(220, 220, 220))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxRoleLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEpost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegBruker)
                    .addComponent(jButtonLogin))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMainCenterLayout = new javax.swing.GroupLayout(jPanelMainCenter);
        jPanelMainCenter.setLayout(jPanelMainCenterLayout);
        jPanelMainCenterLayout.setHorizontalGroup(
            jPanelMainCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelMainCenterLayout.setVerticalGroup(
            jPanelMainCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelLogin.add(jPanelMainCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanelLogin, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void login() {

     localUser localuser = db.login(user, pass, role, id);
        if(localuser != null){
            if (jComboBoxRoleLogin.getSelectedItem().toString().equals("Student")){
                slit.mainWindow hjems = new slit.mainWindow();
                hjems.setVisible(true);
                hjems.setExtendedState(slit.mainWindow.MAXIMIZED_BOTH);
                this.dispose();
            }
            else {
                slit.client.foreleser.mainWindowForeleser hjemf = new slit.client.foreleser.mainWindowForeleser();
                hjemf.setVisible(true);
                hjemf.setExtendedState(slit.client.foreleser.mainWindowForeleser.MAXIMIZED_BOTH);
                this.dispose();
            }
        Main.user = localuser;
       
                }
                
               
            
}
   
    private void jTextFieldEmailLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailLoginActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
        user = jTextFieldEmailLogin.getText();
        pass = jPasswordFieldLogin.getText();
        setRole((jComboBoxRoleLogin.getSelectedItem().toString()));
        localUser localuser = new localUser(user, pass, role,id);
        localuser.setUser(user);
        localuser.setPass(pass);
        localuser.setRole(role);
        try {
        String ID = "SELECT * FROM Bruker WHERE brukerEmail= '" 
                        + user +"' AND brukerPassord='" + pass + "' ";
         
                Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
            
                Statement stmt = con.createStatement( );
                
               
                ResultSet result = stmt.executeQuery (ID);
                
                // Variabel brukerId som skal sendes inn med statusrapport
                id = 0;
              
                 // Om credentials er godkjent, henter ut brukerId fra ID query
                if (result.next()) {
                    id = result.getInt("BrukerId");
                }
              
                localuser.setId(id);
                login();
            
                
        }
        catch (SQLException err) {
                        System.out.println(err);
                        }
        
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonRegBrukerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegBrukerActionPerformed
        // TODO add your handling code here:
        slit.ejb.registrer.RegistrerBruker RegisterWindow = new slit.ejb.registrer.RegistrerBruker(); 
        RegisterWindow.setVisible(true);
       
    }//GEN-LAST:event_jButtonRegBrukerActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonRegBruker;
    private javax.swing.JComboBox jComboBoxRoleLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEpost;
    private javax.swing.JLabel jLabelPassord;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelMainBotoom;
    private javax.swing.JPanel jPanelMainCenter;
    private javax.swing.JPanel jPanelMainLeft;
    private javax.swing.JPanel jPanelMainRigth;
    private javax.swing.JPanel jPanelMainTop;
    private javax.swing.JPasswordField jPasswordFieldLogin;
    private javax.swing.JTextField jTextFieldEmailLogin;
    // End of variables declaration//GEN-END:variables
}

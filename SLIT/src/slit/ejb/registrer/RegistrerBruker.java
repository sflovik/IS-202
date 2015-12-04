package slit.ejb.registrer;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sondre, Michael, Erik, Christian Fredrik, Thomas, Gruppe 109
 * GUI-klasse for registrering av brukere
 */
public class RegistrerBruker extends javax.swing.JFrame {

    /**
     * Creates new form RegistrerBruker
     */
    public RegistrerBruker() {
        initComponents();
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

        jPanelMainTop = new javax.swing.JPanel();
        jPanelMainBotoom = new javax.swing.JPanel();
        jPanelMainRigth = new javax.swing.JPanel();
        jPanelMainLeft = new javax.swing.JPanel();
        jPanelMainCenter = new javax.swing.JPanel();
        jLabelFagkode = new javax.swing.JLabel();
        jLabelRolle = new javax.swing.JLabel();
        jLabelÅrstall = new javax.swing.JLabel();
        jLabelFornavn = new javax.swing.JLabel();
        jLabelEtternavn = new javax.swing.JLabel();
        jLabelEpost = new javax.swing.JLabel();
        jLabelPassord = new javax.swing.JLabel();
        jComboBoxFagkode = new javax.swing.JComboBox();
        jComboBoxRolle = new javax.swing.JComboBox();
        jPasswordFieldRegister = new javax.swing.JPasswordField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldKull = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldLastname = new javax.swing.JTextField();
        jButtonRegistrer = new javax.swing.JButton();
        jButtonTilbake = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        javax.swing.GroupLayout jPanelMainTopLayout = new javax.swing.GroupLayout(jPanelMainTop);
        jPanelMainTop.setLayout(jPanelMainTopLayout);
        jPanelMainTopLayout.setHorizontalGroup(
            jPanelMainTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );
        jPanelMainTopLayout.setVerticalGroup(
            jPanelMainTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelMainTop, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanelMainBotoomLayout = new javax.swing.GroupLayout(jPanelMainBotoom);
        jPanelMainBotoom.setLayout(jPanelMainBotoomLayout);
        jPanelMainBotoomLayout.setHorizontalGroup(
            jPanelMainBotoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );
        jPanelMainBotoomLayout.setVerticalGroup(
            jPanelMainBotoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelMainBotoom, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanelMainRigthLayout = new javax.swing.GroupLayout(jPanelMainRigth);
        jPanelMainRigth.setLayout(jPanelMainRigthLayout);
        jPanelMainRigthLayout.setHorizontalGroup(
            jPanelMainRigthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanelMainRigthLayout.setVerticalGroup(
            jPanelMainRigthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelMainRigth, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanelMainLeftLayout = new javax.swing.GroupLayout(jPanelMainLeft);
        jPanelMainLeft.setLayout(jPanelMainLeftLayout);
        jPanelMainLeftLayout.setHorizontalGroup(
            jPanelMainLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanelMainLeftLayout.setVerticalGroup(
            jPanelMainLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelMainLeft, java.awt.BorderLayout.LINE_START);

        jPanelMainCenter.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrer Bruker", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabelFagkode.setText("Fagkode");

        jLabelRolle.setText("Rolle");

        jLabelÅrstall.setText("Studie kull");

        jLabelFornavn.setText("Fornavn");

        jLabelEtternavn.setText("Etternavn");

        jLabelEpost.setText("E-post");

        jLabelPassord.setText("Passord");

        jComboBoxFagkode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "109", "110" }));

        jComboBoxRolle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Foreleser", "Hjelpelærer" }));

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jButtonRegistrer.setText("Registrer");
        jButtonRegistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrerActionPerformed(evt);
            }
        });

        jButtonTilbake.setText("Tilbake");
        jButtonTilbake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTilbakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainCenterLayout = new javax.swing.GroupLayout(jPanelMainCenter);
        jPanelMainCenter.setLayout(jPanelMainCenterLayout);
        jPanelMainCenterLayout.setHorizontalGroup(
            jPanelMainCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainCenterLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanelMainCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMainCenterLayout.createSequentialGroup()
                        .addGroup(jPanelMainCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelMainCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelÅrstall)
                                .addComponent(jLabelEpost, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelPassord, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelFagkode, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelRolle, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabelEtternavn)
                            .addComponent(jLabelFornavn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelMainCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxRolle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelMainCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxFagkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldLastname)
                                .addComponent(jTextFieldEmail)
                                .addComponent(jTextFieldName)
                                .addComponent(jTextFieldKull)
                                .addComponent(jPasswordFieldRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                    .addGroup(jPanelMainCenterLayout.createSequentialGroup()
                        .addComponent(jButtonTilbake)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRegistrer)))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanelMainCenterLayout.setVerticalGroup(
            jPanelMainCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFagkode)
                    .addComponent(jComboBoxFagkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMainCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRolle)
                    .addComponent(jComboBoxRolle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMainCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelÅrstall)
                    .addComponent(jTextFieldKull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMainCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFornavn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMainCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEtternavn)
                    .addComponent(jTextFieldLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMainCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEpost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMainCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordFieldRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMainCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrer)
                    .addComponent(jButtonTilbake))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMainCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed
    /**
     * Gammel struktur på kode, noe av det første vi skrev. All logikk ligger direkte på en knapp, og ikke i en metode.
     * For det første burde knappen bare kalt en metode, og for det andre burde denne metoden kalt en logikkmetode fra db.java klassen
     * for å unngå store mengder logikk direkte i GUI.
     * @param evt event
     */
    private void jButtonRegistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrerActionPerformed
        // TODO add your handling code here:
         try {   
            String db_url = "jdbc:mysql://localhost:3306/slit";
            String db_user = "root";
            String db_pass = "root";
            String rolle = jComboBoxRolle.getSelectedItem().toString();
            String password = jPasswordFieldRegister.getText();
            String name = jTextFieldName.getText();
            String lastname = jTextFieldLastname.getText();
            String email = jTextFieldEmail.getText();
            String kull = jTextFieldKull.getText();
            String fagkode = jComboBoxFagkode.getSelectedItem().toString();
            int nameLength = name.length();
            int kullLength = kull.length();
            int passwordLength = password.length();
            int emailLength = email.length();
            
            System.out.println("The URL is: " + db_url);
            Connection con = DriverManager.getConnection(db_url, db_user, db_pass);
            Statement stmt = con.createStatement( );
            // sql2 for å sette opp fag, kjørte bare en gang, lar koden ligge for fremtidig bruk.
           // String sql2 = ("INSERT INTO `Fag` (fagKode,fagNavn, fagLærer)" + "VALUE ('"+fagkode+"', '"+fagnavn+"', '"+faglærer+"')");
            // stmt.executeUpdate(sql2);
            
            
               
           
            // Samme som ved innlogging, bare at her definerer vi en String som inserter variabler inn i feltene i databasen
            String sql = ("INSERT INTO `Bruker`(brukerRolle,brukerFornavn,brukerEtternavn,brukerEmail, brukerPassord, brukerKull, Fag_fagKode)"
                    + " VALUE ('"+rolle+"', '"+name+"','"+lastname+"','"+email+"','"+password+"','"+kull+"','"+fagkode+"' )");
            stmt.executeUpdate(sql);
            System.out.println("User Created");
            slit.ejb.registrer.RegisterComplete gui = new slit.ejb.registrer.RegisterComplete(); 
            gui.setVisible(true);
            gui.setExtendedState(slit.ejb.registrer.RegisterComplete.MAXIMIZED_BOTH);
            dispose();
        }
        catch (SQLException err) {
            System.out.println( err.getMessage( ));
            
        }
        
    }//GEN-LAST:event_jButtonRegistrerActionPerformed

    private void jButtonTilbakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTilbakeActionPerformed
     dispose ();         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTilbakeActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrerBruker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrerBruker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrerBruker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrerBruker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrerBruker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrer;
    private javax.swing.JButton jButtonTilbake;
    private javax.swing.JComboBox jComboBoxFagkode;
    private javax.swing.JComboBox jComboBoxRolle;
    private javax.swing.JLabel jLabelEpost;
    private javax.swing.JLabel jLabelEtternavn;
    private javax.swing.JLabel jLabelFagkode;
    private javax.swing.JLabel jLabelFornavn;
    private javax.swing.JLabel jLabelPassord;
    private javax.swing.JLabel jLabelRolle;
    private javax.swing.JLabel jLabelÅrstall;
    private javax.swing.JPanel jPanelMainBotoom;
    private javax.swing.JPanel jPanelMainCenter;
    private javax.swing.JPanel jPanelMainLeft;
    private javax.swing.JPanel jPanelMainRigth;
    private javax.swing.JPanel jPanelMainTop;
    private javax.swing.JPasswordField jPasswordFieldRegister;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldKull;
    private javax.swing.JTextField jTextFieldLastname;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}


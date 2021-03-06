/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit.client.foreleser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextArea;
import slit.Constants;
import slit.Main;

/**
 *
 * @author Sondre
 * 
 */

public class StudentProfil extends javax.swing.JFrame {

    /**
     * Creates new form StudentProfil
     */
    private static String profilStatusrapport = "";
    private int profilStatusrapportInt = 0;
    final static String newline = "\n";
    public String getProfilStatusrapport() {
        return profilStatusrapport;
    }

    public void setProfilStatusrapport(String profilStatusrapport) {
        this.profilStatusrapport = profilStatusrapport;
    }
   

    public int getProfilStatusrapportInt() {
        return profilStatusrapportInt;
    }

    public void setProfilStatusrapportInt(int profilStatusrapportInt) {
        this.profilStatusrapportInt = profilStatusrapportInt;
    }
   

    
   
    public StudentProfil() {
       
        initComponents();
        jLabel1.setText(mainWindowForeleser.getBrukerNavn());
        visInnleveringer();
         
    }
    public void visInnleveringer() {
        try {
        String SQL1 = ("SELECT * FROM Bruker WHERE brukerFornavn = '"+mainWindowForeleser.getBrukerNavn()+"'");
        Connection con = DriverManager.getConnection(Constants.db_url,Constants.db_user, Constants.db_pass);
        Statement stmt2 = con.createStatement();
        ResultSet result = stmt2.executeQuery(SQL1);
        int brukerId = 0;
        if (result.next()) {
            brukerId = result.getInt("brukerId");
        }
        String SQL2 = ("SELECT * FROM Sensur WHERE Bruker_brukerId = '"+brukerId+"'");
        
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(SQL2);
        String vurdering = "";
        int modulFilId = 0;
        String modulFilIdString = "";
        String resultat = "";
        String modul = "";
        while (rs.next()) {
            vurdering = rs.getString("sensurVurdering");
            modulFilIdString = String.valueOf(rs.getInt("Modulfil_modulfilId"));
            resultat = rs.getString("sensurResultat");
            modul = rs.getString("sensurModul");
            jTextAreaModulResultat.append ("Modul fil ID:" + " " + modulFilIdString + newline + 
                "Modul:" + " " + modul + newline +
                "Forelesers vurdering:" + " " +vurdering + newline +
                "Resultat:" + " " + resultat + newline + newline);
        }
                 
        }
        catch (SQLException err) {
            System.out.println(err);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaStatusrapport = new javax.swing.JTextArea();
        jButtonStatusrapport = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaModulResultat = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextAreaStatusrapport.setEditable(false);
        jTextAreaStatusrapport.setColumns(20);
        jTextAreaStatusrapport.setRows(5);
        jScrollPane1.setViewportView(jTextAreaStatusrapport);

        jButtonStatusrapport.setText("Hent statusrapport");
        jButtonStatusrapport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStatusrapportActionPerformed(evt);
            }
        });

        jTextAreaModulResultat.setEditable(false);
        jTextAreaModulResultat.setColumns(20);
        jTextAreaModulResultat.setRows(5);
        jScrollPane2.setViewportView(jTextAreaModulResultat);

        jLabel2.setText("Innleveringer med tilbakemelding:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonStatusrapport))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonStatusrapport)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonStatusrapportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStatusrapportActionPerformed
        // TODO add your handling code here:
        slit.db.profilStatusrapport();
        jTextAreaStatusrapport.setText(getProfilStatusrapport());
      //  jTextAreaStatusrapportTimer.setText("Timer og ukenummer:" + String.valueOf(getProfilStatusrapportInt()));
    }//GEN-LAST:event_jButtonStatusrapportActionPerformed

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
            java.util.logging.Logger.getLogger(StudentProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentProfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonStatusrapport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaModulResultat;
    private javax.swing.JTextArea jTextAreaStatusrapport;
    // End of variables declaration//GEN-END:variables
}

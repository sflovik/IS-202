/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit.Sensur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Michael
 */
public class Sensur extends javax.swing.JFrame {
    
Connection connection=null;
PreparedStatement ps=null;
ResultSet rs=null;
    
    /**
     * Creates new form Sensur
     */
    public Sensur() {
        initComponents();
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
        sensorField = new javax.swing.JTextField();
        sensorLabel = new javax.swing.JLabel();
        beskrivelseLabel = new javax.swing.JLabel();
        elevField = new javax.swing.JTextField();
        vurderingLabel = new javax.swing.JLabel();
        besvarelseLabel = new javax.swing.JLabel();
        elevLabel = new javax.swing.JLabel();
        modulField = new javax.swing.JTextField();
        besvarelseField = new javax.swing.JTextField();
        submitSensur = new javax.swing.JButton();
        godkjentLabel = new javax.swing.JLabel();
        godkjentField = new javax.swing.JTextField();
        kommentarField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Sensur");

        sensorField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        sensorLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        sensorLabel.setText("Sensor:");

        beskrivelseLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        beskrivelseLabel.setText("Modulbeskrivelse:");

        elevField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        elevField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevFieldActionPerformed(evt);
            }
        });

        vurderingLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        vurderingLabel.setText("Sensors kommentar:");

        besvarelseLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        besvarelseLabel.setText("Besvarelse:");

        elevLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        elevLabel.setText("Elev:");

        modulField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        besvarelseField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        besvarelseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                besvarelseFieldActionPerformed(evt);
            }
        });

        submitSensur.setText("Ferdig");
        submitSensur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitSensurActionPerformed(evt);
            }
        });

        godkjentLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        godkjentLabel.setText("Godkjent/Ikke godkjent:");

        godkjentField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        kommentarField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(elevLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sensorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(beskrivelseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(besvarelseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vurderingLabel)
                            .addComponent(godkjentLabel))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(godkjentField)
                            .addComponent(elevField)
                            .addComponent(sensorField)
                            .addComponent(besvarelseField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modulField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(submitSensur, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(kommentarField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(sensorLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sensorField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(elevLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(elevField, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(beskrivelseLabel)
                    .addComponent(modulField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(besvarelseField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(besvarelseLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vurderingLabel)
                    .addComponent(kommentarField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(godkjentField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(godkjentLabel))
                .addGap(39, 39, 39)
                .addComponent(submitSensur, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elevFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elevFieldActionPerformed

    private void besvarelseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_besvarelseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_besvarelseFieldActionPerformed

    private void submitSensurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitSensurActionPerformed
        // fyll ut skjema, elev og besvarelsefeltene fylles inn med brukerId og filId foreløpig. 
        {
    try
        {
         
        Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/slit","root","root");
        System.out.println("Connection Established Succcesfully...");
        
        
        ps=connection.prepareStatement("INSERT INTO sensur(sensurSensor, sensurModul, sensurVurdering, Modulfil_modulfilId, Bruker_brukerId, sensurResultat) VALUES(?,?,?,?,?,?)");
        ps.setObject(1, sensorField.getText());
        ps.setObject(2, modulField.getText());
        ps.setObject(3, kommentarField.getText());
        ps.setInt(4, Integer.parseInt(besvarelseField.getText()));
        ps.setInt(5, Integer.parseInt(elevField.getText()));
        ps.setObject(6, godkjentField.getText());
        
        int val=ps.executeUpdate();
        if(val>=1)JOptionPane.showMessageDialog(this, "Sensuren er gitt");
        else
        JOptionPane.showMessageDialog(this, "Error");
        }catch(Exception e)
        {

        JOptionPane.showMessageDialog(this, e.getMessage());
        e.printStackTrace();
        }
        }
        
this.dispose();
    }//GEN-LAST:event_submitSensurActionPerformed

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
            java.util.logging.Logger.getLogger(Sensur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sensur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sensur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sensur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sensur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel beskrivelseLabel;
    private javax.swing.JTextField besvarelseField;
    private javax.swing.JLabel besvarelseLabel;
    private javax.swing.JTextField elevField;
    private javax.swing.JLabel elevLabel;
    private javax.swing.JTextField godkjentField;
    private javax.swing.JLabel godkjentLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField kommentarField;
    private javax.swing.JTextField modulField;
    private javax.swing.JTextField sensorField;
    private javax.swing.JLabel sensorLabel;
    private javax.swing.JButton submitSensur;
    private javax.swing.JLabel vurderingLabel;
    // End of variables declaration//GEN-END:variables
}

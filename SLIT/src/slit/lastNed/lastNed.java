/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit.lastNed;
import javax.swing.JFileChooser;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael
 */
public class lastNed extends javax.swing.JFrame {
private static final int BUFFER_SIZE = 4096;    
    /**
     * Creates new form lastOpp
     */
    public lastNed() {
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
        jLabel2 = new javax.swing.JLabel();
        elevLastned = new javax.swing.JTextField();
        lastnedButton = new javax.swing.JButton();
        lastnedExit = new javax.swing.JButton();
        modulLastned = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        etternavnLastned = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Modul Nedlastning");

        jLabel2.setText("Elev fornavn:");

        elevLastned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevLastnedActionPerformed(evt);
            }
        });

        lastnedButton.setText("Lagre som..");
        lastnedButton.setToolTipText("Velg directory og skriv filtype etter navnet du velger, så hvis du skal lagre et bilde lagre det som bildejegvilse.jpg");
        lastnedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnedButtonActionPerformed(evt);
            }
        });

        lastnedExit.setText("Ferdig");
        lastnedExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnedExitActionPerformed(evt);
            }
        });

        jLabel4.setText("Modulnummer:");

        jLabel3.setText("Elev etternavn:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastnedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etternavnLastned, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastnedExit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(elevLastned)
                            .addComponent(modulLastned))))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modulLastned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(elevLastned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etternavnLastned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addComponent(lastnedButton)
                .addGap(18, 18, 18)
                .addComponent(lastnedExit)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastnedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnedButtonActionPerformed
        /**
         * man entrer i textfeltene hvilken modul filen du vil laste ned hører til, og så brukerid på eleven som lastet den opp
         * deretter bruker man filevelger til å velge hvor man vil lagre filen og navn. Man må selv velge filtype foreløpig.
         * support for navn input til brukerid coming soon
         */
        {
    try
        {
         

        String url = "jdbc:mysql://localhost:3306/slit";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);
        
    
        JFileChooser chooser=new JFileChooser();
        chooser.showSaveDialog(null);
        String filePath=chooser.getSelectedFile().getAbsolutePath();

    if(filePath!=null)
    {
    String sql = "SELECT modulfilBlob FROM modulnedlast WHERE Modul_modulNummer=? AND brukerFornavn=? AND brukerEtternavn=?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setObject(1, modulLastned.getText());
            statement.setObject(2, elevLastned.getText());
            statement.setObject(3, etternavnLastned.getText());
            
 
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                Blob blob = result.getBlob("modulfilBlob");
                InputStream inputStream = blob.getBinaryStream();
                OutputStream outputStream = new FileOutputStream(filePath);
 
                int bytesRead = -1;
                byte[] buffer = new byte[BUFFER_SIZE];
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
 
                inputStream.close();
                outputStream.close();
                System.out.println("File saved");
                JOptionPane.showMessageDialog(this, "Modulfil lastet ned");
            }
            connection.close();
    }}
    catch (SQLException ex) 
    {
            ex.printStackTrace();
    } 
    catch (IOException ex) 
                {
        ex.printStackTrace();
                }
        }
    
    



    }//GEN-LAST:event_lastnedButtonActionPerformed

    private void lastnedExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnedExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lastnedExitActionPerformed

    private void elevLastnedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevLastnedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elevLastnedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField elevLastned;
    private javax.swing.JTextField etternavnLastned;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton lastnedButton;
    private javax.swing.JButton lastnedExit;
    private javax.swing.JTextField modulLastned;
    // End of variables declaration//GEN-END:variables


}



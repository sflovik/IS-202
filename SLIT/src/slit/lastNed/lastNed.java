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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Modul Nedlastning");

        jLabel2.setText("Elev:");

        elevLastned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevLastnedActionPerformed(evt);
            }
        });

        lastnedButton.setText("Lagre som..");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastnedExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lastnedButton, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
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
                .addGap(36, 36, 36)
                .addComponent(lastnedButton)
                .addGap(37, 37, 37)
                .addComponent(lastnedExit)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastnedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnedButtonActionPerformed
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
    String sql = "SELECT modulfilBlob FROM modulfil WHERE Modul_modulNummer=? AND Bruker_brukerId=? ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setObject(1, modulLastned.getText());
            statement.setObject(2, elevLastned.getText());
            
 
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton lastnedButton;
    private javax.swing.JButton lastnedExit;
    private javax.swing.JTextField modulLastned;
    // End of variables declaration//GEN-END:variables


}



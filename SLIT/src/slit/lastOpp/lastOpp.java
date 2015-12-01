/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit.lastOpp;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author Michael
 */
public class lastOpp extends javax.swing.JFrame {
    
Connection connection=null;
PreparedStatement ps=null;
ResultSet rs=null;
String filePath=null;


    /**
     * Creates new form lastOpp
     */
    public lastOpp() {
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
        jLabel3 = new javax.swing.JLabel();
        tittelField = new javax.swing.JTextField();
        versjonField = new javax.swing.JTextField();
        lastoppButton = new javax.swing.JButton();
        lastoppExit = new javax.swing.JButton();
        modulField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Modul Opplastning");

        jLabel2.setText("Tittel:");

        jLabel3.setText("Versjon:");

        tittelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tittelFieldActionPerformed(evt);
            }
        });

        versjonField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                versjonFieldActionPerformed(evt);
            }
        });

        lastoppButton.setText("Velg Fil");
        lastoppButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastoppButtonActionPerformed(evt);
            }
        });

        lastoppExit.setText("Ferdig");
        lastoppExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastoppExitActionPerformed(evt);
            }
        });

        jLabel4.setText("Modulnummer:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(modulField)
                    .addComponent(tittelField)
                    .addComponent(lastoppButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lastoppExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(versjonField))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modulField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tittelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(versjonField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addComponent(lastoppButton)
                .addGap(18, 18, 18)
                .addComponent(lastoppExit)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void versjonFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_versjonFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_versjonFieldActionPerformed

    private void lastoppButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastoppButtonActionPerformed
        /**
         * man skriver inn informasjonen den ber om og så bruker man filvelger til å velge hvilken fil man vil laste opp til databasen
         */
        {
    try
        {
         

    Class.forName("com.mysql.jdbc.Driver");
    connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/slit","root","root");
    System.out.println("Connection Established Succcesfully...");
    
    JFileChooser chooser=new JFileChooser(new File("E:\\"));
    chooser.setMultiSelectionEnabled(false);
    chooser.setVisible(true);
    chooser.showOpenDialog(this);

    File file=chooser.getSelectedFile();
    if(file!=null){filePath=file.getPath();}


    if(filePath!=null && check())
    {
    ps=connection.prepareStatement("INSERT INTO modulfil(modulfilTittel, modulfilVersjon, modulfilBlob, Modul_modulNummer, Bruker_brukerId, modulfilDato) VALUES(?,?,?,?,?,NOW()); ");
    FileInputStream fileInputStream=new FileInputStream(filePath);
    byte b[]=new byte[fileInputStream.available()];
    fileInputStream.read(b);
    fileInputStream.close();
    ps.setObject(1, tittelField.getText());
    ps.setBytes(3, b);
    ps.setObject(2, versjonField.getText());
    ps.setObject(4, modulField.getText());
    ps.setInt(5, slit.Main.user.getId());


    int val=ps.executeUpdate();
    if(val>=1)JOptionPane.showMessageDialog(this, "Din fil ble lastet opp til databasen");
    else
    JOptionPane.showMessageDialog(this, "Error");

    }
    else
    {
    JOptionPane.showMessageDialog(this,"Velg riktig filtype");
    }

    }catch(Exception e)
    {

    JOptionPane.showMessageDialog(this, e.getMessage());
    e.printStackTrace();
    }
    }
    }//GEN-LAST:event_lastoppButtonActionPerformed

    private void lastoppExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastoppExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lastoppExitActionPerformed

    private void tittelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tittelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tittelFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton lastoppButton;
    private javax.swing.JButton lastoppExit;
    private javax.swing.JTextField modulField;
    private javax.swing.JTextField tittelField;
    private javax.swing.JTextField versjonField;
    // End of variables declaration//GEN-END:variables


private boolean check() {
if(filePath!=null)
{
if(filePath.endsWith(".jpeg")||filePath.endsWith(".jpg")||filePath.endsWith(".JPEG")||filePath.endsWith(".docx")||filePath.endsWith(".JPG") || filePath.endsWith(".rar") || filePath.endsWith(".jar") || filePath.endsWith(".zip") || filePath.endsWith(".doc"))
{
return true;
}
return false;
}
return false;
}
}




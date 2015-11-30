/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static slit.mainWindow.newline;

/**
 *
 * @author Sondre/Michael
 */
public class moduleInformationWindow extends javax.swing.JFrame {

    /**
     * Creates new form moduleInformationWindow
     */
   
    public moduleInformationWindow() {
        initComponents();
    
        
        switch (mainWindow.getModulTrykket()) {
            case "modul 1":
                try {
                    Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
                    
                    Statement stmt = con.createStatement( );
                    String SQL ="SELECT * FROM Modul WHERE modulNummer = 1";
                    ResultSet result = stmt.executeQuery (SQL);
                    
           
                    String emne = "";
                    String læringsmål ="";
                    String kriterie = "";
                    String ressurser = "";
                    String tidsfrist ="";
                    String lærer ="";
                    String kapittel ="";
                    
                    if (result.next() ) {
                        emne = result.getString("modulEmne");
                        læringsmål = result.getString("modulLæringsmål");
                        kriterie = result.getString("modulKriterie");
                        ressurser = result.getString("modulRessurs");
                        tidsfrist = result.getString("modulFrist");
                        lærer = result.getString("modulLærer");
                        kapittel = result.getString("modulKapittel");
                        jLabelTitle1.setText(emne);
                        jLabelTidsfrist.setText(tidsfrist);
                        jTextAreaLæringsmål.setText(læringsmål);
                        jTextAreaRessurs.setText(ressurser);
                        jTextAreaKriterie.append(kriterie);
                        modulLærer.setText(lærer);
                        modulKapittel.setText(kapittel);
                        
                    }
                    else  {
                        JOptionPane.showMessageDialog(null, "Modulen er ikke publisert enda");
                    }
                }
                catch (SQLException err) {
                    System.out.println( err.getMessage( ));
                    
                }   
                break;
            case "modul 2":
                try {
                    Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
                    
                    Statement stmt = con.createStatement( );
                    String SQL ="SELECT * FROM Modul WHERE modulNummer = 2";
                    ResultSet result = stmt.executeQuery (SQL);
                    
           
                    String emne = "";
                    String læringsmål ="";
                    String kriterie = "";
                    String ressurser = "";
                    String tidsfrist ="";
                    
                    if (result.next() ) {
                        emne = result.getString("modulEmne");
                        læringsmål = result.getString("modulLæringsmål");
                        kriterie = result.getString("modulKriterie");
                        ressurser = result.getString("modulRessurs");
                        tidsfrist = result.getString("modulFrist");
                        jLabelTidsfrist.setText(tidsfrist);
                        jTextAreaLæringsmål.setText(læringsmål);
                        jTextAreaRessurs.setText(ressurser);
                        jTextAreaKriterie.append(kriterie);
                        jLabelTitle1.setText(emne);
                        
                        
                    }
                    else  {
                        JOptionPane.showMessageDialog(null, "Modulen er ikke publisert enda");
                    }
                }
                catch (SQLException err) {
                    System.out.println( err.getMessage( ));
                    
                }   
                break;
            case "modul 3":
                try {
                    Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
                    
                    Statement stmt = con.createStatement( );
                    String SQL ="SELECT * FROM Modul WHERE modulNummer = 3";
                    ResultSet result = stmt.executeQuery (SQL);
                    
           
                    String emne = "";
                    String læringsmål ="";
                    String kriterie = "";
                    String ressurser = "";
                    String tidsfrist ="";
                    
                    if (result.next() ) {
                        emne = result.getString("modulEmne");
                        læringsmål = result.getString("modulLæringsmål");
                        kriterie = result.getString("modulKriterie");
                        ressurser = result.getString("modulRessurs");
                        tidsfrist = result.getString("modulFrist");
                        jLabelTitle1.setText(emne);
                        jLabelTidsfrist.setText(tidsfrist);
                        jTextAreaLæringsmål.setText(læringsmål);
                        jTextAreaRessurs.setText(ressurser);
                        jTextAreaKriterie.append(kriterie);
                        
                        
                    }
                    else  {
                      JOptionPane.showMessageDialog(null, "Modulen er ikke publisert enda");    
                    {
    // do something
}
                    }
                }
                catch (SQLException err) {
                    System.out.println( err.getMessage( ));
                    
                }   
                break;
            case "modul 4":
                try {
                    Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
                    
                    Statement stmt = con.createStatement( );
                    String SQL ="SELECT * FROM Modul WHERE modulNummer = 4";
                    ResultSet result = stmt.executeQuery (SQL);
                    
           
                    String emne = "";
                    String læringsmål ="";
                    String kriterie = "";
                    String ressurser = "";
                    String tidsfrist ="";
                    
                    if (result.next() ) {
                        emne = result.getString("modulEmne");
                        læringsmål = result.getString("modulLæringsmål");
                        kriterie = result.getString("modulKriterie");
                        ressurser = result.getString("modulRessurs");
                        tidsfrist = result.getString("modulFrist");
                        jLabelTidsfrist.setText(tidsfrist);
                        jTextAreaLæringsmål.setText(læringsmål);
                        jTextAreaRessurs.setText(ressurser);
                        jTextAreaKriterie.append(kriterie);
                        jLabelTitle1.setText(emne); 
                        
                    }
                    else  {
                        JOptionPane.showMessageDialog(null, "Modulen er ikke publisert enda");
                    }
                }
                catch (SQLException err) {
                    System.out.println( err.getMessage( ));
                    
                }   
                break;
              
            case "modul 5":
                try {
                    Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
                    
                    Statement stmt = con.createStatement( );
                    String SQL ="SELECT * FROM Modul WHERE modulNummer = 5";
                    ResultSet result = stmt.executeQuery (SQL);
                    
           
                    String emne = "";
                    String læringsmål ="";
                    String kriterie = "";
                    String ressurser = "";
                    String tidsfrist ="";
                    
                    if (result.next() ) {
                        emne = result.getString("modulEmne");
                        læringsmål = result.getString("modulLæringsmål");
                        kriterie = result.getString("modulKriterie");
                        ressurser = result.getString("modulRessurs");
                        tidsfrist = result.getString("modulFrist");
                        jLabelTidsfrist.setText(tidsfrist);
                        jTextAreaLæringsmål.setText(læringsmål);
                        jTextAreaRessurs.setText(ressurser);
                        jTextAreaKriterie.append(kriterie);
                        jLabelTitle1.setText(emne);
                        
                        
                    }
                    else  {
                        JOptionPane.showMessageDialog(null, "Modulen er ikke publisert enda");
                    }
                }
                catch (SQLException err) {
                    System.out.println( err.getMessage( ));
                    
                }   
                break;
            case "modul 6":
                try {
                    Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
                    
                    Statement stmt = con.createStatement( );
                    String SQL ="SELECT * FROM Modul WHERE modulNummer = 6";
                    ResultSet result = stmt.executeQuery (SQL);
                    
           
                    String emne = "";
                    String læringsmål ="";
                    String kriterie = "";
                    String ressurser = "";
                    String tidsfrist ="";
                    
                    if (result.next() ) {
                        emne = result.getString("modulEmne");
                        læringsmål = result.getString("modulLæringsmål");
                        kriterie = result.getString("modulKriterie");
                        ressurser = result.getString("modulRessurs");
                        tidsfrist = result.getString("modulFrist");
                        jLabelTidsfrist.setText(tidsfrist);
                        jTextAreaLæringsmål.setText(læringsmål);
                        jTextAreaRessurs.setText(ressurser);
                        jTextAreaKriterie.append(kriterie);
                        jLabelTitle1.setText(emne);
                        
                    }
                    else  {
                        JOptionPane.showMessageDialog(null, "Modulen er ikke publisert enda");
                    }
                }
                catch (SQLException err) {
                    System.out.println( err.getMessage( ));
                    
                }   
                break;
            case "modul 7":
                try {
                    Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
                    
                    Statement stmt = con.createStatement( );
                    String SQL ="SELECT * FROM Modul WHERE modulNummer = 7";
                    ResultSet result = stmt.executeQuery (SQL);
                    
           
                    String emne = "";
                    String læringsmål ="";
                    String kriterie = "";
                    String ressurser = "";
                    String tidsfrist ="";
                    
                    if (result.next() ) {
                        emne = result.getString("modulEmne");
                        læringsmål = result.getString("modulLæringsmål");
                        kriterie = result.getString("modulKriterie");
                        ressurser = result.getString("modulRessurs");
                        tidsfrist = result.getString("modulFrist");
                        jLabelTidsfrist.setText(tidsfrist);
                        jTextAreaLæringsmål.setText(læringsmål);
                        jTextAreaRessurs.setText(ressurser);
                        jTextAreaKriterie.append(kriterie);
                        jLabelTitle1.setText(emne);
                        
                    }
                    else  {
                        JOptionPane.showMessageDialog(null, "Modulen er ikke publisert enda");
                    }
                }
                catch (SQLException err) {
                    System.out.println( err.getMessage( ));
                    
                }   
                break;
            case "modul 8":
                try {
                    Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
                    
                    Statement stmt = con.createStatement( );
                    String SQL ="SELECT * FROM Modul WHERE modulNummer = 8";
                    ResultSet result = stmt.executeQuery (SQL);
                    
           
                    String emne = "";
                    String læringsmål ="";
                    String kriterie = "";
                    String ressurser = "";
                    String tidsfrist ="";
                    
                    if (result.next() ) {
                        emne = result.getString("modulEmne");
                        læringsmål = result.getString("modulLæringsmål");
                        kriterie = result.getString("modulKriterie");
                        ressurser = result.getString("modulRessurs");
                        tidsfrist = result.getString("modulFrist");
                        jLabelTidsfrist.setText(tidsfrist);
                        jTextAreaLæringsmål.setText(læringsmål);
                        jTextAreaRessurs.setText(ressurser);
                        jTextAreaKriterie.append(kriterie);
                        jLabelTitle1.setText(emne);
                        
                    }
                    else  {
                        JOptionPane.showMessageDialog(null, "Modulen er ikke publisert enda");
                    }
                }
                catch (SQLException err) {
                    System.out.println( err.getMessage( ));
                    
                }   
                break;
            case "modul 9":
                try {
                    Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
                    
                    Statement stmt = con.createStatement( );
                    String SQL ="SELECT * FROM Modul WHERE modulNummer = 9";
                    ResultSet result = stmt.executeQuery (SQL);
                    
           
                    String emne = "";
                    String læringsmål ="";
                    String kriterie = "";
                    String ressurser = "";
                    String tidsfrist ="";
                    
                    if (result.next() ) {
                        emne = result.getString("modulEmne");
                        læringsmål = result.getString("modulLæringsmål");
                        kriterie = result.getString("modulKriterie");
                        ressurser = result.getString("modulRessurs");
                        tidsfrist = result.getString("modulFrist");
                        jLabelTidsfrist.setText(tidsfrist);
                        jTextAreaLæringsmål.setText(læringsmål);
                        jTextAreaRessurs.setText(ressurser);
                        jTextAreaKriterie.append(kriterie);
                        jLabelTitle1.setText(emne);
                        
                    }
                    else  {
                        JOptionPane.showMessageDialog(null, "Modulen er ikke publisert enda");
                    }
                }
                catch (SQLException err) {
                    System.out.println( err.getMessage( ));
                    
                }   
                break;
            case "modul 10":
               try {
                    Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
                    
                    Statement stmt = con.createStatement( );
                    String SQL ="SELECT * FROM Modul WHERE modulNummer = 10";
                    ResultSet result = stmt.executeQuery (SQL);
                    
           
                    String emne = "";
                    String læringsmål ="";
                    String kriterie = "";
                    String ressurser = "";
                    String tidsfrist ="";
                    
                    if (result.next() ) {
                        emne = result.getString("modulEmne");
                        læringsmål = result.getString("modulLæringsmål");
                        kriterie = result.getString("modulKriterie");
                        ressurser = result.getString("modulRessurs");
                        tidsfrist = result.getString("modulFrist");
                        jLabelTidsfrist.setText(tidsfrist);
                        jTextAreaLæringsmål.setText(læringsmål);
                        jTextAreaRessurs.setText(ressurser);
                        jTextAreaKriterie.append(kriterie);
                        jLabelTitle1.setText(emne);
                        
                    }
                    else  {
                        JOptionPane.showMessageDialog(null, "Modulen er ikke publisert enda");
                    }
                }
                catch (SQLException err) {
                    System.out.println( err.getMessage( ));
                    
                }   
                break;
            case "modul 11":
               try {
                    Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
                    
                    Statement stmt = con.createStatement( );
                    String SQL ="SELECT * FROM Modul WHERE modulNummer = 11";
                    ResultSet result = stmt.executeQuery (SQL);
                    
           
                    String emne = "";
                    String læringsmål ="";
                    String kriterie = "";
                    String ressurser = "";
                    String tidsfrist ="";
                    
                    if (result.next() ) {
                        emne = result.getString("modulEmne");
                        læringsmål = result.getString("modulLæringsmål");
                        kriterie = result.getString("modulKriterie");
                        ressurser = result.getString("modulRessurs");
                        tidsfrist = result.getString("modulFrist");
                        jLabelTidsfrist.setText(tidsfrist);
                        jTextAreaLæringsmål.setText(læringsmål);
                        jTextAreaRessurs.setText(ressurser);
                        jTextAreaKriterie.append(kriterie);
                        jLabelTitle1.setText(emne);
                        
                    }
                    else  {
                        JOptionPane.showMessageDialog(null, "Modulen er ikke publisert enda");
                    }
                }
                catch (SQLException err) {
                    System.out.println( err.getMessage( ));
                    
                }   
                break;
            case "modul 12":
                try {
                    Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
                    
                    Statement stmt = con.createStatement( );
                    String SQL ="SELECT * FROM Modul WHERE modulNummer = 12";
                    ResultSet result = stmt.executeQuery (SQL);
                    
           
                    String emne = "";
                    String læringsmål ="";
                    String kriterie = "";
                    String ressurser = "";
                    String tidsfrist ="";
                    
                    if (result.next() ) {
                        emne = result.getString("modulEmne");
                        læringsmål = result.getString("modulLæringsmål");
                        kriterie = result.getString("modulKriterie");
                        ressurser = result.getString("modulRessurs");
                        tidsfrist = result.getString("modulFrist");
                        jLabelTidsfrist.setText(tidsfrist);
                        jTextAreaLæringsmål.setText(læringsmål);
                        jTextAreaRessurs.setText(ressurser);
                        jTextAreaKriterie.append(kriterie);
                        jLabelTitle1.setText(emne);
                    }
                    else  {
                        JOptionPane.showMessageDialog(null, "Modulen er ikke publisert enda");
                    }
                }
                catch (SQLException err) {
                    System.out.println( err.getMessage( ));
                    
                }   
                break;
            case "modul 13":
                try {
                    Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
                    
                    Statement stmt = con.createStatement( );
                    String SQL ="SELECT * FROM Modul WHERE modulNummer = 13";
                    ResultSet result = stmt.executeQuery (SQL);
                    
           
                    String emne = "";
                    String læringsmål ="";
                    String kriterie = "";
                    String ressurser = "";
                    String tidsfrist ="";
                    
                    if (result.next() ) {
                        emne = result.getString("modulEmne");
                        læringsmål = result.getString("modulLæringsmål");
                        kriterie = result.getString("modulKriterie");
                        ressurser = result.getString("modulRessurs");
                        tidsfrist = result.getString("modulFrist");
                        jLabelTidsfrist.setText(tidsfrist);
                        jTextAreaLæringsmål.setText(læringsmål);
                        jTextAreaRessurs.setText(ressurser);
                        jTextAreaKriterie.append(kriterie);
                        jLabelTitle1.setText(emne);
                        
                    }
                    else  {
                        JOptionPane.showMessageDialog(null, "Modulen er ikke publisert enda");
                    }
                }
                catch (SQLException err) {
                    System.out.println( err.getMessage( ));
                    
                }   
                break;
            case "modul 14":
                try {
                    Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
                    
                    Statement stmt = con.createStatement( );
                    String SQL ="SELECT * FROM Modul WHERE modulNummer = 14";
                    ResultSet result = stmt.executeQuery (SQL);
                    
           
                    String emne = "";
                    String læringsmål ="";
                    String kriterie = "";
                    String ressurser = "";
                    String tidsfrist ="";
                    
                    if (result.next() ) {
                        emne = result.getString("modulEmne");
                        læringsmål = result.getString("modulLæringsmål");
                        kriterie = result.getString("modulKriterie");
                        ressurser = result.getString("modulRessurs");
                        tidsfrist = result.getString("modulFrist");
                        jLabelTitle1.setText(emne);
                        jLabelTidsfrist.setText(tidsfrist);
                        jTextAreaLæringsmål.setText(læringsmål);
                        jTextAreaRessurs.setText(ressurser);
                        jTextAreaKriterie.append(kriterie);
                        jLabelTitle1.setText(emne);
                        
                    }
                    else  {
                        JOptionPane.showMessageDialog(null, "Modulen er ikke publisert enda");
                    }
                }
                catch (SQLException err) {
                    System.out.println( err.getMessage( ));
                    
                }   
                break;
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

        jPanelTopMain = new javax.swing.JPanel();
        jPanelTopCentre = new javax.swing.JPanel();
        jLabelTitle1 = new javax.swing.JLabel();
        jPanelBotMain = new javax.swing.JPanel();
        jPanelLeftMain = new javax.swing.JPanel();
        jPanelRightMain = new javax.swing.JPanel();
        jPanelCentreMain = new javax.swing.JPanel();
        jPanelCentreCentre = new javax.swing.JPanel();
        modulLærer = new javax.swing.JLabel();
        undervistAv = new javax.swing.JLabel();
        jLabelGodkjenning = new javax.swing.JLabel();
        jScrollPaneGodkjenning = new javax.swing.JScrollPane();
        jTextAreaKriterie = new javax.swing.JTextArea();
        jPanelCentreLeft = new javax.swing.JPanel();
        jLabelLæringsmål = new javax.swing.JLabel();
        jLabelRessurser = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaLæringsmål = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRessurs = new javax.swing.JTextArea();
        greetingLabel = new javax.swing.JLabel();
        modulKapittel = new javax.swing.JLabel();
        frist = new javax.swing.JLabel();
        jLabelTidsfrist = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitle1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTitle1.setText("Hey hå");
        jPanelTopCentre.add(jLabelTitle1);

        javax.swing.GroupLayout jPanelTopMainLayout = new javax.swing.GroupLayout(jPanelTopMain);
        jPanelTopMain.setLayout(jPanelTopMainLayout);
        jPanelTopMainLayout.setHorizontalGroup(
            jPanelTopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTopCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelTopMainLayout.setVerticalGroup(
            jPanelTopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopMainLayout.createSequentialGroup()
                .addComponent(jPanelTopCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTopMain, java.awt.BorderLayout.PAGE_START);

        jPanelBotMain.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanelBotMain, java.awt.BorderLayout.PAGE_END);

        jPanelLeftMain.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanelLeftMain, java.awt.BorderLayout.LINE_START);

        jPanelRightMain.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanelRightMain, java.awt.BorderLayout.LINE_END);

        modulLærer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modulLærer.setText("lærer");

        undervistAv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        undervistAv.setText("Undervist av:");

        jLabelGodkjenning.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelGodkjenning.setText("Godkjenningkrav:");

        jScrollPaneGodkjenning.setMinimumSize(new java.awt.Dimension(320, 146));
        jScrollPaneGodkjenning.setPreferredSize(new java.awt.Dimension(320, 146));

        jTextAreaKriterie.setEditable(false);
        jTextAreaKriterie.setColumns(20);
        jTextAreaKriterie.setRows(5);
        jTextAreaKriterie.setText("\n");
        jTextAreaKriterie.setMinimumSize(new java.awt.Dimension(320, 146));
        jTextAreaKriterie.setPreferredSize(new java.awt.Dimension(300, 50));
        jScrollPaneGodkjenning.setViewportView(jTextAreaKriterie);

        javax.swing.GroupLayout jPanelCentreCentreLayout = new javax.swing.GroupLayout(jPanelCentreCentre);
        jPanelCentreCentre.setLayout(jPanelCentreCentreLayout);
        jPanelCentreCentreLayout.setHorizontalGroup(
            jPanelCentreCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentreCentreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCentreCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCentreCentreLayout.createSequentialGroup()
                        .addComponent(undervistAv)
                        .addGap(27, 27, 27)
                        .addComponent(modulLærer))
                    .addComponent(jLabelGodkjenning)
                    .addComponent(jScrollPaneGodkjenning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanelCentreCentreLayout.setVerticalGroup(
            jPanelCentreCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentreCentreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCentreCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modulLærer)
                    .addComponent(undervistAv))
                .addGap(76, 76, 76)
                .addComponent(jLabelGodkjenning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jScrollPaneGodkjenning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelLæringsmål.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelLæringsmål.setText("Læringsmål:");

        jLabelRessurser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelRessurser.setText("Ressurser:");

        jTextAreaLæringsmål.setEditable(false);
        jTextAreaLæringsmål.setColumns(20);
        jTextAreaLæringsmål.setRows(5);
        jScrollPane2.setViewportView(jTextAreaLæringsmål);

        jTextAreaRessurs.setEditable(false);
        jTextAreaRessurs.setColumns(20);
        jTextAreaRessurs.setRows(5);
        jScrollPane1.setViewportView(jTextAreaRessurs);

        greetingLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        greetingLabel.setText("Velkommer til Kapittel:");

        modulKapittel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modulKapittel.setText("kapittel");

        frist.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        frist.setText("Leveres innen:");

        jLabelTidsfrist.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanelCentreLeftLayout = new javax.swing.GroupLayout(jPanelCentreLeft);
        jPanelCentreLeft.setLayout(jPanelCentreLeftLayout);
        jPanelCentreLeftLayout.setHorizontalGroup(
            jPanelCentreLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentreLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCentreLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCentreLeftLayout.createSequentialGroup()
                        .addGroup(jPanelCentreLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentreLeftLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(greetingLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(modulKapittel))
                            .addGroup(jPanelCentreLeftLayout.createSequentialGroup()
                                .addGroup(jPanelCentreLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelLæringsmål, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanelCentreLeftLayout.createSequentialGroup()
                        .addGroup(jPanelCentreLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRessurser)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanelCentreLeftLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(frist)
                .addGap(18, 18, 18)
                .addComponent(jLabelTidsfrist, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelCentreLeftLayout.setVerticalGroup(
            jPanelCentreLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentreLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCentreLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greetingLabel)
                    .addComponent(modulKapittel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabelLæringsmål, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabelRessurser)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(jPanelCentreLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frist)
                    .addComponent(jLabelTidsfrist, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout jPanelCentreMainLayout = new javax.swing.GroupLayout(jPanelCentreMain);
        jPanelCentreMain.setLayout(jPanelCentreMainLayout);
        jPanelCentreMainLayout.setHorizontalGroup(
            jPanelCentreMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentreMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCentreLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanelCentreCentre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCentreMainLayout.setVerticalGroup(
            jPanelCentreMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentreMainLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanelCentreMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCentreCentre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCentreLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCentreMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(moduleInformationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(moduleInformationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(moduleInformationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(moduleInformationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new moduleInformationWindow().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel frist;
    private javax.swing.JLabel greetingLabel;
    private javax.swing.JLabel jLabelGodkjenning;
    private javax.swing.JLabel jLabelLæringsmål;
    private javax.swing.JLabel jLabelRessurser;
    private javax.swing.JLabel jLabelTidsfrist;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JPanel jPanelBotMain;
    private javax.swing.JPanel jPanelCentreCentre;
    private javax.swing.JPanel jPanelCentreLeft;
    private javax.swing.JPanel jPanelCentreMain;
    private javax.swing.JPanel jPanelLeftMain;
    private javax.swing.JPanel jPanelRightMain;
    private javax.swing.JPanel jPanelTopCentre;
    private javax.swing.JPanel jPanelTopMain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneGodkjenning;
    private javax.swing.JTextArea jTextAreaKriterie;
    private javax.swing.JTextArea jTextAreaLæringsmål;
    private javax.swing.JTextArea jTextAreaRessurs;
    private javax.swing.JLabel modulKapittel;
    private javax.swing.JLabel modulLærer;
    private javax.swing.JLabel undervistAv;
    // End of variables declaration//GEN-END:variables
}

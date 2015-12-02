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
import javax.swing.JOptionPane;
import slit.Main;
import static slit.client.foreleser.mainWindowForeleser.newline;

/**
 *
 * @author Sondre, Michael, Erik, Christian Fredrik, Thomas, Gruppe 109
 * Modulinformasjonsvindu for foreleser. Relativt likt som for student, men her publiseres modulene
 */
public class moduleInformationWindowForeleser extends javax.swing.JFrame {

    /**
     * Creates new form moduleInformationWindow
     */
   
    public moduleInformationWindowForeleser() {
        initComponents();
        
        
        
    }
    /**
     * Switch med 14 caser, også her er dette løst tungvindt. Senere i klassen kommer et mye bedre eksempel
     */
    public void publiserModul() {
        switch (mainWindowForeleser.getModulTrykket()) {
            case "modul 1":
                try {
                    
                    Connection con = DriverManager.getConnection(slit.Constants.db_url, slit.Constants.db_user, slit.Constants.db_pass);
                    Statement stmt = con.createStatement();
                    String check = ("SELECT * FROM Modul");  
                    ResultSet rs = stmt.executeQuery(check);
                    int modulNr = 0;
                    boolean fortsett = true;
                    while (rs.next() && fortsett) {
                        modulNr = rs.getInt("modulNummer");
                            if (modulNr != 1) {
                                Statement nyModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String kapittel = jTextFieldKapittel.getText();
                                String foreleser = Main.user.getUser();
                                String SQL = ("INSERT INTO `modul`(modulNummer, modulKapittel, modulEmne, modulKriterie, modulFrist,"
                                    + " modulLærer, modulLæringsmål, modulRessurs)"
                                    + " VALUES ('"+1+"', '"+kapittel+"','"+emne+"','"+kriterie+"','"+tidsfrist+"','"+foreleser+"','"+læringsmål+"', '"+ressurser+"' )");
                                nyModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                            else if (modulNr == 1) {
                                Statement redigerModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String foreleser = Main.user.getUser();
                                String kapittel = jTextFieldKapittel.getText();       
                                String SQL = ("UPDATE `modul`SET modulEmne = '"+emne+"', modulKriterie = '"+kriterie+"'"
                                        + ",modulKapittel = '"+kapittel+"', modulFrist = '"+tidsfrist+"', modulLærer = '"+foreleser+"'"
                                        + " ,modulLæringsmål = '"+læringsmål+"' ,modulRessurs = '"+ressurser+"' WHERE modulNummer = 1");
                         
                                    
                                redigerModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                    }
                    
                    
                }
                catch (SQLException feil) {
                    System.out.println(feil);
                }
                
                
           
            break;
        case "modul 2":
                try {
                    
                    Connection con = DriverManager.getConnection(slit.Constants.db_url, slit.Constants.db_user, slit.Constants.db_pass);
                    Statement stmt = con.createStatement();
                    String check = ("SELECT * FROM modul");  
                    ResultSet rs = stmt.executeQuery(check);
                    int modulNr = 0;
                    boolean fortsett = true;
                    while (rs.next() && fortsett) {
                        modulNr = rs.getInt("modulNummer");
                            if (modulNr != 2) {
                                Statement nyModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String kapittel = jTextFieldKapittel.getText();
                                String foreleser = Main.user.getUser();
                                String SQL = ("INSERT INTO `Modul`(modulNummer, modulKapittel, modulEmne, modulKriterie, modulFrist,"
                                    + " modulLærer, modulLæringsmål, modulRessurs)"
                                    + " VALUES ('"+2+"', '"+kapittel+"','"+emne+"','"+kriterie+"','"+tidsfrist+"','"+foreleser+"','"+læringsmål+"', '"+ressurser+"' )");
                                nyModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                            else if (modulNr == 2) {
                                Statement redigerModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String foreleser = Main.user.getUser();
                                String kapittel = jTextFieldKapittel.getText();       
                                String SQL = ("UPDATE `Modul`SET modulEmne = '"+emne+"', modulKriterie = '"+kriterie+"'"
                                        + ",modulKapittel = '"+kapittel+"', modulFrist = '"+tidsfrist+"', modulLærer = '"+foreleser+"'"
                                        + " ,modulLæringsmål = '"+læringsmål+"' ,modulRessurs = '"+ressurser+"' WHERE modulNummer = 1");
                         
                                    
                                redigerModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                    }
                    
                    
                }
                catch (SQLException feil) {
                    System.out.println(feil);
                }
            break;
            case "modul 3":
                try {
                    
                    Connection con = DriverManager.getConnection(slit.Constants.db_url, slit.Constants.db_user, slit.Constants.db_pass);
                    Statement stmt = con.createStatement();
                    String check = ("SELECT * FROM Modul");  
                    ResultSet rs = stmt.executeQuery(check);
                    int modulNr = 0;
                    boolean fortsett = true;
                    while (rs.next() && fortsett) {
                        modulNr = rs.getInt("modulNummer");
                            if (modulNr != 3) {
                                Statement nyModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String kapittel = jTextFieldKapittel.getText();
                                String foreleser = Main.user.getUser();
                                String SQL = ("INSERT INTO `Modul`(modulNummer, modulKapittel, modulEmne, modulKriterie, modulFrist,"
                                    + " modulLærer, modulLæringsmål, modulRessurs)"
                                    + " VALUES ('"+3+"', '"+kapittel+"','"+emne+"','"+kriterie+"','"+tidsfrist+"','"+foreleser+"','"+læringsmål+"', '"+ressurser+"' )");
                                nyModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                            else if (modulNr == 3) {
                                Statement redigerModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String foreleser = Main.user.getUser();
                                String kapittel = jTextFieldKapittel.getText();       
                                String SQL = ("UPDATE `Modul`SET modulEmne = '"+emne+"', modulKriterie = '"+kriterie+"'"
                                        + ",modulKapittel = '"+kapittel+"', modulFrist = '"+tidsfrist+"', modulLærer = '"+foreleser+"'"
                                        + " ,modulLæringsmål = '"+læringsmål+"' ,modulRessurs = '"+ressurser+"' WHERE modulNummer = 1");
                         
                                    
                                redigerModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                    }
                    
                    
                }
                catch (SQLException feil) {
                    System.out.println(feil);
                }
            break;
        case "modul 4":
                try {
                    
                    Connection con = DriverManager.getConnection(slit.Constants.db_url, slit.Constants.db_user, slit.Constants.db_pass);
                    Statement stmt = con.createStatement();
                    String check = ("SELECT * FROM Modul");  
                    ResultSet rs = stmt.executeQuery(check);
                    int modulNr = 0;
                    boolean fortsett = true;
                    while (rs.next() && fortsett) {
                        modulNr = rs.getInt("modulNummer");
                            if (modulNr != 4) {
                                Statement nyModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String kapittel = jTextFieldKapittel.getText();
                                String foreleser = Main.user.getUser();
                                String SQL = ("INSERT INTO `Modul`(modulNummer, modulKapittel, modulEmne, modulKriterie, modulFrist,"
                                    + " modulLærer, modulLæringsmål, modulRessurs)"
                                    + " VALUES ('"+4+"', '"+kapittel+"','"+emne+"','"+kriterie+"','"+tidsfrist+"','"+foreleser+"','"+læringsmål+"', '"+ressurser+"' )");
                                nyModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                            else if (modulNr == 4) {
                                Statement redigerModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String foreleser = Main.user.getUser();
                                String kapittel = jTextFieldKapittel.getText();       
                                String SQL = ("UPDATE `Modul`SET modulEmne = '"+emne+"', modulKriterie = '"+kriterie+"'"
                                        + ",modulKapittel = '"+kapittel+"', modulFrist = '"+tidsfrist+"', modulLærer = '"+foreleser+"'"
                                        + " ,modulLæringsmål = '"+læringsmål+"' ,modulRessurs = '"+ressurser+"' WHERE modulNummer = 1");
                         
                                    
                                redigerModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                    }
                    
                    
                }
                catch (SQLException feil) {
                    System.out.println(feil);
                }
            break;  
            case "modul 5":
                try {
                    
                    Connection con = DriverManager.getConnection(slit.Constants.db_url, slit.Constants.db_user, slit.Constants.db_pass);
                    Statement stmt = con.createStatement();
                    String check = ("SELECT * FROM Modul");  
                    ResultSet rs = stmt.executeQuery(check);
                    int modulNr = 0;
                    boolean fortsett = true;
                    while (rs.next() && fortsett) {
                        modulNr = rs.getInt("modulNummer");
                            if (modulNr != 5) {
                                Statement nyModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String kapittel = jTextFieldKapittel.getText();
                                String foreleser = Main.user.getUser();
                                String SQL = ("INSERT INTO `Modul`(modulNummer, modulKapittel, modulEmne, modulKriterie, modulFrist,"
                                    + " modulLærer, modulLæringsmål, modulRessurs)"
                                    + " VALUES ('"+5+"', '"+kapittel+"','"+emne+"','"+kriterie+"','"+tidsfrist+"','"+foreleser+"','"+læringsmål+"', '"+ressurser+"' )");
                                nyModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                            else if (modulNr == 5) {
                                Statement redigerModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String foreleser = Main.user.getUser();
                                String kapittel = jTextFieldKapittel.getText();       
                                String SQL = ("UPDATE `Modul`SET modulEmne = '"+emne+"', modulKriterie = '"+kriterie+"'"
                                        + ",modulKapittel = '"+kapittel+"', modulFrist = '"+tidsfrist+"', modulLærer = '"+foreleser+"'"
                                        + " ,modulLæringsmål = '"+læringsmål+"' ,modulRessurs = '"+ressurser+"' WHERE modulNummer = 1");
                         
                                    
                                redigerModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                    }
                    
                    
                }
                catch (SQLException feil) {
                    System.out.println(feil);
                }
            break;
                case "modul 6":
                try {
                    
                    Connection con = DriverManager.getConnection(slit.Constants.db_url, slit.Constants.db_user, slit.Constants.db_pass);
                    Statement stmt = con.createStatement();
                    String check = ("SELECT * FROM Modul");  
                    ResultSet rs = stmt.executeQuery(check);
                    int modulNr = 0;
                    boolean fortsett = true;
                    while (rs.next() && fortsett) {
                        modulNr = rs.getInt("modulNummer");
                            if (modulNr != 6) {
                                Statement nyModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String kapittel = jTextFieldKapittel.getText();
                                String foreleser = Main.user.getUser();
                                String SQL = ("INSERT INTO `Modul`(modulNummer, modulKapittel, modulEmne, modulKriterie, modulFrist,"
                                    + " modulLærer, modulLæringsmål, modulRessurs)"
                                    + " VALUES ('"+6+"', '"+kapittel+"','"+emne+"','"+kriterie+"','"+tidsfrist+"','"+foreleser+"','"+læringsmål+"', '"+ressurser+"' )");
                                nyModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                            else if (modulNr == 6) {
                                Statement redigerModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String foreleser = Main.user.getUser();
                                String kapittel = jTextFieldKapittel.getText();       
                                String SQL = ("UPDATE `Modul`SET modulEmne = '"+emne+"', modulKriterie = '"+kriterie+"'"
                                        + ",modulKapittel = '"+kapittel+"', modulFrist = '"+tidsfrist+"', modulLærer = '"+foreleser+"'"
                                        + " ,modulLæringsmål = '"+læringsmål+"' ,modulRessurs = '"+ressurser+"' WHERE modulNummer = 1");
                         
                                    
                                redigerModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                    }
                    
                    
                }
                catch (SQLException feil) {
                    System.out.println(feil);
                }
            break;
                    case "modul 7":
                try {
                    
                    Connection con = DriverManager.getConnection(slit.Constants.db_url, slit.Constants.db_user, slit.Constants.db_pass);
                    Statement stmt = con.createStatement();
                    String check = ("SELECT * FROM Modul");  
                    ResultSet rs = stmt.executeQuery(check);
                    int modulNr = 0;
                    boolean fortsett = true;
                    while (rs.next() && fortsett) {
                        modulNr = rs.getInt("modulNummer");
                            if (modulNr != 7) {
                                Statement nyModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String kapittel = jTextFieldKapittel.getText();
                                String foreleser = Main.user.getUser();
                                String SQL = ("INSERT INTO `Modul`(modulNummer, modulKapittel, modulEmne, modulKriterie, modulFrist,"
                                    + " modulLærer, modulLæringsmål, modulRessurs)"
                                    + " VALUES ('"+7+"', '"+kapittel+"','"+emne+"','"+kriterie+"','"+tidsfrist+"','"+foreleser+"','"+læringsmål+"', '"+ressurser+"' )");
                                nyModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                            else if (modulNr == 7) {
                                Statement redigerModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String foreleser = Main.user.getUser();
                                String kapittel = jTextFieldKapittel.getText();       
                                String SQL = ("UPDATE `Modul`SET modulEmne = '"+emne+"', modulKriterie = '"+kriterie+"'"
                                        + ",modulKapittel = '"+kapittel+"', modulFrist = '"+tidsfrist+"', modulLærer = '"+foreleser+"'"
                                        + " ,modulLæringsmål = '"+læringsmål+"' ,modulRessurs = '"+ressurser+"' WHERE modulNummer = 1");
                         
                                    
                                redigerModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                    }
                    
                    
                }
                catch (SQLException feil) {
                    System.out.println(feil);
                }
            break;
            case "modul 8":
                try {
                    
                    Connection con = DriverManager.getConnection(slit.Constants.db_url, slit.Constants.db_user, slit.Constants.db_pass);
                    Statement stmt = con.createStatement();
                    String check = ("SELECT * FROM Modul");  
                    ResultSet rs = stmt.executeQuery(check);
                    int modulNr = 0;
                    boolean fortsett = true;
                    while (rs.next() && fortsett) {
                        modulNr = rs.getInt("modulNummer");
                            if (modulNr != 8) {
                                Statement nyModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String kapittel = jTextFieldKapittel.getText();
                                String foreleser = Main.user.getUser();
                                String SQL = ("INSERT INTO `Modul`(modulNummer, modulKapittel, modulEmne, modulKriterie, modulFrist,"
                                    + " modulLærer, modulLæringsmål, modulRessurs)"
                                    + " VALUES ('"+8+"', '"+kapittel+"','"+emne+"','"+kriterie+"','"+tidsfrist+"','"+foreleser+"','"+læringsmål+"', '"+ressurser+"' )");
                                nyModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                            else if (modulNr == 8) {
                                Statement redigerModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String foreleser = Main.user.getUser();
                                String kapittel = jTextFieldKapittel.getText();       
                                String SQL = ("UPDATE `Modul`SET modulEmne = '"+emne+"', modulKriterie = '"+kriterie+"'"
                                        + ",modulKapittel = '"+kapittel+"', modulFrist = '"+tidsfrist+"', modulLærer = '"+foreleser+"'"
                                        + " ,modulLæringsmål = '"+læringsmål+"' ,modulRessurs = '"+ressurser+"' WHERE modulNummer = 1");
                         
                                    
                                redigerModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                    }
                    
                    
                }
                catch (SQLException feil) {
                    System.out.println(feil);
                }
            break;
            case "modul 9":
                try {
                    
                    Connection con = DriverManager.getConnection(slit.Constants.db_url, slit.Constants.db_user, slit.Constants.db_pass);
                    Statement stmt = con.createStatement();
                    String check = ("SELECT * FROM Modul");  
                    ResultSet rs = stmt.executeQuery(check);
                    int modulNr = 0;
                    boolean fortsett = true;
                    while (rs.next() && fortsett) {
                        modulNr = rs.getInt("modulNummer");
                            if (modulNr != 9) {
                                Statement nyModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String kapittel = jTextFieldKapittel.getText();
                                String foreleser = Main.user.getUser();
                                String SQL = ("INSERT INTO `Modul`(modulNummer, modulKapittel, modulEmne, modulKriterie, modulFrist,"
                                    + " modulLærer, modulLæringsmål, modulRessurs)"
                                    + " VALUES ('"+9+"', '"+kapittel+"','"+emne+"','"+kriterie+"','"+tidsfrist+"','"+foreleser+"','"+læringsmål+"', '"+ressurser+"' )");
                                nyModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                            else if (modulNr == 9) {
                                Statement redigerModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String foreleser = Main.user.getUser();
                                String kapittel = jTextFieldKapittel.getText();       
                                String SQL = ("UPDATE `Modul`SET modulEmne = '"+emne+"', modulKriterie = '"+kriterie+"'"
                                        + ",modulKapittel = '"+kapittel+"', modulFrist = '"+tidsfrist+"', modulLærer = '"+foreleser+"'"
                                        + " ,modulLæringsmål = '"+læringsmål+"' ,modulRessurs = '"+ressurser+"' WHERE modulNummer = 1");
                         
                                    
                                redigerModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                    }
                    
                    
                }
                catch (SQLException feil) {
                    System.out.println(feil);
                }
            break;
            case "modul 10":
                try {
                    
                    Connection con = DriverManager.getConnection(slit.Constants.db_url, slit.Constants.db_user, slit.Constants.db_pass);
                    Statement stmt = con.createStatement();
                    String check = ("SELECT * FROM Modul");  
                    ResultSet rs = stmt.executeQuery(check);
                    int modulNr = 0;
                    boolean fortsett = true;
                    while (rs.next() && fortsett) {
                        modulNr = rs.getInt("modulNummer");
                            if (modulNr != 10) {
                                Statement nyModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String kapittel = jTextFieldKapittel.getText();
                                String foreleser = Main.user.getUser();
                                String SQL = ("INSERT INTO `Modul`(modulNummer, modulKapittel, modulEmne, modulKriterie, modulFrist,"
                                    + " modulLærer, modulLæringsmål, modulRessurs)"
                                    + " VALUES ('"+10+"', '"+kapittel+"','"+emne+"','"+kriterie+"','"+tidsfrist+"','"+foreleser+"','"+læringsmål+"', '"+ressurser+"' )");
                                nyModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                            else if (modulNr == 10) {
                                Statement redigerModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String foreleser = Main.user.getUser();
                                String kapittel = jTextFieldKapittel.getText();       
                                String SQL = ("UPDATE `Modul`SET modulEmne = '"+emne+"', modulKriterie = '"+kriterie+"'"
                                        + ",modulKapittel = '"+kapittel+"', modulFrist = '"+tidsfrist+"', modulLærer = '"+foreleser+"'"
                                        + " ,modulLæringsmål = '"+læringsmål+"' ,modulRessurs = '"+ressurser+"' WHERE modulNummer = 1");
                         
                                    
                                redigerModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                    }
                    
                    
                }
                catch (SQLException feil) {
                    System.out.println(feil);
                }
            break;
            case "modul 11":
                try {
                    
                    Connection con = DriverManager.getConnection(slit.Constants.db_url, slit.Constants.db_user, slit.Constants.db_pass);
                 
                    Statement stmt = con.createStatement();
                    String check = ("SELECT * FROM Modul");  
                    ResultSet rs = stmt.executeQuery(check);
                    int modulNr = 0;
                    boolean fortsett = true;
                    while (rs.next() && fortsett) {
                         modulNr = rs.getInt("modulNummer");
                       
                            if (modulNr != 11) {
                                Statement nyModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String kapittel = jTextFieldKapittel.getText();
                                String foreleser = Main.user.getUser();
                                String SQL = ("INSERT INTO `Modul`(modulNummer, modulKapittel, modulEmne, modulKriterie, modulFrist,"
                                    + " modulLærer, modulLæringsmål, modulRessurs)"
                                    + " VALUES ('"+11+"', '"+kapittel+"','"+emne+"','"+kriterie+"','"+tidsfrist+"','"+foreleser+"','"+læringsmål+"', '"+ressurser+"' )");
                                nyModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                            else if (modulNr == 11) {
                                
                                
                                Statement redigerModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String foreleser = Main.user.getUser();
                                String kapittel = jTextFieldKapittel.getText();       
                                String SQL = ("UPDATE `Modul`SET modulEmne = '"+emne+"', modulKriterie = '"+kriterie+"'"
                                        + ",modulKapittel = '"+kapittel+"', modulFrist = '"+tidsfrist+"', modulLærer = '"+foreleser+"'"
                                        + " ,modulLæringsmål = '"+læringsmål+"' ,modulRessurs = '"+ressurser+"' WHERE modulNummer = 1");
                         
                                    
                                redigerModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                    }
                    
                    
                }
                catch (SQLException feil) {
                    System.out.println(feil);
                }
            break;
            case "modul 12":
                try {
                    
                    Connection con = DriverManager.getConnection(slit.Constants.db_url, slit.Constants.db_user, slit.Constants.db_pass);
                    Statement stmt = con.createStatement();
                    String check = ("SELECT * FROM Modul");  
                    ResultSet rs = stmt.executeQuery(check);
                    int modulNr = 0;
                    boolean fortsett = true;
                    while (rs.next() && fortsett) {
                        modulNr = rs.getInt("modulNummer");
                            if (modulNr != 12) {
                                Statement nyModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String kapittel = jTextFieldKapittel.getText();
                                String foreleser = Main.user.getUser();
                                String SQL = ("INSERT INTO `Modul`(modulNummer, modulKapittel, modulEmne, modulKriterie, modulFrist,"
                                    + " modulLærer, modulLæringsmål, modulRessurs)"
                                    + " VALUES ('"+12+"', '"+kapittel+"','"+emne+"','"+kriterie+"','"+tidsfrist+"','"+foreleser+"','"+læringsmål+"', '"+ressurser+"' )");
                                nyModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                            else if (modulNr == 12) {
                                Statement redigerModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String foreleser = Main.user.getUser();
                                String kapittel = jTextFieldKapittel.getText();       
                                String SQL = ("UPDATE `Modul`SET modulEmne = '"+emne+"', modulKriterie = '"+kriterie+"'"
                                        + ",modulKapittel = '"+kapittel+"', modulFrist = '"+tidsfrist+"', modulLærer = '"+foreleser+"'"
                                        + " ,modulLæringsmål = '"+læringsmål+"' ,modulRessurs = '"+ressurser+"' WHERE modulNummer = 1");
                         
                                    
                                redigerModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                    }
                    
                    
                }
                catch (SQLException feil) {
                    System.out.println(feil);
                }
            break;
            case "modul 13":
                try {
                    
                    Connection con = DriverManager.getConnection(slit.Constants.db_url, slit.Constants.db_user, slit.Constants.db_pass);
                    Statement stmt = con.createStatement();
                    String check = ("SELECT * FROM Modul");  
                    ResultSet rs = stmt.executeQuery(check);
                    int modulNr = 0;
                    boolean fortsett = true;
                    while (rs.next() && fortsett) {
                        modulNr = rs.getInt("modulNummer");
                            if (modulNr != 13) {
                                Statement nyModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String kapittel = jTextFieldKapittel.getText();
                                String foreleser = Main.user.getUser();
                                String SQL = ("INSERT INTO `Modul`(modulNummer, modulKapittel, modulEmne, modulKriterie, modulFrist,"
                                    + " modulLærer, modulLæringsmål, modulRessurs)"
                                    + " VALUES ('"+13+"', '"+kapittel+"','"+emne+"','"+kriterie+"','"+tidsfrist+"','"+foreleser+"','"+læringsmål+"', '"+ressurser+"' )");
                                nyModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                            else if (modulNr == 13) {
                                Statement redigerModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String foreleser = Main.user.getUser();
                                String kapittel = jTextFieldKapittel.getText();       
                                String SQL = ("UPDATE `Modul`SET modulEmne = '"+emne+"', modulKriterie = '"+kriterie+"'"
                                        + ",modulKapittel = '"+kapittel+"', modulFrist = '"+tidsfrist+"', modulLærer = '"+foreleser+"'"
                                        + " ,modulLæringsmål = '"+læringsmål+"' ,modulRessurs = '"+ressurser+"' WHERE modulNummer = 1");
                         
                                    
                                redigerModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                    }
                    
                    
                }
                catch (SQLException feil) {
                    System.out.println(feil);
                }
            break;
            case "modul 14":
                try {
                    
                    Connection con = DriverManager.getConnection(slit.Constants.db_url, slit.Constants.db_user, slit.Constants.db_pass);
                    Statement stmt = con.createStatement();
                    String check = ("SELECT * FROM Modul");  
                    ResultSet rs = stmt.executeQuery(check);
                    int modulNr = 0;
                    boolean fortsett = true;
                    while (rs.next() && fortsett) {
                        modulNr = rs.getInt("modulNummer");
                            if (modulNr != 14) {
                                Statement nyModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String kapittel = jTextFieldKapittel.getText();
                                String foreleser = Main.user.getUser();
                                String SQL = ("INSERT INTO `Modul`(modulNummer, modulKapittel, modulEmne, modulKriterie, modulFrist,"
                                    + " modulLærer, modulLæringsmål, modulRessurs)"
                                    + " VALUES ('"+14+"', '"+kapittel+"','"+emne+"','"+kriterie+"','"+tidsfrist+"','"+foreleser+"','"+læringsmål+"', '"+ressurser+"' )");
                                nyModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                            else if (modulNr == 14) {
                                Statement redigerModul = con.createStatement();
                                String emne = jTextFieldTitle1.getText();
                                String læringsmål = jTextAreaLæringsmål.getText();
                                String kriterie = jTextAreaKriterie.getText();
                                String ressurser = jTextAreaRessurs.getText();
                                String tidsfrist = jTextFieldFrist.getText();
                                String foreleser = Main.user.getUser();
                                String kapittel = jTextFieldKapittel.getText();       
                                String SQL = ("UPDATE `Modul`SET modulEmne = '"+emne+"', modulKriterie = '"+kriterie+"'"
                                        + ",modulKapittel = '"+kapittel+"', modulFrist = '"+tidsfrist+"', modulLærer = '"+foreleser+"'"
                                        + " ,modulLæringsmål = '"+læringsmål+"' ,modulRessurs = '"+ressurser+"' WHERE modulNummer = 1");
                         
                                    
                                redigerModul.executeUpdate(SQL); 
                                fortsett = false;
                            }
                    }
                    
                    
                }
                catch (SQLException feil) {
                    System.out.println(feil);
                }
            break;
        }
    }
    /**
     * Ny og bedre måte på å hente rett modul. En switch med 14 caser, men her blir en variabel
     * satt i hver case, og så kjøres koden basert på denne variabelen, så koden må bare skrives en gang.
     */
    
    public void hentPublisert() {
        try {
                    Connection connect = DriverManager.getConnection(slit.Constants.db_url, slit.Constants.db_user, slit.Constants.db_pass);
                    String hentEmne = "";
                    String hentLæringsmål = "";
                    String hentKriterie = "";
                    String hentRessurser = "";
                    String hentTidsfrist = "";
                    String hentKapittel = "";
                    Statement eksisterendeModul = connect.createStatement();
                   
                    String SQLhentModulNummer = ("SELECT * FROM Modul"); 
                    ResultSet eksisterer = eksisterendeModul.executeQuery(SQLhentModulNummer);
                    // Setter opp en variabel lastModul
                    int lastModul = 0;
                    while (eksisterer.next()) {
                    // Setter lastModul basert på hvilken modulknapp som er trykket
                    switch (mainWindowForeleser.getModulTrykket()) {
                        case "modul 1":
                            lastModul = 1;
                        break;
                        case "modul 2":
                            lastModul = 2;
                        break;
                        case "modul 3":
                            lastModul = 3;
                        break;
                        case "modul 4":
                            lastModul = 4;
                        break;
                        case "modul 5":
                            lastModul = 5;
                        break;
                        case "modul 6":
                            lastModul = 6;
                        break;
                        case "modul 7":
                            lastModul = 7;
                        break;
                        case "modul 8":
                            lastModul = 8;
                        break;
                        case "modul 9":
                            lastModul = 9;
                        break;
                        case "modul 10":
                            lastModul = 10;
                        break;
                        case "modul 11":
                            lastModul = 11;
                        break;
                        case "modul 12":
                            lastModul = 12;
                        break;
                        case "modul 13":
                            lastModul = 13;
                        break;
                        case "modul 14":
                            lastModul = 14;
                        break;
        }
                   }
                    // Og her henter vi rett modul basert på variabelen som settes av en gitt case
                    String SQLhentModul = ("SELECT * FROM Modul where modulNummer = '"+lastModul+"'");
                    
                    ResultSet testing = eksisterendeModul.executeQuery(SQLhentModul);
                            if (testing.next()) {
                                hentEmne = testing.getString("modulEmne");
                                hentLæringsmål = testing.getString("modulLæringsmål");
                                hentKriterie = testing.getString("modulKriterie");
                                hentRessurser = testing.getString("modulRessurs");
                                hentTidsfrist = testing.getString("modulFrist");
                                hentKapittel = testing.getString("modulKapittel");
                                jTextFieldTitle1.setText(hentEmne);
                                jTextAreaLæringsmål.setText(hentLæringsmål);
                                jTextAreaKriterie.setText(hentKriterie);
                                jTextAreaRessurs.setText(hentRessurser);
                                jTextFieldFrist.setText(hentTidsfrist);
                                jTextFieldKapittel.setText(hentKapittel);
                               
                            }
                            else {
                                // gjør ingenting
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

        jPanelTopMain = new javax.swing.JPanel();
        jPanelBotMain = new javax.swing.JPanel();
        jPanelLeftMain = new javax.swing.JPanel();
        jPanelRightMain = new javax.swing.JPanel();
        jPanelCentreMain = new javax.swing.JPanel();
        jPanelCentreCentre = new javax.swing.JPanel();
        jTextFieldFrist = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPaneGodkjenning = new javax.swing.JScrollPane();
        jTextAreaKriterie = new javax.swing.JTextArea();
        jLabelGodkjenning = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTitle1 = new javax.swing.JTextField();
        jTextFieldKapittel = new javax.swing.JTextField();
        jPanelCentreLeft = new javax.swing.JPanel();
        jLabelLæringsmål = new javax.swing.JLabel();
        jLabelRessurser = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaLæringsmål = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRessurs = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanelTopMainLayout = new javax.swing.GroupLayout(jPanelTopMain);
        jPanelTopMain.setLayout(jPanelTopMainLayout);
        jPanelTopMainLayout.setHorizontalGroup(
            jPanelTopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1159, Short.MAX_VALUE)
        );
        jPanelTopMainLayout.setVerticalGroup(
            jPanelTopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelTopMain, java.awt.BorderLayout.PAGE_START);

        jPanelBotMain.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanelBotMain, java.awt.BorderLayout.PAGE_END);

        jPanelLeftMain.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanelLeftMain, java.awt.BorderLayout.LINE_START);

        jPanelRightMain.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanelRightMain, java.awt.BorderLayout.LINE_END);

        jTextFieldFrist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFristActionPerformed(evt);
            }
        });

        jLabel3.setText("Tidsfrist: Format YYYY-MM-DD HH:MM:SS");

        jButton1.setText("Publiser modul");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPaneGodkjenning.setMinimumSize(new java.awt.Dimension(320, 146));
        jScrollPaneGodkjenning.setPreferredSize(new java.awt.Dimension(320, 146));

        jTextAreaKriterie.setColumns(20);
        jTextAreaKriterie.setRows(5);
        jTextAreaKriterie.setText("\n");
        jTextAreaKriterie.setMinimumSize(new java.awt.Dimension(320, 146));
        jTextAreaKriterie.setPreferredSize(new java.awt.Dimension(300, 50));
        jScrollPaneGodkjenning.setViewportView(jTextAreaKriterie);

        jLabelGodkjenning.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelGodkjenning.setText("Skriv kriterier for godkjenning:");

        jLabel1.setText("Skriv inn tittel, eks. modul 1");

        jLabel2.setText("Skriv inn kapittel fra lærebok");

        jTextFieldTitle1.setPreferredSize(new java.awt.Dimension(350, 20));

        jTextFieldKapittel.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout jPanelCentreCentreLayout = new javax.swing.GroupLayout(jPanelCentreCentre);
        jPanelCentreCentre.setLayout(jPanelCentreCentreLayout);
        jPanelCentreCentreLayout.setHorizontalGroup(
            jPanelCentreCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentreCentreLayout.createSequentialGroup()
                .addGroup(jPanelCentreCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentreCentreLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCentreCentreLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelCentreCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCentreCentreLayout.createSequentialGroup()
                                .addComponent(jLabelGodkjenning)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPaneGodkjenning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelCentreCentreLayout.createSequentialGroup()
                                .addGroup(jPanelCentreCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldKapittel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldFrist, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 196, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanelCentreCentreLayout.setVerticalGroup(
            jPanelCentreCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentreCentreLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabelGodkjenning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneGodkjenning, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldKapittel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFrist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jLabelLæringsmål.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelLæringsmål.setText("Læringsmål:");

        jLabelRessurser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelRessurser.setText("Ressurser:");

        jTextAreaLæringsmål.setColumns(20);
        jTextAreaLæringsmål.setRows(5);
        jTextAreaLæringsmål.setText("\n");
        jScrollPane2.setViewportView(jTextAreaLæringsmål);

        jTextAreaRessurs.setColumns(20);
        jTextAreaRessurs.setRows(5);
        jTextAreaRessurs.setText("\n");
        jScrollPane1.setViewportView(jTextAreaRessurs);

        javax.swing.GroupLayout jPanelCentreLeftLayout = new javax.swing.GroupLayout(jPanelCentreLeft);
        jPanelCentreLeft.setLayout(jPanelCentreLeftLayout);
        jPanelCentreLeftLayout.setHorizontalGroup(
            jPanelCentreLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentreLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCentreLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelCentreLeftLayout.createSequentialGroup()
                        .addGroup(jPanelCentreLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLæringsmål, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRessurser))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelCentreLeftLayout.setVerticalGroup(
            jPanelCentreLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentreLeftLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabelLæringsmål)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelRessurser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Publiser Modul");
        jPanel1.add(jLabel4);

        javax.swing.GroupLayout jPanelCentreMainLayout = new javax.swing.GroupLayout(jPanelCentreMain);
        jPanelCentreMain.setLayout(jPanelCentreMainLayout);
        jPanelCentreMainLayout.setHorizontalGroup(
            jPanelCentreMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentreMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCentreMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelCentreMainLayout.createSequentialGroup()
                        .addComponent(jPanelCentreLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelCentreCentre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelCentreMainLayout.setVerticalGroup(
            jPanelCentreMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentreMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCentreMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCentreCentre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCentreLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanelCentreMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            publiserModul();
            JOptionPane.showMessageDialog(null, "Modulen er publisert. Vinduet vil lukkes");
            dispose();
         
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldFristActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFristActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFristActionPerformed

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
            java.util.logging.Logger.getLogger(moduleInformationWindowForeleser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(moduleInformationWindowForeleser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(moduleInformationWindowForeleser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(moduleInformationWindowForeleser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new moduleInformationWindowForeleser().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelGodkjenning;
    private javax.swing.JLabel jLabelLæringsmål;
    private javax.swing.JLabel jLabelRessurser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBotMain;
    private javax.swing.JPanel jPanelCentreCentre;
    private javax.swing.JPanel jPanelCentreLeft;
    private javax.swing.JPanel jPanelCentreMain;
    private javax.swing.JPanel jPanelLeftMain;
    private javax.swing.JPanel jPanelRightMain;
    private javax.swing.JPanel jPanelTopMain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneGodkjenning;
    private javax.swing.JTextArea jTextAreaKriterie;
    private javax.swing.JTextArea jTextAreaLæringsmål;
    private javax.swing.JTextArea jTextAreaRessurs;
    private javax.swing.JTextField jTextFieldFrist;
    private javax.swing.JTextField jTextFieldKapittel;
    private javax.swing.JTextField jTextFieldTitle1;
    // End of variables declaration//GEN-END:variables
}

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
import slit.Constants;
import slit.Constants;
import slit.Main;
import slit.Main;
import slit.localUser;
import slit.localUser;
import static slit.mainWindow.newline;

/**
 *
 * @author Sondre, Michael, Erik, Christian Fredrik, Thomas, Gruppe 109
 * Klasse med DB-logikk. Lager metoder her og kaller de i interface, fremfor å skrive logikk rett i interface.
 * Rakk ikke gjøre disse endringene for hele systemet, men noen metoder ble skrevet om.
 */
public class db {
   
    
    
   /**
    * Henter ut informasjonsmelding fra databasen på "Modul" taben.
    */
    public static void generellInfo() {
         try {
                String test = slit.client.foreleser.mainWindowForeleser.getGenerellModul();
        
                System.out.println(test);
                Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
       
               
                String SQL = ("INSERT INTO generellinfo (generellInfoBeskjed) VALUES ('"+test+"')");      
            
                Statement setInfo = con.createStatement( );
                setInfo.executeUpdate(SQL);
           
        }
        catch (SQLException err) {
            System.out.println(err);
        }
        
                            
    }
    
    public static void visProfil(String bruker) {
        
    }
    /**
     * Sender statusrapport for innlogget bruker (localUser) til databasen
     * @param uke et av spørsmålene som besvares i statusrapport
     * @param gått et av spørsmålene som besvares i statusrapport
     * @param annerledes et av spørsmålene som besvares i statusrapport
     * @param hjelp et av spørsmålene som besvares i statusrapport
     * @param timer et av spørsmålene som besvares i statusrapport 
     */
    public static localUser sendRapport(int uke, String gått, String annerledes,
        String hjelp, int timer) {
        String passord = Main.user.getPass();
        String user = Main.user.getUser();
        
     //   System.out.println (Main.user.getPass());
       // String role = Main.user.getRole();
        
        try {  
                // Query for å hente ut brukerId ut fra gitt bruker som samsvarer med credentials
                String ID = "SELECT * FROM Bruker WHERE brukerEmail= '" 
                        + user +"' AND brukerPassord='" + passord + "' ";
         
                // Definer login credentials på databasen med url, brukernavn og passord
              
                // Printer ut databasens URL (hjelp ved evt. feilsøking)
                System.out.println("The URL is: " + Constants.db_url);
                // Sett opp en ny connection ved bruk av variablene som er definert
                Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
                // Definer en ny Statement (eks. "stmt") og nytt ResultSet (eks. "rs")
                Statement stmt = con.createStatement( );
                
                // kjører query for å finne brukerId
                ResultSet result = stmt.executeQuery (ID);
                
                // Variabel brukerId som skal sendes inn med statusrapport
                int brukerId = 0;
              
                 // Om credentials er godkjent, henter ut brukerId fra ID query
                if (result.next()) {
                    brukerId = result.getInt("BrukerId");
                    System.out.println("Valid user");
                    System.out.println("Statusrapport innsendt av:");
                    System.out.println(user); 
                    
                    // Setter inn variabelverdiene i databasen, variablene blir satt på knappen send/lagre, actionevent
                    String sql = ("INSERT INTO statusrapport (statusUke,statusGått,statusAnnerledes,statusHjelp, statusTimer, Bruker_brukerId)" 
                    + " VALUES ('"+uke+"', '"+gått+"','"+annerledes+"','"+hjelp+"',"
                        + "'"+timer+"','"+brukerId+"')");
                    Statement stmt2 = con.createStatement( );
                    try {
                        stmt2.executeUpdate(sql);
                    }
                    catch (SQLException error){
                    System.out.println(error);
                    }
                    return Main.user;
                   // System.out.println(sql);
                   
                }
                // Om credentials ikke er godkjent
                else {
                    System.out.println("Invalid user");
              //      System.out.println("Statusrapport ble ikke sendt inn, feil brukerinformasjon");
                    System.out.println(user);
                  
                    
                    return null;
                 //   System.out.println(sql);
                }
                // For å kontrollere at variablene har rett verdi
              //  System.out.println(uke);
              //  System.out.println(gått);
              //  System.out.println(annerledes);
              //  System.out.println(hjelp);
              //  System.out.println(timer);
              //  System.out.println(brukerId);
                
                
              
               
            }
            
        
        catch (SQLException err) {
            System.out.println(err.getMessage());
            
        }
        return null;
       
    }
    /**
     * 
     * @param username innskrevet brukernavn / epost i brukerfelt
     * @param password innskrevet passord i passordfelt
     * @param role valgt rolle i dropdown-menyen
     * @param id git localUser en ID, henter ut brukerId i databasen fra innlogget bruker
     * for å slippe å hente ut brukerId manuelt andre steder i systemet. 
     * Endringen kom sent og de fleste stedene er dette løst på en manuell måte.
     * @return 
     */
    public static localUser login(String username, String password, String role, int id){
        
        try {
                String sql = "SELECT * FROM Bruker WHERE brukerEmail= '" 
                        + username +"' AND brukerPassord='" + password + "' AND brukerRolle='"+ role +"' AND brukerId='"+id+"'";
                // Definer en ny Statement (eks. "stmt") og nytt ResultSet (eks. "rs")
                Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
                Statement stmt = con.createStatement( );
                ResultSet rs = stmt.executeQuery(sql);
                // Om credentials er godkjent
                if (rs.next()) {
                    System.out.println(Main.user);
                    System.out.println("Valid user");
                    System.out.println("User logged in:");      
                    System.out.println (username);
                    System.out.println (role);
                    System.out.println (id);
                    return Main.user = new localUser(rs.getString("brukerEmail"), rs.getString("brukerPassord"), rs.getString("brukerRolle"), rs.getInt("brukerId"));
                    
                   
                }
                // Om credentials ikke er godkjent
                else {
                    System.out.println("Invalid user");
                    System.out.println("Login failed for user:");
                    System.out.println(username);
                    System.out.println(role);
                    return null;
                }
        }
        catch (SQLException feil) {
            System.out.println(feil);
            return null;
        }
        
        
       
        
        
    }
    /**
     * Henter ut den gamle beskjeden på "Generell info"-modul tab for foreleser, slik at man ser 
     * beskjeden som er publisert.
     */
    public static void hentGammelBeskjed() {
        try {
        Connection connect = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
       
                Statement hentInfo = connect.createStatement();
                String SQLgammelTekst = ("SELECT generellInfoBeskjed FROM generellInfo");
                String eksisterendeMelding = "";           
                ResultSet testing = hentInfo.executeQuery(SQLgammelTekst);
                if (testing.next()) {  
                        eksisterendeMelding = testing.getString("generellInfoBeskjed");
                        slit.client.foreleser.mainWindowForeleser lagretvisning = new slit.client.foreleser.mainWindowForeleser();
                        lagretvisning.setGenerellModul(eksisterendeMelding);
                }     
                    
        }
        catch (SQLException err) {
            System.out.println(err);
        }
    }
   
    
    /**
     * Foreleser setter opp nye møtetider 
     * @param tidspunkt angir møtetidspunkt (YYYY-MM-DD HH:MM:SS)
     * @param møtested angir møtested, f.eks HK 051
     * @return 
     */
     public static localUser sendMøteInfo(String tidspunkt, String møtested)   
        {
        String passord = Main.user.getPass();
        String user = Main.user.getUser();
        
       //   System.out.println (Main.user.getPass());
       // String role = Main.user.getRole();
        
        try {  
                // Query for å hente ut brukerId ut fra gitt bruker som samsvarer med credentials
                String ID = "SELECT * FROM Bruker WHERE brukerEmail= '" 
                        + user +"' AND brukerPassord='" + passord + "' ";
         
                // Definer login credentials på databasen med url, brukernavn og passord
              
                // Printer ut databasens URL (hjelp ved evt. feilsøking)
                System.out.println("The URL is: " + Constants.db_url);
                // Sett opp en ny connection ved bruk av variablene som er definert
                Connection con = DriverManager.getConnection(Constants.db_url, Constants.db_user, Constants.db_pass);
                // Definer en ny Statement (eks. "stmt") og nytt ResultSet (eks. "rs")
                Statement stmt = con.createStatement( );
                
                // kjører query for å finne brukerId
                ResultSet result = stmt.executeQuery (ID);
                
                // Variabel brukerId som skal sendes inn med statusrapport
                int brukerId = 0;
              
                 // Om credentials er godkjent, henter ut brukerId fra ID query
                if (result.next()) {
                    brukerId = result.getInt("BrukerId");
                    System.out.println("Valid user");
                    System.out.println("Møteinfo innsendt av:");
                    System.out.println(user);

                    // Setter inn variabelverdiene i databasen, variablene blir satt på knappen send/lagre, actionevent
                    String sql = ("INSERT INTO møte (møteTidspunkt,møteSted)" 
                    + " VALUES ('"+tidspunkt+"','"+møtested+"')");
                    Statement stmt3 = con.createStatement( );
                    try {
                        stmt3.executeUpdate(sql);
                    }
                    catch (SQLException error){
                    System.out.println(error);
                    }
                    return Main.user;
                   // System.out.println(sql);
                   
                }
                // Om credentials ikke er godkjent
                else {
                    System.out.println("Invalid user");
              //      System.out.println("Møteinfo ble ikke sendt inn, feil brukerinformasjon");
                    System.out.println(user);
                  
                    
                    return null;
                 //   System.out.println(sql);
                }
                // For å kontrollere at variablene har rett verdi
              //  System.out.println(uke);
              //  System.out.println(gått);
              //  System.out.println(annerledes);
              //  System.out.println(hjelp);
              //  System.out.println(timer);
              //  System.out.println(brukerId);
                
                
              
               
            }
            
        
        catch (SQLException err) {
            System.out.println(err.getMessage());
            
        }
        return null;
       
        }
        }

  
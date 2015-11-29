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
import slit.Main;
import slit.localUser;
import static slit.mainWindow.newline;

/**
 *
 * @author Sondre
 */
public class db {
   
    
    
   

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
    
    public static localUser login(String username, String password, String role){
        
        try {
                String sql = "SELECT * FROM Bruker WHERE brukerEmail= '" 
                        + username +"' AND brukerPassord='" + password + "' AND brukerRolle='"+ role +"'";
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
                    return Main.user = new localUser(rs.getString("brukerEmail"), rs.getString("brukerPassord"), rs.getString("brukerRolle"));
                   
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
   
        }

  
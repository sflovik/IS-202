/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit.statusListe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sondre
 */
public class statusListeHent {
    
  public static void hentListe(String[] args) {
       
        try {

            String db_url = "jdbc:mysql://localhost:3306/slit";
            String db_user = "root";
            String db_pass = "root";
            
            System.out.println("The URL is: " + db_url);
            Connection con = DriverManager.getConnection(db_url, db_user, db_pass);
            
            Statement stmt = con.createStatement( );
            String SQL ="SELECT * FROM Student";
            ResultSet result = stmt.executeQuery (SQL);
            
            while (result.next() ) {
                int id_col = result.getInt("ID");
                String name = result.getString("name");
                String lastname = result.getString("lastname");
                String email = result.getString("epost");
                System.out.println("ID: "+ " " + id_col +" " +  "Fornavn: " + " " + name + 
               "  " + "Etternavn: " +" "+ lastname + " " + "e-post:" + " " + email + " ");
                
             
            }
        }
        catch (SQLException err) {
            System.out.println( err.getMessage( ));
            
        } 
        
        // TODO code application logic here
    }
    
}

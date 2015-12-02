/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit;
import java.sql.*;
/**
 *
 * @author Sondre, Michael, Erik, Christian Fredrik, Thomas, Gruppe 109
 * Main klasse som initierer systemet, åpner innloggingsvindu.
 * Statisk object localUser som blir laget når man logger inn (lagre brukersession)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static localUser user;
    public static void main(String[] args) {
        slit.ejb.login.Login oppstart = new slit.ejb.login.Login(); 
        oppstart.setVisible(true);
        
       /**
        try {

            String db_url = "jdbc:mysql://localhost:3306/slit";
            String db_user = "root";
            String db_pass = "root";
            
            System.out.println("The URL is: " + db_url);
            Connection con = DriverManager.getConnection(db_url, db_user, db_pass);
            
            Statement stmt = con.createStatement( );
            String SQL ="SELECT * FROM Statistikk";
            ResultSet result = stmt.executeQuery (SQL);
            
            while (result.next() ) {
                int id_col = result.getInt("Bruker_brukerId");
                String name = result.getString("brukerFornavn");
                String surname = result.getString("brukerEtternavn");
                String dato = result.getString("levertmodulDato");
                int antLeverte = result.getInt("COUNT(sensurId)");
                System.out.println("ID: "+ " " + id_col +" " +  "Fornavn: " + " " + name + 
               "  " + "Etternavn: " +" "+ surname + " " + "e-post:" + " " + dato + " " + antLeverte);
                
             
            }
        }
        catch (SQLException err) {
            System.out.println( err.getMessage( ));
            
        } 
        */
        // TODO code application logic here
    }
    
}

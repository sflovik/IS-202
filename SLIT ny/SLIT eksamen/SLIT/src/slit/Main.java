/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit;
import java.sql.*;
/**
 *
 * @author Sondre
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        slit.ejb.login.Login oppstart = new slit.ejb.login.Login(); 
        oppstart.setVisible(true);
       
        try {

            String db_url = "jdbc:mysql://localhost:3306/slit";
            String db_user = "root";
            String db_pass = "root";
            
            System.out.println("The URL is: " + db_url);
            Connection con = DriverManager.getConnection(db_url, db_user, db_pass);
            
            Statement stmt = con.createStatement( );
            String SQL ="SELECT * FROM Student";
            String fag ="SELECT fagkode FROM Fag"; 
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit;


/**
 *
 * @author Michael
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertFileTest {

	/**
	 * This is used to get the Connection
	 * 
	 * @return
	 */
	public Connection getConnection() {
		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/slit", "root", "root");
		} catch (Exception e) {
			System.out.println("Error Occured While Getting the Connection: - "
					+ e);
		}
		return connection;
	}

	/**
	 * Insert File
	 */
	public void insertFile() {
		Connection connection = null;
		PreparedStatement statement = null;
		FileInputStream inputStream = null;

		try {
			File file = new File("C:/Users/Michael/Desktop/michael.jpg");
			inputStream = new FileInputStream(file);
			connection = getConnection();
			statement = connection
					.prepareStatement("insert into ressurser(ressurserId, ressurserTittel, ressurserFil, Bruker_brukerId) "
							+ "values(?,?,?,?)");
			statement.setInt(1, 1);
                        statement.setString(2,"Michael" );
                        statement.setInt(4, 2);                              
			statement.setBinaryStream(3, (InputStream) inputStream,
					(int) (file.length()));

			statement.executeUpdate();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException: - " + e);
		} catch (SQLException e) {
			System.out.println("SQLException: - " + e);
		} finally {
			try {
				connection.close();
				statement.close();
			} catch (SQLException e) {
				System.out.println("SQLException Finally: - " + e);
			}
		}

	}

	/***
	 * Execute Program
	 * 
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		InsertFileTest fileTest = new InsertFileTest();
		fileTest.insertFile();
	}

}


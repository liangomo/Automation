package Modelo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Help {

	private static java.sql.Connection Conec = null;
	Statement St;

	/**
	 * METODOS PARA MANEJO DE BASE DE DATOS 
	 * */

	public static void ConnectionDB() {

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Conec =DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=Automation_Test;","sa","sa_PSL;integratedSecurity=true;");
			//Conec =DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS;","sa","sa_PSL");

			if (Conec != null){

				System.out.println("Successfully connected");

			}
		}
		catch ( SQLException excepcionSql)
		{
			JOptionPane.showMessageDialog( null, excepcionSql.getMessage(),"Error en base de datos", JOptionPane.ERROR_MESSAGE );
		}

		catch ( ClassNotFoundException claseNoEncontrada ){
			JOptionPane.showMessageDialog( null, claseNoEncontrada.getMessage(),"No se encontró el controlador", JOptionPane.ERROR_MESSAGE );
		}
	}

	//Metodo de ejecucion de insert,update,delete a la base de datos
	public String ejecutar(String sql) {

		String error="";
		try {
			St=Conec.createStatement();
			St.executeQuery(sql);

		}
		catch(Exception ex){
			error = ex.getMessage();

		}
		return(error);
	}

	//Metodo para las consultas a la base de datos
	public static ResultSet Consulta(String sql) {
		ConnectionDB();
		ResultSet res = null;
		try
		{
			Statement s = Conec.createStatement();
			res = s.executeQuery(sql);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return res;
	}
}
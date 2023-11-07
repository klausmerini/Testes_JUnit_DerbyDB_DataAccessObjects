package com.merini.derbyAgenda.comando;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ComandoPrincipal 
{
	private static String sqlCreateClassif = "CREATE TABLE classificacao (nomeClassificacao varchar(100),idclassificacao int not null generated always as identity"
			+ ", cor varchar(50),descricao varchar (500))";
//	private static String sqlInsertClassif = ""
	private static String JdbcUrl="jdbc:derby:agendaDerby;create=true";

	public static void main(String[] args) 
	{
		System.out.println("main");
		try 
		{
			Connection connection = DriverManager.getConnection(JdbcUrl);
			System.out.println("conectado");
			Statement stmt = connection.createStatement();
			stmt.executeUpdate(sqlCreateClassif);
		} catch (SQLException e) {
			e.printStackTrace();		}	
//		
//		Statement
	}

}

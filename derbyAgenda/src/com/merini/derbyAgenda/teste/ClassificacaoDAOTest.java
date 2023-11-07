package com.merini.derbyAgenda.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class ClassificacaoDAOTest
{
	
	private static String sqlInsertClassif = "INSERT INTO classificacao(nomeclassificacao, cor, descricao) values "
			+ "('Comercial','Amarelo',"
			+ " 'Atividades de compras, pagamentos')";
	private static String JdbcUrl="jdbc:derby:agendaDerby;create=true";
	
	@Test
	public void verificaInclusaoTest()
	{
		try 
		{
			Connection connection = DriverManager.getConnection(JdbcUrl);
				System.out.println("conectado");
			Statement stmt = connection.createStatement();
			int resultado = stmt.executeUpdate(sqlInsertClassif);
				System.out.println("registro classificação inserido - "+String.valueOf(resultado));
		} catch (SQLException e) {
			e.printStackTrace();		}
		String shutdownUrl = "jdbc:derby:;shutdown=true";
		try {
			
			DriverManager.getConnection(shutdownUrl);
				System.out.println("shutdown1");
		} catch (SQLException e) {
			if (e.getSQLState().equals("XJ015"))
				{System.out.println("shutdown2");}
			else
				{e.printStackTrace();}
		}
	}
	
	@Test
	public void verificaInclusaoBancoTest()
	{
		
	}

}

package com.merini.derbyAgenda.comando;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ComandoPrincipal extends Comandos 
{
	public static void main(String[] args) 
	{
//		ComandoIncluirClassificacao comando = new ComandoIncluirClassificacao();
//			System.out.println("main");
//		comando.processaComando("Cria Janela Inclui Classificacao");
		
		ComandoGerenciaClassificacao comando = new ComandoGerenciaClassificacao();
			System.out.println("main");
		comando.processaComando("Cria Janela Gerencia Classificacao");
		
		
	}

}

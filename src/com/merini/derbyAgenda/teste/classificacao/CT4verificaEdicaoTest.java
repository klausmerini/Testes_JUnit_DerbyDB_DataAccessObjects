package com.merini.derbyAgenda.teste.classificacao;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import com.merini.derbyAgenda.dao.ClassificacaoDAO;
import com.merini.derbyAgenda.modelo.Classificacao;

public class CT4verificaEdicaoTest 
{
	@Test
	public void CT3verificaEdicao()
	{
		ClassificacaoDAO dao = new ClassificacaoDAO();
		Date date = new Date();
		String horaSt= String.valueOf(date.getTime());
		String nomeClasssificacaoSt = "Entretenimento 6";
		System.out.println("carregar "+nomeClasssificacaoSt);
		Classificacao classificacao = (Classificacao) dao.carregar(nomeClasssificacaoSt);
		
		String descricaoSt="descrição editada "+String.valueOf(horaSt);		
		classificacao.setDescricao(descricaoSt);
		dao.editar(classificacao);
		Classificacao classificacaoEditada = (Classificacao) dao.carregar(classificacao.getNomeclassificacao());
		assertEquals(descricaoSt, classificacaoEditada.getDescricao());
	}	
	

}

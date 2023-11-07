package com.merini.derbyAgenda.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.merini.derbyAgenda.modelo.Comentario;

public abstract class DAOAbstrato //implements FacadeInterf
{
	protected static EntityManager em ;		
	protected static com.merini.derbyAgenda.modelo.Comentario c = new Comentario();
	
	
	public DAOAbstrato()
	{
//		em  = EM.getInstance().getEm();
	}


//	@Override
	public abstract Object carregar(Integer id);


//	@Override
	public abstract void excluir(Object entidade) ;


//	@Override
	public void excluir(Integer id) 
	{		// TODO Auto-generated method stub
		
	}

//	@Override
	public abstract Object gravar(Object entidade);


//	@Override
	public List obterTodos() {
		// TODO Auto-generated method stub
		return null;
	}


//	@Override
	public List obterTodosNomes() {
		// TODO Auto-generated method stub
		return null;
	}


//	@Override
	public Integer recuperaIdPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}


//	@Override
	public Object recuperaPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}


}

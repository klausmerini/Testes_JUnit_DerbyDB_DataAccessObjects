package com.merini.derbyAgenda.comando.item;

import java.util.ArrayList;

import com.merini.derbyAgenda.modelo.Comentario;
import com.merini.derbyAgenda.modelo.Item;
import com.merini.derbyAgenda.modelo.Itemlista;
import com.merini.derbyAgenda.modelo.Lista;
import com.merini.derbyAgenda.view.item.JanelaAdicionaItem;

public class ComandoIncluirItem //extends ItemCommand
{
//	static ComandoIncluirItem controle;
	public static JanelaAdicionaItem janelaAdicionaItem ;
	Comentario c = new Comentario();	
	
	public ComandoIncluirItem() 
	{		// TODO Auto-generated constructor stub
		c.comentaLocalizacao("public  ComandoIncluirItem");		
	}
		
	public void processaComando(String comando, String nomeLista) 
	{		// [TODO Auto-generated method stub
		c.comentaLocalizCamadaControle("processaComando", "ComandoIncluirItem", comando);
		
		String[] arrayNomeListasSt =  recuperaNomesDasListas();
		
		if (comando.equals("constroi interface adiciona item"))
		{
			c.comentaValor("array de nomeLista", String.valueOf(arrayNomeListasSt.length));			
			janelaAdicionaItem  = new JanelaAdicionaItem("Adiciona Item", arrayNomeListasSt, nomeLista);
		}	
		else 
		if(comando.equals("Constr�i interface - Relaciona item a tipo"))
		{
//			facadeTipoLista.
//			JanelaAdItemSelecLista janela = new JanelaAdItemSelecLista();
		}
		else
		{//gerar exception
			System.out.println("!!!! comando errado");
		}
		
		
	}
	
	public void processaComando(String comando, Item item, String nomeLista) 
	{	
		c.comentaLocalizCamadaControle("processaComando", "ComandoIncluirItem", comando);
		
		if (comando.equals("inclui item no banco de dados"))
		{
//			c.comentaValor("nome dalista selecionada na combo ", nomeLista);
//			Item itemIncluido = (Item) facadeItem.gravar(item);
//			Lista lista = facadeLista.recuperaPorNome(nomeLista);
//			Itemlista itemL = new Itemlista(itemIncluido ,lista);
//			facadeItLi.gravar(itemL);			
//
//			try 
//			{		
//				cp.getComandoExibeListas().getJanelaLista().getFrame().dispose();
//			} 
//			catch (NullPointerException e) 
//			{			// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			cp.getComandoExibeListas().processaComando("Exibe Lista selecionada", nomeLista);	
		}		
		else
		{//gerar exception
			System.out.println("!!!! comando errado");
		}		
	}
	
	public String[] recuperaNomesDasListas()
	{
		ArrayList<String> arrayNomesListas = new ArrayList<String>();
		arrayNomesListas.add("Caderno do monstro");
		arrayNomesListas.add("Cadrno da moto");
		arrayNomesListas.add("CAderno cinza grosso");		
//		ArrayList<String> arrayNomesListas = (ArrayList<String>) facadeLista.obterTodosNomes();
		String[] arrayNomeClSt =  arrayNomesListas.toArray(new String[arrayNomesListas.size()]);
		return arrayNomeClSt;		
	}
	
	public static JanelaAdicionaItem getJanelaAdicionaItem() {
		return janelaAdicionaItem;
	}

	public static void setJanelaAdicionaItem(JanelaAdicionaItem janelaAdicionaItem) {
		ComandoIncluirItem.janelaAdicionaItem = janelaAdicionaItem;
	}
}

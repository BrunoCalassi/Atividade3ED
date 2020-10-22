/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaduplamenteencadeada;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class Listaduplaencadeada {
    private No inicio;

	public Listaduplaencadeada(){
		inicio=null;
	}

	public void AdicionaFinal(ListaCurso l){
		if (inicio==null){
			No n=new No(l);
			inicio=n;
		}
		else{
			No aux=inicio;
			while(aux.prox!=null){
				aux=aux.prox;
			}
			No n=new No(l);
			aux.prox=n;
		}
	}

	public void AdicionaInicio(ListaCurso l){
		No n=new No(l);
		n.prox=inicio;
		inicio=n;
	}

	public ListaCurso RemoveFinal(ListaCurso l){
		if (inicio==null){
			JOptionPane.showMessageDialog(null, "Lista Vazia");
		}
		else{
			if (inicio.prox==null){
				l=inicio.lista;
				inicio=null;
			}
			else{
				No aux1=inicio;
				No aux2=inicio;

				while(aux1.prox!=null){
					aux2=aux1;
					aux1=aux1.prox;
				}

				l=aux1.lista;
				aux2.prox=null;
			}
		}
		return l;
	}

	public ListaCurso RemoveInicio(ListaCurso l){
		if (inicio==null){
			JOptionPane.showMessageDialog(null,"Lista Vazia");			
		}
		else{
			l=inicio.lista;
			inicio=inicio.prox;
		}
		return l;
	}

	public String percorre(){
		No aux=inicio;
		String lista = "";
		while(aux!=null){
			lista+="\nIdCurso:"+aux.lista.getIdcurso()+" Nome:"+aux.lista.getNome()+
					"Area:"+aux.lista.getArea()+" QtdSemestre:"+aux.lista.getQtdsem()+" Periodo:"+aux.lista.getPeriodo();
			aux=aux.prox;
		}
		return lista;
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class Fila {
        private ListaCurso dados[];
	private int tamanho;

	public Fila(int capacidade){
		dados= new ListaCurso[capacidade];
		tamanho=0;
	}

	public void AdicionaFinal(ListaCurso e){
		if (tamanho<dados.length){
			dados[tamanho]=e;
			tamanho++;
		}
		else{
			JOptionPane.showMessageDialog(null, "Fila cheia");
		}
	}

	public ListaCurso RemoveInicio(){
		ListaCurso r=null;
		if (tamanho>=1){
			r=dados[0];
			for (int i=0;i<tamanho-1;i++){
				dados[i]=dados[i+1];
			}
						
			tamanho--;
		}
		else{
			JOptionPane.showMessageDialog(null, "Fila vazia");
		}
		return r;
	}
	
	
	public String percorre(){
		String aux=" ";
		for (int i=0;i<tamanho;i++){
			aux=aux+"\n"+dados[i].toString();
		}
		return aux;
	}
}

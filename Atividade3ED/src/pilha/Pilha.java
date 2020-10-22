/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class Pilha {
    	private ListaCurso dados[];
	private int topo;


	public Pilha(int n){
		dados=new ListaCurso[n];
		topo=0;
	}

	public void AdicionaFinal(ListaCurso l){
		if (topo<dados.length){
			dados[topo]=l;
			topo++;
		}
		else{
			JOptionPane.showMessageDialog(null, "Pilha Cheia");
		}
	}

	public ListaCurso RemoveFinal(){
		ListaCurso l=null;
		if (topo>0){
			l=dados[topo-1];
			topo--;
		}
		else{
			JOptionPane.showMessageDialog(null, "Pilha V�zia");
		}
		return (l);
	}


	public String percorre(){
		String aux=" ";
		for (int i=0;i<topo;i++){
			aux=aux+"\n"+dados[i].toString();
		}
		return aux;
	}

}

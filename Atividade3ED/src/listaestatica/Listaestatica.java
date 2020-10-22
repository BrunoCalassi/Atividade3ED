/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaestatica;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class Listaestatica {
         private ListaCurso dados[];
	private int tamanho;


	public Listaestatica(int n){
		dados=new ListaCurso[n];
		tamanho=0;
	}

	public void AdicionaFinal(ListaCurso l){
		if (tamanho<dados.length){
			dados[tamanho]=l;
			tamanho++;
		}
		else{
			JOptionPane.showMessageDialog(null, "Lista Cheia");
		}
	}
        public void AdicionaInicio(ListaCurso l){   
		if (tamanho<dados.length){           
			for (int i=tamanho;i>0;i--){         
				dados[i]=dados[i-1];                 
			}
			dados[0]=l;                          
			tamanho++;                           
		}
		else{
			System.out.println("Erro, lista cheia");        
		}
	}
        public ListaCurso RemoveInicio(){
		ListaCurso l=null;
		if (tamanho>=1){
			l=dados[0];
			for (int i=0;i<tamanho-1;i++){
				dados[i]=dados[i+1];
			}
						
			tamanho--;
		}
		else{
			JOptionPane.showMessageDialog(null, "Lista vazia");
		}
		return (l);
	}

	public ListaCurso RemoveFinal(){
		ListaCurso l=null;
		if (tamanho>0){
			l=dados[tamanho-1];
			tamanho--;
		}
		else{
			JOptionPane.showMessageDialog(null, "Lista Vázia");
		}
		return (l);
	}


	public String percorre(){
		String aux=" ";
		for (int i=0;i<tamanho;i++){
			aux=aux+"\n"+dados[i].toString();
		}
		return aux;
	}
}

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
public class Main {
	public static void main(String[]args){
                int idcurso;
                String nome;
                String area;
                int qtd;
                String periodo;
                Fila dadosFila = new Fila(10);
	
		int op=0;
		while(op!=9){
			op=Integer.parseInt(JOptionPane.showInputDialog("1-Adicionar\n2-Remover\n3-Exibir\n9-Sair"));
			switch(op){
			case 1:
                            	idcurso=Integer.parseInt(JOptionPane.showInputDialog("Informe o id do curso"));
				nome=JOptionPane.showInputDialog("Nome");
                                	area=JOptionPane.showInputDialog("Area");
                                 qtd=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de semestre"));
				periodo=JOptionPane.showInputDialog("Periodo");
                                 dadosFila.AdicionaFinal(new ListaCurso(idcurso,nome,area,qtd,periodo));
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"O elemento removido foi:\n"+dadosFila.RemoveInicio());
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"Fila:"+dadosFila.percorre());
				break;
			case 9:
				JOptionPane.showMessageDialog(null,"Saindo");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Valor inválido, digite novamente");
			}
		}
	}
}








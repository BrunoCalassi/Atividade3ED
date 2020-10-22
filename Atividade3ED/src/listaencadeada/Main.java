/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;

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
                Listaencadeada dadosLista = new Listaencadeada();
	
		int op=0;
		while(op!=9){
			op=Integer.parseInt(JOptionPane.showInputDialog("1-Adicionar Inicio \n2-Adiciona Final\n3-Remover Inicio\n4-Remover Final\n5-Exibir\n9-Sair"));
			switch(op){
			case 1:
                            	idcurso=Integer.parseInt(JOptionPane.showInputDialog("Informe o id do curso"));
				nome=JOptionPane.showInputDialog("Nome");
                                	area=JOptionPane.showInputDialog("Area");
                                 qtd=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de semestre"));
				periodo=JOptionPane.showInputDialog("Periodo");
                                 dadosLista.AdicionaInicio(new ListaCurso(idcurso,nome,area,qtd,periodo));
				break;
			case 2:idcurso=Integer.parseInt(JOptionPane.showInputDialog("Informe o id do curso"));
				nome=JOptionPane.showInputDialog("Nome");
                                	area=JOptionPane.showInputDialog("Area");
                                 qtd=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de semestre"));
				periodo=JOptionPane.showInputDialog("Periodo");
                                 dadosLista.AdicionaFinal(new ListaCurso(idcurso,nome,area,qtd,periodo));
				break;
				
			case 3:{
                                ListaCurso l = null;
                                JOptionPane.showMessageDialog(null,"O elemento removido foi:\n"+dadosLista.RemoveInicio(l));
                            }
				break;

				
                         case 4:{
                                ListaCurso l = null;
                                JOptionPane.showMessageDialog(null,"O elemento removido foi:\n"+dadosLista.RemoveFinal(l));
                            }
				break;

                                 
                         case 5:JOptionPane.showMessageDialog(null,"Lista:"+dadosLista.percorre());
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

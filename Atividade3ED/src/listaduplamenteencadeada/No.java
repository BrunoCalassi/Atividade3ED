/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaduplamenteencadeada;

/**
 *
 * @author bruno
 */
public class No {
    public ListaCurso lista;
    public No prox;

	public No(ListaCurso lista){
		this.lista=lista;
		prox=null;
	}
}

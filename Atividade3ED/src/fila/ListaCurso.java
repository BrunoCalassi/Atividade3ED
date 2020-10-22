/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author bruno
 */
public class ListaCurso {
    private int idcurso;
    private String nome;
    private String area;
    private int qtdsem;
    private String periodo;

    public ListaCurso(int idcurso, String nome, String area, int qtdsem, String periodo) {
        this.idcurso = idcurso;
        this.nome = nome;
        this.area = area;
        this.qtdsem = qtdsem;
        this.periodo = periodo;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getQtdsem() {
        return qtdsem;
    }

    public void setQtdsem(int qtdsem) {
        this.qtdsem = qtdsem;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }


	

	public String toString(){
		String retorno="IdCurso:"+this.idcurso+",Nome:"+this.nome+",Area Curso:"+this.area+",Quantidade Semestre:"+this.qtdsem+",Periodo:"+this.periodo;
		return retorno;
	}
}

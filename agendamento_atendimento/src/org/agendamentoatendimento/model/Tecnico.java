package org.agendamentoatendimento.model;


/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:57 PM
 */
public class Tecnico extends Pessoa {

	private Habilidades habilidade;
	private int matr;

	public Tecnico(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public String toString(){
		return "";
	}

    public Habilidades getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Habilidades habilidade) {
        this.habilidade = habilidade;
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }
        
        
}
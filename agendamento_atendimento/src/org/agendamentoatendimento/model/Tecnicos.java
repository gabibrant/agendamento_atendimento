package org.agendamentoatendimento.model;

import org.agendamentoatendimento.model.Habilidades;


/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:57 PM
 */
public class Tecnicos extends Pessoa {

	private Habilidades habilidade;
	private int matr;

	public Tecnicos(){

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
    
    public void setHabilidadeById(int id) {
        for(Habilidades h: Habilidades.values()) {
            if(h.getId() == id) {
                habilidade = h;
            }
        }
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }
        
        
}
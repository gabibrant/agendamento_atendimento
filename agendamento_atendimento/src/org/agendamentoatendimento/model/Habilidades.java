package org.agendamentoatendimento.model;


/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:54 PM
 */
public enum Habilidades {
    Eletricista(1),
    Bombeiro(2),
    Pedreiro(3),
    Limpador(4),
    Outro(5)
;
    private int id;
    
    Habilidades(final int id) {
        this.id=id;
    }
    
    /*Retorna a habilidade 
    Habilidades getId(int id) {
        for(Habilidades h: Habilidades.values()) {
            if(h.id == id) {
                return h;
            }
        }
        return null;// not found
    }*/
    
    public int getId() {
        return id; 
    }
    

        
    public Tecnicos m_Tecnico;
    public OrdemServico m_OrdemServico;
}
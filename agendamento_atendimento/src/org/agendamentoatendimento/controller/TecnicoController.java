package org.agendamentoatendimento.controller;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import org.agendamentoatendimento.model.Habilidades;
import org.agendamentoatendimento.model.Tecnico;
import org.agendamentoatendimento.model.TecnicoDao;

/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:58 PM
 */
public class TecnicoController {

	public Tecnico m_Tecnico;

	public TecnicoController(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param nome
	 * @param email
	 * @param telefone
	 * @param habilidade
	 * @param numeroMatricula
	 */
	public int createTecnico(String nome, String email, String telefone, Habilidades habilidade) throws SQLException, ParseException{
            Tecnico tecnico = new Tecnico();
            //tecnico.setMatr(matr);  Auto-increment
            tecnico.setNome(nome);
            tecnico.setEmail(email);
            tecnico.setTelefone(telefone);
            tecnico.setHabilidade(habilidade);
                        
            new TecnicoDao().salvar(tecnico);
            return 0;
	}

	/**
	 * 
	 * @param numeroMatricula
	 */
	public Tecnico readTecnico(int numeroMatricula){
		return null;
	}

	public ArrayList<Tecnico> realAllTecnico(){
		return null;
	}

	/**
	 * 
	 * @param nome
	 * @param email
	 * @param telefone
	 * @param habilidade
	 * @param numeroMatricula
	 */
	public int updateTecnico(String nome, String email, String telefone, Habilidades habilidade, int numeroMatricula){
		return 0;
	}

	/**
	 * 
	 * @param numeroMatricula
	 */
	public int deleteTecnico(int numeroMatricula){
		return 0;
	}

}
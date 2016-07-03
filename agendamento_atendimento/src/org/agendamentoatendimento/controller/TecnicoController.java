package org.agendamentoatendimento.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import static org.agendamentoatendimento.model.ConnectionDatabase.getConnection;
import org.agendamentoatendimento.model.Habilidades;
import org.agendamentoatendimento.model.Tecnicos;
import org.agendamentoatendimento.model.TecnicoDao;

/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:58 PM
 */
public class TecnicoController {

	public Tecnicos tecnico;

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
            tecnico = new Tecnicos();
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
	public Tecnicos readTecnico(int matr) throws SQLException{
            String select = "SELECT * FROM tecnicos WHERE matr = ?";
            tecnico = null;
            
            PreparedStatement stmt = 
			getConnection().prepareStatement(select);
			
            stmt.setInt(1, matr);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                tecnico = new Tecnicos();
                tecnico.setMatr(rs.getInt("matr"));
                tecnico.setNome(rs.getString("nome"));
                tecnico.setEmail(rs.getString("email"));
                tecnico.setTelefone(rs.getString("telefone"));
                tecnico.setHabilidadeById(rs.getInt("habilidade"));
            }
            rs.close();
            stmt.close();
            return tecnico;      
      	}

	public ArrayList<Tecnicos> realAllTecnico() throws SQLException {
            ArrayList<Tecnicos> tecnicos = new ArrayList<Tecnicos>();
            String select = "SELECT * FROM tecnicos";
            PreparedStatement stmt = getConnection().prepareStatement(select);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Tecnicos tecnico = new Tecnicos();
                tecnico.setMatr(rs.getInt("matr"));
                tecnico.setNome(rs.getString("nome"));
                tecnico.setEmail(rs.getString("email"));
                tecnico.setTelefone(rs.getString("telefone"));
                tecnico.setHabilidadeById(rs.getInt("habilidade"));
                tecnicos.add(tecnico);
            }

            rs.close();
            stmt.close();

            return tecnicos;       
	}

	/**
	 * 
	 * @param nome
	 * @param email
	 * @param telefone
	 * @param habilidade
	 * @param numeroMatricula
	 */
	public int updateTecnico(int matr, String nome, String email, String telefone, Habilidades habilidade) throws ParseException, SQLException{
            tecnico = new Tecnicos();
            tecnico.setMatr(matr);  
            tecnico.setNome(nome);
            tecnico.setEmail(email);
            tecnico.setTelefone(telefone);
            tecnico.setHabilidade(habilidade);
            
            new TecnicoDao().alterar(tecnico);
            return 0;
	}

	/**
	 * 
	 * @param numeroMatricula
	 */
	public int deleteTecnico(int matr) throws SQLException{
            new TecnicoDao().excluir(matr);
            return 0;
        }

}
package org.agendamentoatendimento.controller;

import org.agendamentoatendimento.model.Cliente;
import org.agendamentoatendimento.model.ClienteDao;
import javax.swing.*;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import static org.agendamentoatendimento.model.ConnectionDatabase.getConnection;
import org.agendamentoatendimento.model.Tecnicos;
/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:53 PM
 */
public class ClienteController {

	public Cliente m_Cliente;

	public ClienteController(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param identidade
	 * @param nome
	 * @param email
	 * @param telefone
	 * @param cpf
	 * @param dataNasc
	 */
	public int createCliente(String nome, String email, String telefone, String cpf, String rg, String dataNasc) throws SQLException, ParseException {
            Cliente cliente = new Cliente();
            cliente.setNome(nome);
            cliente.setEmail(email);
            cliente.setTelefone(telefone);
            cliente.setCpf(cpf);
            cliente.setRg(rg);
            cliente.setDataNasc(dataNasc);
            new ClienteDao().salvar(cliente);
            return 0;
	}

	/**
	 * 
	 * @param identidade
	 */
	public Cliente readCliente(String cpf) throws SQLException{
            String select = "SELECT * FROM clientes WHERE cpf = ?";
            Cliente cliente = null;
            
            PreparedStatement stmt = 
			getConnection().prepareStatement(select);
			
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setRg(rs.getString("rg"));
                cliente.setDataNasc(rs.getString("dataNasc"));
            }
            
            rs.close();
            stmt.close();
            return cliente;      
	}

	public ArrayList<Cliente> readAllCliente() throws SQLException{
            ArrayList<Cliente> clientes = new ArrayList<Cliente>();
            String select = "SELECT * FROM clientes";
            PreparedStatement stmt = getConnection().prepareStatement(select);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setRg(rs.getString("rg"));
                cliente.setDataNasc(rs.getString("dataNasc"));
                clientes.add(cliente);
            }

            rs.close();
            stmt.close();

            return clientes;  
	}

	/**
	 * 
	 * @param identidade
	 * @param nome
	 * @param email
	 * @param telefone
	 * @param cpf
	 * @param dataNascimento
	 */
	public int updateCliente(String nome, String email, String telefone, String cpf, String rg, String dataNasc) throws ParseException, SQLException{
            Cliente cliente = new Cliente();
            cliente.setNome(nome);
            cliente.setEmail(email);
            cliente.setTelefone(telefone);
            cliente.setCpf(cpf);
            cliente.setRg(rg);
            cliente.setDataNasc(dataNasc);
            new ClienteDao().alterar(cliente);
            return 0;
	}

	/**
	 * 
	 * @param identidade
	 */
	public int deleteCliente(String cpf) throws SQLException{
            new ClienteDao().excluir(cpf);
		return 0;
	}

}
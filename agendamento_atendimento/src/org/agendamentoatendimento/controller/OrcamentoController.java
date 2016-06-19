package org.agendamentoatendimento.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import static org.agendamentoatendimento.model.ConnectionDatabase.getConnection;
import org.agendamentoatendimento.model.Material;
import org.agendamentoatendimento.model.Orcamento;
import org.agendamentoatendimento.model.OrcamentoDao;
import org.agendamentoatendimento.model.Tecnico;

/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:55 PM
 */
public class OrcamentoController {

	public Orcamento m_Orcamento;

	public OrcamentoController(){

	}

	public void finalize() throws Throwable {

	}

         //Acho que o valor total do orçamento tem que levar em conta todas essas variáveis
        public Double calculaValorTotal(Double valorHora, String horasNecessarias, Double taxaISS, ArrayList<Material> materiais) { 
            return 0.0;
        }
        
	/**
	 * 
	 * @param id
	 * @param dataCriacao
	 * @param horasNecessarias
	 * @param prazoValidade
	 * @param valorHora
	 * @param taxaISS
	 */
	public int createOrcamento(String horasNecessarias, Double valorHora, ArrayList<Material> materiais, Calendar dataCriacao, Calendar prazoValidade, Double taxaISS) throws SQLException{
            Orcamento orcamento = new Orcamento();
            orcamento.setHorasNecessarias(horasNecessarias);
            orcamento.setValorHora(valorHora);
            orcamento.setMateriais(materiais);
            orcamento.setDataCriacao(dataCriacao);
            orcamento.setPrazoValidade(prazoValidade);
            orcamento.setTaxaISS(taxaISS);
            orcamento.setValorTotal(calculaValorTotal(valorHora,horasNecessarias,taxaISS,materiais));
            new OrcamentoDao().salvar(orcamento);
            return 0;
	}
        
        //Adiciona um material a um orçamento
        public int adiconaMaterial (Orcamento orcamento, Material material) {
            return 0;
        }
        
        //Busca os id de cada material em um determinado orçamento
        //Para calcular a quantidade de cada material em um determinado orçamento, tem que usar esse método como base e somar o número de elementos repetidos
        //Depois de calcular a quantidade de cada material, dá pra fazer o preço daquele material (quantidade*valorUnitario)
        public ArrayList<Integer> idMateriaisDoOrcamento(Orcamento orcamento) throws SQLException {           
            ArrayList<Integer> materiais_id = new ArrayList<Integer>();
            
            int id_orcamento = orcamento.getId();
            String select = "SELECT * FROM materiais_orcamentos WHERE id_orcamento=" + id_orcamento + ";";
            System.out.println(select);
            
            try {
                PreparedStatement stmt = getConnection().prepareStatement(select);
                ResultSet rs = stmt.executeQuery();

                int material_id=0;
                while (rs.next()) {
                    material_id = rs.getInt("id_material");
                    System.out.println(material_id);
                    materiais_id.add(material_id);
                }
                rs.close();
                stmt.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
            return materiais_id;     
        }

	/**
	 * 
	 * @param identificacao
	 */
	public String readOrcamento(String identificacao){
		return "";
	}

	public ArrayList<Orcamento> realAllOrcamento(){
		return null;
	}

	/**
	 * 
	 * @param identificacao
	 * @param horasNecessarias
	 * @param valorHora
	 * @param materiais
	 * @param valorTotal
	 * @param prazoValidade
	 */
	public int updateOrcamento(String identificacao, String horasNecessarias, Double valorHora, ArrayList<Material> materiais, Double valorTotal, Calendar prazoValidade){
		return 0;
	}

	/**
	 * 
	 * @param identificacao
	 */
	public int deleteOrcamento(String identificacao){
		return 0;
	}
}
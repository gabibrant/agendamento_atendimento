/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agendamentoatendimento.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Gabriela
 */
public class GenericDao {
    private Connection connection;

    protected GenericDao() {
        this.connection = ConnectionDatabase.getConnection();
    }

    protected Connection getConnection() {
        return connection;
    }

    protected void save(String insertSql, Object... parametros) throws SQLException {
        PreparedStatement pstmt = getConnection().prepareStatement(insertSql);

        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i+1, parametros[i]);
        }

        pstmt.execute();
        pstmt.close();
    }

    protected void update(String updateSql, Object id, Object... parametros) throws SQLException {
        PreparedStatement pstmt = getConnection().prepareStatement(updateSql);
			
        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i+1, parametros[i]);
        }
        pstmt.setObject(parametros.length + 1, id);
        pstmt.execute();
        pstmt.close();
    }

    protected void delete(String deleteSql, Object... parametros) throws SQLException {
        PreparedStatement pstmt = getConnection().prepareStatement(deleteSql);
			
        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i+1, parametros[i]);
        }

        pstmt.execute();
        pstmt.close();
    }
}

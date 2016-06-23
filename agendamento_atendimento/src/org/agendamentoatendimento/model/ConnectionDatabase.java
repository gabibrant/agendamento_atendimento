/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agendamentoatendimento.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gabriela
 */
public class ConnectionDatabase {
    private static final String URL_MYSQL = "jdbc:mysql://localhost:3306/agendamento_atendimento";

    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

    private static final String USER = "root";

    private static final String PASS = "";

    public static Connection getConnection() {
        System.out.println("Conectando ao Banco de Dados");
        try {
            Class.forName(DRIVER_CLASS);
            return DriverManager.getConnection(URL_MYSQL, USER, PASS);
        } catch (ClassNotFoundException e) {
                e.printStackTrace();
        } catch (SQLException e) {
                throw new RuntimeException(e);
        }
        return null;
    }
}

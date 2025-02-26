package com.demo.hospedagem.database;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
 class DatabaseTest {

    @Autowired
    private DataSource dataSource;

    @Test
     void testaConexaoDoBancoDeDados(){
        Assert.notNull(dataSource, "O dataSource não pode ser nulo");

        try(Connection connection = dataSource.getConnection()){
            assertFalse(connection.isClosed(), "A conexão deve estar aberta");
            System.out.println("Conexão do banco bem sucedida");
        } catch (SQLException e) {
            throw new RuntimeException("Falha ao conectar o banco de dados: " + e);
        }
    }

}

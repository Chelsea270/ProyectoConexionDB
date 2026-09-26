package org.test.proyectoconexiondb.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConection {
    // datos constantes en mayuscula
    private static final String URL = "jdbc:postgresql://localhost:5432/dbprueba";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin123";

    private DatabaseConection() {

    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD); // clase encargada de la coneccion.
    }

}

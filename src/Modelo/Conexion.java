package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private String user = "bibliografia";
    private String password = "kl5GsG1VBMNrwq2K";
    private String hostname = "localhost";
    private String port = "3306";
    private String database = "bibliografia";
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://"+hostname+":"+port+"/"+database;
    private Connection con;

    public Conexion() {
        try {
            Class.forName(classname);
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (SQLException esql){
            System.err.println(esql.getMessage());
        }
    }

    public Connection getConecction(){
        return con;
    }
}

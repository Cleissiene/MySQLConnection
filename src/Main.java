import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            String driverName = "org.gjt.mm.mysql.Driver";
            Class.forName(driverName);


            String serverName = "127.0.0.1"; //nomme ou numero do servidor
            String mydatabase = "dbteste"; //nome do meu banco
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "admin";
            String password = "admin";
            //Utilizando o DriverManager para buscar a conexão
            connection = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException e) {

        } catch (SQLException e) {
        }
        try {
            Statement stmt = connection.createStatement();

            String sql = "TRUNCATE cargo";

            sql = "DELETE FROM cargo"; //Sentença SQL


            stmt.executeUpdate(sql);
        } catch (SQLException e) {
        }

    }
}
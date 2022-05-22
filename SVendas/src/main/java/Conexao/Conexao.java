package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author renan
 */
public class Conexao {

    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/lojaPI?useTimezone=true&serverTimezone=UTC&useSSL=false"; //base do projeto
        String login = "root"; // usuário do banco
        String senha = ""; // senha do banco
        Connection conexao = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); //Driver do Mysql
            conexao = DriverManager.getConnection(URL, login, senha);
            Statement instrucaoSQL = conexao.createStatement();
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Object listaRetorno = null;
            }
        }

    }

}

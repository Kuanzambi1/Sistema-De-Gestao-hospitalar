package baseDeDados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexao {
    final private String url = "jdbc:mysql://localhost:/projecto_hospital";
    final private String usuario = "root";
    final private String senha = "";
    
    public Connection pegarConexao(){
       try{
           return DriverManager.getConnection(url,usuario,senha);
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Erro ao conectar com a base dedados"+e);
       }
       return null;
    }
}

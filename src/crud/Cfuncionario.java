package crud;

import baseDeDados.conexao;
import classes.Funcionario;
import classes.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Cfuncionario {
    private Connection conn;
    
    public Cfuncionario(){
        this.conn = new conexao().pegarConexao();
    }

    public void salvar(Funcionario f, Medico m){
        try{
            String sql = "INSERT INTO funcionario(nome, cargo, salario, dataContratacao) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getCargo());
            stmt.setDouble(3, f.getSalario());
            stmt.setString(4, String.valueOf(f.getDataContratacao()));

            stmt.executeUpdate();

            

            if (m.getEspecialidade() != null) {
                int codigoFuncionario = getLastInsertID(stmt);
                String sql1 = "INSERT INTO medico(codigoM, numMedico, especialidade, dia_disponivel) VALUES (?, ?, ?, ?)";
                PreparedStatement stmt1 = conn.prepareStatement(sql1);
                stmt1.setInt(1, codigoFuncionario);
                stmt1.setString(2, m.getNumeroDoMedico());
                stmt1.setString(3, m.getEspecialidade());
                stmt1.setString(4, m.getDiaDisponivel());
                stmt1.executeUpdate();
                stmt1.close();
            }
            stmt.close();
            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar Funcionario: " + erro);
        }
    }

    private int getLastInsertID(PreparedStatement stmt) throws SQLException {
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            return rs.getInt(1);
        } else {
            throw new SQLException("Erro ao obter o último ID inserido");
        }
    }

    public List<Funcionario>  filtrarMedicoPorEsp(String esp){
        List<Funcionario> listarM = new ArrayList();
        try{
            String sql = "SELECT f.nome FROM funcionario f JOIN medico m"
                    + " ON f.codigo = m.codigoM "
                    + " WHERE m.especialidade LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,esp);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Funcionario f = new Funcionario();
                f.setNome(rs.getString("nome"));
                listarM.add(f);
            }
           return  listarM;
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao Listar médico: " + erro);
        }
        return null;
    }
}

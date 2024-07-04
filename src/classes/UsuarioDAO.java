/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.*;
import baseDeDados.conexao;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Bernardo
 */
public class UsuarioDAO {

    private conexao conex;

    public UsuarioDAO(conexao conex) {
        this.conex = conex;
    }

    public Usuario login(String user, String senha) {
        Connection conn = conex.pegarConexao();
        if (conn != null) {
            try {
                String sql = "SELECT * FROM usuarios WHERE user = ? AND senha = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, user);
                stmt.setString(2, senha);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    String role = rs.getString("role");
                    return new Usuario(user, senha, role);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao verificar login: " + e);
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e);
                }
            }
        }
        return null;
    }

    public boolean cadastrarUsuario(Usuario usuario) {
        Connection conn = conex.pegarConexao();
        if (conn != null) {
            try {
              /*  if (usuarioExistente(usuario.getUser())) {
                    JOptionPane.showMessageDialog(null, "Usuário já existente!");
                    return false;
                }*/

                String sql = "INSERT INTO usuarios(user, senha, role) VALUES (?,?,?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, usuario.getUser());
                stmt.setString(2, usuario.getSenha());
                stmt.setString(3, usuario.getRole());

                int rowsInserted = stmt.executeUpdate();

                return rowsInserted > 0;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuario: " + e);
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e);
                }
            }
        }
        return false;
    }

    /*private boolean usuarioExistente(String user){
        String sql = "SELECT COUNT(*) FROM usuarios WHERE user = ?"; 
        try{
    Connection conn = conex.getConection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, user);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);
            return count > 0;
        }
    } catch (SQL Execption e){
    JOptionPane.showMessageDialog(null, "Erro ao verificar usuário existente: " + e);
    }
        return false;
    }
*/
}
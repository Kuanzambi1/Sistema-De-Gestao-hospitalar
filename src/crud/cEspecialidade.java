/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import baseDeDados.conexao;
import classes.Especialidade;
import classes.Funcionario;
import classes.Medico;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel Kuanzambi
 */
public class cEspecialidade {
    private Connection conn;
   
    public cEspecialidade(){
        this.conn = new conexao().pegarConexao();
    }
    
    public List<Especialidade> listarEespecialidade(){
       
        try{
            List<Especialidade> listar = new ArrayList<>();
            String sql = "SELECT nome FROM especialidade";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Especialidade e = new Especialidade();
                e.setNome(rs.getString("nome"));
                listar.add(e);
            }
            return listar;
        }catch(SQLException erro){
        JOptionPane.showMessageDialog(null, "Erro ao listar");
        }
       return null;  
    }
    
    public  float preco(String esp){
        float preco = 0;
        try{
            String sql = "SELECT preco FROM especialidade WHERE nome LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,esp);
            ResultSet rs = stmt.executeQuery();
            Especialidade e = new Especialidade();
            if(rs.next()){
              preco = Float.parseFloat(rs.getString("preco"));   
            }
             
        }catch(SQLException erro){
            
        }
        return preco;
    }
    public List<Object[]> getMedicos(){
         List<Object[]> medicos = new ArrayList<>();
        
        try{
            String sql = "SELECT m.numMedico, f.nome, m.especialidade,m.dia_disponivel FROM medico m "
                    + "JOIN funcionario f ON f.codigo = m.codigoM";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String nome = rs.getString("nome");
                String numMedico = rs.getString("numMedico");
                String especialidade = rs.getString("especialidade");
                String diaDisponivel = rs.getString("dia_disponivel");
                medicos.add(new Object[]{numMedico,nome,especialidade,diaDisponivel});
                
            }
            return medicos;
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao listar dias");
        }
        
       return null; 
    }
    
}

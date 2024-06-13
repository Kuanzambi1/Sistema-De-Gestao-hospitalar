/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import baseDeDados.conexao;
import classes.Paciente;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cpaciente {
    private Connection conn;
    
    public Cpaciente(){
        this.conn = new conexao().pegarConexao();
    }
    
    public void salvar(Paciente p){
        try{
            String sql ="INSERT INTO paciente(nome,data_de_nascimento,genero,peso,altura,numero_bi,numero_do_telefone,endereco)"
                    + "VALUES(?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,p.getNome());
            stmt.setString(2,String.valueOf(p.getNascimento()));
            stmt.setString(3, p.getGenero());
            stmt.setFloat(4,p.getPeso());
            stmt.setFloat(5,p.getAltura());
            stmt.setString(6,p.getBi());
            stmt.setInt(7,p.getTelefone());
            stmt.setString(8,p.getEndereco());
            
            stmt.execute();
            
            stmt.close();
            JOptionPane.showMessageDialog(null, "Paciente Salvo com sucesso");
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao salvar paciente "+erro);
        }
    }
    public Paciente buscarPaciente(int id){
        try{
            String sql = "SELECT * FROM paciente WHERE codigo=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            Paciente p = new Paciente();
            if(rs.next()){
                p.setIdPaciente(Integer.parseInt(rs.getString("codigo")));
                p.setNome(rs.getString("nome"));
                p.setNascimento(LocalDate.parse(rs.getString("data_de_nascimento")));
                p.setGenero(rs.getString("genero"));
                p.setPeso(Float.parseFloat(rs.getString("peso")));
                p.setAltura(Float.parseFloat(rs.getString("altura")));
                p.setBi(rs.getString("numero_bi"));
                p.setTelefone(Integer.parseInt(rs.getString("numero_do_telefone")));
                p.setEndereco(rs.getString("endereco"));
            }
            return p;
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente "+erro);
        }
        return null;
    }
    public List<Paciente>Listar(){
        List<Paciente> lista = new ArrayList<>();
        try{
            String sql = "SELECT * FROM paciente";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Paciente p = new Paciente();
                p.setIdPaciente(Integer.parseInt(rs.getString("codigo")));
                p.setNome(rs.getString("nome"));
                p.setNascimento(LocalDate.parse(rs.getString("data_de_nascimento")));
                p.setGenero(rs.getString("genero"));
                p.setPeso(Float.parseFloat(rs.getString("peso")));
                p.setAltura(Float.parseFloat(rs.getString("altura")));
                p.setBi(rs.getString("numero_bi"));
                p.setTelefone(Integer.parseInt(rs.getString("numero_do_telefone")));
                p.setEndereco(rs.getString("endereco"));
                lista.add(p);
            }
            return lista;
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao criar lista de pacientes "+erro);
        }
        return null;
    }
    public List<Paciente>filtrar(String nome){
        List<Paciente> lista = new ArrayList<>();
        try{
            String sql = "SELECT * FROM paciente WHERE nome LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,nome);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Paciente p = new Paciente();
                p.setIdPaciente(Integer.parseInt(rs.getString("codigo")));
                p.setNome(rs.getString("nome"));
                p.setNascimento(LocalDate.parse(rs.getString("data_de_nascimento")));
                p.setGenero(rs.getString("genero"));
                p.setPeso(Float.parseFloat(rs.getString("peso")));
                p.setAltura(Float.parseFloat(rs.getString("altura")));
                p.setBi(rs.getString("numero_bi"));
                p.setTelefone(Integer.parseInt(rs.getString("numero_do_telefone")));
                p.setEndereco(rs.getString("endereco"));
                lista.add(p);
            }
            return lista;
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao criar lista de pacientes "+erro);
        }
        return null;
    }
}

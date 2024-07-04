/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import baseDeDados.conexao;
import java.sql.Connection;
import classes.Factura;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel Kuanzambi
 */
public class Cfactura {
    private Connection conn;
    
    public Cfactura(){
        this.conn = new conexao().pegarConexao();
    }
    public void salvar(Factura f){
        try{
            String sql = "INSERT INTO factura(valor,paciente,dataEmissao) Values(?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setFloat(1,f.getValor());
            stmt.setString(2, f.getPaciente());
            stmt.setString(3, String.valueOf(f.getDataDeEmissao()));
            stmt.executeQuery();
            stmt.close();
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Médico indisponível");
        }
    }
}

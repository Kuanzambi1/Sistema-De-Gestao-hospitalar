/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDeDados;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel Kuanzambi
 */
public class TestarConexao {
    public static void main(String [] args){
        try{
            new conexao().pegarConexao();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        }catch(HeadlessException erro){
            JOptionPane.showMessageDialog(null, "Erro ao conectar"+ erro.getMessage());
        }
    }
    
}

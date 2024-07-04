/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import baseDeDados.conexao;
import classes.Consulta;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;


/**
 *
 * @author Emanuel Kuanzambi
 */
public class Cconsulta {
    private Connection conn;
    
    public Cconsulta(){
        this.conn = new conexao().pegarConexao();
    }
    public void salvar(Consulta c){
        String dia="";String dayOfWeekStr="";
            Date diaSelecionado = c.getDataDaConsulta();
              if (diaSelecionado != null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(diaSelecionado);
                
                // Obtém o dia da semana
                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                
                // Converte o dia da semana para texto
                SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
                dayOfWeekStr = sdf.format(diaSelecionado);
                
                
                try{
                    String buscarDia = "SELECT dia_disponivel FROM dados_medico WHERE nome LIKE ?";
                    PreparedStatement stmtD = conn.prepareStatement(buscarDia);
                    stmtD.setString(1,c.getMedico());
                    ResultSet rsD = stmtD.executeQuery();
                    if(rsD.next()){
                        dia = rsD.getString("dia_disponivel");
                        if(dia.equals(dayOfWeekStr)){
                            JOptionPane.showMessageDialog(null, "Médico disponível");
                               try{
                                        String sql = "INSERT INTO consulta (especialidade,nomeMedico,nomePaciente,valor,data) VALUES(?,?,?,?,?);";
                                        PreparedStatement stmt = conn.prepareStatement(sql);
                                        stmt.setString(1,c.getEspecialidade() );
                                        stmt.setString(2,c.getMedico() );
                                        stmt.setString(3,c.getPaciente() );
                                        stmt.setFloat(4, c.getValor());
                                        stmt.setString(5,String.valueOf(c.getDataDaConsulta()) );

                                        stmt.execute();
                                        stmt.close();
                                        JOptionPane.showMessageDialog(null, "Consulta agendada com sucesso");
                                    }catch(SQLException erro){
                                        JOptionPane.showMessageDialog(null, "Erro ao agendar a consulta "+ erro);
                                     }
                            
                        }else{
                            JOptionPane.showMessageDialog(null, "Médico indisponível");
                        }
                    }
                }catch(SQLException erro){
                    JOptionPane.showMessageDialog(null, "Erro ao pegar dia disponivel "+erro);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma data selecionada.");
            }
              
      
    }
    public List<Object[]> getConsultas(){
        List<Object[]> consultas = new ArrayList<>();
        try{
            String sql = "SELECT especialidade,nomeMedico,nomePaciente,valor,data FROM consulta;";
            PreparedStatement  stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                String especialidade = rs.getString("especialidade");
                String nomeMedico = rs.getString("nomeMedico");
                String nomePaciente = rs.getString("nomePaciente");
                String valor = rs.getString("valor");
                String data = rs.getString("data");
                consultas.add(new Object[]{especialidade,nomeMedico,nomePaciente,valor,data});
                
            }
            return consultas;
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao listar Consultas "+ erro);
        }
      return null;  
    }
}

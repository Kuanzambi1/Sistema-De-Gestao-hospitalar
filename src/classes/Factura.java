/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
/**
 *
 * @author Emanuel Kuanzambi
 */
public class Factura {
    private String paciente;
    private float valor;
    private Date dataDeEmissao;

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataDeEmissao() {
        return new Date();
    }

    public void setDataDeEmissao(Date dataDeEmissao) {
        this.dataDeEmissao = dataDeEmissao;
    }
    
   
    
    
}

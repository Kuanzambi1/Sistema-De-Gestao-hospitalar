/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.math.BigDecimal;
import java.time.LocalDate;
/**
 *
 * @author Emanuel Kuanzambi
 */
public class Factura {
    private int idFactura;
    private Paciente paciente;
    private BigDecimal valor;
    private LocalDate dataDeEmissao;
    
    public boolean emitirFactura(Paciente paciente, BigDecimal valor, LocalDate dataEmissao){
        return true;
    }
    public boolean calcularTotalFacturas(LocalDate dataInicio, LocalDate dataFim){
        return true;
    }
    public BigDecimal pagarFactura(LocalDate inicio, LocalDate fim){
        return valor;
    }
    
    
}

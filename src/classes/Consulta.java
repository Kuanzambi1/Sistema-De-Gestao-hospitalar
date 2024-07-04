
package classes;

import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author Emanuel Kuanzambi
 */
public class Consulta {
    private String medico;
    private String paciente;
    private Date dataDaConsulta;
    private String especialidade;
    private Float valor;

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public Date getDataDaConsulta() {
        return dataDaConsulta;
    }

    public void setDataDaConsulta(Date dataDaConsulta) {
        this.dataDaConsulta = dataDaConsulta;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
    
    
    
    
    
    public boolean agendarConsulta(Consulta consulta, Paciente paciente){

        return true;
    }
    public boolean remarcarConsulta(Consulta consulta){
        return true;
    }
    public boolean cancelarConsulta(Consulta consulta){
        return true;
    }
    
}

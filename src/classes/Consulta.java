
package classes;

import java.time.LocalDate;

/**
 *
 * @author Emanuel Kuanzambi
 */
public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private LocalDate dataDaConsulta;
    private Especialidade especialidade;
    
    
    
    
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

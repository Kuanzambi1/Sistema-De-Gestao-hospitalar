
package classes;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Emanuel Kuanzambi
 */
public abstract class Funcionario extends Pessoa {
    private String codigo;
    private String cargo;
    private BigDecimal salario;
    private LocalDate dataContratacao;
    
    Funcionario(String cargo){
        this.cargo = cargo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    
}

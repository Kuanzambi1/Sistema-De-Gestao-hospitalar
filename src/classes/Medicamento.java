

package classes;

import java.time.LocalDate;

/**
 *
 * @author Emanuel Kuanzambi
 */
public class Medicamento {
    private String codigo;
    private String nome;
    private float dosagem;
    private LocalDate dataDeFabrico;
    private LocalDate dataDeCaducidade;
    private String instruçõesDeUso;
    public boolean cadastrarMedicamento(Medicamento medicamento){
        return true;
    }
    public boolean expirado(Medicamento medicamento){
        return true;
    }
}

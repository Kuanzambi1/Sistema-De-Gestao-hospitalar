
package classes;

import java.time.LocalDate;

/**
 *
 * @author Emanuel Kuanzambi
 */
public abstract class Pessoa {
    private String nome;
    private int telefone;
    private String endereco;
    private String bi;
    private LocalDate nascimento;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

}

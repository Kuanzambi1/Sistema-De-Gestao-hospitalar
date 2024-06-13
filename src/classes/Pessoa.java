
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
    private String genero;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }



}

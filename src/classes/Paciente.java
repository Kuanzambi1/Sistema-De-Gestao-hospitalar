package classes;

import java.time.LocalDate;

/**
 *
 * @author Emanuel Kuanzambi
 */
public class Paciente extends Pessoa{
       private int idPaciente;
       private float peso;
       private float altura;

    @Override
    public void setGenero(String genero) {
        super.setGenero(genero); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getGenero() {
        return super.getGenero(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public float getPeso() {
        return peso;
    }

    @Override
    public void setNascimento(LocalDate nascimento) {
        super.setNascimento(nascimento); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public LocalDate getNascimento() {
        return super.getNascimento(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setBi(String bi) {
        super.setBi(bi); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getBi() {
        return super.getBi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setEndereco(String endereco) {
        super.setEndereco(endereco); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getEndereco() {
        return super.getEndereco(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setTelefone(int telefone) {
        super.setTelefone(telefone); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getTelefone() {
        return super.getTelefone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNome() {
        return super.getNome(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

  
       
    
}

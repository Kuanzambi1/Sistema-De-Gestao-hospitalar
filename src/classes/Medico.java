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
public class Medico extends Funcionario{
    private int numeroDoMedico;
    private LocalDate horarioDeTrabalho;
    private Especialidade especialidade;
    
    public Medico(){
        super("Médico");
    }
    
    @Override
    public void setDataContratacao(LocalDate dataContratacao) {
        super.setDataContratacao(dataContratacao); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setSalario(BigDecimal salario) {
        super.setSalario(salario); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setCodigo(String codigo) {
        super.setCodigo(codigo); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNascimento(LocalDate nascimento) {
        super.setNascimento(nascimento); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setBi(String bi) {
        super.setBi(bi); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setEndereco(String endereco) {
        super.setEndereco(endereco); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setTelefone(int telefone) {
        super.setTelefone(telefone); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}

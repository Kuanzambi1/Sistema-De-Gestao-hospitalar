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
    private String numeroDoMedico;
    private String diaDisponivel ;
    private String especialidade;
    
    
    

    public String getNumeroDoMedico() {
        return numeroDoMedico;
    }

    public void setNumeroDoMedico(String numeroDoMedico) {
        this.numeroDoMedico = numeroDoMedico;
    }

    public String getDiaDisponivel() {
        return diaDisponivel;
    }

    public void setDiaDisponivel(String diaDisponivel) {
        this.diaDisponivel = diaDisponivel;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void setDataContratacao(LocalDate dataContratacao) {
        super.setDataContratacao(dataContratacao); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public LocalDate getDataContratacao() {
        return super.getDataContratacao(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setSalario(double salario) {
        super.setSalario(salario); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getSalario() {
        return super.getSalario(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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

    @Override
    public void setCodigo(String codigo) {
        super.setCodigo(codigo); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getCodigo() {
        return super.getCodigo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

/**
 *
 * @author Lucas Bernardo
 */
public class Usuario {
    private String user;
    private String senha;
    private String role;

    public Usuario(String user, String senha, String role) {
        this.user = user;
        this.senha = senha;
        this.role = role;
    }



   

    public String getUser() {
        return user;
    }

    public String getSenha() {
        return senha;
    }

    public String getRole() {
        return role;
    }

 

    public void setUser(String user) {
        this.user = user;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setRole(String role) {
        this.role = role;
    }

  

   
    
}

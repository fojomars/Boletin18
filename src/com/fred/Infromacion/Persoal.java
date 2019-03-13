/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fred.Infromacion;

/**
 *
 * @author fojomars
 */
public class Persoal {
    String telefono;
    String correo;

    
    // CONSTRUCTORES
    public Persoal() {
    }

    public Persoal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }
    
    
    // MÉTODOS DE ACCESO
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // MÉTODOS TO STRING
    @Override
    public String toString() {
        return "telefono = " + telefono + ", correo = " + correo;
    }
    
    
    
}

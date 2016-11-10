/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatransporte;

import java.util.Date;

/**
 *
 * @author usuario
 */
public abstract class Envio {

    private double peso;
    String fecha;

    public void mostrar() {
        System.out.print(this.fecha);
        System.out.print(this.peso);
    }

    public Envio() {
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Envio(double peso, String fecha) {
        this.peso = peso;
        this.fecha = fecha;
    }

}

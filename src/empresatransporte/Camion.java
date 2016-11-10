/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatransporte;

/**
 *
 * @author usuario
 */
public class Camion extends Vehiculo {

    double volumen;

    public void mostrar() {
        super.mostrar();
        System.out.print(this.volumen);
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public Camion(double volumen, String marca, String matricula) {
        super(marca, matricula);
        this.volumen = volumen;
    }

    public Camion() {
    }

}

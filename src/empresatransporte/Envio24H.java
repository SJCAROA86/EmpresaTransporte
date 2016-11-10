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
public class Envio24H extends Envio {

    String prioridad;

    public void mostrar() {
        super.mostrar();
        System.out.print(this.prioridad);
    }

    public Envio24H(String prioridad, double peso, String fecha) {
        super(peso, fecha);
        this.prioridad = prioridad;
    }

    public Envio24H() {
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

}

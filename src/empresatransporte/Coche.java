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
public class Coche extends Vehiculo {

    String color;

    public void mostrar() {
        super.mostrar();
        System.out.print(this.color);
    }

    public Coche(String color, String marca, String matricula) {
        super(marca, matricula);

    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public Coche() {
    }

}

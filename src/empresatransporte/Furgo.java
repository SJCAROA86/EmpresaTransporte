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
public class Furgo extends Vehiculo {

    int PMA;

    public void mostrar() {
        super.mostrar();
        System.out.print(this.PMA);
    }

    public Furgo(int PMA, String marca, String matricula) {
        super(marca, matricula);
        this.PMA = PMA;
    }

    public int getPMA() {
        return PMA;
    }

    public void setPMA(int PMA) {
        this.PMA = PMA;
    }

    public Furgo() {
    }

}

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
public class EnvioAzul extends Envio {
    
    double valor;
    
    public void mostrar() {
        super.mostrar();
       System.out.print(this.valor);
    }

    public EnvioAzul(double valor, double peso, String fecha) {
        super(peso, fecha);
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public EnvioAzul() {
    }
    
}

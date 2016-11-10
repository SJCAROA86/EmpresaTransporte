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
public abstract class Vehiculo {

    protected String marca;
    protected String matricula;

    public Vehiculo(Empleado empleado, String marca, String matricula) {

        this.marca = marca;
        this.matricula = matricula;
    }

    public void mostrar() {
        System.out.print(this.marca);
        System.out.print(this.matricula);

    }

    public Vehiculo(String marca, String matricula) {
        this.marca = marca;
        this.matricula = matricula;
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}

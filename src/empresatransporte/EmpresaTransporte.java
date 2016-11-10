/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatransporte;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class EmpresaTransporte {

    static ArrayList<Empleado> empleados = new ArrayList<>();
    static ArrayList<Envio> envios = new ArrayList<>();
    static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public static void rellenarDatos() {
        for (int i = 0; i < 40; i++) {
            empleados.add(new Empleado("PACO" + i));
        }
        for (int i = 0; i < 40; i++) {
            if (i < 5) {

                vehiculos.add(new Coche("AZUL", "AUDI" + i, "9549HWV" + i));
            } else if (i < 20) {
                vehiculos.add(new Furgo(2000, "RENAULT" + i, "4324KWS" + i));
            } else if (i < 40) {
                vehiculos.add(new Camion(5000, "MERCEDES" + i, "8871LFB" + i));
            }
        }
        for (int i = 0; i < 200; i++) {
            if (i < 100) {
                envios.add(new EnvioAzul(500, (int) (Math.random() * (500 - 50) + 50), "Entrega en 5 días después de hacer el pedido"));
            } else if (i < 200) {
                envios.add(new Envio24H("ALTA", (int) (Math.random() * (250 - 25) + 25), "Entrega  1 día después de hacer el pedido"));
            }
        }
    }

    public static void mostrarTodosLosEnvios() {
        for (Envio envio : envios) {
            envio.mostrar();
            System.out.println();

        }
    }

    public static void mostrarEnvio24HMayorPeso() {
        double max = 0;
        Envio24H envioMax = null;
        for (Envio envio : envios) {
            if (envio instanceof Envio24H) {
                if (max < envio.getPeso()) {
                    max = envio.getPeso();
                    envioMax = (Envio24H) envio;

                }
            }
        }
        System.out.println("El envío 24H con mayor peso es: " + max + "Kg");
    }

    public static void SumaDePesosSegunTipoDeEnvio() {
        double pesoazul = 0;
        double peso24H = 0;
        for (int i = 0; i < envios.size(); i++) {
            if (envios.get(i) instanceof EnvioAzul) {
                pesoazul = pesoazul + envios.get(i).getPeso();
            } else if (envios.get(i) instanceof Envio24H) {
                peso24H = peso24H + envios.get(i).getPeso();
            }

        }
        System.out.println("PESO ENVIOS AZULES: " + pesoazul + "Kg");
        System.out.println("PESO ENVIOS 24H: " + peso24H + "Kg");
        System.out.println("PESO DE TODOS LOS ENVÍOS: " + pesoazul + peso24H + "Kg");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rellenarDatos();
        mostrarTodosLosEnvios();
        SumaDePesosSegunTipoDeEnvio();

    }

}

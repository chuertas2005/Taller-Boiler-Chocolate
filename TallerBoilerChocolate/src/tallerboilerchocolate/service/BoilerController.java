
package tallerboilerchocolate.service;

import tallerboilerchocolate.model.Boiler;

public class BoilerController {

    private final Boiler boiler;

    public BoilerController() {
        this.boiler = Boiler.getInstancia();
    }

    public void llenarBoiler() {
        boiler.llenar();
    }

    public void iniciarMezcla() {
        boiler.iniciarMezcla();
    }

    public void vaciarBoiler() {
        boiler.vaciar();
    }

    public void mostrarEstado() {

        System.out.println("\n--- ESTADO DEL BOILER ---");

        System.out.println(
            "Boiler lleno: " + boiler.estaLleno()
        );

        System.out.println(
            "Resistencia encendida: "
            + boiler.estaResistenciaEncendida()
        );

        System.out.println("-------------------------\n");
    }
}


package tallerboilerchocolate.main;

import tallerboilerchocolate.service.BoilerController;

public class Main {

    public static void main(String[] args) {

        BoilerController controller =
                new BoilerController();

        System.out.println("=== SISTEMA DE CONTROL DEL BOILER ===");

        // Estado inicial
        controller.mostrarEstado();

        // Llenar el boiler
        controller.llenarBoiler();
        controller.mostrarEstado();

        // Iniciar mezcla
        controller.iniciarMezcla();
        controller.mostrarEstado();

        // Vaciar boiler
        controller.vaciarBoiler();
        controller.mostrarEstado();
    }
}

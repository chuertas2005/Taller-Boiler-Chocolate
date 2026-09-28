
package tallerboilerchocolate.model;

public class Boiler {

    private static Boiler instancia;

    private boolean lleno;
    private boolean resistenciaEncendida;

    private Boiler() {
        this.lleno = false;
        this.resistenciaEncendida = false;
    }


    public static Boiler getInstancia() {

        if (instancia == null) {
            instancia = new Boiler();
        }

        return instancia;
    }

    public boolean estaLleno() {
        return lleno;
    }

    public boolean estaResistenciaEncendida() {
        return resistenciaEncendida;
    }

    public void llenar() {

        if (!lleno && !resistenciaEncendida) {
            lleno = true;

            System.out.println("Boiler lleno con mezcla de chocolate y leche.");
        } else {
            System.out.println(
                "No se puede llenar el boiler. " +
                "Debe estar vacío y la resistencia apagada."
            );
        }
    }

    public void iniciarMezcla() {

        if (lleno && !resistenciaEncendida) {
            resistenciaEncendida = true;

            System.out.println(
                "La resistencia se encendio. " +
                "Iniciando proceso de mezcla..."
            );
        } else {
            System.out.println(
                "No se puede iniciar la mezcla. " +
                "El boiler debe estar lleno y la resistencia apagada."
            );
        }
    }

    public void vaciar() {

        if (lleno && resistenciaEncendida) {
            lleno = false;

            System.out.println(
                "El boiler se vacio correctamente."
            );
        } else {
            System.out.println(
                "No se puede vaciar el boiler. " +
                "Debe estar lleno y la resistencia encendida."
            );
        }
    }
}


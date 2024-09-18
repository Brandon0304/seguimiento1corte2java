package constructoressobrecarga;

public class sobrecargaMain {
    public static void main(String[] args) {
        sobrecargaconstructor x1 = new sobrecargaconstructor("Guante");
        sobrecargaconstructor x2 = new sobrecargaconstructor("Escoba", 2.500);
        x1.mostrarInformacion();
        x2.mostrarInformacion();
    }
}

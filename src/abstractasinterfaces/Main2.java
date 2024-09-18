package abstractasinterfaces;

public class Main2 {
    public static void main(String[] args) {
        Volador pajaro = new Pajaro();
        Volador avion = new Avion();
        pajaro.volar();
        avion.volar();
    }
}

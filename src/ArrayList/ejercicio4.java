package ArrayList;
import java.util.ArrayList;

//ALMACENAR NOMBRES DE NUESTROS AMIGOS
public class ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Miguel");
        nombres.add("Sofía");
        nombres.add("Jeshua");
        nombres.add("Arle");
        nombres.remove(3);
        if (nombres.contains("Miguel") && nombres.contains("Arle")){
            System.out.println("Los nombres se encuentran en la lista");
        }else {
            System.out.println("Los nombres no se encuentran en la lista");
        }
    }
}

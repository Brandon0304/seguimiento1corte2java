package ArrayList;
import java.util.ArrayList;

//BUSCAR EN ARRAYLIST
public class ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Blanco");
        colores.add("Negro");
        colores.add("Rojo");
        if (colores.contains("Rojo")){
            System.out.println("La lista contiene el color rojo");
        }
    }


}

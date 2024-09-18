package ArrayList;
import java.util.ArrayList;

//RECORRER ARRAYLIST
public class ejercicio2 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Sandía");
        for (String fruta : frutas){
            System.out.println(fruta);
        }
    }
}

package ArrayList;
import java.util.ArrayList;

public class ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> peliculas = new ArrayList<>();
        peliculas.add("Titanic");
        peliculas.add("Harry Potter");
        peliculas.add("Picapiedras");
        peliculas.add("Indestructibles");
        peliculas.get(2);
        peliculas.set(0, "Son como niños");
        peliculas.remove(3);
        System.out.println(peliculas);
    }
}

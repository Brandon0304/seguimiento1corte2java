package funcionesdecadena;

//COMPARAR CADENAS
public class ejemplo2 {
    public static void main(String[] args) {
        String cadena1 = "Hola";
        String cadena2 = "hola";
        System.out.println("¿Son iguales? "+cadena1.equals(cadena2));
        System.out.println("¿Son iguales (ignorando las mayúsculas)? "+cadena1.equalsIgnoreCase(cadena2));

        String cadena3 = "abc";
        String cadena4 = "abd";
        System.out.println("Comparación: "+cadena3.compareTo(cadena4));
    }
}

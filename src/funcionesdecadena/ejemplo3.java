package funcionesdecadena;

public class ejemplo3 {
    public static void main(String[] args) {
        String original = "Aprende Java en línea";
        String reemplazada = original.replace("Java", "JavaScript");
        System.out.println("Cadena reemplazada: "+reemplazada);

        String conEspacios = "  Hola  ";
        System.out.println("Cadena sin espacios: '" + conEspacios.trim() + "'");

        String lista = "uno, dos, tres";
        String[] partes = lista.split(",");
        System.out.println("Partes:");
        for (String parte : partes){
            System.out.println(parte);
        }
    }
}

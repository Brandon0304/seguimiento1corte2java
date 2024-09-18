package tiposdedatosclaseswrapper;

public class conversionprimitivowrapper {
    public static void main(String[] args) {
        Integer numero = Integer.valueOf(600);
        int numeroPrimitivo = numero.intValue();
        System.out.println("De primitivo a Wrapper: "+numero);
        System.out.println("De Wrapper a primitivo: "+numeroPrimitivo);
    }
}

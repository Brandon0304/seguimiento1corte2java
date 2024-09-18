package constructoressobrecarga;

public class sobrecargaconstructor {
    public String nombre;
    public double precio;

    public sobrecargaconstructor(String nombre){
        this.nombre = nombre;
    }

    public sobrecargaconstructor(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre + ", Precio: "+precio);
    }
}

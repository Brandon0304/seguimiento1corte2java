package Agregacion;
import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Universidad(String nombre){
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiantes(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes(){
        for (Estudiante estudiante : estudiantes){
            System.out.println(estudiante.getNombre());
        }
    }



}

package modificadoresdeacceso;

import javax.swing.*;

public class Private {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre(){
        JOptionPane.showMessageDialog(null, "Su nombre es: "+nombre);
    }
}

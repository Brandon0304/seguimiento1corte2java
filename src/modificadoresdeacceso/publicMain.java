package modificadoresdeacceso;

import javax.swing.*;

public class publicMain {
    public static void main(String[] args) {
        Public x = new Public();
        x.mensaje = JOptionPane.showInputDialog(null, "Hola, mundo");
        x.mostrarMensaje();
    }

}

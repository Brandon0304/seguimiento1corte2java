package modificadoresdeacceso;

import javax.swing.*;

public class PrivateMain {
    public static void main(String[] args) {
        Private x = new Private();
        x.setNombre(JOptionPane.showInputDialog(null, "Ingrese su nombre"));
        x.mostrarNombre();
    }
}

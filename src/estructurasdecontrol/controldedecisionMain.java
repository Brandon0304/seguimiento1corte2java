package estructurasdecontrol;

import javax.swing.*;

public class controldedecisionMain {
    public static void main(String[] args) {
        controldedecision x = new controldedecision();
        x.numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número"));
        x.positivoNegativo(x.numero);
    }
}

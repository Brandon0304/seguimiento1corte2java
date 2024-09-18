package Metodos;

import javax.swing.*;

public class CocheMain {
    public static void main(String[] args) {
        Coche x = new Coche();
        x.marca = JOptionPane.showInputDialog(null, "Ingrese la marca del vehículo");
        x.modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo del vehículo");
        JOptionPane.showMessageDialog(null, x.detalles());
    }
}

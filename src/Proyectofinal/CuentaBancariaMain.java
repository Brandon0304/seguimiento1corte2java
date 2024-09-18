package Proyectofinal;
import javax.swing.*;
import java.util.Scanner;

public class CuentaBancariaMain {
    public static void main(String[] args) {
        CuentaBancaria y = new CuentaBancaria(10000000, 12345);
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int numerocuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su número de cuenta (12345)"));
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        if (numerocuenta==12345 && nombre.equals("Brandon Ortiz Medina")){
            do {
                System.out.println("\n----BIENVENIDO A DAVIVIENDA, BRANDON ORTIZ MEDINA----");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Depositar (monto mayor a 10000)");
                System.out.println("3. Retirar");
                System.out.println("4. Consignar a número de cuenta (monto mayor a 10000)");
                System.out.println("5. Salir");
                System.out.println("Elige una opción: ");
                opcion = scanner.nextInt();

                switch (opcion){
                    case 1:
                        y.consultarSaldo();
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad a depositar");
                        double deposito = scanner.nextDouble();
                        y.depositar(deposito);
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad a retirar");
                        double retiro = scanner.nextDouble();
                        y.retirar(retiro);
                        break;
                    case 4:
                        System.out.println("Ingrese la cantidad a consignar");
                        double consignacion = scanner.nextDouble();
                        System.out.println("Ingrese el número de cuenta para realizar la consignación");
                        int cuenta = scanner.nextInt();
                        y.consignarMonto(consignacion, cuenta);
                        break;
                    case 5:
                        System.out.println("...SALIENDO DEL SISTEMA BANCARIO EN LINEA...");
                        break;
                    default:
                        System.out.println("OPCIÓN INVÁLIDA");
                }
            }while (opcion!=5);
            scanner.close();
        }else {
            System.out.println("ERROR....NÚMERO DE CUENTA NO ENCONTRADO");
        }
        }
}

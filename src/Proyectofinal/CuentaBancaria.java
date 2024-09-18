package Proyectofinal;

public class CuentaBancaria {
    public int saldo;
    public int numeroCuenta;

    public CuentaBancaria(int saldo, int numeroCuenta){
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public void consultarSaldo(){
        System.out.println("Su saldo es: "+saldo);
    }

    public void depositar(double cantidad){
        if (cantidad>=10000){
            saldo+=cantidad;
            System.out.println("Su depósito fue de: "+cantidad + ", Su nuevo saldo es de: "+saldo);
        }else{
            System.out.println("Cantidad inválida para depositar");
        }
    }

    public void retirar(double cantidad){
        if (saldo>=cantidad && saldo>=10000){
            saldo-=cantidad;
            System.out.println("Su retiro fue de: "+cantidad + ", Su nuevo saldo es de: "+saldo);
        }else{
            System.out.println("RETIRO NO VÁLIDO");
        }
    }

    public void consignarMonto(double cantidad, int numeroCuenta){
        if (cantidad>=10000 && numeroCuenta!=12345){
            saldo-=cantidad;
            System.out.println("Usted ha consignado :"+cantidad + " al número de cuenta "+numeroCuenta);
        }else{
            System.out.println("CANTIDAD O USUARIO NO VÁLIDOS");
        }

    }

}

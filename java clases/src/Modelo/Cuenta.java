package Modelo;

public class Cuenta {
private double saldo, limiteCredito;
public static final double LIMITE = 500;

    public void ingresar (double cantidad) {
        saldo += cantidad;
    }
    public void retirar (double cantidad){
        saldo -= cantidad;
    }
    public void setLimiteCredito (double cantidad) {
        limiteCredito = cantidad;
    }
    public double getLimiteCredito () {
        return limiteCredito;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Constructor por defecto
    public  Cuenta(){
        this.saldo = 0;
        this.limiteCredito = LIMITE;
    }

    //Constructor parametrizado
    public  Cuenta(double PlimiteCredito){
        this.saldo = 0;
        this.limiteCredito = PlimiteCredito;

    }

    }


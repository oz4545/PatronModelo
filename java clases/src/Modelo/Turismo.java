package Modelo;

public class Turismo extends Vehiculo{
    private int  numPuertas;
    public Turismo(String marca, String modelo,
    double precioAlquiler,int numPuertas){
        super(marca, modelo, precioAlquiler);
        setNumPuertas(numPuertas);
    
    }
    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
public void imprimirAtributos(){
    super.imprimirAtributos();
    System.out.print("\t" + "Puertas: " + numPuertas);
}
}

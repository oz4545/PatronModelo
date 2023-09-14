package modelo2;

public class Mago {
    private String nombre;
    private Mascota complice;

    public void mostrarDatos(){
        System.out.println("El mago se llama: " + nombre +" "+" tiene de mascota un(a) " + complice.getNombre() );
    }

    public Mago(String nombre, Mascota complice){
        this.nombre = nombre;
        this.complice = complice;

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Mascota getComplice() {
        return complice;
    }
    public void setComplice(Mascota complice) {
        this.complice = complice;
    }
}

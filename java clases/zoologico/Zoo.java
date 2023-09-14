package java clases.zoologico;

public class Zoo {
    private String nombre;
    private Animal animal;

    public void mostrarDatos(){
        System.out.println("el zoo se llama: " + nombre +" "+" tiene un animal " +animal.getNombre());
    }
    public Zoo (String nombre, Animal animal){
        this.nombre=nombre;
        this.animal=animal;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    
}

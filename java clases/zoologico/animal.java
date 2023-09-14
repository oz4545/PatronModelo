class Animal extends Zoo {
    private String tipoAnimal;

    public Animal(String nombre, String tipoAnimal) {
        super(nombre);
        this.tipoAnimal = tipoAnimal;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de animal: " + tipoAnimal);
    }}
package modelo2;
public class app {
    public class App{
        public static void main(String[] args) throws Exception {
            Mascota mascota1 = new Mascota( "Buho", "hedwig");
            Mago mago1 = new Mago("Harry Potter", mascota1);
            Mago mago2 = new Mago("Ron Weasley", new Mascota("Rata", "Scabbers"));
            mago1.mostrarDatos();
            mago2.mostrarDatos();
        }
    }
}

import java.util.ArrayList;
import java.util.List;

import Modelo.Autobus;
import Modelo.Cuenta;
import Modelo.Persona;
import Modelo.Turismo;
import Modelo.Vehiculo;
import modelo2.Mascota;

public class App {
    public static void main(String[] args) throws Exception {
        //Crando  objetos
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        //dondole valores a los atributos

        p1.setNombre("Juan");
        p1.setApellidos("Gonzalez");
        p2.setNombre("Luis");
        p2.setApellidos("Gomez");
        
        p1.mostrarNombre();
        p2.mostrarNombre();

        Cuenta miCuenta1 = new Cuenta();
        Cuenta miCuenta2 = new Cuenta(6000);
        System.out.print("Limite cuenta 1(normal):");
        System.out.println(miCuenta1.getLimiteCredito());
        System.out.print("Limite cuenta 2(vip):");
        System.out.println(miCuenta2.getLimiteCredito());
        
         List listaVehiculos = new ArrayList();
         
            listaVehiculos.add(new Vehiculo("Mercedes","E",55));
            listaVehiculos.add(new Autobus("Mercedes","M20",100,20));
            listaVehiculos.add(new Turismo("BMW","525",50,4));
            listaVehiculos.add(new Turismo("Audi", "A4",55,4));
            listaVehiculos.add(new Autobus("Mercedes","M10",120,30));
            listaVehiculos.add(new Turismo("VM", "Passat",35,4));
            listaVehiculos.add(new Turismo("Audi", "A3",30,2));
            listaVehiculos.add(new Turismo("Mercedes", "E",60,4));
            listaVehiculos.add(new Vehiculo("Audi", "A3",30));
            imprimirElementosLista((ArrayList)listaVehiculos);

            Mascota mascota1 = new Mascota( "Buho", "hedwig");    
    }

    private static void imprimirElementosLista(ArrayList listaVehiculos){
                for(int i=0; i<listaVehiculos.size(); i++){
                    Vehiculo v = (Vehiculo)listaVehiculos.get(i);
                    v.imprimirAtributos();
                    System.out.println("");
                }
            }
        }



package barcos;

public class BarcoPasajeros extends Barco implements Socorro {
private int eslora;
private int numerosDeCamaras;
public BarcoPasajeros(String nombre){
super(nombre);
    System.out.println("se crea el barco de pasageros con el nombre: "+super.getNombre());
}
@Override
public void alarma(){
    System.out.println("alarma desde el barco de pasageros con el nombre: "+super.getNombre());
}
@Override
public void mensajeDeSocorro(String mensaje){
    alarma();
    System.out.println("!!! SOS SOS "+mensaje);
}
}

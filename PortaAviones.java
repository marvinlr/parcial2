
package barcos;

public class PortaAviones extends Barco implements Socorro {
private int aviones=20;
private int tripulacion;
public PortaAviones(String nombre, int marinos){
super(nombre);
System.out.println("se crea el objeto PortaAviones con nombre: "+super.getNombre());
}
@Override
public void alarma(){
System.out.println("!!! marineros a sus puestos!!! de nombre: "+super.getNombre());    
}
@Override
public void mensajeDeSocorro(String mensaje) {
alarma();
    System.out.println("!!!SOS SOS!!!"+mensaje);
}
}

package barcos;
public class Pesquero extends Barco implements Socorro {
private int eslora;
private int pescadores;  
private double potencia;
public Pesquero(String nombre, int tripulacion){
super(nombre);
System.out.println("se crea el objeto pesquero con el nombre: "+super.getNombre());
}
@Override
public void alarma(){
System.out.println("!!! alarma desde pesquero!!! de nombre: "+super.getNombre());    
}
@Override
public void mensajeDeSocorro(String mensaje) {
alarma();
System.out.println("!!! SOS SOS !!!"+mensaje);
}

}

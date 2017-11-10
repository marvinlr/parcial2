
package barcos;

public class Barco {
private String nombre;
public Barco(String nombre){
this.nombre=nombre;
    System.out.println("dentro del costructor con el nombre: "+getNombre());
}
public String getNombre() {
return nombre;
}
public void alarma(){
    System.out.println("S.O.S desde el barco de nombre: "+getNombre());
}
}

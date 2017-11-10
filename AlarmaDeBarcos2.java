
package barcos;
import java.util.ArrayList;
public class AlarmaDeBarcos2 {
public static void main(String[]args){ 
//ArrayList<Socorro> b=new ArrayList<Socorro>();
Socorro bs[]=new Socorro[3];
String mensaje[]={"Nos Hundimos Tempano de hielo","Torpedos en HAWAI",
                  "Capitan Jack Sparrow Pirata del Caribe"};
BarcoPasajeros barPasajero= new BarcoPasajeros("titanic");
PortaAviones portAvion=new PortaAviones("Jhon F. Kennedy",4660);
Pesquero pesquero=new Pesquero("Perla Negra",20);
bs[0] = barPasajero;
bs[1] = portAvion;
bs[2] = pesquero;        
for ( int i=0;i<= 2;i++)
bs[i].mensajeDeSocorro(mensaje[i]);
}
}   


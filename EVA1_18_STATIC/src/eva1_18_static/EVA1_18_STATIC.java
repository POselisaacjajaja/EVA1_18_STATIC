/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_static;

/**
 *
 * @author isaaczapatto
 */
public class EVA1_18_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba obj = new Prueba(); //Creamos objeto y llamamos al método
        obj.mensaje();
        Prueba.mensajeEstatico();   //Directamente de la clase
        
        System.out.println("Pi: " + Math.PI);
    }
}

class Prueba{
    public void mensaje(){                           //Sólo al crear objetos
        System.out.println("Hola jaja");
    }
    public static void mensajeEstatico(){            //Directamente de la clase
        System.out.println("Hola (esteril)");
}
}
class Prueba2{}

package Excepcions;


public class ExcepcionCicle extends Exception{
    String mensaje;
    
    public ExcepcionCicle(String message){
        super(message);
        if (message.equals("cicle")) {
            mensaje = "Cicle no trobat.";
        }else if(message.equals("COG")){
            mensaje = "No s'han trobat cicles.";
        }
    }
}

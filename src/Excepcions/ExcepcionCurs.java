
package Excepcions;


public class ExcepcionCurs extends Exception{
    String mensaje;
    
    public ExcepcionCurs(String message){
        super(message);
        if (message.equals("curs")) {
            mensaje = "Curs no trobat.";
        }else if(message.equals("COG")){
            mensaje = "No s'han trobat curs.";
        }
    }
}

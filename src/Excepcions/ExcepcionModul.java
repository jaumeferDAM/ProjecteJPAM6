
package Excepcions;


public class ExcepcionModul extends Exception{
    String mensaje;
    
    public ExcepcionModul(String message){
        super(message);
        if (message.equals("modul")) {
            mensaje = "modul error";
        }else if(message.equals("fallo")){
            mensaje = "No s'han trobat el modul.";
        }
    }
}

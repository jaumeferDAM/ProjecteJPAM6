
package Excepcions;


public class ExcepcionFamilia extends Exception{
    String mensaje;
    
    public ExcepcionFamilia(String message){
        super(message);
        if (message.equals("Familia")) {
            mensaje = "Familia no trobat.";
        }else if(message.equals("COG")){
            mensaje = "No s'han trobat families.";
        }
    }
}

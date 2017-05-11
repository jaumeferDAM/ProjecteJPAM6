
package Excepcions;


public class ExcepcionAlumno extends Exception{
    String mensaje;
    
    public ExcepcionAlumno(String message){
        super(message);
        if (message.equals("NIF")) {
            mensaje = "NIF no trobat.";
        }else if(message.equals("COG")){
            mensaje = "No s'han trobat alumnes.";
        }
    }
}

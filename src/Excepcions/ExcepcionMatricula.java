
package Excepcions;


public class ExcepcionMatricula extends Exception{
    String mensaje;
    
    public ExcepcionMatricula(String message){
        super(message);
        if (message.equals("NIF")) {
            mensaje = "NIF no trobat.";
        }else if(message.equals("COG")){
            mensaje = "No s'han trobat la matricula.";
        }
    }
}

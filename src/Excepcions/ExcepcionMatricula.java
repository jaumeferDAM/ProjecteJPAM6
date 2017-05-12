
package Excepcions;


public class ExcepcionMatricula extends Exception{
    String mensaje;
    
    public ExcepcionMatricula(String message){
        super(message);
        if (message.equals("matricula")) {
            mensaje = "Matricula error";
        }else if(message.equals("fallo")){
            mensaje = "No s'han trobat la matricula.";
        }
    }
}

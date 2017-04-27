
package proyecto.m6.uf4;

import Controlador.AlumneDAO;
import Model.Alumne;


public class ProyectoM6UF4 {


    public static void main(String[] args) {
        AlumneDAO alumneDAO = new AlumneDAO();
        
        Alumne alumne1 = new Alumne("111111", "nom", "cognom", "correu", 555555);
        alumneDAO.crear();
        alumneDAO.insertar(alumne1);
    }
    
}

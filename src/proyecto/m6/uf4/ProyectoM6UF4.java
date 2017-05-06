
package proyecto.m6.uf4;

import Controlador.Alumne_Controlador;
import Model.Alumne;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ProyectoM6UF4 {


    public static void main(String[] args) {
//        Alumne_Controlador alumneDAO = new Alumne_Controlador();
//        
//        Alumne alumne1 = new Alumne("111111", "nom", "cognom", "correu", 555555);
//        alumneDAO.crear();
//        alumneDAO.insertar(alumne1);
//        alumneDAO.actualizar(new Alumne("111111", "Juan", "Alberto", "correu", 555555));
//        alumneDAO.eliminar(alumne1);
//        alumneDAO.buscarCognom("Alberto");
         EntityManager em;
//            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PROYECTE");
//            em = emf.createEntityManager();

              EntityManagerFactory emf = Persistence.createEntityManagerFactory("EXTERNA");
        em = emf.createEntityManager();
        System.out.println(em);
        Alumne a1 = new Alumne("447484F", "JJ", "DFCADF", "dadad", 3);
        Alumne_Controlador acontrol = new Alumne_Controlador(em);
        acontrol.Insertar(a1);
    }
    
}

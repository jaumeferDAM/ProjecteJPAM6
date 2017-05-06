
package Controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EM_Controlador {
    public static EntityManager getEntityManager() {
         EntityManager em;
//            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PROYECTE");
//            em = emf.createEntityManager();

              EntityManagerFactory emf = Persistence.createEntityManagerFactory("EXTERNA");
        em = emf.createEntityManager();

       
        return em;
    }
}
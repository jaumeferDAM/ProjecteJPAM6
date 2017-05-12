
package Controlador;

import Excepcions.ExcepcionAlumno;
import Model.Alumne;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class Alumne_Controlador extends Generic_Controlador<Alumne> {

    public Alumne_Controlador(EntityManager entityManger) {
        super(entityManger);
    }

    /**
     * Metode per a realitzar la busca d'alumnes mitjançant el cognom.
     * @param cognom
     * @return 
     */
    public Alumne buscarCognom(String cognom) {
        Alumne p = null;
        try {
            // Recupera el entity manager       
            Query query = em.createNamedQuery("alumneCognom", Alumne.class);
            query.setParameter("cognom", cognom);
            p = (Alumne) query.getSingleResult();
            System.out.println("close");
            em.close();
            if (p == null) {
                throw new ExcepcionAlumno("fallo");
            }
        } catch (ExcepcionAlumno ex) {
            System.out.println(ex.getMessage());
        }
        return p;
    }

}

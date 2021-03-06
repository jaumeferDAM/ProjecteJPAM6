
package Controlador;

import Excepcions.ExcepcionMatricula;
import Model.Matricula;
import Model.UnitatFormativa;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class Matricula_Controlador extends Generic_Controlador{

   public Matricula_Controlador(EntityManager entityManger) {
        super(entityManger);
    }
    /**
     * Metode per a realitzar la busca de matricules mitjançant el nif de l'alumne.
     * @param nif 
     */
    public void BuscarMatricula(String nif){
        Matricula p = null;
        try{
            Query query = em.createNamedQuery("nifMatricula", Matricula.class);
            query.setParameter("nif", nif);
            p = (Matricula) query.getSingleResult();
            System.out.println("close");
            if (p == null) {
                throw new ExcepcionMatricula("fallo");
            }
        }catch(ExcepcionMatricula ex){
            ex.getMessage();
        }
        
    }
    
}

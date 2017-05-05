
package Controlador;

import Model.UnitatFormativa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class Modul_Controlador extends Generic_Controlador{

   public Modul_Controlador(EntityManager entityManger) {
        super(entityManger);
    }
    
    public List<UnitatFormativa> BuscarCursosCicle(Long id) {
        System.out.println("Busqueda per id");
        Query query = em.createNamedQuery("cercaUFModul", UnitatFormativa.class);
        query.setParameter("id", id);
        List<UnitatFormativa> p = (List<UnitatFormativa>) query.getResultList();
        System.out.println(p.size());
        return p;
    }
}

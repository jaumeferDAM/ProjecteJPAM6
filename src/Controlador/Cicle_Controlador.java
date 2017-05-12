package Controlador;

import Excepcions.ExcepcionCicle;
import Model.Curs;
import Model.Modul;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class Cicle_Controlador extends Generic_Controlador {

    public Cicle_Controlador(EntityManager entityManager) {
        super(entityManager);
    }

    public List<Curs> BuscarCursosCicle(Long id) {
        List<Curs> p = null;
        try {
            System.out.println("Busqueda per id");
            Query query = em.createNamedQuery("cercaCursosCicles", Curs.class);
            query.setParameter("id", id);
            p = (List<Curs>) query.getResultList();
            System.out.println(p.size());
            System.out.println("close");
            if (p == null || p.isEmpty()) {
                throw new ExcepcionCicle("fallo");
            }
        } catch (ExcepcionCicle ex) {
            System.out.println(ex.getMessage());
        }
        return p;
    }

    public List<Modul> BuscarModulsCicle(Long id) {
        List<Modul> p = null;
        try {
            System.out.println("Busqueda per id");
            Query query = em.createNamedQuery("cercaModulsCicles", Modul.class);
            query.setParameter("id", id);
            p = (List<Modul>) query.getResultList();
            System.out.println(p.size());
            if (p == null || p.isEmpty()) {
                throw new ExcepcionCicle("COG");
            }
        } catch (ExcepcionCicle ex) {
            System.out.println(ex.getMessage());
        }
        return p;
    }

}

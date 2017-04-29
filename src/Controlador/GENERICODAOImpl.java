/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Alumne;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.hibernate.SessionFactory;

public class GENERICODAOImpl<T, ID extends Serializable> implements GENERICODAO<T, ID> {

    SessionFactory sessionFactory;

    private final static Logger LOGGER = Logger.getLogger(GENERICODAOImpl.class.getName());
    EntityManagerFactory emf;
    EntityManager em;

    /**
     * Inicializar la entityManagerFactory y EntityManager;
     *
     * @return
     */
    @Override
    public T crear() {
        emf = Persistence.createEntityManagerFactory("PROYECTE");
        em = emf.createEntityManager();
        return (T) em;
    }

    /**
     * Inserta una entidad en la tabla de la base de datos
     *
     * @param entity
     */
    @Override
    public void insertar(T entity) {
        // Recupera el entity manager
        // El persistim a la base de dades
//        em.getTransaction().begin();
        EntityTransaction et = em.getTransaction();

        System.out.println("begin");
        et.begin();

        System.out.println("persist");
        em.persist(entity);

        System.out.println("commit");
        //em.getTransaction().commit();
        et.commit();

        System.out.println("close");
        em.close();
    }

    /**
     * Modifica una fila en la tabla de la base de datos.
     *
     * @param entity
     */
    @Override
    public void actualizar(T entity) {
        EntityTransaction etx = em.getTransaction();

        System.out.println("begin");
        etx.begin();

        System.out.println("merge");
        em.merge(entity);

        System.out.println("commit");
        //em.getTransaction().commit();
        etx.commit();

        System.out.println("close");
        em.close();
    }

    /**
     * return id
     *
     * @param id
     * @return
     */
    @Override
    public T get(ID id) {
        return (T) id;
    }

    /**
     * Elimina una fila(entidad) en la tabla de la base de datos.
     *
     * @param id
     */
    @Override
    public void eliminar(ID id) {
        // El persistim a la base de dades
        //em.getTransaction().begin();
        EntityTransaction etx = em.getTransaction();

        System.out.println("begin");
        etx.begin();

        System.out.println("remove");
        em.remove(em.contains(id) ? id : em.merge(id));

        System.out.println("commit");
        //em.getTransaction().commit();
        etx.commit();

        System.out.println("close");
        em.close();
    }

    /**
     * Lista todas las filas en la tabla de la base de datos.
     *
     * @param s
     * @return
     */
    @Override
    public ArrayList<T> listarTodos(String s) {

        System.out.println("busqueda");
            Query q = em.createNamedQuery("FROM " + s);
        List<T> lista = (List<T>) q.getResultList();
//        Polissa a = (Polissa) em.find(Polissa.class, id);

        System.out.println("close");
        em.close();

        return (ArrayList<T>) lista;
    }

    T buscarPorClave(String nif) {
      EntityTransaction etx = em.getTransaction();
      
      

        System.out.println("busqueda");
//        Query query = em.createNamedQuery("Persona.personesPerCognom",Persona.class);
//        query.setParameter("nombre", "Jorge");
//        Persona p = (Persona) query.getSingleResult();
        T t = (T) em.find(Alumne.class, nif);

        System.out.println("close");
        em.close();

        return t;
    }

}

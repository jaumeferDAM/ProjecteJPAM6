package proyecto.m6.uf4;

import Controlador.Alumne_Controlador;
import Controlador.Matricula_Controlador;
import Model.Alumne;
import Model.Matricula;
import Model.importe;
import java.util.Date;
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

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PROYECTE");
        em = emf.createEntityManager();
        System.out.println(em);
        Date d = new Date(2000, 3, 34);
        
        //importe i1 = new importe(0L, 0, null);
        
        Alumne a1 = new Alumne("pruebadeInsercionDos", "ffff", "ffff", "fffff", 333);
        
        Matricula m1 = new Matricula();
//        i1.setMatricula(m1);
       
        m1.setData(d);
        m1.setIdAlumne(a1);
        m1.setDescompte("0");
        m1.setModalitat("a");
//        a1.setMatriculaId(m1);

        Alumne_Controlador acontrol = new Alumne_Controlador(em);
        Matricula_Controlador mcontrol  = new Matricula_Controlador(em);
//        mcontrol.Insertar(m1);
        acontrol.Insertar(a1);
    }

}

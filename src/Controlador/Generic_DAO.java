
package Controlador;

import java.io.Serializable;
import java.util.ArrayList;


 public interface Generic_DAO<T,ID extends Serializable> {
     T crear();
     void insertar(T entity);
     void actualizar(T entity);
     T get(ID id);
     void eliminar(ID id);
     ArrayList<T> listarTodos();
}

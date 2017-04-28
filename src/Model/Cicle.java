
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "cicles")
public class Cicle implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idCicle", nullable = false, unique = true)
    Long id;
    
    @Column(name = "nomCicle", length = 50, nullable = false)
    private String nom;
    
    @Column(name = "grauCicle", length = 50)
    private String grau;
    
    private ArrayList<Modul> llistaModuls;
    private ArrayList<Curs> llistaCursos;

    public Cicle(Long id, String nom, String grau) {
        this.id = id;
        this.nom = nom;
        this.grau = grau;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public ArrayList<Modul> getLlistaModuls() {
        return llistaModuls;
    }

    public void setLlistaModuls(ArrayList<Modul> llistaModuls) {
        this.llistaModuls = llistaModuls;
    }

    public ArrayList<Curs> getLlistaCursos() {
        return llistaCursos;
    }

    public void setLlistaCursos(ArrayList<Curs> llistaCursos) {
        this.llistaCursos = llistaCursos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cicle other = (Cicle) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
    
 

    public Cicle() {
    }
    

    @Override
    public String toString() {
        return "Cicle{" + "id=" + id + ", nom=" + nom + ", grau=" + grau + ", llistaModuls=" + llistaModuls + ", llistaCursos=" + llistaCursos + '}';
    }
    
    
}


package Model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modul")
public class Modul implements Serializable{
    
    private static final long serialVersionUID = 1L; 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idModul", unique = true, nullable = false)
    private int id;
    
    @Column(name = "nomModul", length = 50, nullable = false)
    private String nom;
    
    ArrayList <UnitatFormativa> llistaUnitatsFormatives;

    public Modul(int id, String nom, ArrayList<UnitatFormativa> llistaUnitatsFormatives) {
        this.id = id;
        this.nom = nom;
        this.llistaUnitatsFormatives = llistaUnitatsFormatives;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<UnitatFormativa> getLlistaUnitatsFormatives() {
        return llistaUnitatsFormatives;
    }

    public void setLlistaUnitatsFormatives(ArrayList<UnitatFormativa> llistaUnitatsFormatives) {
        this.llistaUnitatsFormatives = llistaUnitatsFormatives;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id;
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
        final Modul other = (Modul) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modul{" + "id=" + id + ", nom=" + nom + ", llistaUnitatsFormatives=" + llistaUnitatsFormatives + '}';
    }

    public Modul() {
    }
    
    
    
}

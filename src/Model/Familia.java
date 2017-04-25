
package Model;

import java.util.ArrayList;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;


@Entity
@Table(name = "familiaCicles")
public class Familia {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idFamilia", unique = true, nullable = false)
    private Long id;
            
    @Column(name = "nomFamilia", nullable = false, length = 20 )
    private String nom;
    
    
    ArrayList<Cicle> cicles;

    public Familia(Long id, String nom, ArrayList<Cicle> cicles) {
        this.id = id;
        this.nom = nom;
        this.cicles = cicles;
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

    public ArrayList<Cicle> getCicles() {
        return cicles;
    }

    public void setCicles(ArrayList<Cicle> cicles) {
        this.cicles = cicles;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Familia other = (Familia) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Familia{" + "id=" + id + ", nom=" + nom + ", cicles=" + cicles + '}';
    }
    

}

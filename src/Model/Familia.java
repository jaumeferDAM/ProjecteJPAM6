
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
import java.util.ArrayList;
import java.util.List;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@Table(name = "familiaCicles")
@NamedQueries({
@NamedQuery(name="familiaId", query="SELECT f FROM familiaCicles f WHERE f.id=:id")})
public class Familia implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idFamilia", unique = true, nullable = false)
    private Long id;
            
    @Column(name = "nomFamilia", nullable = false, length = 20 )
    private String nom;
    
    
    @OneToMany(mappedBy = "familia")
    private List<Cicle> llistaCicles;

    public Familia(Long id, String nom) {
        this.id = id;
        this.nom = nom;
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

    public List<Cicle> getLlistaCicles() {
        return llistaCicles;
    }

    public void setLlistaCicles(List<Cicle> llistaCicles) {
        this.llistaCicles = llistaCicles;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        return "Familia{" + "id=" + id + ", nom=" + nom + ", llistaCicles=" + llistaCicles + '}';
    }

    
    

    public Familia() {
    }
    

}

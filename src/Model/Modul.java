
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@NamedQueries({
//@NamedQuery(name = "cercaUFModul", query = "SELECT c FROM UnitatFormativa c WHERE c.modul.id=:id")})
@Table(name = "modul")
public class Modul implements Serializable{
    
    private static final long serialVersionUID = 1L; 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idModul", unique = true, nullable = false)
    private Long id;
    
    @Column(name = "nomModul", length = 50, nullable = false)
    private String nom;
    
    //Cada modul te diverses unitats formatives pero les nitats formatives pertanyen a un sol modul.
    @OneToMany(mappedBy = "modul", cascade = CascadeType.ALL)
    private List<UnitatFormativa> llistaUF;

    //Un curs te diversos moduls pero cada modul es d'un sol curs.
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCurs")
    private Curs curs;

    //Un cicle conté diversos moduls pero cada modul pertany a un sol cicle.
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCicle")
    private Cicle cicle;


    public Modul() {
    }

    public Modul(Long id, String nom, Curs curs, Cicle cicle) {
        this.id = id;
        this.nom = nom;
        this.curs = curs;
        this.cicle = cicle;
    }

    public Modul(String nom, Curs curs, Cicle cicle) {
        this.nom = nom;
        this.curs = curs;
        this.cicle = cicle;
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

    public List<UnitatFormativa> getLlistaUF() {
        return llistaUF;
    }

    public void setLlistaUF(List<UnitatFormativa> llistaUF) {
        this.llistaUF = llistaUF;
    }

    public Curs getCurs() {
        return curs;
    }

    public void setCurs(Curs curs) {
        this.curs = curs;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modul{" + "id=" + id + ", nom=" + nom + ", llistaUF=" + llistaUF + ", curs=" + curs + '}';
    }
    
    
}

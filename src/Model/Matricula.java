/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
//@NamedQueries({
//@NamedQuery(name = "nifMatricula", query = "SELECT p FROM Matricula p WHERE p.alumneId.nif=:nif"), 
//@NamedQuery(name = "alumneUFMatricula", query = "SELECT u.alumneId FROM Matricula u, UnitatFormativa p WHERE p in (:id)"),
//@NamedQuery(name = "ufsMatricula", query = "SELECT u FROM UnitatFormativa u, Matricula m WHERE m.id=:id")}) 

@Table(name = "matricula")
public class Matricula implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idMatricula", unique = true, nullable = false)
    private Long idMatricula;/////
    
    @OneToOne()
    @JoinColumn(name = "idAlumne")
    private Alumne idAlumne;

    private Date data;

    @Column(name = "modalitatMatricula", length = 50, nullable = false)
    private String modalitat;

    @Column(name = "descompte", length = 50, nullable = false)
    private String descompte;
    
    @Embedded
    private importe idImport;
    
    @ManyToMany(mappedBy = "listaMatriculas", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<UnitatFormativa> listaUF;

    public Matricula(Alumne idAlumne, Date data, String modalitat, String descompte, importe idImport) {
        this.idAlumne = idAlumne;
        this.data = data;
        this.modalitat = modalitat;
        this.descompte = descompte;
        this.idImport = idImport;
    }

    public Matricula(Long id, Alumne idAlumne, Date data, String modalitat, String descompte, importe idImport) {
        this.idMatricula = id;
        this.idAlumne = idAlumne;
        this.data = data;
        this.modalitat = modalitat;
        this.descompte = descompte;
        this.idImport = idImport;
    }
    
    
    
    public Matricula() {
    }

    public Long getId() {
        return idMatricula;
    }

    public void setId(Long id) {
        this.idMatricula = id;
    }

    public Alumne getIdAlumne() {
        return idAlumne;
    }

    public void setIdAlumne(Alumne idAlumne) {
        this.idAlumne = idAlumne;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getModalitat() {
        return modalitat;
    }

    public void setModalitat(String modalitat) {
        this.modalitat = modalitat;
    }

    public String getDescompte() {
        return descompte;
    }

    public void setDescompte(String descompte) {
        this.descompte = descompte;
    }

    public importe getIdImport() {
        return idImport;
    }

    public void setIdImport(importe idImport) {
        this.idImport = idImport;
    }

    public List<UnitatFormativa> getListaUF() {
        return listaUF;
    }

    public void setListaUF(List<UnitatFormativa> listaUF) {
        this.listaUF = listaUF;
    }



    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.idMatricula);
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
        final Matricula other = (Matricula) obj;
        if (!Objects.equals(this.idMatricula, other.idMatricula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Matricula{" + "id=" + idMatricula + ", idAlumne=" + idAlumne + ", data=" + data + ", modalitat=" + modalitat + ", descompte=" + descompte + ", idImport=" + idImport + ", listaUF=" + listaUF + '}';
    }

    
    
}

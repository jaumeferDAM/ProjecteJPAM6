/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "matricula")
public class Matricula {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idMatricula", unique = true, nullable = false)
    private int id;
    
    
    private Alumne alumne;
    private Date data;
    private ArrayList <UnitatFormativa> llistaUnitatsFormatives;
    
    @Column(name = "modalitatMatricula",length = 50, nullable = false)
    String modalitat;
    
    @Column(name = "descompteMatricula",length = 50, nullable = false)
    String descompte;

    public Matricula(int id, Alumne alumne, Date data, ArrayList<UnitatFormativa> llistaUnitatsFormatives, String modalitat, String descompte) {
        this.id = id;
        this.alumne = alumne;
        this.data = data;
        this.llistaUnitatsFormatives = llistaUnitatsFormatives;
        this.modalitat = modalitat;
        this.descompte = descompte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Alumne getAlumne() {
        return alumne;
    }

    public void setAlumne(Alumne alumne) {
        this.alumne = alumne;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList<UnitatFormativa> getLlistaUnitatsFormatives() {
        return llistaUnitatsFormatives;
    }

    public void setLlistaUnitatsFormatives(ArrayList<UnitatFormativa> llistaUnitatsFormatives) {
        this.llistaUnitatsFormatives = llistaUnitatsFormatives;
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
    
    
    
    
}

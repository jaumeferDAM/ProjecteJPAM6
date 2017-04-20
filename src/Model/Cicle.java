/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ALUMNEDAM
 */
public class Cicle {
    
    String id;
    String nom;
    String grau;
    ArrayList <Modul> llistaModuls;
    ArrayList <Curs> llistaCursos;

    public Cicle(String id, String nom, String grau, ArrayList<Modul> llistaModuls, ArrayList<Curs> llistaCursos) {
        this.id = id;
        this.nom = nom;
        this.grau = grau;
        this.llistaModuls = llistaModuls;
        this.llistaCursos = llistaCursos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
    
    
}

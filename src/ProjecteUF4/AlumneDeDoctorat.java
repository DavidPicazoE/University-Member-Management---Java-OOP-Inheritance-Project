/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjecteUF4;

import java.util.List;

/**
 *
 * @author david
 */
public class AlumneDeDoctorat extends Alumne {
    protected Professor director;
    protected int anyInici;
    protected String tipusContracte;
    
    public AlumneDeDoctorat(String dni, String nom, String cognoms, Professor director, int anyInici, String tipusContracte) {
        super(dni, nom, cognoms);
        this.director = director;
        this.anyInici = anyInici;
        this.tipusContracte = tipusContracte;
    }
    
    // Getters i setters
    public Professor getDirector() {
        return director;
    }
    
    public void setDirector(Professor director) {
        this.director = director;
    }
    
    public int getAnyInici() {
        return anyInici;
    }
    
    public void setAnyInici(int anyInici) {
        this.anyInici = anyInici;
    }
    
    public String getTipusContracte() {
        return tipusContracte;
    }
    
    public void setTipusContracte(String tipusContracte) {
        this.tipusContracte = tipusContracte;
    }
 
}

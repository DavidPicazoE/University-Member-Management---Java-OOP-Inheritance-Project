/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjecteUF4;

/**
 *
 * @author david
 */
import java.util.ArrayList;

// Classe que representa un alumne de la Universita
// Classe que representa un alumne becat de la Universitat
public class AlumneBecat extends Alumne {
    private String tipusBeca;

    public AlumneBecat(String dni, String nom, String cognoms, String tipusBeca) {
        super(dni, nom, cognoms);
        this.tipusBeca = tipusBeca;
    }

    public String getTipusBeca() {
        return tipusBeca;
    }

    public void setTipusBeca(String tipusBeca) {
        this.tipusBeca = tipusBeca;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }
     @Override
    public String toString() {
    return "Alumno becado: " + super.toString() + ", tipo de beca: " + tipusBeca;
    }
    
}

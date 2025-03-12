/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjecteUF4;

/**
 *
 * @author david
 */
// Classe abstracta per a membres de la universitat
public abstract class MembreUniversitat {
    protected String dni;
    protected String nom;
    protected String cognoms;

    public MembreUniversitat(String dni, String nom, String cognoms) {
        this.dni = dni;
        this.nom = nom;
        this.cognoms = cognoms;
    }

    // Getters i setters
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
    
    

    // Mètode per obtenir la informació del membre
 
@Override
public String toString() {
return "DNI: " + dni + ", Nombre: " + nom + ", Apellidos: " + cognoms;
}

}






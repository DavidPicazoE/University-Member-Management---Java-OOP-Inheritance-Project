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

// Classe abstracta que representa un membre de la Universitat
public class Professor extends MembreUniversitat {
    private int anyIniciDocencia;
    private ArrayList<String> matèries=new ArrayList<>();

    public Professor(String dni, String nom, String cognoms, int anyIniciDocencia) {
        super(dni, nom, cognoms);
        this.anyIniciDocencia = anyIniciDocencia;
      //  this.matèries = matèries;
    }

    // Getters i setters
    public int getAnyIniciDocencia() {
        return anyIniciDocencia;
    }

    public void setAnyIniciDocencia(int anyIniciDocencia) {
        this.anyIniciDocencia = anyIniciDocencia;
    }


public void agregarMaterias(String mat){
   matèries.add(mat);
}
    // Implementació del mètode abstracte getInfo
public String getInfo() {
return "Profesor: " + dni + ", " + nom + " " + cognoms + ", año inicio docencia: " + anyIniciDocencia + ", materias: " + matèries.toString();
    }
}




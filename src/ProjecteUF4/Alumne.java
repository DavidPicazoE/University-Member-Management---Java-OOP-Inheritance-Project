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
import java.util.List;

public class Alumne extends MembreUniversitat {
    private ArrayList<String> assignatures=new ArrayList<>();

    public Alumne(String dni, String nom, String cognoms) {
        super(dni, nom, cognoms);
       // this.assignatures = assignatures;
    }

public void agregarAsignatura(String ass){
   assignatures.add(ass);
}
    // Implementació del mètode abstracte getInfo
    
    public String getInfo() {
return "Alumno: " + dni + ", " + nom + " " + cognoms + ", asignaturas matriculadas: " + assignatures.toString();
    }
}
// Classe que representa un alumne becat de la Universitat



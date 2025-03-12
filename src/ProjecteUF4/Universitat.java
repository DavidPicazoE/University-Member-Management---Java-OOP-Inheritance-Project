/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjecteUF4;
import java.util.Scanner;

/**
 *
 * @author david
 */
import java.util.ArrayList;

public class Universitat  {
    private String nom;
    private ArrayList<MembreUniversitat> membres = new ArrayList<>();
    public Scanner scanner; 
    
    public Universitat(String nom) {
        this.nom = nom;
        scanner = new Scanner(System.in);
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



    public void eliminarMiembro(String dni) {
        for (MembreUniversitat membre : membres) {
            if (membre.getDni().equals(dni)) {
                membres.remove(membre);
                break;
            }
        }
    }

    public void mostrarMembres() {
        System.out.println("Miembros de la Universitat " + nom + ":");
        for (MembreUniversitat membre : membres) {
            System.out.println(membre);
        }
    }

    public ArrayList<MembreUniversitat> getMembres() {
        return membres;
    }

    public void setMembres(ArrayList<MembreUniversitat> membres) {
        this.membres = membres;
    }


//
//    boolean eliminarMembrePerDNI(String dni) {
//    }
    public void agregarMiembroUniversidad(MembreUniversitat addMemb){
   membres.add(addMemb);
}
    public void listarMiembros() {
        System.out.println("Miembros de la Universidad:");
        for (MembreUniversitat membre : membres) {
            System.out.println(membre.toString());

        }
    }

    public void listarAlumnos() {
        System.out.println("Alumnos de la Universidad:");
        for (MembreUniversitat membre : membres) {
            if (membre instanceof Alumne) {
                System.out.println(membre);
            }
        }
    }

    public void listarAlumnosDoctorado() {
        System.out.println("Alumnos de doctorado de la Universidad:");
        for (MembreUniversitat membre : membres) {
            if (membre instanceof AlumneDeDoctorat) {
                System.out.println(membre);
            }
        }
    }

    public void listarProfesores() {
        System.out.println("Profesores de la Universidad:");
        for (MembreUniversitat membre : membres) {
            if (membre instanceof Professor) {
                System.out.println(membre);
            }

        }
    }
    
    
@Override
public String toString() {
    return "Universidad{" +
            "nombre='" + nom + '\'' +'}';
//            ", membres=" + membres +
//            '}';
}

}


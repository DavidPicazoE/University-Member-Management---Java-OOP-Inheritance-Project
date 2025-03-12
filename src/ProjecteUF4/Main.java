/*
 * Haz clic en nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para cambiar esta licencia
 * Haz clic en nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar esta plantilla
 */
package ProjecteUF4;

import ProjecteUF4.Alumne;
import ProjecteUF4.AlumneBecat;
import ProjecteUF4.AlumneDeDoctorat;
import ProjecteUF4.MembreUniversitat;
import ProjecteUF4.Professor;
import ProjecteUF4.Universitat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal que contiene el menú de la universidad y permite gestionar
 * los miembros de la universidad.
 * 
 * @author david
 */
public class Main {

    static Scanner scanner = new Scanner(System.in); // Definir el scanner aquí

    /**
     * Método principal que inicia el menú y permite interactuar con el usuario.
     */
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Universitat uni = new Universitat("UAB");
        uni = cargarDatos(uni);

        boolean salir = false;
        while (!salir) {
            System.out.println();
            System.out.println("MENÚ");
            System.out.println("1.- Listar todos los miembros de la Universidad");
            System.out.println("2.- Listar todos los alumnos");
            System.out.println("3.- Listar solo los alumnos de doctorado");
            System.out.println("4.- Listar todos los profesores");
            System.out.println("5.- Buscar y mostrar información de un miembro por su DNI");
            System.out.println("6.- Eliminar miembros pidiendo el DNI");
            System.out.println("0.- Salir");
            System.out.println();

            int opcion = pedirEntero("Elige una opción:");
            switch (opcion) {
                case 1:
                    uni.listarMiembros();
                    break;
                case 2:
                    uni.listarAlumnos();
                    break;
                case 3:
                    uni.listarAlumnosDoctorado();
                    break;
                case 4:
                    uni.listarProfesores();
                    break;
                case 5:
                    buscarMiembroPorDNI(uni);
                    break;
                case 6:
                    eliminarMiembroPorDNI(uni);
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    /**
     * Método que carga los datos iniciales para realizar pruebas, como miembros,
     * alumnos y profesores.
     * 
     * @param uni Universidad a la que se agregarán los datos.
     * @return Universidad con los datos cargados.
     */
    public static Universitat cargarDatos(Universitat uni) {
        // Aquí se añaden los datos mínimos para hacer pruebas de funcionamiento
        // UNI
        uni = new Universitat("UAB");

        // PROFESOR
        Professor prof1 = new Professor("11111111A", "Juan", "García", 2005);
        Professor prof2 = new Professor("22222222B", "Ana", "Pérez", 2010);
        Professor prof3 = new Professor("33333333C", "Pedro", "Sánchez", 2008);

        // ALUMNOS
        Alumne alumno1 = new Alumne("11111111D", "María", "Gómez");
        Alumne alumno2 = new Alumne("22222222E", "Javier", "López");

        // ALUMNOS BECADOS
        AlumneBecat becado1 = new AlumneBecat("22222222F", "Carlos", "Diaz", "Publica");

        // ALUMNOS DE DOCTORADO
        AlumneDeDoctorat doctorado1 = new AlumneDeDoctorat("44444444G", "Jordi", "Jorquera", prof3, 2019, "Fijo");

        // ASIGNATURAS
        alumno1.agregarAsignatura("Matematicas");
        alumno2.agregarAsignatura("Biologia");

        // MATERIAS
        prof1.agregarMaterias("Biologia");

        // MIEMBROS UNIVERSIDAD
        uni.agregarMiembroUniversidad(alumno1);
        uni.agregarMiembroUniversidad(alumno2);
        uni.agregarMiembroUniversidad(becado1);
        uni.agregarMiembroUniversidad(doctorado1);
        uni.agregarMiembroUniversidad(prof1);
        uni.agregarMiembroUniversidad(prof2);
        uni.agregarMiembroUniversidad(prof3);

        return uni;
    }

    /**
     * Método para pedir un número entero al usuario. Si la entrada es incorrecta,
     * pide nuevamente el valor.
     * 
     * @param mensaje Mensaje que se muestra al usuario para que ingrese un valor.
     * @return El número entero ingresado por el usuario.
     */
    private static int pedirEntero(String mensaje) {
        int valor = 0;
        boolean entradaCorrecta = false;
        while (!entradaCorrecta) {
            System.out.print(mensaje);
            try {
                valor = scanner.nextInt();
                entradaCorrecta = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada incorrecta. Por favor, introduce un número entero.");
                scanner.next(); // Se descarta la lectura incorrecta
            }
        }
        return valor;
    }

    /**
     * Método para buscar un miembro de la universidad por su DNI.
     * 
     * @param uni Universidad donde buscar al miembro.
     * @param dni DNI del miembro a buscar.
     * @return Miembro encontrado o null si no se encuentra.
     */
    public static MembreUniversitat encontrarPorDNI(Universitat uni, String dni) {
        MembreUniversitat miembroEncontrado = null;
        for (MembreUniversitat miembro : uni.getMembres()) {
            if (miembro.getDni().equals(dni)) {
                miembroEncontrado = miembro;
                break;  // Si encontramos al miembro, salimos del bucle
            }
        }
        return miembroEncontrado;
    }

    /**
     * Método para buscar un miembro de la universidad por su DNI y mostrar la
     * información correspondiente.
     * 
     * @param uni Universidad donde buscar al miembro.
     */
    public static void buscarMiembroPorDNI(Universitat uni) {
        System.out.println("Introduce el DNI del miembro:");
        String dni = scanner.next();  // Lee el DNI ingresado por el usuario
        if (encontrarPorDNI(uni, dni) != null) {
            System.out.println("Miembro encontrado: " + encontrarPorDNI(uni, dni));
        } else {
            System.out.println("No se ha encontrado ningún miembro con este DNI.");
        }
    }

    /**
     * Método para eliminar un miembro de la universidad mediante su DNI.
     * 
     * @param uni Universidad de la que se eliminará el miembro.
     */
    private static void eliminarMiembroPorDNI(Universitat uni) {
        System.out.println("Introduce el DNI del miembro a eliminar:");
        String dni = scanner.next();  // Lee el DNI ingresado por el usuario
        if (encontrarPorDNI(uni, dni) != null) {
            uni.eliminarMiembro(dni);
            System.out.println("Miembro eliminado con éxito");
        } else {
            System.out.println("No se ha encontrado ningún miembro con este DNI.");
        }
    }
}

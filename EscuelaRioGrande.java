/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escuelariogrande;

/**
 *
 * @author ahmur0
 */
public class EscuelaRioGrande {

    public static void main(String[] args) {
        
        //Se  crean la instancias y se pasan los parametros
        Maestro maestro1 = new Maestro("817263", "Alfredo", "Renteria", "alrenteria@riogrande.edu.mx");
        Alumno alumno1 = new Alumno("20018274", "Elvira", "Zámano", "zamelv1999@outlook.com");
        //Como parametro alumno se usa el nombre del objeto recien creado
        Tutor tutor1 = new Tutor("635482", "Isabel", "Carmona", "iscarmona@riogrande.edu.mx", alumno1);

        //Se guarda el valor del atributo calificacion para el objeto alumno1 creado
        alumno1.guardarCalificacion(82);
        
        //Imprimimos los perfiles usando el metodo que requerimos con la interfaz
        System.out.println("\uD83D\uDCBB Bienvenido al Sistema de Usuarios de la \nEscuela de Informática Río Grande");
        System.out.println("\n\uD83D\uDC68 Informacion del Maestro:");
        maestro1.imprimirPerfil();
        System.out.println("\n\uD83D\uDC67 Informacion del Alumno:");
        alumno1.imprimirPerfil();
        alumno1.mostrarCalificacion();
        System.out.println("\n\uD83D\uDC69 Informacion del Tutor");
        tutor1.imprimirPerfil();
    }
    
}

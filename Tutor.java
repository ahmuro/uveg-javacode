/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuelariogrande;

/**
 *
 * @author ahmur0
 */
public class Tutor extends Usuario implements IPerfil {
    
    //Creamos un atributo estatico para interactuar con la clase Alumno
    private final Alumno alumno;

    //Se crea el constructor pasando valores y asignando tambien el objeto Alumno con el que Tutor va a interactuar
    public Tutor(String idUsuario, String nombre, String apellido, String email, Alumno alumno) {
        super(idUsuario, nombre, apellido, email);
        this.alumno = alumno;
    }

    //Obtenemos la calificacion del alumno llamando al metodo para obtener su calificacion
    public double calificacionAlumno() {
        return this.alumno.getCalificacion();
    }
    
    //Se crea el metodo requerido po la interfaz
    @Override
    public void imprimirPerfil() {
        System.out.println("La ID de usuario del tutor es " + this.getUsuario());
        System.out.println("El nombre completo del tutor es " + this.getNombre() + " " + this.getApellido());
        System.out.println("El email del tutr es " + this.getEmail());
        System.out.println("La calificacion del alumno bajo tutoria es " + this.calificacionAlumno());
    }
    
}
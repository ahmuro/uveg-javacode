/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuelariogrande;

/**
 *
 * @author ahmur0
 */
public class Alumno extends Usuario implements IPerfil {
    
    //Incluimos el atributo unico del ususario Alumno
    private double calificacion;

    //Se crea el contructor
    public Alumno(String idUsuario, String nombre, String apellido, String email) {
        super(idUsuario, nombre, apellido, email);
    }

    //Creamos el metodo para asignar un valor al atributo de calificacion
    public void guardarCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    //Metodo get para leer la calificacion
    public double getCalificacion(){
        return this.calificacion;
    }
    
    //Implementamos el metodo heredado de la interfaz para imprimir el perfil del Alumno
    @Override
    public void imprimirPerfil() {
        System.out.println("La ID de usuario del alumno es " + this.getUsuario());
        System.out.println("El nombre completo del alumno es " + this.getNombre() + " " + this.getApellido());
        System.out.println("El email del alumno es " + this.getEmail());
    }
    
    //Y para mostrar el valor de la calificacion
    public void mostrarCalificacion() {
        System.out.println("Su calificación del módulo es " + getCalificacion());
    }

}
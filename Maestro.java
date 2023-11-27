/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuelariogrande;

/**
 *
 * @author ahmur0
 */
public class Maestro extends Usuario implements IPerfil {
    
    //Como el usuario Maestro solo contiene los valores comunes a todos los usuarios,
    //no se define ninguna otra variable adicional a las de la superclase
    
    //Se crea el coonstructor que pasa parametros de la case heredada
    public Maestro(String idUsuario, String nombre, String apellido, String email) {
        super(idUsuario, nombre, apellido, email);
    }

    //Se implementa el metodo requerido por la interfaz
    @Override
    public void imprimirPerfil() {
        System.out.println("La ID de usuario del maestro es " + this.getUsuario());
        System.out.println("El nombre completo del maestro es " + this.getNombre() + " " + this.getApellido());
        System.out.println("El email del maestro es " + this.getEmail());
    }
    
}
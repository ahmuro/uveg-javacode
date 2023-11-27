/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuelariogrande;

/**
 *
 * @author ahmur0
 */
public abstract class Usuario {
    
    //Se crean los atributos de los datos que tienen en comun todos los usuarios
    private String idUsuario = "";
    private String nombre = "";
    private String apellido = "";
    private String email = "";

    //Se crea el constructor
    public Usuario(String idUsuario, String nombre, String apellido, String email) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
    //Se crean los metodos get para acceder a los datos private
    public String getUsuario(){
        return this.idUsuario;
    }
        public String getNombre(){
        return this.nombre;
    }
        public String getApellido(){
        return this.apellido;
    }
        public String getEmail(){
        return this.email;
    }
        
    //Otra caracteristica comun de todos los usuarios es que se imprime su informacion, por
    //lo que se podria incluir aqui el metodo para ello. Pero para utilizar tambien
    //las interfaces decidi implementar el requerimiento del metodo por separado

}
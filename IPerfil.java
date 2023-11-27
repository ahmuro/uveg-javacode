/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package escuelariogrande;

/**
 *
 * @author ahmur0
 */
public interface IPerfil {
    
    //Solamente agregamos un metodo abstracto requerido por todos los usuarios para imprimir su perfil.
    //Es un buen caso para el uso de una interfaz, pues todas las subclases REQUIEREN que se imprima su perfil
    //pero todas las subclases tienen un perfil un poco diferente, por lo que la interfaz se asegura de que se incluya
    //el metodo pero al estar vacio deja que cada clase lo implmente segun sea necesario
    void imprimirPerfil();
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_jv_constructores;

/**
 *
 * @author Piero354
 */
public class Persona {
    private String nombre;
    private int edad;
    //Constructor sin argumentos
    public Persona(){}
    
    public String getEdadComoTexto(){
        String edadTexto = Clase_Jv_Constructores.convertirATexto(edad);
        return edadTexto;
    }
    public String getTextoImprimir(){
        return"Nombre: " + this.nombre + "\nEdad: " + getEdadComoTexto()
                + "\n--------------";
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    } 
} 

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
public class Empleado {
    private String nombre;
    private int edad;
    private String departamento;
    public Empleado (String nombre, int edad, String departamento){
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
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
        this.departamento = departamento;
        
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    } 
    
    //Patrones de diseño de Constructores
    public static Empleado copiaEmpleado(Empleado empleadoOld){
        return new Empleado (empleadoOld.getNombre(), empleadoOld.getEdad(),
        empleadoOld.getDepartamento());
    }
    public String getTextoImprimir(){
        return "Nombre: " + this.nombre + "\nEdad: " + getEdadComoTexto()
                +"\nDep: " + departamento + "\n-----------------";
    }
    public String getEdadComoTexto(){
        String edadTexto = Clase_Jv_Constructores.convertirATexto(edad);
        return edadTexto;
    }
}

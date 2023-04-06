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
public class Clase_Jv_Constructores {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Manuel", 20, "Finanzas");
        Empleado empleadoCopia = Empleado.copiaEmpleado(empleado);
        
        empleadoCopia.setDepartamento("Ventas");
        imprimir(empleado.getTextoImprimir());
        imprimir(empleadoCopia.getTextoImprimir());  
    }
    public static void imprimir (String texto) {
        System.out.println(texto);
    }
    public static String convertirATexto(int Entero) {
        return String.valueOf(Entero);
    }
}

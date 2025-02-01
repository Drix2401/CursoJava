package controller;

/**
 *
 * @author Joseph Cueto
 */
public class AreaCirculo {
    public static void main(String[] args) {
        // Calcular el area de una 
        // circunferencia de radio = 2.5
        // Operador de asignacion es =
        // nom_variable = valor; // nom_variable almacena valor
        float radio = 2.5f; // declaracion o definicion de la variable
                      // Tipo_de_dato nombre_variable;
        float area; 
        final float pi = 3.141592654f; // pi es una constante
                                       // no se puede cambiar        
        area = pi * radio * radio;
        
        System.out.println("El area de un circulo de radio " + radio + " es " + area);
        
        //pi = 3.13f; // pi es de solo lectura 
        System.out.println("pi es " + pi);
    }
}

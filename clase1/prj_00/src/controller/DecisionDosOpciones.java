package controller;

/**
 *
 * @author Alumno
 */
public class DecisionDosOpciones {
    public static void main(String[] args) {
        // Determinar si un alumno a aprobado o desaprobado 
        // el curso de Java Programación
        // Si calificacion final es mayor o igual a 14 mostrar 
        // APROBADO de otra forma mostrar DESAPROBADO
        float califinal = 13.8f;
        
        if(califinal >= 14) {
                System.out.println("APROBADO con " + califinal);
        } else {
                System.out.println("DESAPROBADO con " + califinal);
        }
    }
}

package controller;

/**
 *
 * @author Alumno
 */
public class ParticipacionEnClase {
    public static void main(String[] args) {
        // Determinar si un alumno ha aprobado o desaprobado 
        // el curso de Java Programación
        // Si la calificación final es mayor o igual a 14 mostrar 
        // Si la calificación es mayor a 10 pero menor a 14 mostrar el mensaje PARA SUSTITUTORIO
        // de otra forma mostrar DESAPROBADO
        // Considerar que la calificación válida es entre 0 a 20, de otra forma poner el mensaje CALIFICACION INVALIDA
        float califinal = 13.8f;
        
        if (califinal >= 0 && califinal <= 20) {  // Verifica que la calificación esté entre 0 y 20
            if (califinal >= 14) {
                System.out.println("APROBADO con " + califinal);
            } else if (califinal > 10 && califinal < 14) {
                System.out.println("PARA SUSTITUTORIO");
            } else {
                System.out.println("DESAPROBADO con " + califinal);
            }
        } else {
            System.out.println("CALIFICACION INVALIDA");  // Mensaje de calificación inválida
        }
    }
}

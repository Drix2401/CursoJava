package controller;
import model.*; // importa todas las clases de model
/**
 *Esta clase es para probar las funcionalidades de las clases definidas
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
   public static void main (String x[]) {
       // Definición/creación del objeto
       // nombre_clase nombre_ojeto;
       Alumno alum1, alum2;
       
       // Inicializar el objeto (darle un espacio en memoria)
       // Opcionalmente darle valores iniciales
       alum1 = null;   // Es nada (no tiene espacio en memoria)
       
       // Asignar espacio de memoria para alum1 y de paso
       // poner valores iniciales
       alum1 = new Alumno( 4444, "ABAD", "ANA", 1); // asignar espacio de memoria
       alum2 = new Alumno(); // usa el constructor vacio
       //recien se puede usar el objeto alum1
       //alum1.registrarAlumno(12345, "Tello", "Angie", 4);
       
       // Mostramos los datos
       alum1.mostrarCarnet();
       
       // ... mucho despues se asignan valores a alum2
       alum2.registrarAlumno(12345, "Tello", "Angie", 4);
       alum2.mostrarCarnet();
   }
}

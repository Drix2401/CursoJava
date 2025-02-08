
/**
 * Write a description of class Test2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test2
{
    public static void main (String x[]) {
       // Definición/creación del objeto
       // nombre_clase nombre_ojeto;
       Curso curs1;
       
       // Inicializar el objeto (darle un espacio en memoria)
       // Opcionalmente darle valores iniciales
       curs1 = null;   // Es nada (no tiene espacio en memoria)
       
       //...muchas lineas adelante recién se requiere llenar datos
       curs1 = new Curso(); // asignar espacio de memoria
       
       //recien se puede usar el objeto alum1
       curs1.registrarCurso(123, "programación Java", "01/02/2025");
       
       // Mostramos los datos
       curs1.mostrar();
       
       curs1.modificarFechaInicio("08/02/2025");
       
       curs1.mostrarnuevaFecha();
       
   }
}

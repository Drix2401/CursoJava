package model;
/**
 * Write a description of class Curso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Curso
{
     //atributos
    private int cod_curso; 
    private String nombre_curso;
    private String fec_inicio;
    
    // metodos/operaciones
    public void registrarCurso(int cod, String nom, String fec) {
        cod_curso = cod;
        nombre_curso = nom;
        fec_inicio = fec;
    }
   
    public void mostrar() {
        System.out.println("Código de curso       : " + cod_curso);
        System.out.println("Nombre de curso       : " + nombre_curso);
        System.out.println("Fecha de inicio       : " + fec_inicio);
    }
    public void modificarFechaInicio(String nuevaFecha) {
        fec_inicio =  nuevaFecha;    
    }
    public void mostrarnuevaFecha() {
        System.out.println("Nueva fecha de inicio       : " + fec_inicio);
    }
}

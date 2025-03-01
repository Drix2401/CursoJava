package controller;

/**
 *
 * @author Alumno
 */
public class Arreglos3 {
    public static void main(String[] args) {
        // Crear un objeto de Automovil
        model.Automovil vehi1 = new model.Automovil("ABC100", "KIA", 2005); 
        System.out.println(vehi1);
        
        // Crear un arreglo de Automoviles
        int cantidad = 5 ;
        model.Automovil vehs[]; //definir el arreglo
        
        // Indicar la cantidad de vehiculos
        vehs = new model.Automovil[cantidad];
        
        //inicializarlos con null
        for(int i= 0; i < cantidad; i++) {
            vehs[i] = null;
        }
        
        // Mucho mas adelante se pueden usar
        
        // Asignando valor al indice de indice 3
        vehs[3] = new model.Automovil("WX2222", "VOLVO", 2020);
        vehs[1] = new model.Automovil("ABX", "NISSAN", 2015);
        
        //mostrarlos
        System.out.println("Lista de vehiculos");
        for(int i= 0; i < cantidad; i++) {
            if(vehs[i] != null){
            System.out.println(vehs[i]);
            }
        }
    }
}
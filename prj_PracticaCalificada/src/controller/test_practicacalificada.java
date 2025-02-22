package controller;
import model.*;
/**
 *
 * @author Alumno
 */
public class test_practicacalificada {
        static void pagar(Producto pago){
        System.out.println("Tipo de producto:" + pago);
         
     }
    public static void main(String[] args) {
        Producto produc1 = new PlatoRestaurant(150);
        pagar(produc1);
        
        produc1 = new ProductoFarmacia(300);
        pagar(produc1);
        
        produc1 = new ProductoFerreteria(40);
        pagar(produc1);
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Producto;
/**
 *
 * @author Alumno
 */
public class TestProducto {
    public static void main(String[] args) {
       Producto p1 = new Producto (12345, "GALLETAS DEL NORTE", 3.5, 150);
        Producto p2 = new Producto(11111, "LECHE GLORIA");
        Producto p3 = new Producto();
        //mostrar p1
        System.out.println("p1 es " + p1);
        System.out.println("p2 es " + p2);
        System.out.println("p3 es " + p3);
        
        // Prueba de negocio
        // Para vender prodcuto: debe tener stock, debe tener precio, debe 
        // tener código,...
        if(p1.EsVendible()) {
            System.out.println("El producto " + p1.getNombre() + " es vendible");
      
    }
        // Comparar un objeto con otro
        if(p1.equals(p2)){
            System.out.println(p1.getNombre() + " es igual a " + p2.getNombre());
        } else {
            System.out.println(p1.getNombre() + " es diferente a " + p2.getNombre());
        }
        Producto p4 = new Producto(11111, "LECHE GLORIA");
        if(p2.equals(p4)){
            System.out.println(p2.getNombre() + " es igual a " + p4.getNombre());
        } else {
            System.out.println(p2.getNombre() + " es diferente a " + p4.getNombre());
        }
         // Comparacion por sus valores hash
        if(p1.hashCode() == p2.hashCode()) {
         System.out.println(p1.getNombre() + " es igual a " + p2.getNombre());
        } else {
            System.out.println(p1.getNombre() + " es diferente a " + p2.getNombre());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Boleto;
/**
 *
 * @author Alumno
 */
public class TestBoleto {
    public static void main(String[] args) {
        // Una empresa vende boletos en todas sus
        // oficinas a nivel nacional
        Boleto b1=new Boleto("LIMA", "TRUJILLO");
        System.out.println(b1);
        Boleto b2=new Boleto("ICA", "AREQUIPA");
        System.out.println(b2);
        Boleto b3=new Boleto("TACNA", "MOQUEGUA");
        System.out.println(b3);
    }
    
}

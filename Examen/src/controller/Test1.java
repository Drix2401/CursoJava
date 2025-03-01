package controller;
import model.*;
/**
 *
 * @author Alumno
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("VIAJE");
        System.out.println("------------");
       
        viaje via1;
       via1 = new viaje("000001", "PIURA", "LIMA");
       Persona person1;
       person1 = new Persona("77777", "joseph cueto");
        System.out.println(via1);
        System.out.println(person1);
        Pasajero pasaj1;
        pasaj1 = new Pasajero("11111","77777", "joseph cueto");
        System.out.println(pasaj1);
        Conductor conduc1;
        conduc1 = new Conductor("888888","77777", "joseph cueto");
        System.out.println(conduc1);
    }
}

package controller;
import model.Cliente;
import model.ClienteJuridico;
/**
 *
 * @author Alumno
 */
public class Test1 {
    public static void main(String[] args) {
            /*
            // Cliente no puede instanciar, por ser abstracto
            // El fin Cliente es servir de modelo para otros tipos de cliente
            Cliente client1 = new Cliente("Juan", 1500);
            System.out.println(client1);
            */
            
            model.ClienteNatural clientN1 = new model.ClienteNatural("12345678", "ANA ABAD", 5000, "Av.Lima 123", "ana@gmail.com", 2015);
            System.out.println(clientN1);
            System.out.println("Antiguedad del cliente natural: " + clientN1.getAntiguedad());
             
            ClienteJuridico clienJ1 = new ClienteJuridico ("20102030401", "EMPRESA ABC", "Av. Tupac Amaru", 
                    100000, "empabc@abc.com", 2020, "10020030", "José Perez");
            System.out.println(clienJ1);
    }
}

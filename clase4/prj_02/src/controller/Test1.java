package controller;

/**
 *
 * @author Alumno
 */
public class Test1 {
    public static void main(String[] args) {
        int x,y,z;
        x = 25;
        y = 0;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        try{
        z = x / y;
        System.out.println(x + "/" + y + " resulta" + z);
        }
        catch(ArithmeticException e){ // para division por cero
            System.out.println("Se produjo un error de division por cero");
            System.out.println("mensaje de error: " + e.getMessage());
        }
        
        catch(Exception e){
            System.out.println("Se produjo un error");
        }
        System.out.println("\nSistema terminado correctamente");
    }
}

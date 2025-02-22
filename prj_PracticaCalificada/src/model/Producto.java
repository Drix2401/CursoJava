package model;

/**
 *
 * @author Alumno
 */
public class Producto {
    protected double precio;
    protected String producto;

    public Producto(String producto) {
        this.producto = producto;
        precio = 0.0;
        
    }

    @Override
    public String toString() {
        return "Producto{" + "precio=" + precio + ", nombre_producto=" + producto + '}';
    }
    
}

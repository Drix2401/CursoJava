package model;

/**
 *
 * @author Alumno
 */
public class PlatoRestaurant extends Producto {
     private String tipoPlato_Restaurant;

    public PlatoRestaurant(double precio) {
        super("LOMO SALTADO");
        
        this.precio = precio; 
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

   
}

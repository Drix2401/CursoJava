package model;

/**
 *
 * @author Alumno
 */
public class ProductoFarmacia extends Producto {
     private String tipoProducto_Farmacia;

    public ProductoFarmacia(double precio) {
        super("AGUA OXIGENADA");
      
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
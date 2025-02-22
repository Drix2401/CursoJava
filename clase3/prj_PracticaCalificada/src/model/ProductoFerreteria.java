package model;

/**
 *
 * @author Alumno
 */
public class ProductoFerreteria extends Producto {
    private String tipoProduc_ferre;

    public ProductoFerreteria(double precio) {
        super("TORNILLOS");
  
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

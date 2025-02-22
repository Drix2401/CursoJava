package model;

/**
 *
 * @author Alumno
 */
public class Efectivo extends FormaPago {
   private String tipoMoneda ; //soles o dolares
   public Efectivo (double monto) {
           super("Pago en efectivo");
           tipoMoneda = "Soles";
           this.monto = monto;
   }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }
   
}

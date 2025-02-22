package model;

/**
 *
 * @author Alumno
 */
public class TarjetaCredito extends FormaPago {
    private int cantCuotas;
    private String nro_Tarjeta;
    
    public TarjetaCredito (double monto) {
        super("Tarjeta de credito");
          cantCuotas = 1;
          nro_Tarjeta = "";
          this.monto = monto;
          
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getNro_Tarjeta() {
        return nro_Tarjeta;
    }

    public void setNro_Tarjeta(String nro_Tarjeta) {
        this.nro_Tarjeta = nro_Tarjeta;
    }
    
}

package model;
import model.Conductor;
import model.Pasajero;        
/**
 *
 * @author Alumno
 */
public class viaje {
    private String cod_viaje;
    private String origen;
    private String destino;

    public viaje(String cod_viaje, String origen, String destino) {
        this.cod_viaje = cod_viaje;
        this.origen = origen;
        this.destino = destino;
    }

    public String getCod_viaje() {
        return cod_viaje;
    }

    public void setCod_viaje(String cod_viaje) {
        this.cod_viaje = cod_viaje;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "viaje{" + "cod_viaje=" + cod_viaje + ", origen=" + origen + ", destino=" + destino + '}';
    }

    
    
}

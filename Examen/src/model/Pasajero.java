package model;

/**
 *
 * @author Alumno
 */
public class Pasajero extends Persona {
    private String cod_pasajero;

    public Pasajero(String cod_pasajero, String dni, String nombres) {
        super(dni, nombres);
        this.cod_pasajero = cod_pasajero;
    }

    public String getCod_pasajero() {
        return cod_pasajero;
    }

    public void setCod_pasajero(String cod_pasajero) {
        this.cod_pasajero = cod_pasajero;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "cod_pasajero=" + cod_pasajero + '}';
    }
   
    
}

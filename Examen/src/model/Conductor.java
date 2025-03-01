package model;

/**
 *
 * @author Alumno
 */
public class Conductor extends Persona {
    private String nro_licencia;

    public Conductor(String nro_licencia, String dni, String nombres) {
        super(dni, nombres);
        this.nro_licencia = nro_licencia;
    }

    public String getNro_licencia() {
        return nro_licencia;
    }

    public void setNro_licencia(String nro_licencia) {
        this.nro_licencia = nro_licencia;
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
        return "Conductor{" + "nro_licencia=" + nro_licencia + '}';
    }
    
   
   
}

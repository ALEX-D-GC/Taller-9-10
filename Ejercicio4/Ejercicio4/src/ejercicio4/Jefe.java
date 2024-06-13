package ejercicio4;
public class Jefe extends Trabajador {
    private double sueldo;

    public Jefe(double sueldo, String nombre, String apellidos, String direccion, String dni) {
        super(nombre, apellidos, direccion, dni);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}

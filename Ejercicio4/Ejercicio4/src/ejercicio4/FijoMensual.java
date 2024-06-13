package ejercicio4;
public class FijoMensual extends Trabajador{
    private double salarioMensual;

    public FijoMensual(double salarioMensual, String nombre, String apellidos, String direccion, String dni) {
        super(nombre, apellidos, direccion, dni);
        this.salarioMensual = salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }
    
}

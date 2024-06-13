package ejercicio4;
public class Comisionista extends Trabajador {
    private double ventasRealizadas;
    private double salario;

    public Comisionista(double ventasRealizadas, String nombre, String apellidos, String direccion, String dni) {
        super(nombre, apellidos, direccion, dni);
        this.ventasRealizadas = ventasRealizadas;
    }
    public double getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(double ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }
    public void calcularSalario() {
        salario = ventasRealizadas * 0.5;
    }

    public double getSalario() {
        return salario;
    }
}


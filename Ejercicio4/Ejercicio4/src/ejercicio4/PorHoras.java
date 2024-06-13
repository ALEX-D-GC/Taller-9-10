package ejercicio4;
public class PorHoras extends Trabajador {
    private int horasTrabajadas;

    public PorHoras(int horasTrabajadas, String nombre, String apellidos, String direccion, String dni) {
        super(nombre, apellidos, direccion, dni);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSueldo() {
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * 15;
        } else {
            int horasExtras = horasTrabajadas - 40;
            return (40 * 15) + (horasExtras * 17);
        }
    }
}
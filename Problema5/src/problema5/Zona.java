package problema5;

public abstract class Zona {
    protected String nombre;
    protected int numLocalidades;
    protected double precioNormal;
    protected double precioAbonado;

    public Zona(String nombre, int numLocalidades, double precioNormal, double precioAbonado) {
        this.nombre = nombre;
        this.numLocalidades = numLocalidades;
        this.precioNormal = precioNormal;
        this.precioAbonado = precioAbonado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumLocalidades() {
        return numLocalidades;
    }

    public void reducirLocalidad() {
        if (numLocalidades > 0) {
            numLocalidades--;
        }
    }

    public abstract double calcularPrecio(String tipoEntrada);
}
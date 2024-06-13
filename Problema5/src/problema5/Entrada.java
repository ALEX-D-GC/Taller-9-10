package problema5;

public class Entrada {
    protected static int contador = 0;
    protected int id;
    protected String nombreComprador;
    protected double precio;
    protected Zona zona;

    public Entrada(String nombreComprador, Zona zona, String tipoEntrada) {
        this.id = ++contador;
        this.nombreComprador = nombreComprador;
        this.zona = zona;
        this.precio = zona.calcularPrecio(tipoEntrada);
    }

    public int getId() {
        return id;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombreZona() {
        return zona.getNombre();
    }

    @Override
    public String toString() {
        return String.format(
            "Entrada ID: %d\nComprador: %s\nZona: %s\nPrecio: $%.2f",
            id, nombreComprador, zona.getNombre(), precio
        );
    }
}
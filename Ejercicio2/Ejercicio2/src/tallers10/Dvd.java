package tallers10;
public class Dvd extends Pelicula {
    private double capacidadGb;

    public Dvd(double capacidadGb, String titulo, String autor, String añoEdicion, String idioma, double precioAlquiler, Soporte soporte) {
        super(titulo, autor, añoEdicion, idioma, precioAlquiler, soporte);
        this.capacidadGb = capacidadGb;
    }
    public void calcularPrecio(){
        precioAlquiler=(precioAlquiler*1.10);
    }
    public double getCapacidadGb() {
        return capacidadGb;
    }

    public void setCapacidadGb(double capacidadGb) {
        this.capacidadGb = capacidadGb;
    }
}

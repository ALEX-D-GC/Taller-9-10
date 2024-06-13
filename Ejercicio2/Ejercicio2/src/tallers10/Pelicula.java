package tallers10;
public class Pelicula {
    private String titulo;
    private String autor;
    private String añoEdicion;
    private String idioma;
    public double precioAlquiler;
    private Soporte soporte;

    public Pelicula(String titulo, String autor, String añoEdicion, String idioma, double precioAlquiler, Soporte soporte) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoEdicion = añoEdicion;
        this.idioma = idioma;
        this.precioAlquiler = precioAlquiler;
        this.soporte = soporte;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAñoEdicion() {
        return añoEdicion;
    }

    public void setAñoEdicion(String añoEdicion) {
        this.añoEdicion = añoEdicion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public Soporte getSoporte() {
        return soporte;
    }

    public void setSoporte(Soporte soporte) {
        this.soporte = soporte;
    }
}
package tallers10;
public class TallerS10 {
     public static void main(String[] args) {
        Soporte soporteDvd1 = new Soporte("9847384");
        Soporte soporteDvd2 = new Soporte("9847385");
        Soporte soporteVhs1 = new Soporte("9857398", "Tipo I");
        Soporte soporteVhs2 = new Soporte("9857399", "Tipo II");

        Dvd dvd1 = new Dvd(4.1, "Piratas del Caribe", "Jack Sparrow", "2006", "Español", 5.0, soporteDvd1);
        dvd1.calcularPrecio();
        
        Dvd dvd2 = new Dvd(4.7, "Inception", "Christopher Nolan", "2010", "Ingles", 8.5, soporteDvd2);
        dvd2.calcularPrecio();

        VHS vhs1 = new VHS("Jurassic Park", "Steven Spielberg", "1353", "Espanol", 4.0, soporteVhs1);
        VHS vhs2 = new VHS("The Lion King", "Roger Allers", "1954", "Espanol", 3.5, soporteVhs2);

        System.out.println("Información de DVDs:");
        System.out.println("Título: " + dvd1.getTitulo() + ", Autor: " + dvd1.getAutor() + ", Año: " + dvd1.getAñoEdicion() + ", Idioma: " + dvd1.getIdioma() + ", Capacidad: " + dvd1.getCapacidadGb() + " Gb, Precio: $" + dvd1.getPrecioAlquiler() + ",ID: " + dvd1.getSoporte().getId());
        System.out.println("Título: " + dvd2.getTitulo() + ", Autor: " + dvd2.getAutor() + ", Año: " + dvd2.getAñoEdicion() + ", Idioma: " + dvd2.getIdioma() + ", Capacidad: " + dvd2.getCapacidadGb() + " Gb, Precio: $" + dvd2.getPrecioAlquiler() + ",ID: " + dvd2.getSoporte().getId());

        System.out.println("\nInformación de VHS:");
        System.out.println("Título: " + vhs1.getTitulo() + ", Autor: " + vhs1.getAutor() + ", Año: " + vhs1.getAñoEdicion() + ", Idioma: " + vhs1.getIdioma() + ", Precio: $" + vhs1.getPrecioAlquiler() + ", Soporte ID: " + vhs1.getSoporte().getId() + ", Tipo de Cinta: " + vhs1.getSoporte().getTipoCinta());
        System.out.println("Título: " + vhs2.getTitulo() + ", Autor: " + vhs2.getAutor() + ", Año: " + vhs2.getAñoEdicion() + ", Idioma: " + vhs2.getIdioma() + ", Precio: $" + vhs2.getPrecioAlquiler() + ", Soporte ID: " + vhs2.getSoporte().getId() + ", Tipo de Cinta: " + vhs2.getSoporte().getTipoCinta());
    }
}
